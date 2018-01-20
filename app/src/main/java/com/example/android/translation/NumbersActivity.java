package com.example.android.translation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");
        words.add(new Word("one", "unu"));
        words.add(new Word("two", "doi"));
        words.add(new Word("three", "trei"));
        words.add(new Word("four", "patru"));
        words.add(new Word("five", "cinci"));
        words.add(new Word("six", "sase"));
        words.add(new Word("seven", "sapte"));
        words.add(new Word("eight", "opt"));
        words.add(new Word("nine", "noua"));
        words.add(new Word("ten", "zece"));

//        let`s learn how to debug
//        Log.v("NumbersActivity", "Word at index 7 is "+words.get(7));

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this,
                        R.layout.list_item, words);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
