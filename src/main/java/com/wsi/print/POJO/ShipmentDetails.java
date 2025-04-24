package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ShipmentDetails {

   @SerializedName("possessionStatus")
   boolean possessionStatus;


    public void setPossessionStatus(boolean possessionStatus) {
        this.possessionStatus = possessionStatus;
    }
    public boolean getPossessionStatus() {
        return possessionStatus;
    }
    
}