package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class OriginLocation {

   @SerializedName("locationContactAndAddress")
   LocationContactAndAddress locationContactAndAddress;


    public void setLocationContactAndAddress(LocationContactAndAddress locationContactAndAddress) {
        this.locationContactAndAddress = locationContactAndAddress;
    }
    public LocationContactAndAddress getLocationContactAndAddress() {
        return locationContactAndAddress;
    }
    
}