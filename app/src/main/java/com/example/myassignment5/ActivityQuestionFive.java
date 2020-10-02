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

public class ActivityQuestionFive extends AppCompatActivity {
    RadioGroup rgq5;
    Button confirm5;
    TextView counter;
    RadioButton rb1q5,rb2q5,rb3q5,a1;
    int i=0 ,f=0, c=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five);
        rgq5=(RadioGroup)findViewById(R.id.rgq5);
        rb1q5=findViewById(R.id.rb1q5);
        rb2q5=findViewById(R.id.rb2q5);
        rb3q5=findViewById(R.id.rb3q5);
        TextView counter=findViewById(R.id.counter);
        confirm5=findViewById(R.id.confirm5);
        counter.setText((c)+"/5");
        c++;
    }
    public void onclickbuttonMethod(View view) {
        if (f == 0) {
            a1=findViewById(rgq5.getCheckedRadioButtonId());
            if(a1.getId()==rb3q5.getId()){
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4g));
                i++;
            } else {
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4));}}
        confirm5.setText(getResources().getText(R.string.next));
        confirm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityQuestionFive.this, ActivityResult.class);
                startActivity(intent);
            }
        });
    }

    }
