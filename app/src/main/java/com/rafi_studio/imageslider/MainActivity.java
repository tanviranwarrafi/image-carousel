package com.rafi_studio.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Image Carousel");
        getSupportActionBar().setElevation(0);

        imageSlider = findViewById(R.id.imageSlider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.pstu_twoo, ""));
        slideModels.add(new SlideModel(R.drawable.pstu_three, ""));
        slideModels.add(new SlideModel(R.drawable.pstu_four, ""));
        slideModels.add(new SlideModel(R.drawable.pstu_five, ""));
        imageSlider.setImageList(slideModels, true);
    }
}
