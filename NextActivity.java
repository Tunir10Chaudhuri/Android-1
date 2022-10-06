package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        EditText dr = (EditText) findViewById(R.id.databaseresult);


        Intent in = getIntent();
        double res = in.getDoubleExtra("latestresult",0.0);
        SharedPreferences sp = getSharedPreferences("resultdatabase",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("storedresult",Double.toString(res));
        editor.commit();
        dr.setText(sp.getString("storedresult","null"));

        Intent in2 = getIntent();
        double fl = in2.getDoubleExtra("deleteresult",0.0);
        if(fl==1.0)
        {
            editor.clear();
            editor.commit();
            dr.setText("Deleted");
            Toast.makeText(getApplicationContext(),"Data has been deleted",Toast.LENGTH_SHORT).show();
        }
    }
}