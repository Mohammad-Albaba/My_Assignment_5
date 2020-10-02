package com.example.myassignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityQuestionFour extends AppCompatActivity {
    RadioGroup rgq4;
    Button confirm4;
    TextView counter;
    RadioButton rb1q4,rb2q4,rb3q4,a1;
    int i=0 ,f=0, c=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);
        rgq4=(RadioGroup)findViewById(R.id.rgq4);
        rb1q4=findViewById(R.id.rb1q4);
        rb2q4=findViewById(R.id.rb2q4);
        rb3q4=findViewById(R.id.rb3q4);
        TextView counter=findViewById(R.id.counter);
        confirm4=findViewById(R.id.confirm4);
        counter.setText((c)+"/5");
        c++;

    }
    public void onclickbuttonMethod(View view) {
        if (f == 0) {
            a1=findViewById(rgq4.getCheckedRadioButtonId());
            if(a1.getId()==rb2q4.getId()){
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4g));
                i++;
            } else {
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4));}}
        confirm4.setText(getResources().getText(R.string.next));
        confirm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityQuestionFour.this, ActivityQuestionFive.class);
                startActivity(intent);
            }
        });
    }
    }
