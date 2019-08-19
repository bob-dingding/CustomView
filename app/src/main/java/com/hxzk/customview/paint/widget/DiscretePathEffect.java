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
public class DiscretePathEffect extends View {
    Context mContext;
    public DiscretePathEffect(Context context) {
        super(context);
        this.mContext =context;
    }

    public DiscretePathEffect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DiscretePathEffect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DiscretePathEffect(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float [] pathPoints ={20,20,120,200,120,200,150,150,150,150,200,230,200,230,256,0};
        //把线条进行随机的偏离，让轮廓变得乱七八糟。乱七八糟的方式和程度由参数决定
        PathEffect pathEffect = new android.graphics.DiscretePathEffect(20,5);
        paint.setPathEffect(pathEffect);
        canvas.drawLines(pathPoints, paint);
    }
}
