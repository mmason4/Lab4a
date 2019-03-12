package com.example.jsu.lab4a;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void tipButtonPressed (View view) {
        Intent intent;
        intent = new Intent(this, ActivityCalculateTip.class);
        startActivity(intent);
    }
    public void milesButtonPressed (View view) {
        Intent intent;
        intent = new Intent(this, ActivityCalculateMiles.class);
        startActivity(intent);
    }
    public void fahrenheitButtonPressed (View view) {
        Intent intent;
        intent = new Intent(this, ActivityCalculateTemperature.class);
        startActivity(intent);
    }

}
