package com.example.trial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.File;

import okhttp3.MultipartBody;

public class Send {

    File file;

    String sub_id;
    public Send(File file, String sub_id)
    {
        this.file =file;
        this.sub_id=sub_id;
    }
}
