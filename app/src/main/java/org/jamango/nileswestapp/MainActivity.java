package org.jamango.nileswestapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSchedule(View view){
        Intent i = new Intent(MainActivity.this, Schedule.class);
        startActivity(i);
    }

    public void openNews(View view){
        Intent i = new Intent(MainActivity.this, NewsMain.class);
        startActivity(i);
    }

    public void openRepairStatus(View view){
        Intent i = new Intent(MainActivity.this, ChromebookRepairMain.class);
        startActivity(i);
    }

}
