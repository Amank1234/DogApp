package com.example.trial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity2 extends AppCompatActivity {
private TextView textView4;
    private TextView textView6;
    private TextView textView9;
    private TextView textView11;
    private TextView textView13;
    private TextView textView15;
    private TextView textView17;
    private TextView textView19;
    private TextView textView21;
    private TextView textView23;
    private TextView textView25;
    private TextView textView27;
    private TextView textView29;
    private TextView textView31;
    private TextView textView33;
    private TextView textView35;
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView4 = findViewById(R.id.textView4);
        textView6 = findViewById(R.id.textView6);
        textView9 = findViewById(R.id.textView9);
        textView11 = findViewById(R.id.textView11);
        textView13 = findViewById(R.id.textView13);
        textView15 = findViewById(R.id.textView15);
        textView17 = findViewById(R.id.textView17);
        textView19 = findViewById(R.id.textView19);
        textView21 = findViewById(R.id.textView21);
        textView23 = findViewById(R.id.textView23);
        textView25 = findViewById(R.id.textView25);
        textView27 = findViewById(R.id.textView27);
        textView29 = findViewById(R.id.textView29);
        textView31 = findViewById(R.id.textView31);
        textView33 = findViewById(R.id.textView33);
        textView35 = findViewById(R.id.textView35);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        Intent k =getIntent();
        String p1 = k.getStringExtra("weightimperial");
        textView4.setText(p1);
        String p2 = k.getStringExtra("weightmetric");
        textView6.setText(p2);
        String p3 = k.getStringExtra("heightimperial");
        textView9.setText(p3);
        String p4 = k.getStringExtra("heightmetric");
        textView11.setText(p4);
        int p5 = k.getIntExtra("id",0);
        String k1 = Integer.toString(p5);
        textView13.setText(k1);
        String p6 = k.getStringExtra("name");
        textView15.setText(p6);
        String p7 = k.getStringExtra("countrycode");
        textView17.setText(p7);
        String p8 = k.getStringExtra("bredfor");
        textView19.setText(p8);
        String p9 = k.getStringExtra("breedgroup");
        textView21.setText(p9);
        String p10 = k.getStringExtra("lifespan");
        textView23.setText(p10);
        String p11 = k.getStringExtra("temperament");
        textView25.setText(p11);
        String p12 = k.getStringExtra("referenceimageid");
        textView27.setText(p12);
        String p13 = k.getStringExtra("ID");
        textView29.setText(p13);
        String p14 = k.getStringExtra("url");
        textView31.setText(p14);
        String p15 = k.getStringExtra("width");
        textView33.setText(p15);
        String p16 = k.getStringExtra("height");
        textView35.setText(p16);
    }
    public void reverse(View v)
    {
        Intent i1 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i1);
    }
    public void end(View v)
    {
        finishAffinity();
        System.exit(0);
    }
}

//        textView2 = findViewById(R.id.textView2);
//        RequestQueue requestQueue;
//        requestQueue = Volley.newRequestQueue(this);
//        Intent k = getIntent();
//        String p1 = k.getStringExtra("msg");
//        int num = Integer.parseInt(p1);
//
//        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, "https://api.thedogapi.com/v1/images/search?api_key=cbae1cbf-8e4c-41ba-b294-cc308d855b03&limit=10&page=1&order=ASC", null, new Response.Listener<JSONArray>() {
//            @Override
//            public void onResponse(JSONArray response) {
//                JSONArray array2 = new JSONArray();
//                try {
//                    array2 = response.getJSONArray(num);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//                for(int l=0;l<array2.length();l++) {
//
//
//                    JSONArray array1 = new JSONArray();
//                    try {
//                        array1 = response.getJSONArray(l);
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//
//// loop through that array and get nested arrays
//                    for (int i = 0; i < array1.length(); i++) {
//                        JSONArray subArray = null;
//                        try {
//                            subArray = array1.getJSONArray(i);
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                        // loop trhough those nested arrays to retrieve the objects
//                        for (int j = 0; j < subArray.length(); j++) {
//                            JSONObject obj = null;
//                            try {
//                                obj = subArray.getJSONObject(j);
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//                            // parse the object properties...
//                            textView2.setText(obj.toString());
//                        }
//                    }
//                }
//            }
//
//        } ,new  Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.d("aman","Something went wrong");
//                Toast.makeText(MainActivity2.this, "We have an error", Toast.LENGTH_SHORT).show();
//            }
//        });
//        requestQueue.add(jsonArrayRequest);
//    }