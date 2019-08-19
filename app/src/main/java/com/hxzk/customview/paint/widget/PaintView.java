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
 * 作者：created by ${zjt} on 2019/8/14
 * 描述:
 */
public class PaintView extends View {


    public PaintView(Context context) {
        super(context);
    }

    public PaintView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PaintView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PaintView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置颜色
        paint.setColor(Color.RED);
        //设置抗锯齿
        paint.setAntiAlias(true);
        // FILL 模式，填充
        paint.setStyle(Paint.Style.FILL);
        //设置线条宽度。单位为像素，默认值是 0
        paint.setStrokeWidth(5);
        //设置线头的形状,BUTT 平头、ROUND 圆头、SQUARE 方头。默认为 BUTT
        paint.setStrokeCap(Paint.Cap.ROUND);
        //设置拐角的形状。有三个值可以选择：MITER 尖角、 BEVEL 平角和 ROUND 圆角。默认为 MITER
        paint.setStrokeJoin(Paint.Join.BEVEL);
        //对于 setStrokeJoin() 的一个补充，它用于设置 MITER 型拐角的延长线的最大值
        paint.setStrokeMiter(5);
        canvas.drawCircle(90,90,80,paint);
    }
}
