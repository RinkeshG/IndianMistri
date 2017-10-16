package com.example.rinkesh.offpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MechanicInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanic_info);
    }

    public void completeconfirm(View view) {

        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
        finish();
    }
}


