package com.wsi.print.POJO;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class FedexTrackingRequest {

   @SerializedName("includeDetailedScans")
   boolean includeDetailedScans;

   @SerializedName("trackingInfo")
   List<TrackingInfo> trackingInfo;


    public void setIncludeDetailedScans(boolean includeDetailedScans) {
        this.includeDetailedScans = includeDetailedScans;
    }
    public boolean getIncludeDetailedScans() {
        return includeDetailedScans;
    }
    
    public void setTrackingInfo(List<TrackingInfo> trackingInfo) {
        this.trackingInfo = trackingInfo;
    }
    public List<TrackingInfo> getTrackingInfo() {
        return trackingInfo;
    }
    
}