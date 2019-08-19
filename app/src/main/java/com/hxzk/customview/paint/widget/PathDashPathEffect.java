package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/19
 * 描述:
 */
public class PathDashPathEffect extends View {

    public PathDashPathEffect(Context context) {
        super(context);
    }

    public PathDashPathEffect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PathDashPathEffect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PathDashPathEffect(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float [] pathPoints ={20,20,120,200,120,200,150,150,150,150,200,230,200,230,256,0};
        // 使用一个三角形来做 dash
        Path dashPath =new Path() ;
        dashPath.moveTo(100, 100);
        dashPath.lineTo(200, 100);
        dashPath.lineTo(150, 150);
        //// 使用 close() 封闭子图形
        dashPath.close();
        PathEffect pathEffect = new android.graphics.PathDashPathEffect(dashPath, 40, 0,
           android.graphics.PathDashPathEffect.Style.TRANSLATE);
        paint.setPathEffect(pathEffect);

        canvas.drawLines(pathPoints, paint);
    }
}
