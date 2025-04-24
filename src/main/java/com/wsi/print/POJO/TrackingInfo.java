package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrackingInfo {

   @SerializedName("trackingNumberInfo")
   TrackingNumberInfo trackingNumberInfo;


    public void setTrackingNumberInfo(TrackingNumberInfo trackingNumberInfo) {
        this.trackingNumberInfo = trackingNumberInfo;
    }
    public TrackingNumberInfo getTrackingNumberInfo() {
        return trackingNumberInfo;
    }
    
}