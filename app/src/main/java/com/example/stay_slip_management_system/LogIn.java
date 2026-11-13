package com.example.stay_slip_management_system;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    ImageButton studentbtn, teacherbtn, sbmobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        studentbtn = findViewById(R.id.studentbtn);
        teacherbtn = findViewById(R.id.teacherbtn);
        sbmobtn = findViewById(R.id.sbmobtn1);

        studentbtn.setOnClickListener(v -> {
            startActivity(new Intent(LogIn.this, Staysliprequest.class));
        });

        teacherbtn.setOnClickListener(v -> {
            startActivity(new Intent(LogIn.this, TeacherApproval.class));
        });

        sbmobtn.setOnClickListener(v -> {
            startActivity(new Intent(LogIn.this, SBMOApproval.class));
        });
    }
}