package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ServiceDetail {

   @SerializedName("type")
   String type;

   @SerializedName("description")
   String description;

   @SerializedName("shortDescription")
   String shortDescription;


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    
}