package com.example.rinkesh.offpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Shedulelater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shedulelater);
    }

    public void confirm(View view)
    {
        Intent intent = new Intent(this, confirmation.class);
        startActivity(intent);
        finish();
    }
}

