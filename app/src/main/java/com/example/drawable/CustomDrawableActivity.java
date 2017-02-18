package com.example.drawable;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.drawable.utils.CircleDrawable;
import com.example.drawable.utils.RoundDrawable;

/**
 * Created by Administrator on 2017/2/17.
 */
public class CustomDrawableActivity extends AppCompatActivity {
    private ImageView iv,img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customdrawable);

        iv=(ImageView)findViewById(R.id.iv);
        img=(ImageView)findViewById(R.id.img);

        Bitmap bitmap= BitmapFactory.decodeResource(getResources(), R.mipmap.avatar);

        iv.setImageDrawable(new CircleDrawable(bitmap));
        img.setImageDrawable(new RoundDrawable(bitmap));
    }
}
