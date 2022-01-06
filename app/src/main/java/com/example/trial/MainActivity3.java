//package com.example.trial;
//
//import androidx.activity.result.ActivityResultLauncher;
//import androidx.activity.result.contract.ActivityResultContracts;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Instrumentation;
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//
//import com.github.drjacky.imagepicker.ImagePicker;
//
//public class MainActivity3 extends AppCompatActivity {
//ImageView imageView3;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
//        imageView3 = findViewById(R.id.imageView3);
//        Button button3 = findViewById(R.id.button3);
//
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ImagePicker.Companion.with(MainActivity3.this)
//                .crop()	    			//Crop image(Optional), Check Customization for more option
//                .cropOval()	    		//Allow dimmed layer to have a circle inside
//                .cropFreeStyle()	    //Let the user to resize crop bounds
//                .galleryOnly()          //We have to define what image provider we want to use
//                .maxResultSize(1080, 1080,true)	//Final image resolution will be less than 1080 x 1080(Optional)
//                        .createIntent();
//            }
//        });
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        assert data != null;
//        Uri uri = data.getData();
//        imageView3.setImageURI(uri);
////        ActivityResultLauncher<Intent> launcher =
////                registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), (Instrumentation.ActivityResult result) -> {
////                    if (result.getResultCode() == RESULT_OK) {
////                        Uri uri = result.getData().getData();
////                        // Use the uri to load the image
////                    } else if (result.getResultCode() == ImagePicker.RESULT_ERROR) {
////                        // Use ImagePicker.Companion.getError(result.getData()) to show an error
////                    }
////                });
//    }
//}