package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AncillaryDetails {

   @SerializedName("reason")
   String reason;

   @SerializedName("reasonDescription")
   String reasonDescription;

   @SerializedName("action")
   String action;

   @SerializedName("actionDescription")
   String actionDescription;


    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getReason() {
        return reason;
    }
    
    public void setReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
    }
    public String getReasonDescription() {
        return reasonDescription;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
    public String getAction() {
        return action;
    }
    
    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }
    public String getActionDescription() {
        return actionDescription;
    }
    
}