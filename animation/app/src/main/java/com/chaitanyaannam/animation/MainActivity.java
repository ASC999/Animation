package com.chaitanyaannam.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView ivSkull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivSkull = (ImageView) findViewById(R.id.ivSkull);
    }

    public void clockwise(View view) {
        ImageView image = (ImageView) findViewById(R.id.ivSkull);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
        image.startAnimation(animation);
    }

    public void fade(View view) {
        ImageView image = (ImageView) findViewById(R.id.ivSkull);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        image.startAnimation(animation1);
    }


    public void blink(View view) {
        ImageView image = (ImageView) findViewById(R.id.ivSkull);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        image.startAnimation(animation1);
    }

    public void move(View view) {
        ImageView image = (ImageView) findViewById(R.id.ivSkull);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        image.startAnimation(animation1);
    }

    public void slide(View view) {
        ImageView image = (ImageView) findViewById(R.id.ivSkull);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        image.startAnimation(animation1);
    }
}