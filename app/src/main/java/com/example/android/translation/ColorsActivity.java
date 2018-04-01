package com.example.android.translation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "rosu", R.drawable.color_red, R.raw.unu ));
        words.add(new Word("dusty yellow", "crem", R.drawable.color_dusty_yellow, R.raw.unu ));
        words.add(new Word("yellow", "galben", R.drawable.color_mustard_yellow, R.raw.unu ));
        words.add(new Word("green", "verde", R.drawable.color_green, R.raw.unu ));
        words.add(new Word("brown", "maro", R.drawable.color_brown, R.raw.unu ));
        words.add(new Word("gray", "gri", R.drawable.color_gray, R.raw.unu ));
        words.add(new Word("black", "negru", R.drawable.color_black, R.raw.unu ));
        words.add(new Word("white", "alb", R.drawable.color_white, R.raw.unu ));

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
