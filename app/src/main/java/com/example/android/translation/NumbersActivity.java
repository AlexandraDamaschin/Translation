package com.example.android.translation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of words
        String[] englishWords = new String[10];
        englishWords[0] = "one";
        englishWords[1] = "two";
        englishWords[2] = "three";
        englishWords[3] = "four";
        englishWords[4] = "five";
        englishWords[5] = "six";
        englishWords[6] = "seven";
        englishWords[7] = "eight";
        englishWords[8] = "nine";
        englishWords[9] = "ten";
    }
}
