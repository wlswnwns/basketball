package com.example.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int i=0;
    int j=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void PointThreeA(View view) {
        i=i+3;
        displayA(i);
    }
    public void PointTwoA(View view) {
        i=i+2;
        displayA(i);
    }
    public void PointOneA(View view) {
        i=i+1;
        displayA(i);
    }
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.scoreA_text_view);
        quantityTextView.setText("" + number);
    }
    public void PointThreeB(View view) {
        j=j+3;
        displayB(j);
    }
    public void PointTwoB(View view) {
        j=j+2;
        displayB(j);
    }
    public void PointOneB(View view) {
        j=j+1;
        displayB(j);
    }
    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.scoreB_text_view);
        quantityTextView.setText("" + number);
    }
    public void Reset(View view){
        i=0;
        j=0;
        displayA(i);
        displayB(j);
    }

}
