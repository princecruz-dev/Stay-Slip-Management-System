
package com.example.stay_slip_management_system;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TeacherApproval extends Activity {

    Button btnBack, btnApprove, btnReject;
    TextView txtStatus, txtDecisionBy, txtDecisionTime, txtDecisionRemarks;
    EditText etRemarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_approval);

        btnBack = findViewById(R.id.btnBack);
        btnApprove = findViewById(R.id.btnApprove);
        btnReject = findViewById(R.id.btnReject);

        txtStatus = findViewById(R.id.txtStatus);
        txtDecisionBy = findViewById(R.id.txtDecisionBy);
        txtDecisionTime = findViewById(R.id.txtDecisionTime);
        txtDecisionRemarks = findViewById(R.id.txtDecisionRemarks);

        etRemarks = findViewById(R.id.etRemarks);

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(TeacherApproval.this, LogIn.class);
            startActivity(intent);
            finish();
        });

        btnApprove.setOnClickListener(v -> showConfirmation(
                getString(R.string.approved)
        ));

        btnReject.setOnClickListener(v -> showConfirmation(
                getString(R.string.rejected)
        ));
    }

    private void showConfirmation(String decision) {

        String message;

        if (decision.equals(getString(R.string.approved))) {
            message = getString(R.string.confirm_approve);
        } else {
            message = getString(R.string.confirm_reject);
        }

        new AlertDialog.Builder(this)
                .setTitle(R.string.confirm_decision)
                .setMessage(message)
                .setPositiveButton(R.string.confirm, (dialog, which) ->
                        updateDecision(decision))
                .setNegativeButton(R.string.cancel, null)
                .show();
    }

    private void updateDecision(String decision) {

        String currentDateTime = new SimpleDateFormat(
                "MMMM dd, yyyy | hh:mm a",
                Locale.getDefault()
        ).format(new Date());

        String remarks = etRemarks.getText().toString().trim();

        if (remarks.isEmpty()) {
            remarks = getString(R.string.no_remarks);
        }

        txtStatus.setText(decision);

        if (decision.equals(getString(R.string.approved))) {
            txtStatus.setTextColor(0xFF146C43);
            txtStatus.setBackgroundColor(0xFFD8F3DC);
        } else {
            txtStatus.setTextColor(0xFFB71C1C);
            txtStatus.setBackgroundColor(0xFFFFDADA);
        }

        txtDecisionBy.setText(R.string.decision_by_teacher);
        txtDecisionTime.setText(
                getString(R.string.date_time_format, currentDateTime)
        );
        txtDecisionRemarks.setText(
                getString(R.string.remarks_format, remarks)
        );

        txtDecisionBy.setVisibility(TextView.VISIBLE);
        txtDecisionTime.setVisibility(TextView.VISIBLE);
        txtDecisionRemarks.setVisibility(TextView.VISIBLE);

        btnApprove.setEnabled(false);
        btnReject.setEnabled(false);

        String studentInfo = getString(
                R.string.student_info_format,
                decision,
                currentDateTime,
                remarks
        );

        String title = getString(
                R.string.request_decision_title,
                decision
        );

        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(studentInfo)
                .setPositiveButton(R.string.ok, null)
                .show();
    }
}
