package com.example.trial;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Api
{

    @POST("/v1/images/upload?api_key=87b07539-3646-4e67-94fb-b86b52998851")

//    Call<ResponsePOJO> uploadImage(@Part("file") MultipartBody.Part file,@Part("sub_id") String s);
//    Call<ResponsePOJO> uploadImage(@Part("file") MultipartBody.Part file,@Part("sub_id") String s);

    Call<List<ResponsePOJO>> uploadImage(@Body Send ob);
}
