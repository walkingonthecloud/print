package com.wsi.print.POJO;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PackageIdentifiers {

   @SerializedName("type")
   String type;

   @SerializedName("values")
   List<String> values;

   @SerializedName("trackingNumberUniqueId")
   String trackingNumberUniqueId;

   @SerializedName("carrierCode")
   String carrierCode;


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
    public void setValues(List<String> values) {
        this.values = values;
    }
    public List<String> getValues() {
        return values;
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