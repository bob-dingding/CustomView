package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/8
 * 描述: Paint通过Shader 来指定着色方案
 */
public class PaintColorByShader_LinearGradient extends View {

//    Shader和直接设置颜色的区别是，着色器设置的是一个颜色方案，或者说是一套着色规则。当设置了 Shader 之后，
//    Paint 在绘制图形和文字时就不使用  setColor/ARGB() 设置的颜色了，而是使用 Shader 的方案中的颜色
//    在 Android 的绘制里使用 Shader ，并不直接用 Shader 这个类，而是用它的几个子类。
//    具体来讲有  LinearGradient RadialGradient SweepGradient BitmapShader ComposeShader 这么几个


    public PaintColorByShader_LinearGradient(Context context) {
        super(context);
    }

    public PaintColorByShader_LinearGradient(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PaintColorByShader_LinearGradient(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PaintColorByShader_LinearGradient(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //LinearGradient为线性渐变
        //设置两个点和两种颜色，以这两个点作为端点，使用两种颜色的渐变来绘制颜色,注意这两个点都在圆内
        //最后一个参数TileMode有三个模式: 一共有 3 个值可选 CLAMP, MIRROR 和  REPEAT
        //CLAMP模式会在端点之外延续端点处的颜色；MIRROR 是镜像模式；REPEAT 是重复模式
        Shader shader = new LinearGradient(50, 50, 250, 250, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawCircle(150,150,80,paint);
    }


}
