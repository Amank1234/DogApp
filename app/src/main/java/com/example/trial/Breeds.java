package com.example.trial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Breeds {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
            @Expose
            private int id;
    @SerializedName("country_code")
            @Expose
            private String country_code;
    @SerializedName("bred_for")
            @Expose
            private String bred_for;
    @SerializedName("life_span")
            @Expose
            private String life_span;
    @SerializedName("temperament")
            @Expose
            private String temperament;
    @SerializedName("reference_image_id")
            @Expose
            private String reference_image_id;
@SerializedName("weight")
        @Expose
        private Weight weight;
@SerializedName("height")
        @Expose
        private Height height;
@SerializedName("breed_group")
        @Expose
        private String breed_group;

    Breeds(String name,int id,String country_code,String bred_for,String life_span,String temperament,String reference_image_id,Weight weight,Height height,String breed_group)
    {
this.name = name;
this.id = id;
this.country_code = country_code;
this.bred_for = bred_for;
this.life_span = life_span;
this.temperament = temperament;
this.reference_image_id = reference_image_id;
this.weight = weight;
this.height = height;
this.breed_group=breed_group;
    }

    public String getName() {
        return name;
    }

    public Weight getWeight() {
        return weight;
    }

    public Height getHeight() {
        return height;
    }

    public int getId() {
        return id;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getBred_for() {
        return bred_for;
    }

    public String getBreed_group() {
        return breed_group;
    }

    public String getLife_span() {
        return life_span;
    }

    public String getTemperament() {
        return temperament;
    }

    public String getReference_image_id() {
        return reference_image_id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBred_for(String bred_for) {
        this.bred_for = bred_for;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public void setLife_span(String life_span) {
        this.life_span = life_span;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public void setReference_image_id(String reference_image_id) {
        this.reference_image_id = reference_image_id;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public void setBreed_group(String breed_group) {
        this.breed_group = breed_group;
    }
}
