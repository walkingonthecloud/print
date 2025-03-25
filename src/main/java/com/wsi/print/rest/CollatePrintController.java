package com.wsi.print.rest;

import com.wsi.print.impl.CollateServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@Slf4j
@RequestMapping(path = "/api")
public class CollatePrintController {

    private final CollateServiceImpl collateService;

    public CollatePrintController(CollateServiceImpl collateService) {
        this.collateService = collateService;
    }

    @GetMapping(path = "/LPNs", produces = "application/json")
    public ResponseEntity<List<String>> getLPNs() {
        return new ResponseEntity<>(collateService.getLPNs(), HttpStatus.OK);
    }

    @PostMapping(path = "/create/png/{lpn}")
    public ResponseEntity<String> createPNGForLpn(@PathVariable String lpn) {
        try {
            if (!Objects.isNull(collateService.createLabelPNGForLpn(lpn))) {
                return new ResponseEntity<>("PNG successfully created!", HttpStatus.OK);
            }
        } catch (Exception e) {
            log.error("Error creating PNG for LPN {}", lpn, e);
            return new ResponseEntity<>("Error creating PNG for LPN " + lpn, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("PNG successfully created!", HttpStatus.OK);
    }

    @PostMapping(path = "/create/collate/{lpn}")
    public ResponseEntity<String> createCollateForLpn(@PathVariable String lpn) {
        try {
            if (collateService.printCollateForLPN(lpn)) {
                return new ResponseEntity<>("Collate successfully printed!", HttpStatus.OK);
            }
        } catch (Exception e) {
            log.error("Error printing collate for LPN {}", lpn, e);
            return new ResponseEntity<>("Error printing collate for LPN " + lpn, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Collate successfully printed!", HttpStatus.OK);
    }
}
