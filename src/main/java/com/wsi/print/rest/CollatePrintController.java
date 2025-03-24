package com.wsi.print.rest;

import com.wsi.print.impl.CollateServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping(path = "/create/{lpn}")
    public ResponseEntity<String> createCollateForLpn(@PathVariable String lpn) {
        try {
            if (collateService.createLabelPNGForLpn(lpn)) {
                return new ResponseEntity<>("Collate successfully created!", HttpStatus.OK);
            }
        } catch (Exception e) {
            log.error("Error creating collate for LPN {}", lpn, e);
            return new ResponseEntity<>("Error creating collate for LPN " + lpn, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Collate successfully created!", HttpStatus.OK);
    }
}
