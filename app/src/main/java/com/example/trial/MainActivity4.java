package com.example.trial;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.FileUtils;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.dhaval2404.imagepicker.ImagePicker;

import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//import com.github.drjacky.imagepicker.ImagePicker;

public class MainActivity4<mediaPath> extends AppCompatActivity {
    ImageView imageView3;
    private Bitmap bitmap;
    private int IMG_REQUEST = 21;
public String mediaPath;
Button button4;
Uri uri;
List<ResponsePOJO> responsePOJO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imageView3 = findViewById(R.id.imageView3);
        Button button3 = findViewById(R.id.button3);
         button4 = findViewById(R.id.button4);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity4.this, "I clicked", Toast.LENGTH_SHORT).show();
                ImagePicker.Companion.with(MainActivity4.this)
                        .crop()	    			//Crop image(Optional), Check Customization for more option
                        .compress(1024)			//Final image size will be less than 1 MB(Optional)
                        .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
                        .start();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadImage();
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            uri = data.getData();
            imageView3.setImageURI(uri);

        }
    }

    public void uploadImage() {


        Log.d("Path","Mediapath = "+mediaPath);
//            File file = new File("/storage/emulated/0/Android/data/com.example.trial/files/DCIM/IMG_20210819_204501933.jpg");
        File file = new File("/storage/emulated/0/Android/data/com.example.trial/files/Downloads/IMG_20211004_232043444.jpg");
//        File file = new File("/storage/emulated/0/Android/data/com.example.trial/files/DCIM/IMG_20211004_232043444.jpg");
            //        File file = new File("/storage/emulated/0/Download/IMG_20210819_204501933.jpg");
//        File file = new File(mediaPath);

//        Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM),"cs_"+new Date().getTime()+".jpg"
        RequestBody requestFile = RequestBody.create(file,MediaType.parse("multipart/form-data"));
        MultipartBody.Part body = MultipartBody.Part.createFormData("image",file.getName(),requestFile);
        Send ob = new Send(file,"");
        Call<List<ResponsePOJO>> call = RetroClient.getInstance().getApi().uploadImage(ob);
        call.enqueue(new Callback<List<ResponsePOJO>>() {
            @Override
            public void onResponse(@NotNull Call<List<ResponsePOJO>> call, @NotNull Response<List<ResponsePOJO>> response) {
                responsePOJO = response.body();
                if(responsePOJO != null)
                {
                    Toast.makeText(MainActivity4.this, responsePOJO.get(0).getId(), Toast.LENGTH_SHORT).show();
                }


                Log.d("Displaynew","Pass="+response.body());
            }

            @Override
            public void onFailure(@NotNull Call<List<ResponsePOJO>> call, @NotNull Throwable t) {
Log.d("Check","Failed");
            }
        });

    }

}