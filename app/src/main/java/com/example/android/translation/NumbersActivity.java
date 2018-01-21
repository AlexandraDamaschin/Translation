package com.example.android.translation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");
        words.add(new Word("one", "unu", R.drawable.number_one));
        words.add(new Word("two", "doi", R.drawable.number_two));
        words.add(new Word("three", "trei", R.drawable.number_three));
        words.add(new Word("four", "patru", R.drawable.number_four));
        words.add(new Word("five", "cinci", R.drawable.number_five));
        words.add(new Word("six", "sase", R.drawable.number_six));
        words.add(new Word("seven", "sapte", R.drawable.number_seven));
        words.add(new Word("eight", "opt", R.drawable.number_eight));
        words.add(new Word("nine", "noua", R.drawable.number_nine));
        words.add(new Word("ten", "zece", R.drawable.number_ten));

//        let`s learn how to debug
//        Log.v("NumbersActivity", "Word at index 7 is "+words.get(7));

        WordAdapter adapter =
                new WordAdapter(this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
