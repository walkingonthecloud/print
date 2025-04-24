package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class HoldAtLocation {

   @SerializedName("locationContactAndAddress")
   LocationContactAndAddress locationContactAndAddress;

   @SerializedName("locationId")
   String locationId;


    public void setLocationContactAndAddress(LocationContactAndAddress locationContactAndAddress) {
        this.locationContactAndAddress = locationContactAndAddress;
    }
    public LocationContactAndAddress getLocationContactAndAddress() {
        return locationContactAndAddress;
    }
    
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
    public String getLocationId() {
        return locationId;
    }
    
}