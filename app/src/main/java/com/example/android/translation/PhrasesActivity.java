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
        words.add(new Word("Where are you going?", "Unde esti?", R.raw.unu ));
        words.add(new Word("What is your name?", "Cum te numesti?", R.raw.unu ));
        words.add(new Word("My name is...", "Numele meu eate ...", R.raw.unu ));
        words.add(new Word("How are you feeling?", "Cuum te simti?", R.raw.unu ));
        words.add(new Word("I’m feeling good.", "Ma simt bine.", R.raw.unu ));
        words.add(new Word("Are you coming?", "Vi?", R.raw.unu ));
        words.add(new Word("Yes, I’m coming.", "Da, vin.", R.raw.unu ));
        words.add(new Word("I’m coming.", "Vin", R.raw.unu ));
        words.add(new Word("Let’s go.", "Sa mergem.", R.raw.unu ));
        words.add(new Word("Come here.", "Vino aici,", R.raw.unu ));

        WordAdapter adapter = new WordAdapter(this, words ,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
