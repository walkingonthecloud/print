package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class EstimatedDeliveryTimeWindow {

   @SerializedName("window")
   Window window;


    public void setWindow(Window window) {
        this.window = window;
    }
    public Window getWindow() {
        return window;
    }
    
}