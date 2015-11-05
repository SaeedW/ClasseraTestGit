package com.app.classera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // another changes
        Toast.makeText(MainActivity.this,"Welcome in Get", Toast.LENGTH_LONG).show();
    }
}
