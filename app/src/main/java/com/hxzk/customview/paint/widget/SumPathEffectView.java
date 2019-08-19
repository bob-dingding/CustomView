package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.DiscretePathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.SumPathEffect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/19
 * 描述:
 */
public class SumPathEffectView extends View {
    public SumPathEffectView(Context context) {
        super(context);
    }

    public SumPathEffectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SumPathEffectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SumPathEffectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //组合效果类的 PathEffect 。
        // 它的行为特别简单，就是分别按照两种 PathEffect 分别对目标进行绘制。
        float [] pathPoints ={20,20,120,200,120,200,150,150,150,150,200,230,200,230,256,0};

        PathEffect dashEffect = new DashPathEffect(new float[]{20, 10}, 0);
        PathEffect discreteEffect = new DiscretePathEffect(20, 5);
        PathEffect pathEffect = new SumPathEffect(dashEffect, discreteEffect);

        paint.setPathEffect(pathEffect);
        canvas.drawLines(pathPoints, paint);
    }
}
