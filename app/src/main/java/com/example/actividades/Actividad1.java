package com.example.actividades;
//KATERIN MAYRA PARRA ALVAREZ
//8522693
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String msn = this.getIntent().getExtras().getString("msn");
        TextView txt = findViewById(R.id.txt1);
        txt.setText(msn);
    }
    @Override
    protected void onStart() {
        Toast.makeText(this, "hola onStart",Toast.LENGTH_LONG).show();
        super.onStart();
    }
    protected void onResume() {
        Toast.makeText(this, "hola onResume",Toast.LENGTH_LONG).show();
        super.onResume();
    }
    protected void onPause() {
        Toast.makeText(this, "hola onPause",Toast.LENGTH_LONG).show();
        super.onPause();
    }
    protected void onStop() {
        Toast.makeText(this, "hola onStop",Toast.LENGTH_LONG).show();
        super.onStop();
    }
    protected void onRestart() {
        Toast.makeText(this, "hola onRestart",Toast.LENGTH_LONG).show();
        super.onRestart();
    }
    protected void onDestroy() {

        super.onDestroy();
    }



}