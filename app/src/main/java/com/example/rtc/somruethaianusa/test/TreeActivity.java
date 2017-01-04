package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);
    }
    public void onClickoop (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton39);
        Intent intent = new Intent(TreeActivity.this,d1Activity.class);
        startActivity(intent);
    }
    public void onClickqee (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton43);
        Intent intent = new Intent(TreeActivity.this,f1Activity.class);
        startActivity(intent);
    }
    public void onClickwoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton38);
        Intent intent = new Intent(TreeActivity.this,fiveActivity.class);
        startActivity(intent);
    }
    public void onClickhoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton54);
        Intent intent = new Intent(TreeActivity.this,MainActivity.class);
        startActivity(intent);
    }
    public void onClicknoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton44);
        Intent intent = new Intent(TreeActivity.this,g1Activity.class);
        startActivity(intent);
    }
    public void onClickloo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton40);
        Intent intent = new Intent(TreeActivity.this,e1Activity.class);
        startActivity(intent);
    }
}
