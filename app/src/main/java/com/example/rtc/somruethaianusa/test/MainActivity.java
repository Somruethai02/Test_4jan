package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickone (View view) {
        ImageButton btn_next = (ImageButton)findViewById(R.id.imageButton1);
        Intent intent = new Intent(MainActivity.this,TwoActivity.class);
        startActivity(intent);
    }
    public void onClicky (View view) {
        ImageButton btn_next = (ImageButton)findViewById(R.id.imageButton2);
        Intent intent = new Intent(MainActivity.this,TreeActivity.class);
        startActivity(intent);
    }
    public void onClickyyy (View view) {
        ImageButton btn_next = (ImageButton)findViewById(R.id.imageButton3);
        Intent intent = new Intent(MainActivity.this,ShowDetailActivity.class);
        startActivity(intent);

    }
}
