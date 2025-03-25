package com.wsi.print.api;

import net.sf.jasperreports.engine.JRException;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface CollateService {
    File createLabelPNGForLpn(String lpn) throws IOException;

    List<String> getLPNs();

    boolean printCollateForLPN(String lpn) throws Exception;

}
