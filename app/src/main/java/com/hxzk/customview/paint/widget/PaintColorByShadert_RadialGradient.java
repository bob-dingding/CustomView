package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
 * 描述:RadialGradient 辐射渐变实现Paint着色
 */
public class PaintColorByShadert_RadialGradient extends View {


    public PaintColorByShadert_RadialGradient(Context context) {
        super(context);
    }

    public PaintColorByShadert_RadialGradient(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PaintColorByShadert_RadialGradient(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PaintColorByShadert_RadialGradient(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        enterX centerY：辐射中心的坐标
//        radius：辐射半径
//        centerColor：辐射中心的颜色
//        edgeColor：辐射边缘的颜色
//        tileMode：辐射范围之外的着色模式。
        Shader shader = new RadialGradient(150, 150, 100, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawCircle(150,150,80,paint);
    }
}
