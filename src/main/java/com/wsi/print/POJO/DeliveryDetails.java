package com.wsi.print.POJO;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class DeliveryDetails {

   @SerializedName("deliveryAttempts")
   String deliveryAttempts;

   @SerializedName("deliveryOptionEligibilityDetails")
   List<DeliveryOptionEligibilityDetails> deliveryOptionEligibilityDetails;

   @SerializedName("destinationServiceArea")
   String destinationServiceArea;


    public void setDeliveryAttempts(String deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
    }
    public String getDeliveryAttempts() {
        return deliveryAttempts;
    }
    
    public void setDeliveryOptionEligibilityDetails(List<DeliveryOptionEligibilityDetails> deliveryOptionEligibilityDetails) {
        this.deliveryOptionEligibilityDetails = deliveryOptionEligibilityDetails;
    }
    public List<DeliveryOptionEligibilityDetails> getDeliveryOptionEligibilityDetails() {
        return deliveryOptionEligibilityDetails;
    }
    
    public void setDestinationServiceArea(String destinationServiceArea) {
        this.destinationServiceArea = destinationServiceArea;
    }
    public String getDestinationServiceArea() {
        return destinationServiceArea;
    }
    
}