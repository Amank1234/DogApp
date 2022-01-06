package com.example.trial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelClass {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("breeds")
    @Expose
            private List<Breeds> breeds;
    @SerializedName("width")
            @Expose
            private int width;
    @SerializedName("height")
            @Expose
            private int height;

    ModelClass(String id, String url, List<Breeds> breeds,int width,int height)
    {

        this.id = id;
        this.url = url;
        this.breeds = breeds;
        this.height = height;
        this.width = width;
    }
    public String getId()
    {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public List<Breeds> getBreeds() {
        return breeds;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public void setBreeds(List<Breeds> breeds) {
        this.breeds = breeds;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    //    @NonNull
//    @Override
//    public String toString() {
//        return android_version_name;
//    }
}
