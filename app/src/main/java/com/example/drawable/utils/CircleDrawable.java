package com.example.drawable.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/**
 * 自定义Drawable，绘制圆形图像
 */
public class CircleDrawable extends Drawable {
    private Paint mPaint;//画笔对象
    private int mWidth;//半径，取图片宽高的最小值
    private Bitmap mBitmap;//位图对象

    public CircleDrawable(Bitmap mBitmap) {
        this.mBitmap = mBitmap;
        BitmapShader bs=new BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);//着色器
        mPaint=new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setShader(bs);
        mWidth=Math.min(mBitmap.getWidth(),mBitmap.getHeight());
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(mWidth/2,mWidth/2,mWidth/2,mPaint);//绘制图形
    }

    @Override
    public void setAlpha(int alpha) {
        mPaint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        mPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;//返回系统自带透明度
    }

    @Override
    public int getIntrinsicHeight() {//重写，返回实际的高
        return mWidth;
    }

    @Override
    public int getIntrinsicWidth() {//重写，返回实际的宽
        return mWidth;
    }
}
