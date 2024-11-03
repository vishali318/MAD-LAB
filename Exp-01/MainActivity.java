package com.example.s3mca55;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String valid_usrnm="user";
    private static final String valid_pswd="pass";
    private EditText username;
    private EditText password;
    private Button loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.uname);
        password=findViewById(R.id.pwd);
        loginbtn=findViewById(R.id.lbtn);
        loginbtn.setOnClickListener(view -> {
            String enteredUname=username.getText().toString();
            String enteredPwd=password.getText().toString();
            if(isValid(enteredUname,enteredPwd)){
                showToast("Login Success");
            }
            else
                showToast("Invalid credentials");
        });
    }
    public boolean isValid(String euname,String epwd){
        return valid_usrnm.equals(euname) && valid_pswd.equals(epwd);
    }
    private void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }



}