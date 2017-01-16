package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class PlayGame2 extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView1, imageView2, imageView3;
    private int timeAnInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game1);

        imageView1 = (ImageView) findViewById(R.id.imageView9);
        imageView2 = (ImageView) findViewById(R.id.imageView7);
        imageView3 = (ImageView) findViewById(R.id.imageView8);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);


    }   // Main Method

    @Override
    public void onClick(View view) {

        Log.d("16janV3", "click OK");

        switch (view.getId()) {
            case R.id.imageView9:
                clickImage(imageView1);
                break;
            case R.id.imageView7:
                clickImage(imageView2);
                break;
            case R.id.imageView8:
                clickImage(imageView3);
                break;

        }


    }   // onClick

    private void clickImage(ImageView imageView) {
        imageView.setImageResource(R.drawable.aoo);
        timeAnInt += 1;
        if (timeAnInt == 3) {
            startActivity(new Intent(PlayGame2.this, PlayGame3.class));
        }
    }
}   // Main Class
