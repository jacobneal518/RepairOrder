package com.example.workorderproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener submitListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            float subtotal;

            subtotal = editTextToFloat(orderTypeInput) + editTextToFloat(technitionInput) + editTextToFloat(inspectionInput) + editTextToFloat(paintInput) + editTextToFloat(partsInput) + editTextToFloat(laborInput);

            subtotalOutput.setText(String.valueOf(subtotal));

            double tax = subtotal * .0925;
            taxOutput.setText(String.valueOf(tax));

            totalOutput.setText(String.valueOf(subtotal + tax));

        }
    };
    Button submitButton;
    EditText orderTypeInput;
    EditText technitionInput;
    EditText inspectionInput;
    EditText paintInput;
    EditText partsInput;
    EditText laborInput;

    EditText subtotalOutput;
    EditText taxOutput;
    EditText totalOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        submitButton = findViewById(R.id.submit_button);
        technitionInput = findViewById(R.id.technicianInput);
        orderTypeInput = findViewById(R.id.orderTypeInput);
        inspectionInput = findViewById(R.id.inspectionInput);
        paintInput = findViewById(R.id.paintInput);
        partsInput = findViewById(R.id.partsInput);
        laborInput = findViewById(R.id.laborInput);

        subtotalOutput = findViewById(R.id.subtotalOutput);
        taxOutput = findViewById(R.id.taxOutput);
        totalOutput = findViewById(R.id.totalOutput);

        submitButton.setOnClickListener(submitListener);

    }

    private float editTextToFloat(EditText editText){
        return Float.valueOf(editText.getText().toString());
    }
}