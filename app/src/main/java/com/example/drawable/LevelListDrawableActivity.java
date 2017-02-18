package com.example.drawable;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/2/17.
 */
public class LevelListDrawableActivity extends AppCompatActivity{
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levellistdrawable);

        iv=(ImageView)findViewById(R.id.iv);
        iv.setImageLevel(8);//介于minLevel和maxLevel之间
    }

    public void lampOn(View v){
        iv.setImageLevel(15);
    }

    public void lampOff(View v){
        iv.setImageLevel(8);
    }
}
