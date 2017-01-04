package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class e1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e1);
    }
    public void onClickzoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton56);
        Intent intent = new Intent(e1Activity.this,TreeActivity.class);
        startActivity(intent);
    }
}
