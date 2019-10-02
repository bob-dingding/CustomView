package com.hxzk.customview.draworder.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by zjt on 2019/10/1. 21:48
 * 作用:
 */
public class CustomOrderLinearLayout extends LinearLayout {

    public CustomOrderLinearLayout(Context context) {
        super(context);
    }

    public CustomOrderLinearLayout(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint paint =new Paint();
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(300,300,50,paint);
        canvas.drawCircle(200,200,20,paint);
        canvas.drawCircle(400,400,50,paint);
    }
}
