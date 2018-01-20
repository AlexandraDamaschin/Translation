package com.example.android.translation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "Unde esti?"));
        words.add(new Word("What is your name?", "Cum te numesti?"));
        words.add(new Word("My name is...", "Numele meu eate ..."));
        words.add(new Word("How are you feeling?", "Cuum te simti?"));
        words.add(new Word("I’m feeling good.", "Ma simt bine."));
        words.add(new Word("Are you coming?", "Vi?"));
        words.add(new Word("Yes, I’m coming.", "Da, vin."));
        words.add(new Word("I’m coming.", "Vin"));
        words.add(new Word("Let’s go.", "Sa mergem."));
        words.add(new Word("Come here.", "Vino aici,"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
