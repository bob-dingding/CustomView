package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;


/**
 * 作者：created by ${zjt} on 2019/8/14
 * 描述:
 */
public class setDitherAndsetFilterBitmapTwo extends View {

    public setDitherAndsetFilterBitmapTwo(Context context) {
        super(context);
    }

    public setDitherAndsetFilterBitmapTwo(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public setDitherAndsetFilterBitmapTwo(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public setDitherAndsetFilterBitmapTwo(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.photo);
        //设置图像的抖动
        paint.setDither(false);
        //设置是否使用双线性过滤来绘制 Bitmap
        paint.setFilterBitmap(false);
        canvas.drawBitmap(bitmap, 30, 30, paint);
    }
}
