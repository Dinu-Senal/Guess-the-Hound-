package com.example.guessthehound_w1742312;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * Author : Dinu Senal Sendanayake
 * IIT Number : 2018445
 * UOW Number : W1742312
 * Activity : Search Page
 */

public class activity_search_dog_breed extends AppCompatActivity {

    // Images that spin
    int[] images = {R.drawable.img_01, R.drawable.img_02, R.drawable.img_03,
            R.drawable.img_04, R.drawable.img_05, R.drawable.img_06,
            R.drawable.img_07, R.drawable.img_08, R.drawable.img_09,
            R.drawable.img_10, R.drawable.img_11, R.drawable.img_12,
            R.drawable.img_13, R.drawable.img_14, R.drawable.img_15,
            R.drawable.img_16, R.drawable.img_17, R.drawable.img_18,
            R.drawable.img_19, R.drawable.img_20, R.drawable.img_21,
            R.drawable.img_22, R.drawable.img_23, R.drawable.img_24,
            R.drawable.img_25, R.drawable.img_26, R.drawable.img_27,
            R.drawable.img_28, R.drawable.img_29, R.drawable.img_30};

    ViewFlipper viewFlipper;
    Button stopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_dog_breed);

        viewFlipper = (ViewFlipper) findViewById(R.id.searchedImage);
        stopBtn = (Button) findViewById(R.id.btn_stop);
        // For loop
        for (int i = 0; i < images.length; i++) {
            flipperImages(images[i]);
        }

        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.stopFlipping();
            }
        });
    }

    public void flipperImages(int images){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(5000); // 5 sec
        viewFlipper.setAutoStart(true);

        // Animation
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
    }
}












