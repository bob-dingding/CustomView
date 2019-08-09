package com.hxzk.customview.drawbase.widget.Canvas.drawXXX;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;



/**
 * 作者：created by ${zjt} on 2019/8/8
 * 描述:
 */
class DrawRecView extends View {

    public DrawRecView(Context context) {
        super(context);
    }

    public DrawRecView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawRecView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public DrawRecView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLACK);
        // Style 修改为画线模式
        paint.setStyle(Paint.Style.STROKE);
        //left, top, right, bottom 是矩形四条边的坐标,准确说是对角
        canvas.drawRect(150, 100, 450, 200, paint);
    }
}
