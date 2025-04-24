package com.wsi.print.POJO;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class WeightAndDimensions {

   @SerializedName("weight")
   List<Weight> weight;

   @SerializedName("dimensions")
   List<Dimensions> dimensions;


    public void setWeight(List<Weight> weight) {
        this.weight = weight;
    }
    public List<Weight> getWeight() {
        return weight;
    }
    
    public void setDimensions(List<Dimensions> dimensions) {
        this.dimensions = dimensions;
    }
    public List<Dimensions> getDimensions() {
        return dimensions;
    }
    
}