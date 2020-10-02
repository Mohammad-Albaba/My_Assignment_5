package com.example.myassignment5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
public class ActivityQuestionOne extends AppCompatActivity {
    RadioGroup rgq1;
    Button confirm1;
   TextView counter;
    RadioButton rb1q1,rb2q1,rb3q1,a1;
    int i=0 ,f=0, c=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);
        rgq1=(RadioGroup)findViewById(R.id.rgq1);
        rb1q1=findViewById(R.id.rb1q1);
        rb2q1=findViewById(R.id.rb2q1);
        rb3q1=findViewById(R.id.rb3q1);
        confirm1=findViewById(R.id.confirm1);
        TextView counter=findViewById(R.id.counter);
        counter.setText((c)+"/5");
        c++;
    }



    public void onclickbuttonMethod(View view) {
        if (f == 0) {
            a1=findViewById(rgq1.getCheckedRadioButtonId());
            if(a1.getId()==rb1q1.getId()){
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4g));
                i++;
        } else {
            a1.setBackground(getResources().getDrawable(R.drawable.rectangle4));}}
            confirm1.setText(getResources().getText(R.string.next));
            confirm1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ActivityQuestionOne.this, ActivityQuestionTwo.class);
                    startActivity(intent);
                }
            });
        }


    }
