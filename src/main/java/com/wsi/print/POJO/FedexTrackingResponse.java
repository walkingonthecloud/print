package com.wsi.print.POJO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class FedexTrackingResponse {

   @SerializedName("transactionId")
   String transactionId;

   @SerializedName("customertransactionId")
   String customertransactionId;

   @SerializedName("output")
   Output output;


    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getTransactionId() {
        return transactionId;
    }
    
    public void setCustomertransactionId(String customertransactionId) {
        this.customertransactionId = customertransactionId;
    }
    public String getCustomertransactionId() {
        return customertransactionId;
    }
    
    public void setOutput(Output output) {
        this.output = output;
    }
    public Output getOutput() {
        return output;
    }
    
}