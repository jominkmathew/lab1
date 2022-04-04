package com.example.optionmenu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        builder=new AlertDialog.Builder(this);
    }
    public void oncl(View view){
        AlertDialog alertDialog=builder.create();
        alertDialog.setTitle("Name:Star");
        alertDialog.show();
    }
    public void oncli(View view){
        AlertDialog alertDialog=builder.create();
        alertDialog.setTitle("Name:cross");
        alertDialog.show();
    }
    public void onclick(View view){
        Intent i = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(i);
    }
}