package com.example.drawable;

import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/2/17.
 */
public class TransitionDrawableActivity extends AppCompatActivity {
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transitiondrawable);
        iv=(ImageView)findViewById(R.id.iv);
    }

    public void lampOn(View view){
        TransitionDrawable td=(TransitionDrawable)iv.getDrawable();
        td.startTransition(3*1000);
    }

    public void lampOff(View view){
        TransitionDrawable td=(TransitionDrawable)iv.getDrawable();
        td.reverseTransition(3*1000);
    }

}
