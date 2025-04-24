package com.wsi.print.POJO;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Output {

   @SerializedName("alerts")
   List<Alerts> alerts;

   @SerializedName("completeTrackResults")
   List<CompleteTrackResults> completeTrackResults;


    public void setAlerts(List<Alerts> alerts) {
        this.alerts = alerts;
    }
    public List<Alerts> getAlerts() {
        return alerts;
    }
    
    public void setCompleteTrackResults(List<CompleteTrackResults> completeTrackResults) {
        this.completeTrackResults = completeTrackResults;
    }
    public List<CompleteTrackResults> getCompleteTrackResults() {
        return completeTrackResults;
    }
    
}