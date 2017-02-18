package com.example.drawable;

import android.app.Activity;
import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/2/17.
 */
public class ClipDrawableActivity extends AppCompatActivity {
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clipdrawable);

        iv=(ImageView)findViewById(R.id.iv);
        ClipDrawable cd=(ClipDrawable)iv.getDrawable();
        cd.setLevel(5000);//取值0-10000，0是完全不显示，10000是完全显示
    }
}
