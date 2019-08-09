package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/8
 * 描述:扫描渐变
 */
public class PaintColorByShadert_SweepGradient extends View {

    public PaintColorByShadert_SweepGradient(Context context) {
        super(context);
    }

    public PaintColorByShadert_SweepGradient(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PaintColorByShadert_SweepGradient(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PaintColorByShadert_SweepGradient(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint= new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        参数：
//        cx cy ：扫描的中心
//        color0：扫描的起始颜色
//        color1：扫描的终止颜色
        Shader shader = new SweepGradient(150, 150, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"));
        paint.setShader(shader);
        canvas.drawCircle(150,150,80,paint);
    }
}
