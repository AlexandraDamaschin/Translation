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
        words.add(new Word("father", "tata", R.drawable.family_father, R.raw.unu ));
        words.add(new Word("mother", "mama", R.drawable.family_mother, R.raw.unu ));
        words.add(new Word("son", "fiu", R.drawable.family_son, R.raw.unu ));
        words.add(new Word("daughter", "fiica", R.drawable.family_daughter, R.raw.unu ));
        words.add(new Word("older brother", "frate mai mare", R.drawable.family_older_brother, R.raw.unu ));
        words.add(new Word("younger brother", "frate mai mic", R.drawable.family_younger_brother, R.raw.unu ));
        words.add(new Word("older sister", "sora mai mare", R.drawable.family_older_sister, R.raw.unu ));
        words.add(new Word("younger sister", "sora mai mica", R.drawable.family_younger_sister, R.raw.unu ));
        words.add(new Word("grandmother ", "bunica", R.drawable.family_grandmother, R.raw.unu ));
        words.add(new Word("grandfather", "bunicul", R.drawable.family_grandfather, R.raw.unu ));

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

       listView.setAdapter(adapter);
    }
}
