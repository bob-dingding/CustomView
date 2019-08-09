package com.hxzk.customview.drawbase.widget.Canvas.drawXXX;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/8
 * 描述:画点
 */
public class DrawPointView extends View {
    public DrawPointView(Context context) {
        super(context);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    Paint paint =new Paint();
   // float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
    float[] points = {0, 0, 150, 150, 150, 200, 200, 150, 200, 200, 250, 150, 250, 250};
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
          //设置点的大小
         paint.setStrokeWidth(40);
         //设置：ROUND 画出来是圆形的点，SQUARE 或 BUTT 画出来是方形的点
        paint.setStrokeCap(Paint.Cap.ROUND) ;
        paint.setStyle(Paint.Style.STROKE);
        // 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
        canvas.drawPoint(50,150,paint);
        canvas.drawPoints(points, 2 /* 跳过两个数，即前两个 0 */,
                8 /* 一共绘制 8 个数（4 个点）*/, paint);
    }
}
