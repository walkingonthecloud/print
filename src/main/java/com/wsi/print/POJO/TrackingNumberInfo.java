package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TrackingNumberInfo {

   @SerializedName("trackingNumber")
   String trackingNumber;

   @SerializedName("trackingNumberUniqueId")
   String trackingNumberUniqueId;

   @SerializedName("carrierCode")
   String carrierCode;


    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
    public String getTrackingNumber() {
        return trackingNumber;
    }
    
    public void setTrackingNumberUniqueId(String trackingNumberUniqueId) {
        this.trackingNumberUniqueId = trackingNumberUniqueId;
    }
    public String getTrackingNumberUniqueId() {
        return trackingNumberUniqueId;
    }
    
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }
    public String getCarrierCode() {
        return carrierCode;
    }
    
}