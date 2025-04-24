package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Weight {

   @SerializedName("value")
   String value;

   @SerializedName("unit")
   String unit;


    public void setValue(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getUnit() {
        return unit;
    }
    
}