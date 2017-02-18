package com.example.drawable;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BitmapDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmapdrawable);
        Log.i("BitmapDrawableActivity",findViewById(R.id.id_bitmap).getBackground().toString());
    }


}
