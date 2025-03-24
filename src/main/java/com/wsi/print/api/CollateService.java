package com.wsi.print.api;

import java.io.IOException;
import java.util.List;

public interface CollateService {
    boolean createLabelPNGForLpn(String lpn) throws IOException;

    List<String> getLPNs();

    boolean printCollateForLPN(String lpn) throws IOException;

}
