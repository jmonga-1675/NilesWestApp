package org.jamango.nileswestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ChromebookRepairMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chromebook_repair_main);

        EditText idNumber = (EditText) findViewById(R.id.editText);
    }
}
