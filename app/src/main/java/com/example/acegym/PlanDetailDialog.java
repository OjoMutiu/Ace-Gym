package com.example.acegym;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class PlanDetailDialog extends DialogFragment {

    private TextView trainingName;
    private Spinner spnDay;
    private EditText edtMinutes;
    private Button btnAdd, btnDismiss;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        View view = getActivity().getLayoutInflater().inflate(R.layout.dialogue_box_layout, null);
        intiView(view);

        return super.onCreateDialog(savedInstanceState);
    }

    public void intiView(View view){
        trainingName = view.findViewById(R.id.txtTrainingName);
        spnDay = view.findViewById(R.id.spnDayOfWeek);
        edtMinutes = view.findViewById(R.id.edtMinute);
        btnAdd = view.findViewById(R.id.btnAdd);
        btnDismiss = view.findViewById(R.id.btnDismiss);
    }
}
