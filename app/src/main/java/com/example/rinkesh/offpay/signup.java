package com.example.rinkesh.offpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void signupclick(View view) {

        Intent SignUpIntent = new Intent(this, MainActivity.class);
        startActivity(SignUpIntent);
    }
}
