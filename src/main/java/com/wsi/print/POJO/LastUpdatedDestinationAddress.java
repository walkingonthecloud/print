package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class LastUpdatedDestinationAddress {

   @SerializedName("city")
   String city;

   @SerializedName("stateOrProvinceCode")
   String stateOrProvinceCode;

   @SerializedName("countryCode")
   String countryCode;

   @SerializedName("residential")
   boolean residential;

   @SerializedName("countryName")
   String countryName;


    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    
    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }
    
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getCountryCode() {
        return countryCode;
    }
    
    public void setResidential(boolean residential) {
        this.residential = residential;
    }
    public boolean getResidential() {
        return residential;
    }
    
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getCountryName() {
        return countryName;
    }
    
}