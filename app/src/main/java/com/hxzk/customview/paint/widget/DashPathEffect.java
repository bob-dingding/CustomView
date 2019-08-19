package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/19
 * 描述:
 */
public class DashPathEffect extends View {

    public DashPathEffect(Context context) {
        super(context);
    }

    public DashPathEffect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DashPathEffect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DashPathEffect(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float [] pathPoints ={20,20,120,200,120,200,150,150,150,150,200,230,200,230,256,0};
        //使用虚线来绘制线条
        //第一个参数 intervals 是一个数组，它指定了虚线的格式：数组中元素必须为偶数（最少是 2 个），按照「画线长度、空白长度、画线长度、空白长度」……的顺序排列
        //第二个参数 phase 是虚线的偏移量
        PathEffect pathEffect = new android.graphics.DashPathEffect(new float[]{20, 10, 5, 10}, 0);
        paint.setPathEffect(pathEffect);
        canvas.drawLines(pathPoints, paint);
    }
}
