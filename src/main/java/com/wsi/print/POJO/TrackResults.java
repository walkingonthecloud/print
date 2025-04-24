package com.wsi.print.POJO;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TrackResults {

   @SerializedName("trackingNumberInfo")
   TrackingNumberInfo trackingNumberInfo;

   @SerializedName("additionalTrackingInfo")
   AdditionalTrackingInfo additionalTrackingInfo;

   @SerializedName("shipperInformation")
   ShipperInformation shipperInformation;

   @SerializedName("recipientInformation")
   RecipientInformation recipientInformation;

   @SerializedName("latestStatusDetail")
   LatestStatusDetail latestStatusDetail;

   @SerializedName("dateAndTimes")
   List<DateAndTimes> dateAndTimes;

   @SerializedName("availableImages")
   List<String> availableImages;

   @SerializedName("specialHandlings")
   List<SpecialHandlings> specialHandlings;

   @SerializedName("packageDetails")
   PackageDetails packageDetails;

   @SerializedName("shipmentDetails")
   ShipmentDetails shipmentDetails;

   @SerializedName("scanEvents")
   List<ScanEvents> scanEvents;

   @SerializedName("availableNotifications")
   List<String> availableNotifications;

   @SerializedName("deliveryDetails")
   DeliveryDetails deliveryDetails;

   @SerializedName("originLocation")
   OriginLocation originLocation;

   @SerializedName("holdAtLocation")
   HoldAtLocation holdAtLocation;

   @SerializedName("lastUpdatedDestinationAddress")
   LastUpdatedDestinationAddress lastUpdatedDestinationAddress;

   @SerializedName("serviceCommitMessage")
   ServiceCommitMessage serviceCommitMessage;

   @SerializedName("serviceDetail")
   ServiceDetail serviceDetail;

   @SerializedName("standardTransitTimeWindow")
   StandardTransitTimeWindow standardTransitTimeWindow;

   @SerializedName("estimatedDeliveryTimeWindow")
   EstimatedDeliveryTimeWindow estimatedDeliveryTimeWindow;

   @SerializedName("customDeliveryOptions")
   List<CustomDeliveryOptions> customDeliveryOptions;

   @SerializedName("goodsClassificationCode")
   String goodsClassificationCode;

   @SerializedName("returnDetail")
   ReturnDetail returnDetail;


    public void setTrackingNumberInfo(TrackingNumberInfo trackingNumberInfo) {
        this.trackingNumberInfo = trackingNumberInfo;
    }
    public TrackingNumberInfo getTrackingNumberInfo() {
        return trackingNumberInfo;
    }
    
    public void setAdditionalTrackingInfo(AdditionalTrackingInfo additionalTrackingInfo) {
        this.additionalTrackingInfo = additionalTrackingInfo;
    }
    public AdditionalTrackingInfo getAdditionalTrackingInfo() {
        return additionalTrackingInfo;
    }
    
    public void setShipperInformation(ShipperInformation shipperInformation) {
        this.shipperInformation = shipperInformation;
    }
    public ShipperInformation getShipperInformation() {
        return shipperInformation;
    }
    
    public void setRecipientInformation(RecipientInformation recipientInformation) {
        this.recipientInformation = recipientInformation;
    }
    public RecipientInformation getRecipientInformation() {
        return recipientInformation;
    }
    
    public void setLatestStatusDetail(LatestStatusDetail latestStatusDetail) {
        this.latestStatusDetail = latestStatusDetail;
    }
    public LatestStatusDetail getLatestStatusDetail() {
        return latestStatusDetail;
    }
    
    public void setDateAndTimes(List<DateAndTimes> dateAndTimes) {
        this.dateAndTimes = dateAndTimes;
    }
    public List<DateAndTimes> getDateAndTimes() {
        return dateAndTimes;
    }
    
    public void setAvailableImages(List<String> availableImages) {
        this.availableImages = availableImages;
    }
    public List<String> getAvailableImages() {
        return availableImages;
    }
    
    public void setSpecialHandlings(List<SpecialHandlings> specialHandlings) {
        this.specialHandlings = specialHandlings;
    }
    public List<SpecialHandlings> getSpecialHandlings() {
        return specialHandlings;
    }
    
    public void setPackageDetails(PackageDetails packageDetails) {
        this.packageDetails = packageDetails;
    }
    public PackageDetails getPackageDetails() {
        return packageDetails;
    }
    
    public void setShipmentDetails(ShipmentDetails shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }
    public ShipmentDetails getShipmentDetails() {
        return shipmentDetails;
    }
    
    public void setScanEvents(List<ScanEvents> scanEvents) {
        this.scanEvents = scanEvents;
    }
    public List<ScanEvents> getScanEvents() {
        return scanEvents;
    }
    
    public void setAvailableNotifications(List<String> availableNotifications) {
        this.availableNotifications = availableNotifications;
    }
    public List<String> getAvailableNotifications() {
        return availableNotifications;
    }
    
    public void setDeliveryDetails(DeliveryDetails deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }
    public DeliveryDetails getDeliveryDetails() {
        return deliveryDetails;
    }
    
    public void setOriginLocation(OriginLocation originLocation) {
        this.originLocation = originLocation;
    }
    public OriginLocation getOriginLocation() {
        return originLocation;
    }
    
    public void setHoldAtLocation(HoldAtLocation holdAtLocation) {
        this.holdAtLocation = holdAtLocation;
    }
    public HoldAtLocation getHoldAtLocation() {
        return holdAtLocation;
    }
    
    public void setLastUpdatedDestinationAddress(LastUpdatedDestinationAddress lastUpdatedDestinationAddress) {
        this.lastUpdatedDestinationAddress = lastUpdatedDestinationAddress;
    }
    public LastUpdatedDestinationAddress getLastUpdatedDestinationAddress() {
        return lastUpdatedDestinationAddress;
    }
    
    public void setServiceCommitMessage(ServiceCommitMessage serviceCommitMessage) {
        this.serviceCommitMessage = serviceCommitMessage;
    }
    public ServiceCommitMessage getServiceCommitMessage() {
        return serviceCommitMessage;
    }
    
    public void setServiceDetail(ServiceDetail serviceDetail) {
        this.serviceDetail = serviceDetail;
    }
    public ServiceDetail getServiceDetail() {
        return serviceDetail;
    }
    
    public void setStandardTransitTimeWindow(StandardTransitTimeWindow standardTransitTimeWindow) {
        this.standardTransitTimeWindow = standardTransitTimeWindow;
    }
    public StandardTransitTimeWindow getStandardTransitTimeWindow() {
        return standardTransitTimeWindow;
    }
    
    public void setEstimatedDeliveryTimeWindow(EstimatedDeliveryTimeWindow estimatedDeliveryTimeWindow) {
        this.estimatedDeliveryTimeWindow = estimatedDeliveryTimeWindow;
    }
    public EstimatedDeliveryTimeWindow getEstimatedDeliveryTimeWindow() {
        return estimatedDeliveryTimeWindow;
    }
    
    public void setCustomDeliveryOptions(List<CustomDeliveryOptions> customDeliveryOptions) {
        this.customDeliveryOptions = customDeliveryOptions;
    }
    public List<CustomDeliveryOptions> getCustomDeliveryOptions() {
        return customDeliveryOptions;
    }
    
    public void setGoodsClassificationCode(String goodsClassificationCode) {
        this.goodsClassificationCode = goodsClassificationCode;
    }
    public String getGoodsClassificationCode() {
        return goodsClassificationCode;
    }
    
    public void setReturnDetail(ReturnDetail returnDetail) {
        this.returnDetail = returnDetail;
    }
    public ReturnDetail getReturnDetail() {
        return returnDetail;
    }
    
}