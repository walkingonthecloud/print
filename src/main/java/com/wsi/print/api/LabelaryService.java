package com.wsi.print.api;

import java.io.File;
import java.io.IOException;

public interface LabelaryService {

    void convertZplToPng(String zpl) throws IOException, InterruptedException;

}
