package com.wsi.print.POJO;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PackageDetails {

   @SerializedName("packagingDescription")
   PackagingDescription packagingDescription;

   @SerializedName("physicalPackagingType")
   String physicalPackagingType;

   @SerializedName("sequenceNumber")
   String sequenceNumber;

   @SerializedName("count")
   String count;

   @SerializedName("weightAndDimensions")
   WeightAndDimensions weightAndDimensions;

   @SerializedName("packageContent")
   List<String> packageContent;


    public void setPackagingDescription(PackagingDescription packagingDescription) {
        this.packagingDescription = packagingDescription;
    }
    public PackagingDescription getPackagingDescription() {
        return packagingDescription;
    }
    
    public void setPhysicalPackagingType(String physicalPackagingType) {
        this.physicalPackagingType = physicalPackagingType;
    }
    public String getPhysicalPackagingType() {
        return physicalPackagingType;
    }
    
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    public String getSequenceNumber() {
        return sequenceNumber;
    }
    
    public void setCount(String count) {
        this.count = count;
    }
    public String getCount() {
        return count;
    }
    
    public void setWeightAndDimensions(WeightAndDimensions weightAndDimensions) {
        this.weightAndDimensions = weightAndDimensions;
    }
    public WeightAndDimensions getWeightAndDimensions() {
        return weightAndDimensions;
    }
    
    public void setPackageContent(List<String> packageContent) {
        this.packageContent = packageContent;
    }
    public List<String> getPackageContent() {
        return packageContent;
    }
    
}