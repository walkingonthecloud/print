package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CustomDeliveryOptions {

   @SerializedName("type")
   String type;

   @SerializedName("status")
   String status;


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    
}