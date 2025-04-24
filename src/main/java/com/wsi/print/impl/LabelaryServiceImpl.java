package com.wsi.print.impl;

import com.wsi.print.api.LabelaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;

@Service
@Slf4j
public class LabelaryServiceImpl implements LabelaryService {

    private final RestTemplate restTemplate;

    public LabelaryServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void convertZplToPng(String zpl) throws IOException, InterruptedException {

        log.info("Converting ZPL to PNG >>");
        String decodedZpl = new String(Base64.getDecoder().decode(zpl), StandardCharsets.UTF_8);

        var uri = URI.create("http://api.labelary.com/v1/printers/8dpmm/labels/4x6/0/");
        var request = HttpRequest.newBuilder(uri)
                .POST(HttpRequest.BodyPublishers.ofString(decodedZpl))
                .build();
        var client = HttpClient.newHttpClient();
        var response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());
        var body = response.body();

        if (response.statusCode() == 200) {
            var file = new File("label.png"); // change file name for PNG images
            Files.write(file.toPath(), body);
        } else {
            var errorMessage = new String(body, StandardCharsets.UTF_8);
            System.out.println(errorMessage);
            throw new RuntimeException(errorMessage);
        }

        log.info("label.png created successfully!");
    }
}

