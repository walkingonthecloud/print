package com.wsi.print.rest;

import com.wsi.print.impl.CollateServiceImpl;
import com.wsi.print.impl.FedextrackingService;
import com.wsi.print.impl.LabelaryServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@Slf4j
@RequestMapping(path = "/api")
public class CollatePrintController {

    private final CollateServiceImpl collateService;
    private final LabelaryServiceImpl labelaryService;

    private final FedextrackingService fedextrackingService;

    public CollatePrintController(CollateServiceImpl collateService, LabelaryServiceImpl labelaryService, FedextrackingService fedextrackingService) {
        this.collateService = collateService;
        this.labelaryService = labelaryService;
        this.fedextrackingService = fedextrackingService;
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
    @GetMapping(path = "/fedex/track/{trackingNumber}")
    public ResponseEntity<String> trackFedexShipment(@PathVariable String trackingNumber) {
        try {
            // Assuming you have a method to get the OAuth token
            fedextrackingService.trackShipment(trackingNumber);
            return new ResponseEntity<>("Package successfully tracked", HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error getting OAuth token", e);
            return new ResponseEntity<>("Error getting OAuth token: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(path = "/zpl/to/png", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> createPNgfromZPL(@RequestBody String zpl) {
        try {
            labelaryService.convertZplToPng(zpl);
        } catch (Exception e) {
            log.error("Error converting ZPL to PNG", e);
            return new ResponseEntity<>("Error converting ZPL to PNG, with error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Collate successfully printed!", HttpStatus.OK);
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
