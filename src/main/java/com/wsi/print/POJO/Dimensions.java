package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Dimensions {

   @SerializedName("length")
   int length;

   @SerializedName("width")
   int width;

   @SerializedName("height")
   int height;

   @SerializedName("units")
   String units;


    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    
    public void setUnits(String units) {
        this.units = units;
    }
    public String getUnits() {
        return units;
    }
    
}