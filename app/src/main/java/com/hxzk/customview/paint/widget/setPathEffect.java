package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/14
 * 描述:
 */
public class setPathEffect extends View {
    public setPathEffect(Context context) {
        super(context);
    }

    public setPathEffect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public setPathEffect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public setPathEffect(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置颜色
        paint.setColor(Color.RED);
        //设置抗锯齿
        paint.setAntiAlias(false);
        //STROKE 模式，画线
        paint.setStyle(Paint.Style.STROKE);
        //使用 PathEffect 来给图形的轮廓设置效果。对 Canvas 所有的图形绘制有效
        //ndroid 中的 6 种 PathEffect。PathEffect 分为两类，单一效果的 CornerPathEffect DiscretePathEffect DashPathEffect PathDashPathEffect ，
        // 和组合效果的 SumPathEffect ComposePathEffect。
        PathEffect pathEffect = new DashPathEffect(new float[]{10, 5}, 10);
        paint.setPathEffect(pathEffect);
        canvas.drawCircle(90,90,80,paint);

    }
}
