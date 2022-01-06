package com.example.trial;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.squareup.picasso.Picasso;

import java.util.List;



public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private final List<ModelClass> userList;
    private final Context context ;

    public Adapter(List<ModelClass> userList, Context context)
    {
        this.userList = userList;

        this.context = context;
    }
//    public void setMovieList(List<ModelClass> userList) {
//        this.userList = userList;
//        notifyDataSetChanged();
//    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdesign,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        ModelClass modelClass = userList.get(position);


        Picasso.get().load(modelClass.getUrl()).into(holder.imageview1);
//holder.setData(resource,name);
holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        
        Toast.makeText(context, "Image id is : "+userList.get(position).getId(), Toast.LENGTH_SHORT).show();
//        String s = Integer.toString(position);
//        Intent i1 = new Intent(context,MainActivity2.class);
//        i1.putExtra("msg",s);
//        i1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        context.startActivity(i1);

//        String s1 = Integer.toString(userList.get(position).getBreeds().get(0).getId());
        String s2 = Integer.toString(userList.get(position).getWidth());
        String s3 = Integer.toString(userList.get(position).getHeight());
        Intent i =new Intent(context,MainActivity2.class);
        if( userList.get(position).getBreeds().get(0) != null) {


            i.putExtra("weightimperial", userList.get(position).getBreeds().get(0).getWeight().getImperial());
            i.putExtra("weightmetric", userList.get(position).getBreeds().get(0).getWeight().getMetric());
            i.putExtra("heightimperial", userList.get(position).getBreeds().get(0).getHeight().getImperial());
            i.putExtra("heightmetric", userList.get(position).getBreeds().get(0).getHeight().getMetric());
            i.putExtra("id", userList.get(position).getBreeds().get(0).getId());
            i.putExtra("name", userList.get(position).getBreeds().get(0).getName());
            i.putExtra("countrycode", userList.get(position).getBreeds().get(0).getCountry_code());
            i.putExtra("bredfor", userList.get(position).getBreeds().get(0).getBred_for());
            i.putExtra("breedgroup", userList.get(position).getBreeds().get(0).getBreed_group());
            i.putExtra("lifespan", userList.get(position).getBreeds().get(0).getLife_span());
            i.putExtra("temperament", userList.get(position).getBreeds().get(0).getTemperament());
            i.putExtra("referenceimageid", userList.get(position).getBreeds().get(0).getReference_image_id());
        }
        i.putExtra("ID",userList.get(position).getId());
        i.putExtra("url",userList.get(position).getUrl());
        i.putExtra("width",s2);
        i.putExtra("height",s3);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);



    }
});


    }

    @Override
    public int getItemCount() {

            return userList.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @SuppressLint("StaticFieldLeak")
        private  ImageView imageview1;
//        @SuppressLint("StaticFieldLeak")
//        private  TextView textview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageview1 = itemView.findViewById(R.id.imageview1);
//            textview = itemView.findViewById(R.id.textview);
           

        }


    }
}
