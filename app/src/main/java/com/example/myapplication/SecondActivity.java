package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        if(getIntent().hasExtra("com.example.myapplication.transferredString")){
            TextView tv=(TextView) findViewById(R.id.textView);
            String text=getIntent().getExtras().getString("com.example.myapplication.transferredString");
            tv.setText(text);
        }
    }
}