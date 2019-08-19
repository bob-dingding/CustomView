package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.DashPathEffect;
import android.graphics.DiscretePathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/19
 * 描述:
 */
public class ComposePathEffectView extends View {
    public ComposePathEffectView(Context context) {
        super(context);
    }

    public ComposePathEffectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ComposePathEffectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ComposePathEffectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    Paint paint =new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float [] pathPoints ={20,20,120,200,120,200,150,150,150,150,200,230,200,230,256,0};

        PathEffect dashEffect = new DashPathEffect(new float[]{20, 10}, 0);
        PathEffect discreteEffect = new DiscretePathEffect(20, 5);
        PathEffect  pathEffect = new ComposePathEffect(dashEffect, discreteEffect);

        paint.setPathEffect(pathEffect);
        canvas.drawLines(pathPoints, paint);
    }
}
