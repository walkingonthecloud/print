package com.wsi.print.POJO;
import java.util.Date;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ScanEvents {

   @SerializedName("date")
   Date date;

   @SerializedName("eventType")
   String eventType;

   @SerializedName("eventDescription")
   String eventDescription;

   @SerializedName("exceptionCode")
   String exceptionCode;

   @SerializedName("exceptionDescription")
   String exceptionDescription;

   @SerializedName("scanLocation")
   ScanLocation scanLocation;

   @SerializedName("locationId")
   String locationId;

   @SerializedName("locationType")
   String locationType;

   @SerializedName("derivedStatusCode")
   String derivedStatusCode;

   @SerializedName("derivedStatus")
   String derivedStatus;


    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
    
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    public String getEventType() {
        return eventType;
    }
    
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
    public String getEventDescription() {
        return eventDescription;
    }
    
    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }
    public String getExceptionCode() {
        return exceptionCode;
    }
    
    public void setExceptionDescription(String exceptionDescription) {
        this.exceptionDescription = exceptionDescription;
    }
    public String getExceptionDescription() {
        return exceptionDescription;
    }
    
    public void setScanLocation(ScanLocation scanLocation) {
        this.scanLocation = scanLocation;
    }
    public ScanLocation getScanLocation() {
        return scanLocation;
    }
    
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
    public String getLocationId() {
        return locationId;
    }
    
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
    public String getLocationType() {
        return locationType;
    }
    
    public void setDerivedStatusCode(String derivedStatusCode) {
        this.derivedStatusCode = derivedStatusCode;
    }
    public String getDerivedStatusCode() {
        return derivedStatusCode;
    }
    
    public void setDerivedStatus(String derivedStatus) {
        this.derivedStatus = derivedStatus;
    }
    public String getDerivedStatus() {
        return derivedStatus;
    }
    
}