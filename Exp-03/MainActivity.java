package com.example.s3mca55;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("Activity created");

    }
    protected void onStart(){
        super.onStart();
        showToast("Activity started");
    }
    protected void onResume(){
        super.onStart();
        showToast("Activity resumed");
    }
    protected void onPause(){
        super.onStart();
        showToast("Activity paused");
    }
    protected void onStop(){
        super.onStart();
        showToast("Activity stopped");
    }
    protected void onRestart(){
        super.onStart();
        showToast("Activity restarted");
    }
    @Override
    protected void onDestroy(){
        super.onStart();
        showToast("Activity destroyed");
    }
    private void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }



}