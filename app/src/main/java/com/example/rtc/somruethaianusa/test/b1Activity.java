package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);
    }
    public void onClickmo (View view) {
        ImageButton btn_animal = (ImageButton)findViewById(R.id.imageButton20);
        Intent intent = new Intent(b1Activity.this,b2Activity.class);
        startActivity(intent);
        finish();
    }
}
