
package com.example.stay_slip_management_system;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SBMOApproval extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sbmoapproval);

        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main), (v, insets) -> {
                    Insets systemBars = insets.getInsets(
                            WindowInsetsCompat.Type.systemBars());

                    v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom);

                    return insets;
                });

        Button btnApprove = findViewById(R.id.btnApprove);
        Button btnDecline = findViewById(R.id.btnDecline);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnClose = findViewById(R.id.btnClose);

        TextView txtStatus = findViewById(R.id.txtStatus);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) LinearLayout resultBox = findViewById(R.id.resultBox);

        // APPROVE
        btnApprove.setOnClickListener(v -> {
            resultBox.setVisibility(View.VISIBLE);

            txtStatus.setText("✓ APPROVED");
            txtStatus.setTextColor(Color.parseColor("#2E7D32"));
            txtStatus.setBackgroundColor(Color.parseColor("#DCFCE7"));
        });

        // REJECT
        btnDecline.setOnClickListener(v -> {
            resultBox.setVisibility(View.VISIBLE);

            txtStatus.setText("✕ DECLINED");
            txtStatus.setTextColor(Color.parseColor("#D32F2F"));
            txtStatus.setBackgroundColor(Color.parseColor("#FEE2E2"));
        });

        // CLOSE AND RETURN TO REASON FOR STAY
        btnClose.setOnClickListener(v -> {
            Intent intent = new Intent(
                    SBMOApproval.this,
                    Staysliprequest.class);

            startActivity(intent);
            finish();
        });
    }
}