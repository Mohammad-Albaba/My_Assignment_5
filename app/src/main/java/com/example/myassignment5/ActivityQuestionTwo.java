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

public class ActivityQuestionTwo extends AppCompatActivity {
    RadioGroup rgq2;
    Button confirm2;
    TextView counter;
    RadioButton rb1q2,rb2q2,rb3q2,a1;
    int i=0 ,f=0, c=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);
        rgq2=(RadioGroup)findViewById(R.id.rgq2);
        rb1q2=findViewById(R.id.rb1q2);
        rb2q2=findViewById(R.id.rb2q2);
        rb3q2=findViewById(R.id.rb3q2);
        TextView counter=findViewById(R.id.counter);
       confirm2=findViewById(R.id.confirm2);
        counter.setText((c)+"/5");
        c++;

    }
    public void onclickbuttonMethod(View view) {
        if (f == 0) {
            a1=findViewById(rgq2.getCheckedRadioButtonId());
            if(a1.getId()==rb2q2.getId()){
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4g));
                i++;
            } else {
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4));}}
        confirm2.setText(getResources().getText(R.string.next));
        confirm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityQuestionTwo.this, ActivityOuestionThree.class);
                startActivity(intent);
            }
        });
    }}