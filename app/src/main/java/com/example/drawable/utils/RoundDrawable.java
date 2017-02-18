package com.example.drawable.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/**
 * 自定义Drawable，绘制圆角图片
 */
public class RoundDrawable extends Drawable {
    private Paint mPaint;//画笔对象
    private RectF rectF;//矩形区域
    private Bitmap mBitmap;//位图对象

    public RoundDrawable(Bitmap mBitmap) {
        this.mBitmap = mBitmap;
        BitmapShader bs=new BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);//着色器
        mPaint=new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setShader(bs);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRoundRect(rectF, 50, 50, mPaint);
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
        return mBitmap.getHeight();
    }

    @Override
    public int getIntrinsicWidth() {//重写，返回实际的宽
        return mBitmap.getWidth();
    }

    @Override
    public void setBounds(int left, int top, int right, int bottom) {//重写，设置区域
        rectF=new RectF(left,top,right,bottom);//这几个参数包含整个区域
    }

}