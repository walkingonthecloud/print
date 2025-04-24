package com.wsi.print.POJO;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AdditionalTrackingInfo {

   @SerializedName("nickname")
   String nickname;

   @SerializedName("packageIdentifiers")
   List<PackageIdentifiers> packageIdentifiers;

   @SerializedName("hasAssociatedShipments")
   boolean hasAssociatedShipments;


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getNickname() {
        return nickname;
    }
    
    public void setPackageIdentifiers(List<PackageIdentifiers> packageIdentifiers) {
        this.packageIdentifiers = packageIdentifiers;
    }
    public List<PackageIdentifiers> getPackageIdentifiers() {
        return packageIdentifiers;
    }
    
    public void setHasAssociatedShipments(boolean hasAssociatedShipments) {
        this.hasAssociatedShipments = hasAssociatedShipments;
    }
    public boolean getHasAssociatedShipments() {
        return hasAssociatedShipments;
    }
    
}