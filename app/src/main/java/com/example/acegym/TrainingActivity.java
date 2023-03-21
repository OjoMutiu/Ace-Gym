package com.example.acegym;

import static com.example.acegym.AllTrainingRecyclerViewAdapter.TRAINING_KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class TrainingActivity extends AppCompatActivity {

    private Button btnAddToPlan;
    private TextView txtTrainingName, txtLongDesc;
    private ImageView imgTrainingImg;
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
            }
        }

    }

    public void initView() {
        btnAddToPlan = findViewById(R.id.btnAddToPlan);
        txtTrainingName = findViewById(R.id.txtTrainingName);
        txtLongDesc = findViewById(R.id.txtLongDesc);
        imgTrainingImg = findViewById(R.id.imgTrainingImg);
    }
}