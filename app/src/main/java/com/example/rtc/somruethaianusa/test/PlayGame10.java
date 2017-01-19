package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class PlayGame10 extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView1, imageView2, imageView3;
    private int timeAnInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game10);

        imageView1 = (ImageView) findViewById(R.id.bb);
        imageView2 = (ImageView) findViewById(R.id.cc);
        imageView3 = (ImageView) findViewById(R.id.dd);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);


    }   // Main Method

    @Override
    public void onClick(View view) {

        Log.d("16janV3", "click OK");

        switch (view.getId()) {
            case R.id.bb:
                clickImage(imageView1);
                break;
            case R.id.cc:
                clickImage(imageView2);
                break;
            case R.id.dd:
                clickImage(imageView3);
                break;

        }


    }   // onClick

    private void clickImage(ImageView imageView) {
        imageView.setImageResource(R.drawable.boo);
        timeAnInt += 1;
        if (timeAnInt == 3) {
            startActivity(new Intent(PlayGame10.this, PlayGame1.class));
        }
    }
}   // Main Class
