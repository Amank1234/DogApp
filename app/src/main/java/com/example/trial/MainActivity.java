package com.example.trial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.navigationrail.NavigationRailMenuView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;
    ApiInterface apiService;
    RequestQueue requestQueue;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
//        recyclerView.setAdapter(adapter);
//        adapter.setMovieList(userList);
//        adapter.notifyDataSetChanged();
        apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<ModelClass>> call = apiService.getData();


        call.enqueue(new Callback<List<ModelClass>>() {
            @Override
            public void onResponse(@NotNull Call<List<ModelClass>> call, @NotNull Response<List<ModelClass>> response) {
                userList = response.body();
                Log.d("TAG", "Response = " + userList);
                adapter = new Adapter(userList, MainActivity.this);
                recyclerView.setAdapter(adapter);

            }


            @Override
            public void onFailure(@NotNull Call<List<ModelClass>> call, @NotNull Throwable t) {
                Log.d("give", "See = " + t.toString());
            }
        });


        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.upload) {
                    Toast.makeText(MainActivity.this, "Upload", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, MainActivity4.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);
                } else if (item.getItemId() == R.id.exit) {
//                    Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                    finishAffinity();
                    System.exit(0);
                }
                return true;
            }
        });

    }
}


