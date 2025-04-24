package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ServiceCommitMessage {

   @SerializedName("message")
   String message;

   @SerializedName("type")
   String type;


    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
}