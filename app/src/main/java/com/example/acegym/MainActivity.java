package com.example.acegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity Started";

    private Button btnSeeYourPlans, btnSeeAllTrainings, btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        Utils.getInstance();

        btnSeeAllTrainings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllTrainingActivity.class);
                startActivity(intent);
            }
        });
        //TODO: Create onClickListeners for the buttons
    }

    private void initViews() {
        btnSeeYourPlans = findViewById(R.id.btnSeeYourPlan);
        btnSeeAllTrainings = findViewById(R.id.btnSeeAllActivities);
        btnAboutUs = findViewById(R.id.btnAbout);
    }
}