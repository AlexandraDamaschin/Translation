package com.example.android.translation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //displays the activity_category.xml layout
        setContentView(R.layout.activity_category);
        //replace activity with the container created
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ColorsFragment())
                //ColorsFragment displays the word_list.xml layout
                .commit();
    }
}
