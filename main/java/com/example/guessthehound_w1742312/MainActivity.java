package com.example.guessthehound_w1742312;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
 * Author : Dinu Senal Sendanayake
 * IIT Number : 2018445
 * UOW Number : W1742312
 * Activity : Main Page
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 3 Button for user interactions
        Button idTheBreed = (Button) findViewById(R.id.btn_identify_breed);
        Button idTheDog = (Button) findViewById(R.id.btn_identify_dog);
        Button searchDog = (Button) findViewById(R.id.btn_search_dog);

        idTheBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_identify_breed.class));
            }
        });

        idTheDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_identify_dog.class));
            }
        });

        searchDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_search_dog_breed.class));
            }
        });
    }
}

/*
 ** References
 * Android ListView Ep.09 : Custom Filter/Search - BaseAdapter [With Images and Text] - YouTube
 * Custom Toast - Android Studio Tutorial - YouTube
 * Auto Image Slider with ViewFlipper - Android Studio Tutorial - YouTube
 * Android Studio: Searchview for images, how? - StackOverFlow
 * Avoid multi-click in image view android - StackOverFlow
 * Find real position of an ImageView - StackOverFlow
 * Android Log.v(), Log.d(), Log.i(), Log.w(), Log.e() - When to use each one? - StackOverFlow
 * Getting an attribute from an object inside an arraymap - StackOverFlow
 * How to set an onclick listener for an imagebutton in an alertdialog - StackOverFlow
 * Log | Android Developers
 * Autosizing TextViews | Android Developers
 */