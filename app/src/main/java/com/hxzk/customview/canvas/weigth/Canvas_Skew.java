package com.hxzk.customview.canvas.weigth;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * Created by OCN.Yang on 2019/10/1. 11:58
 * 作用:错切
 */
public class Canvas_Skew extends View {
    public Canvas_Skew(Context context) {
        super(context);
    }

    public Canvas_Skew(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint =new Paint();
        canvas.save();
        //参数里的 sx 和 sy 是 x 方向和 y 方向的错切系数。
        canvas.skew(0, 0.5f);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gaoxiao);
        canvas.drawBitmap(bitmap, 100, 100, paint);
        canvas.restore();
    }


}
