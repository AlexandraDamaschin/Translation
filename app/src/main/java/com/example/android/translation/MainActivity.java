package com.example.android.translation;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // fragments
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }
}





    ////////activities
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        set content of the activity to use the activity_main.xml
//        setContentView(R.layout.activity_main);
//
////        find the view that shows the numbers cat
//        TextView numbers= (TextView) findViewById(R.id.numbers);
////        set click listener on that view
//        numbers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link NumbersActivity}
//                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//
//                // Start the new activity
//                startActivity(numbersIntent);
//            }
//        });
//
////         find the view that shows the family cat
//        TextView family= (TextView) findViewById(R.id.family);
////        set click listener on that view
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link NumbersActivity}
//                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
//
//                // Start the new activity
//                startActivity(familyIntent);
//            }
//        });
//
//
////      find the view that shows the colors cat
//        TextView colors= (TextView) findViewById(R.id.colors);
////        set click listener on that view
//        colors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link NumbersActivity}
//                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
//
//                // Start the new activity
//                startActivity(colorsIntent);
//            }
//        });
//
////       find the view that shows the colors cat
//        TextView phrases= (TextView) findViewById(R.id.phrases);
////        set click listener on that view
//        phrases.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link NumbersActivity}
//                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
//
//                // Start the new activity
//                startActivity(phrasesIntent);
//            }
//        });
//    }



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
//}
