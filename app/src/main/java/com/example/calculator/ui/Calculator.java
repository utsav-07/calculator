package com.example.calculator.ui;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculator.MainActivity;
import com.example.calculator.R;

import org.w3c.dom.Text;

public class Calculator extends Fragment {

    private CalculatorViewModel mViewModel;

    public static Calculator newInstance() {
        return new Calculator();
    }
    Button button;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.calculator_fragment, container, false);
        TextView tvPhone = (TextView) v.findViewById(R.id.tvPhone);
        EditText etPhone=(EditText) v.findViewById(R.id.etPhone);
        final Button bt=(Button)v.findViewById(R.id.button);

        tvPhone.setText("phone number");
        etPhone.setHint("input phone number");
        bt.setText("confirm");
        button=(Button)v.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(bt.this ,"button clicked",Toast.LENGTH_SHORT);
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(CalculatorViewModel.class);
        // TODO: Use the ViewModel
    }


}
