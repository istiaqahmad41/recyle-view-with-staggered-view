package com.example.rv_withstaggeredview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);



getIncomingIntent();




    }
    private void getIncomingIntent(){
        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){



            String imageurl =getIntent().getStringExtra("image_url");
            String imageName =getIntent().getStringExtra("image_name");
            setImage(imageurl,imageName);



        }


    }
    private void setImage(String imageUrl, String imageName) {
        //Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.detail_text);
        name.setText(imageName);

        ImageView image = findViewById(R.id.detail_image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }


    }