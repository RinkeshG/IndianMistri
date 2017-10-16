package com.example.rinkesh.offpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bookelcetrician extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookelcetrician);
    }

    public void laterbook(View view )
    {
        Intent laterintent = new Intent(this, Shedulelater.class);
        startActivity(laterintent);
    }
}
