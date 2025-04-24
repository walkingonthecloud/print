package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class DeliveryOptionEligibilityDetails {

   @SerializedName("option")
   String option;

   @SerializedName("eligibility")
   String eligibility;


    public void setOption(String option) {
        this.option = option;
    }
    public String getOption() {
        return option;
    }
    
    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }
    public String getEligibility() {
        return eligibility;
    }
    
}