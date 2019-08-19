package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/19
 * 描述:把所有拐角变成圆角
 */
public class CornerPathEffectView extends View {
    public CornerPathEffectView(Context context) {
        super(context);
    }

    public CornerPathEffectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CornerPathEffectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CornerPathEffectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float [] pathPoints ={20,20,120,200,120,200,150,150,150,150,200,230,200,230,256,0};
        //拐角变成圆角,圆角的半径20
        PathEffect pathEffect = new CornerPathEffect(20);
        paint.setPathEffect(pathEffect);
        canvas.drawLines(pathPoints, paint);
    }
}
