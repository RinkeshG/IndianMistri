package com.example.rinkesh.offpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    public void completepayment(View view) {

        Intent intent = new Intent(this, Feedback.class);
        startActivity(intent);
        finish();
    }
}
