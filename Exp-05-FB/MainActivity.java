package com.example.s3mca55;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the ImageView elements by their IDs
        ImageView facebookView = findViewById(R.id.fbView);
        ImageView likeImgView = findViewById(R.id.likeView);
        ImageView commentImgView = findViewById(R.id.cmmntView);
        ImageView shareImgView = findViewById(R.id.shareView);

        // Set click listeners for the ImageViews
        likeImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the Like button");

            }

        });
        commentImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the Comment button");
            }
        });
        shareImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the Share button");
            }
        });
    }
    // Helper method to display a toast message
    private void showToast(String message){
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
}