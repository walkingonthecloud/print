package com.wsi.print.impl;

import com.wsi.print.api.CollateService;
import com.wsi.print.entity.Collates;
import com.wsi.print.repository.CollateRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CollateServiceImpl implements CollateService {

    private final CollateRepository collateRepository;

    private Collates collate;

    @Autowired
    public CollateServiceImpl(CollateRepository collateRepository) {
        this.collateRepository = collateRepository;
    }

    @Override
    public boolean createLabelPNGForLpn(String lpn) throws IOException {
        log.info("Printing collate for LPN {}", lpn);
        collate = collateRepository.findByLpn(lpn);

        if (Objects.isNull(collate)) {
            log.error("LPN {} not found in the DB", lpn);
            return false;
        }

        String base64String = collate.getPng();
        byte[]  pngBytes = Base64.getDecoder().decode(base64String);
        ByteArrayInputStream pngStream = new ByteArrayInputStream(pngBytes);
        // print pngStream
        BufferedImage labelImage = ImageIO.read(pngStream);
        pngStream.close();

        File labelFile = new File("lpnLabel.png");
        ImageIO.write(labelImage, "png", labelFile);
        return true;
    }

    @Override
    public List<String> getLPNs() {
        return collateRepository
                .findAll()
                .stream()
                .map(Collates::getTc_lpn_id)
                .collect(Collectors.toList());
    }

    @Override
    public boolean printCollateForLPN(String lpn) throws IOException {
        log.info("Printing collate for LPN {}", lpn);
        InputStream collateStream = getClass().getResourceAsStream("/MyReport.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(collateStream);
    }
}
