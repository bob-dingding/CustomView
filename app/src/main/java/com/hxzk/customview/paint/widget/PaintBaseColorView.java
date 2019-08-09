package com.hxzk.customview.paint.widget;

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
 * 描述:设置基本颜色直接用 Paint.setColor/ARGB() 来设置颜色
 */
class PaintBaseColorView extends View {

    //Canvas 的颜色填充类方法  drawColor/RGB/ARGB() 的颜色，是直接写在方法的参数里
    //drawBitmap() 的颜色，是直接由 Bitmap 对象来提供的
    //图形和文字的绘制，它们的颜色就需要使用 paint 参数来额外设置
    //Paint 设置颜色的方法有两种：一种是直接用 Paint.setColor/ARGB() 来设置颜色
    //另一种是使用 Shader 来指定着色方案。

    public PaintBaseColorView(Context context) {
        super(context);
    }

    public PaintBaseColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PaintBaseColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PaintBaseColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //setColor() 对应的 get 方法是 getColor()
        //paint.setColor(Color.parseColor("#009688"));
        //它的参数用的是更直接的三原色与透明度的值
        paint.setARGB(100, 255, 0, 0);
        canvas.drawCircle(150,150,60,paint);
    }
}
