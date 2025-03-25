package com.wsi.print.impl;

import com.wsi.print.api.CollateService;
import com.wsi.print.entity.Collates;
import com.wsi.print.repository.CollateRepository;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
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
    public File createLabelPNGForLpn(String lpn) throws IOException {
        log.info("Printing collate for LPN {}", lpn);
        collate = collateRepository.findByLpn(lpn);

        if (Objects.isNull(collate)) {
            log.error("LPN {} not found in the DB", lpn);
            return null;
        }

        String base64String = collate.getPng();
        byte[]  pngBytes = Base64.getDecoder().decode(base64String);
        ByteArrayInputStream pngStream = new ByteArrayInputStream(pngBytes);
        // print pngStream
        BufferedImage labelImage = ImageIO.read(pngStream);
        pngStream.close();

        File labelFile = new File("lpnLabel.png");
        ImageIO.write(labelImage, "png", labelFile);
        return labelFile;
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
    public boolean printCollateForLPN(String lpn) throws IOException, JRException {
        log.info("Printing collate for LPN {}", lpn);
        //ClassPathResource resource = new ClassPathResource("/MyReport.jrxml");
        File file = ResourceUtils.getFile("src/main/resources/static/images/kili.jpg");
        String reportPath = ResourceUtils.getFile("src/main/resources/MyReport.jrxml").getAbsolutePath();
        JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("brandName", "PotteryBarn");

        collate = collateRepository.findByLpn(lpn);
        if (Objects.isNull(collate)) {
            log.error("LPN {} not found in the DB", lpn);
            return false;
        }
        InputStream inputStream = new ByteArrayInputStream(Base64.getDecoder().decode(collate.getPng()));
        parameters.put("labelImage", inputStream);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
        JasperExportManager.exportReportToPdfFile(jasperPrint, "collate.pdf");
        return true;
    }


}
