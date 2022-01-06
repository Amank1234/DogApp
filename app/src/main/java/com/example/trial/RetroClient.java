package com.example.trial;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClient
{

    private static final String BASE_URL = "https://api.thedogapi.com";
    private static RetroClient myClient;
    private final Retrofit retrofit;
     RetroClient()
    {
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }
    public static synchronized RetroClient getInstance()
    {
        if(myClient == null)
        {
            myClient = new RetroClient();
        }
        return myClient;
    }

    public Api getApi()
    {
        return retrofit.create(Api.class);
    }
}
