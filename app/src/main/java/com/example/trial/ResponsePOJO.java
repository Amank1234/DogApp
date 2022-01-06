package com.example.trial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponsePOJO {
    @SerializedName("id")
    @Expose
     public String id;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("width")
    @Expose
    public  int width;
    @SerializedName("height")
    @Expose
    public int height;
    @SerializedName("original_filename")
    @Expose
    public  String original_filename;
//    @SerializedName("pending")
//    @Expose
//    public  int pending;
//    @SerializedName("approved")
//    @Expose
//    public  int approved;
@SerializedName("created_at")
@Expose
public  String created_at;
    @SerializedName("breed_ids")
    @Expose
    public  String breed_ids;
    @SerializedName("sub_id")
    @Expose
    public  String sub_id;
    @SerializedName("breeds")
    @Expose
    public List<Breeds> breeds;
     public ResponsePOJO(String id, String url, int width, int height, String original_filename, String created_at, String breed_ids,String sub_id,List<Breeds> breeds) {

        this.id = id;
        this.url = url;
        this.width = width;
        this.height = height;
        this.original_filename = original_filename;
        this.created_at = created_at;
        this.breed_ids = breed_ids;
        this.sub_id = sub_id;
         this.breeds = breeds;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getBreed_ids() {
        return breed_ids;
    }

    public String getSub_id() {
        return sub_id;
    }
    public List<Breeds> getBreeds() {
        return breeds;
    }
    public String getId() {
        return id;
    }

    public String getOriginal_filename() {
        return original_filename;
    }

    public String getUrl() {
        return url;
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

    public void setOriginal_filename(String original_filename) {
        this.original_filename = original_filename;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setBreed_ids(String breed_ids) {
        this.breed_ids = breed_ids;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }
}

