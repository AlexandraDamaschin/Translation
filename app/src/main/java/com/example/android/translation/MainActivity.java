package com.example.android.translation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        set content of the activity to use the activity_main.xml
        setContentView(R.layout.activity_main);

//        find the view that shows the numbers cat
        TextView numbers= (TextView) findViewById(R.id.numbers);
//        set click listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

//         find the view that shows the family cat
        TextView family= (TextView) findViewById(R.id.family);
//        set click listener on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });


//      find the view that shows the colors cat
        TextView colors= (TextView) findViewById(R.id.colors);
//        set click listener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

//       find the view that shows the colors cat
        TextView phrases= (TextView) findViewById(R.id.phrases);
//        set click listener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }
//    //explicit intents
//    public void openNumbersList(View view) {
//        Intent i = new Intent(this, NumbersActivity.class);
//        startActivity(i);
//    }
//    public void openFamilyList(View view) {
//        Intent i = new Intent(this, FamilyActivity.class);
//        startActivity(i);
//    }
//    public void openPhrasesList(View view) {
//        Intent i = new Intent(this, PhrasesActivity.class);
//        startActivity(i);
//    }
//    public void openColorsList(View view) {
//        Intent i = new Intent(this, ColorsActivity.class);
//        startActivity(i);
//    }
}
