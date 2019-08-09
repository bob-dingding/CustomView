package com.hxzk.customview.drawbase.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/7
 * 描述:
 */
public class CustomePath_Line extends View {
    //lineTo(float x, float y) / rLineTo(float x, float y) 画直线,这两个方法的区别是，lineTo(x, y) 的参数是绝对坐标，而 rLineTo(x, y) 的参数是相对当前位置的相对坐标
   //当前位置：所谓当前位置，即最后一次调用画 Path 的方法的终点位置。初始值为原点 (0, 0)。

    Paint paint =new Paint();
    Path path =new Path();
    public CustomePath_Line(Context context) {
        super(context);
    }

    public CustomePath_Line(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomePath_Line(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomePath_Line(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.STROKE);
           /* <-- ============lineTo()和rLineTo()==================*/
        // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
        //path.lineTo(100, 100);
        // 由当前位置 (100, 100) 向正右方 100 像素的位置画一条直线
        //path.rLineTo(100, 0);
        /* <-- ============贝塞尔曲线quadTo()和rQuadTo()==================*/
//        path.quadTo(0,0,200,200);
//        path.rQuadTo(200,200,100,100);
        /* <-- ============moveTo()==================*/
        //moveTo(float x, float y) / rMoveTo(float x, float y) 移动到目标位置
        //你可以通过 moveTo(x, y) 或  rMoveTo() 来改变当前位置，从而间接地设置这些方法的起点
        // 画斜线
        //path.lineTo(100, 100);
        // 移动
        //path.moveTo(200, 100);
        // 画竖线
       // path.lineTo(200, 0);
        /* <-- ============arcTo()和addArc()==================*/
//        path.lineTo(100, 100);
//        // false直接连线连到弧形起点（有痕迹）
//        path.arcTo(100, 100, 300, 300, -90, 90, true);

        /* <-- ============close() 封闭当前子图形==================*/
        path.moveTo(100, 100);
        path.lineTo(200, 100);
        path.lineTo(150, 150);
        //使用 close() 封闭子图形。等价于 path.lineTo(100, 100)
        //注意当需要填充图形时（即 Paint.Style 为 FILL 或  FILL_AND_STROKE），Path 会自动封闭子图形
        path.close();
        canvas.drawPath(path,paint);
        //addArc() 只是一个直接使用了 forceMoveTo = true 的简化版 arcTo()
    }


//    <-- ============贝塞尔曲线================== -->
    //贝塞尔曲线：贝塞尔曲线是几何上的一种曲线。它通过起点、控制点和终点来描述一条曲线，主要用于计算机图形学。
    //画二次贝塞尔曲线
    //quadTo(float x1, float y1, float x2, float y2) / rQuadTo(float dx1, float dy1, float dx2, float dy2)
    //这条二次贝塞尔曲线的起点就是当前位置，而参数中的 x1, y1 和 x2, y2 则分别是控制点和终点的坐标。和 rLineTo(x, y)
    // 同理，rQuadTo(dx1, dy1, dx2, dy2) 的参数也是相对坐标
    // 画三次贝塞尔曲线
    //cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) / rCubicTo(float x1, float y1, float x2, float y2, float x3, float y3)


    //    <-- ============arcTo() 和 addArc()================== -->
    //arcTo() 和 addArc()。它们也是用来画线的，但并不使用当前位置作为弧线的起点。
    //arcTo() 只用来画弧形而不画扇形

}
