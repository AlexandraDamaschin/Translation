package com.example.android.translation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "tata"));
        words.add(new Word("mother", "mama"));
        words.add(new Word("son", "fiu"));
        words.add(new Word("daughter", "fiica"));
        words.add(new Word("older brother", "frate mai mare"));
        words.add(new Word("younger brother", "frate mai mic"));
        words.add(new Word("older sister", "sora mai mare"));
        words.add(new Word("younger sister", "sora mai mica"));
        words.add(new Word("grandmother ", "bunica"));
        words.add(new Word("grandfather", "bunicul"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

       listView.setAdapter(adapter);
    }
}
