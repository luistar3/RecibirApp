package com.example.luis.recibirapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        if ( intent.ACTION_SEND.equals(action) && type != null){
            if ("text/plain".equals(type)){
                //realizar el tratamiento de la informacion
                manipularTexto(intent);
            }

        }
    }
    public void manipularTexto(Intent intent){
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        if (sharedText != null){
            Toast.makeText(this,sharedText,Toast.LENGTH_LONG).show();
        }
    }
}
