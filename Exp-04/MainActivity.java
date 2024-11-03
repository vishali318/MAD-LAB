package com.example.s3mca55;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button constraintButton = findViewById(R.id.constraintBtn);
        Button linearButton = findViewById(R.id.linearBtn);
        Button gridButton = findViewById(R.id.gridBtn);
        Button relativeButton = findViewById(R.id.relativeBtn);
        Button frameButton = findViewById(R.id.frameBtn);
        Button tableButton = findViewById(R.id.tableBtn);
        View.OnClickListener btnclklistnr = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String layoutName = ((Button) v).getText().toString();
                displayToken(layoutName);
            }
        };
        constraintButton.setOnClickListener(btnclklistnr);
        linearButton.setOnClickListener(btnclklistnr);
        gridButton.setOnClickListener(btnclklistnr);
        relativeButton.setOnClickListener(btnclklistnr);
        frameButton.setOnClickListener(btnclklistnr);
        tableButton.setOnClickListener(btnclklistnr);
    }
    private void displayToken(String layoutName){
        Toast.makeText(this,"Token from "+layoutName, Toast.LENGTH_SHORT).show();
    }

}