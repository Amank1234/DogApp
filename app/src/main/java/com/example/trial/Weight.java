package com.example.trial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weight
{

    @SerializedName("imperial")
    @Expose
    private String imperial;
    @SerializedName("metric")
    @Expose
    private String metric;

    Weight(String imperial,String metric)
    {
        this.imperial = imperial;
        this.metric = metric;
    }

    public String getImperial() {
        return imperial;
    }

    public String getMetric() {
        return metric;
    }

    public void setImperial(String imperial) {
        this.imperial = imperial;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }
}

