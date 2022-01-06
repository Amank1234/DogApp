package com.example.trial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
//    public static String BASE_URL = "https://api.thedogapi.com";
    private static Retrofit retrofit;
    private static ApiClient instance = null;
    private static ApiInterface myApi;

//     static Gson gson = new GsonBuilder()
//            .setLenient()
//            .create();


    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//     interceptor.level(HttpLoggingInterceptor.Level.BODY);
    OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiInterface.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            myApi = retrofit.create(ApiInterface.class);
        }
        return retrofit;
    }
    public static synchronized ApiClient getInstance() {
        if (instance == null) {
            instance = new ApiClient();
        }
        return instance;
    }
//    public static synchronized ApiClient getInstance() {
//        if (instance == null) {
//            instance = new ApiClient();
//        }
//        return instance;
//    }
//
    public ApiInterface getMyApi() {
        return myApi;
    }
//    private ServiceHelper() {
//        httpClient = new OkHttpClient.Builder();
//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        httpClient.interceptors().add(interceptor);
//        Retrofit retrofit = createAdapter().build();
//        service = retrofit.create(IService.class);
//    }
}
