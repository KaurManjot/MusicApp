package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Implicit intent to open JazzActivity when button on MainActivity is clicked
         */
        Button jazz = findViewById(R.id.button_jazz);
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(jazzIntent);
            }
        });

        /*
         * Implicit intent to open RockActivity when button on MainActivity is clicked
         */
        TextView rock = findViewById(R.id.button_rock);
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });

        /*
         * Implicit intent to open HiphopActivity when button on MainActivity is clicked
         */
        TextView hiphop = findViewById(R.id.button_hiphop);
        hiphop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                Intent hiphopIntent = new Intent(MainActivity.this, HiphopActivity.class);
                startActivity(hiphopIntent);
            }
        });

        /*
         * Implicit intent to open PopActivity when button on MainActivity is clicked
         */
        TextView pop = findViewById(R.id.button_pop);
        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);
                startActivity(popIntent);
            }
        });
    }
}
