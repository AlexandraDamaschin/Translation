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
        words.add(new Word("red", "rosu"));
        words.add(new Word("yellow", "galben"));
        words.add(new Word("blue", "albastru"));
        words.add(new Word("green", "verde"));
        words.add(new Word("brown", "maro"));
        words.add(new Word("gray", "gri"));
        words.add(new Word("black", "negru"));
        words.add(new Word("white", "alb"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
