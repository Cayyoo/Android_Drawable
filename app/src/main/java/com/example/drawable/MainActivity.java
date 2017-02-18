package com.example.drawable;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * 各种Drawable用法：
 *    BitmapDrawable
 *    LayerDrawable
 *    StateListDrawable
 *    LevelListDrawable
 *    TransitionDrawable
 *    InsertDrawable
 *    ClipDrawable
 *    CustomDrawable
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        this.findViewById(R.id.bitmap).setOnClickListener(this);
        this.findViewById(R.id.layer).setOnClickListener(this);
        this.findViewById(R.id.statelist).setOnClickListener(this);
        this.findViewById(R.id.levellist).setOnClickListener(this);
        this.findViewById(R.id.transition).setOnClickListener(this);
        this.findViewById(R.id.insert).setOnClickListener(this);
        this.findViewById(R.id.clip).setOnClickListener(this);
        this.findViewById(R.id.custom).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bitmap:
                startActivity(new Intent(this,BitmapDrawableActivity.class));
                break;
            case R.id.layer:
                startActivity(new Intent(this,LayerDrawableActivity.class));
                break;
            case R.id.statelist:
                startActivity(new Intent(this,StateListDrawableActivity.class));
                break;
            case R.id.levellist:
                startActivity(new Intent(this,LevelListDrawableActivity.class));
                break;
            case R.id.transition:
                startActivity(new Intent(this,TransitionDrawableActivity.class));
                break;
            case R.id.insert:
                startActivity(new Intent(this,InsertDrawableActivity.class));
                break;
            case R.id.clip:
                startActivity(new Intent(this,ClipDrawableActivity.class));
                break;
            case R.id.custom:
                startActivity(new Intent(this,CustomDrawableActivity.class));
                break;
            default:
                break;
        }
    }
}
