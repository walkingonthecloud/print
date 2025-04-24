package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SpecialHandlings {

   @SerializedName("type")
   String type;

   @SerializedName("description")
   String description;

   @SerializedName("paymentType")
   String paymentType;


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public String getPaymentType() {
        return paymentType;
    }
    
}