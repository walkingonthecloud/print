package com.wsi.print.POJO;
import java.util.Date;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class DateAndTimes {

   @SerializedName("type")
   String type;

   @SerializedName("dateTime")
   Date dateTime;


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    public Date getDateTime() {
        return dateTime;
    }
    
}