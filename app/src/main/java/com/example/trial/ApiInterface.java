package com.example.trial;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
     String BASE_URL = "https://api.thedogapi.com";
    @GET("/v1/images/search?api_key=87b07539-3646-4e67-94fb-b86b52998851&limit=40&order=RANDOM")

    Call<List<ModelClass>> getData();
}
