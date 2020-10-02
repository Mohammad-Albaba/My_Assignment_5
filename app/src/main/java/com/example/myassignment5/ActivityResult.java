package com.example.myassignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {
TextView result;
int i=4;
// مراجعته داخل المناقشة
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result=findViewById(R.id.result);
        result.setText(i+"\n"+"  /\n"+"   5");

    }
}