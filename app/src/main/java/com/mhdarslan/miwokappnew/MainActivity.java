package com.mhdarslan.miwokappnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the numbers category
        TextView number = (TextView) findViewById(R.id.numbers);

        //Set a clickListener on that View
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent=new Intent(MainActivity.this,NumbersActivity.class);

                //Start the new activity
                startActivity(numbersIntent);
            }
        });

        //Find the View that shows the family category
        TextView family=(TextView) findViewById(R.id.family);

        //Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent=new Intent(MainActivity.this,FamilyActivity.class);

                //Start the new activity
                startActivity(familyIntent);
            }
        });

        //Find the View that shows the colors category
        TextView colors=(TextView) findViewById(R.id.colors);

        //Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent=new Intent(MainActivity.this,ColorsActivity.class);

                //Start the new activity
                startActivity(colorIntent);
            }
        });

        //Find the View that shows phrases category
        TextView phrases=(TextView) findViewById(R.id.phrases);

        //Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent=new Intent(MainActivity.this,PhrasesActivity.class);

                //Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }
}