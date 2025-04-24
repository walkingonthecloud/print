package com.wsi.print.POJO;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class LatestStatusDetail {

   @SerializedName("code")
   String code;

   @SerializedName("derivedCode")
   String derivedCode;

   @SerializedName("statusByLocale")
   String statusByLocale;

   @SerializedName("description")
   String description;

   @SerializedName("scanLocation")
   ScanLocation scanLocation;

   @SerializedName("ancillaryDetails")
   List<AncillaryDetails> ancillaryDetails;


    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
    
    public void setDerivedCode(String derivedCode) {
        this.derivedCode = derivedCode;
    }
    public String getDerivedCode() {
        return derivedCode;
    }
    
    public void setStatusByLocale(String statusByLocale) {
        this.statusByLocale = statusByLocale;
    }
    public String getStatusByLocale() {
        return statusByLocale;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setScanLocation(ScanLocation scanLocation) {
        this.scanLocation = scanLocation;
    }
    public ScanLocation getScanLocation() {
        return scanLocation;
    }
    
    public void setAncillaryDetails(List<AncillaryDetails> ancillaryDetails) {
        this.ancillaryDetails = ancillaryDetails;
    }
    public List<AncillaryDetails> getAncillaryDetails() {
        return ancillaryDetails;
    }
    
}