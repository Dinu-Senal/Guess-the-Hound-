package com.example.guessthehound_w1742312;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Random;

/*
 * Author : Dinu Senal Sendanayake
 * IIT Number : 2018445
 * UOW Number : W1742312
 * Activity : Identify Breed
 */

@RequiresApi(api = Build.VERSION_CODES.KITKAT)
public class activity_identify_breed extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static int set_image;

    // Setting images in drawable file in a  list
    private static int[] images = {R.drawable.img_01, R.drawable.img_02, R.drawable.img_03,
                    R.drawable.img_04, R.drawable.img_05, R.drawable.img_06,
                    R.drawable.img_07, R.drawable.img_08, R.drawable.img_09,
                    R.drawable.img_10, R.drawable.img_11, R.drawable.img_12,
                    R.drawable.img_13, R.drawable.img_14, R.drawable.img_15,
                    R.drawable.img_16, R.drawable.img_17, R.drawable.img_18,
                    R.drawable.img_19, R.drawable.img_20, R.drawable.img_21,
                    R.drawable.img_22, R.drawable.img_23, R.drawable.img_24,
                    R.drawable.img_25, R.drawable.img_26, R.drawable.img_27,
                    R.drawable.img_28, R.drawable.img_29, R.drawable.img_30};

    String[] names = {"African Hunting Dog", "Boxer",
                      "Chesapeake Bay Retriever", "Chow",
                      "Dhole", "Dingo", "Eskimo Dog",
                      "French Bulldog", "German Shepherd",
                      "Great Dane", "Mala Mute",
                      "Old English Sheepdog", "Pug","Saint Bernard",
                      "Shetland Sheepdog"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_breed);


        final ImageView randomImage = findViewById(R.id.random_imageView);
        final Switch switch_v1 = (Switch) findViewById(R.id.switchCompat);

        final Random rnd = new Random();
        set_image = rnd.nextInt(images.length);
        randomImage.setImageResource(images[set_image]);

        // Creating the spinner
        Spinner spinner = findViewById(R.id.breed_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        // Creating ArrayAdapter using the string array
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.breed_spinner,
                android.R.layout.simple_spinner_item);

        // Specifying the layout when list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Applying the adapter to the spinner
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    // Implemented methods for spinner
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, final long id) {
        final String spinner_name_equal = names[position];

        final Button submitDog = (Button) findViewById(R.id.btn_submit_1);
        submitDog.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                final ArrayMap<Integer, String> imageName = new ArrayMap<>();
                imageName.put(2131165284, "African Hunting Dog");        imageName.put(2131165285, "African Hunting Dog");
                imageName.put(2131165286, "Boxer");                      imageName.put(2131165287, "Boxer");
                imageName.put(2131165288, "Chesapeake Bay Retriever");   imageName.put(2131165289, "Chesapeake Bay Retriever");
                imageName.put(2131165290, "Chow");                       imageName.put(2131165291, "Chow");
                imageName.put(2131165292, "Dhole");                      imageName.put(2131165293, "Dhole");
                imageName.put(2131165294, "Dingo");                      imageName.put(2131165295, "Dingo");
                imageName.put(2131165296, "Eskimo Dog");                 imageName.put(2131165297, "Eskimo Dog");
                imageName.put(2131165298, "French Bulldog");             imageName.put(2131165299, "French Bulldog");
                imageName.put(2131165300, "German Shepherd");            imageName.put(2131165301, "German Shepherd");
                imageName.put(2131165302, "Great Dane");                 imageName.put(2131165303, "Great Dane");
                imageName.put(2131165304, "Mala Mute");                  imageName.put(2131165305, "Mala Mute");
                imageName.put(2131165306, "Old English Sheepdog");       imageName.put(2131165307, "Old English Sheepdog");
                imageName.put(2131165308, "Pug");                        imageName.put(2131165309, "Pug");
                imageName.put(2131165310, "Saint Bernard");              imageName.put(2131165311, "Saint Bernard");
                imageName.put(2131165312, "Shetland Sheepdog");          imageName.put(2131165313, "Shetland Sheepdog");

                String val = imageName.get(images[set_image]);

                // Used for finding the index
                Log.i("values", "" + spinner_name_equal);
                System.out.println("Dog Id : " + Arrays.toString(images));

                if (val == spinner_name_equal){
                    // Message correct
                    showToast_01();
                    submitDog.setText("Next");
                    next_activity();
                }else {
                    // Message wrong
                    showToast_02();
                    // Message correct breed
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.toast_layout_v3, (ViewGroup)
                            findViewById(R.id.toast_correct_dog_name_layout));
                    TextView correctDogName = layout.findViewById(R.id.tv_correct_dog_name);
                    correctDogName.setText("Correct Breed : " + val);
                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER, 0 , 0 );
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();
                    submitDog.setText("Next");
                    next_activity();
                }
            }
        });
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

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
        Button submit_v1 = (Button) findViewById(R.id.btn_submit_1);
        submit_v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent repeat =  new Intent(activity_identify_breed.this, activity_identify_breed.class);
                startActivity(repeat);
            }
        });
    }

    public void home_screen(View view) {
        Intent home_screen = new Intent(activity_identify_breed.this, MainActivity.class);
        startActivity(home_screen);
    }
}

