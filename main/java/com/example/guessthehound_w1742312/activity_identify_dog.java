package com.example.guessthehound_w1742312;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

/*
 * Author : Dinu Senal Sendanayake
 * IIT Number : 2018445
 * UOW Number : W1742312
 * Activity : Identify Dog
 */

public class activity_identify_dog extends AppCompatActivity {

    protected static int set_image_01;
    protected static int set_image_02;
    protected static int set_image_03;

    // 3 Image Arrays for 3 random ImageViews
    int[] images_01 = {R.drawable.img_01, R.drawable.img_02, R.drawable.img_03,
            R.drawable.img_04, R.drawable.img_05, R.drawable.img_06,
            R.drawable.img_07, R.drawable.img_08, R.drawable.img_09,
            R.drawable.img_10};
    int[] images_02 = {R.drawable.img_11, R.drawable.img_12, R.drawable.img_13,
            R.drawable.img_14, R.drawable.img_15, R.drawable.img_16,
            R.drawable.img_17, R.drawable.img_18, R.drawable.img_19,
            R.drawable.img_20};
    int[] images_03 = {R.drawable.img_21, R.drawable.img_22, R.drawable.img_23,
            R.drawable.img_24, R.drawable.img_25, R.drawable.img_26,
            R.drawable.img_27, R.drawable.img_28, R.drawable.img_29,
            R.drawable.img_30};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_dog);

        final ImageButton randomImage_V1 = findViewById(R.id.random_imageBtn_V1);
        final ImageButton randomImage_V2 = findViewById(R.id.random_imageBtn_V2);
        final ImageButton randomImage_V3 = findViewById(R.id.random_imageBtn_V3);
        final TextView randomImage_text_V1 = findViewById(R.id.tv_random_img_name_V1);
        final TextView randomImage_text_V2 = findViewById(R.id.tv_random_img_name_V2);
        final TextView randomImage_text_V3 = findViewById(R.id.tv_random_img_name_V3);
        final Button btn_name_dog = findViewById(R.id.btn_submit_02);
        final Switch switch_v1 = (Switch) findViewById(R.id.switchCompat);

        final Random rnd = new Random();
        set_image_01 = rnd.nextInt(images_01.length);
        randomImage_V1.setImageResource(images_01[set_image_01]);

        set_image_02 = rnd.nextInt(images_02.length);
        randomImage_V2.setImageResource(images_02[set_image_02]);

        set_image_03 = rnd.nextInt(images_03.length);
        randomImage_V3.setImageResource(images_03[set_image_03]);

        // Prompting right text corresponding to the image that randomly generated
        if (set_image_01 == 0) {
            String names_01 = "African Hunting Dog";
            randomImage_text_V1.setText(names_01);
        }else if (set_image_02 == 0) {
            String names_01 = "Dingo";
            randomImage_text_V2.setText(names_01);
        }else if (set_image_03 == 0) {
            String names_01 = "Mala Mute";
            randomImage_text_V3.setText(names_01);

        }else if (set_image_01 == 1) {
            String names_01 = "African Hunting Dog";
            randomImage_text_V1.setText(names_01);
        }else if (set_image_02 == 1) {
            String names_01 = "Dingo";
            randomImage_text_V2.setText(names_01);
        }else if (set_image_03 == 1) {
            String names_01 = "Mala Mute";
            randomImage_text_V3.setText(names_01);

        }else if (set_image_01 == 2) {
            String names_01 = "Boxer";
            randomImage_text_V1.setText(names_01);
        }else if (set_image_02 == 2) {
            String names_01 = "Eskimo Dog";
            randomImage_text_V2.setText(names_01);
        }else if (set_image_03 == 2){
            String names_01 = "Old English Sheepdog";
            randomImage_text_V3.setText(names_01);

        }else if (set_image_01 == 3) {
            String names_01 = "Boxer";
            randomImage_text_V1.setText(names_01);
        }else if (set_image_02 == 3) {
            String names_01 = "Eskimo Dog";
            randomImage_text_V2.setText(names_01);
        }else if (set_image_03 == 3){
            String names_01 = "Old English Sheepdog";
            randomImage_text_V3.setText(names_01);

        }else if (set_image_01 == 4) {
            String names_01 = "Chesapeake Bay Retriever";
            randomImage_text_V1.setText(names_01);
        }else if (set_image_02 == 4) {
            String names_01 = "French Bulldog";
            randomImage_text_V2.setText(names_01);
        }else if (set_image_03 == 4){
            String names_01 = "Pug";
            randomImage_text_V3.setText(names_01);

        }else if (set_image_01 == 5) {
            String names_01 = "Chesapeake Bay Retriever";
            randomImage_text_V1.setText(names_01);
        }else if (set_image_02 == 5) {
            String names_01 = "French Bulldog";
            randomImage_text_V2.setText(names_01);
        }else if (set_image_03 == 5){
            String names_01 = "Pug";
            randomImage_text_V3.setText(names_01);

        }else if (set_image_01 == 6) {
            String names_01 = "Chow";
            randomImage_text_V1.setText(names_01);
        }else if (set_image_02 == 6) {
            String names_01 = "German Shepherd";
            randomImage_text_V2.setText(names_01);
        }else if (set_image_03 == 6){
            String names_01 = "Saint Bernard";
            randomImage_text_V3.setText(names_01);

        }else if (set_image_01 == 7) {
            String names_01 = "Chow";
            randomImage_text_V1.setText(names_01);
        }else if (set_image_02 == 7) {
            String names_01 = "German Shepherd";
            randomImage_text_V2.setText(names_01);
        }else if (set_image_03 == 7){
            String names_01 = "Saint Bernard";
            randomImage_text_V3.setText(names_01);

        }else if (set_image_01 == 8) {
            String names_01 = "Dhole";
            randomImage_text_V1.setText(names_01);
        }else if (set_image_02 == 8) {
            String names_01 = "Great Dane";
            randomImage_text_V2.setText(names_01);
        }else if (set_image_03 == 8){
            String names_01 =  "Shetland Sheepdog";
            randomImage_text_V3.setText(names_01);

        }else if (set_image_01 == 9) {
            String names_01 = "Dhole";
            randomImage_text_V1.setText(names_01);
        }else if (set_image_02 == 9) {
            String names_01 = "Great Dane";
            randomImage_text_V2.setText(names_01);
        }else if (set_image_03 == 9) {
            String names_01 = "Shetland Sheepdog";
            randomImage_text_V3.setText(names_01);
        }

        for (int i = 0; i < images_01.length ; i++) {
            //System.out.println("Dog Image id: " + Arrays.toString(images_01));
            System.out.println(set_image_02);
        }

        randomImage_V1.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                String get_name = randomImage_text_V1.getText().toString();
                if (get_name.equals("African Hunting Dog")){
                    showToast_01();
                }else if (get_name.equals("Boxer")){
                    showToast_01();
                }else if (get_name.equals("Chesapeake Bay Retriever")){
                    showToast_01();
                }else if (get_name.equals("Chow")){
                    showToast_01();
                }else if (get_name.equals("Dhole")){
                    showToast_01();
                }else{
                    showToast_02();
                }
                next_activity();
            }
        });

        // When user interacts with imageView prompting specific message
        randomImage_V2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get_name = randomImage_text_V2.getText().toString();
                if (get_name.equals("Dingo")){
                    showToast_01();
                }else if (get_name.equals("Eskimo Dog")){
                    showToast_01();
                }else if (get_name.equals("French Bulldog")){
                    showToast_01();
                }else if (get_name.equals("German Shepherd")){
                    showToast_01();
                }else if (get_name.equals("Great Dane")){
                    showToast_01();
                }else{
                    showToast_02();
                }
                next_activity();
            }
        });

        randomImage_V3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get_name = randomImage_text_V3.getText().toString();
                if (get_name.equals("Mala Mute")){
                    showToast_01();
                }else if (get_name.equals("Old English Sheepdog")){
                    showToast_01();
                }else if (get_name.equals("Pug")){
                    showToast_01();
                }else if (get_name.equals("Saint Bernard")){
                    showToast_01();
                }else if (get_name.equals("Shetland Sheepdog")){
                    showToast_01();
                }else{
                    showToast_02();
                }
                next_activity();
            }
        });
    }

    private void showToast_01() {
        LayoutInflater inflater =  getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout_v1, (ViewGroup) findViewById(R.id.toast_message_layout));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0 , 0 );
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    private void showToast_02() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout_v2, (ViewGroup) findViewById(R.id.toast_wrong_message_layout));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0 , 0 );
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    public void next_activity() {
        Button btn_name_dog = (Button) findViewById(R.id.btn_submit_02);
        btn_name_dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent repeat =  new Intent(activity_identify_dog.this, activity_identify_dog.class);
                startActivity(repeat);
            }
        });
    }

    public void home_screen(View view) {
        Intent home_screen = new Intent(activity_identify_dog.this, MainActivity.class);
        startActivity(home_screen);
    }
}
