package com.example.acegym;

import static com.example.acegym.AllTrainingRecyclerViewAdapter.TRAINING_KEY;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class TrainingActivity extends AppCompatActivity {

    private Button btnAddToPlan;
    private TextView txtTrainingName, txtLongDesc;
    private ImageView imgTrainingImg;
    private NestedScrollView nestedScrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        initView();

        Intent intent = getIntent();
        if(intent != null) {
            Training training = intent.getParcelableExtra(TRAINING_KEY);
            if(training != null){

                txtTrainingName.setText(training.getName());
                txtLongDesc.setText(training.getLongDescription());

                Glide.with(this)
                        .asBitmap()
                        .load(training.getImgUrl())
                        .into(imgTrainingImg);

                btnAddToPlan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TODO: Display Add to plan dialogue box
                        Toast.makeText(TrainingActivity.this, "Add to plan selected", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    }

    public void initView() {
        nestedScrollView = findViewById(R.id.nestedScrollView);
        btnAddToPlan = findViewById(R.id.btnAddToPlan);
        txtTrainingName = findViewById(R.id.txtTrainingName);
        txtLongDesc = findViewById(R.id.txtLongDesc);
        imgTrainingImg = findViewById(R.id.imgTrainingImg);
    }
}