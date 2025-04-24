package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Alerts {

   @SerializedName("code")
   String code;

   @SerializedName("message")
   String message;


    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    
}