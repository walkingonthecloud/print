package com.wsi.print.impl;

import com.wsi.print.POJO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Service
public class FedextrackingService {

    @Autowired
    RestTemplate restTemplate;

    private final String FEDEX_CLIENT_ID = "l77e32d7aab1bc4ab48d34d8414b587a4a";
    private final String FEDEX_CLIENT_SECRET = "baa7182eb3374cd0a4683c002439e4ef";

    public void trackShipment(String trackingNumber) {

        String oauthUrl = "https://apis-sandbox.fedex.com/oauth/token";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/x-www-form-urlencoded");
        String body = "grant_type=client_credentials&client_id=" + FEDEX_CLIENT_ID + "&client_secret=" + FEDEX_CLIENT_SECRET;
        HttpEntity<String> oAuthRequestEntity = new HttpEntity<>(body, headers);
        ResponseEntity<OauthResponse> response = restTemplate.exchange(oauthUrl, HttpMethod.POST, oAuthRequestEntity, OauthResponse.class);

        String accessToken = Objects.requireNonNull(response.getBody()).getAccess_token();

        String trackingUrl = "https://apis-sandbox.fedex.com/track/v1/trackingnumbers";
        HttpHeaders trackingHeaders = new HttpHeaders();
        trackingHeaders.set("Content-Type", "application/json");
        FedexTrackingRequest request = new FedexTrackingRequest();

        TrackingNumberInfo trackingNumberInfo = new TrackingNumberInfo();
        trackingNumberInfo.setTrackingNumber(trackingNumber);
        TrackingInfo trackingInfo = new TrackingInfo();
        trackingInfo.setTrackingNumberInfo(trackingNumberInfo);

        request.setIncludeDetailedScans(true);
        request.setTrackingInfo(List.of(trackingInfo));
        HttpEntity<FedexTrackingRequest> trackingRequestEntity = new HttpEntity<>(request, trackingHeaders);
        trackingHeaders.set("Authorization", "Bearer " + accessToken);


        ResponseEntity<FedexTrackingResponse> fedexTrackingResponse = restTemplate.exchange(trackingUrl, HttpMethod.POST, trackingRequestEntity, FedexTrackingResponse.class);

        fedexTrackingResponse.getBody().getOutput().getCompleteTrackResults().forEach(completeTrackResults -> {
            System.out.println("Tracking Number: " + completeTrackResults.getTrackingNumber());
            completeTrackResults.getTrackResults().forEach(trackResults -> {
                System.out.println("Code: " + trackResults.getLatestStatusDetail().getCode());
                System.out.println("Derived Code: " + trackResults.getLatestStatusDetail().getDerivedCode());
                System.out.println("Description: " + trackResults.getLatestStatusDetail().getDescription());
                System.out.println("Reason Code: " + trackResults.getLatestStatusDetail().getAncillaryDetails().get(0).getReason());
                System.out.println("Reason Desc: " + trackResults.getLatestStatusDetail().getAncillaryDetails().get(0).getReasonDescription());
            });
        });

    }

}
