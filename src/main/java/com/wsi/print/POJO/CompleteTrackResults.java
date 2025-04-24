package com.wsi.print.POJO;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CompleteTrackResults {

   @SerializedName("trackingNumber")
   String trackingNumber;

   @SerializedName("trackResults")
   List<TrackResults> trackResults;


    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
    public String getTrackingNumber() {
        return trackingNumber;
    }
    
    public void setTrackResults(List<TrackResults> trackResults) {
        this.trackResults = trackResults;
    }
    public List<TrackResults> getTrackResults() {
        return trackResults;
    }
    
}