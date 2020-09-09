/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package android.example.courtcounter;


import android.example.courtcounter.R;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity_a = 0;
    int quantity_b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void reset_score(View view) {
        quantity_a = 0;
        display_a(quantity_a);
        quantity_b = 0;
        display_b(quantity_b);
    }

    public void incrementOrder1_a(View view) {
        quantity_a = quantity_a + 1;
        display_a(quantity_a);
    }

    public void incrementOrder2_a(View view) {
        quantity_a = quantity_a + 2;
        display_a(quantity_a);
    }

    public void incrementOrder3_a(View view) {
        quantity_a = quantity_a + 3;
        display_a(quantity_a);
    }

    public void incrementOrder1_b(View view) {
        quantity_b = quantity_b + 1;
        display_b(quantity_b);
    }

    public void incrementOrder2_b(View view) {
        quantity_b = quantity_b + 2;
        display_b(quantity_b);
    }

    public void incrementOrder3_b(View view) {
        quantity_b = quantity_b + 3;
        display_b(quantity_b);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display_a(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_text_view_a);
        quantityTextView.setText("" + number);
    }

    private void display_b(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_text_view_b);
        quantityTextView.setText("" + number);
    }

}