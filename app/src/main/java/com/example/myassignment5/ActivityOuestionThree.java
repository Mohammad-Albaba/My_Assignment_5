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

public class ActivityOuestionThree extends AppCompatActivity {
    RadioGroup rgq3;
    Button confirm3;
    TextView counter;
    RadioButton rb1q3,rb2q3,rb3q3,a1;
    int i=0 ,f=0, c=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ouestion_three);
        rgq3=(RadioGroup)findViewById(R.id.rgq3);
        rb1q3=findViewById(R.id.rb1q3);
        rb2q3=findViewById(R.id.rb2q3);
        rb3q3=findViewById(R.id.rb3q3);
        TextView counter=findViewById(R.id.counter);
        confirm3=findViewById(R.id.confirm3);
        counter.setText((c)+"/5");
        c++;
    }
    public void onclickbuttonMethod(View view) {
        if (f == 0) {
            a1=findViewById(rgq3.getCheckedRadioButtonId());
            if(a1.getId()==rb3q3.getId()){
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4g));
                i++;
            } else {
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4));}}
        confirm3.setText(getResources().getText(R.string.next));
        confirm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityOuestionThree.this, ActivityQuestionFour.class);
                startActivity(intent);
            }
        });
    }

    }