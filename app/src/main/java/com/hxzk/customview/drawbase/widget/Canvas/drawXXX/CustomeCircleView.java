package com.hxzk.customview.drawbase.widget.Canvas.drawXXX;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


/**
 * 作者：created by ${zjt} on 2019/8/5
 * 描述:
 */
public class CustomeCircleView extends View {

    //执行顺序:onMeasure onLayout onDraw
    Paint paint = new Paint();

    public CustomeCircleView(Context context) {
        super(context);
    }

    public CustomeCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomeCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomeCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 设置为红色,画一个红色的圆
        paint.setColor(Color.RED);
        // Style 修改为画线模式,空心圆或者叫环形
//        具体来说有三种： FILL, STROKE 和  FILL_AND_STROKE 。
//        FILL 是填充模式，
//        STROKE 是画线模式（即勾边模式），
//        FILL_AND_STROKE 是两种模式一并使用：既画线又填充。它的默认值是 FILL，填充模式
        paint.setStyle(Paint.Style.STROKE);
        // 线条宽度为 20 像素
        paint.setStrokeWidth(20);
        //来动态开关抗锯齿,让图形和文字的边缘更加平滑
        paint.setAntiAlias(true);
        //绘制一个圆,前两个参数 centerX centerY 是圆心的坐标，第三个参数 radius 是圆的半径，单位都是像素
        canvas.drawCircle(150, 150, 50, paint);
        //颜色填充,会把整个区域染成纯黑色，覆盖掉原有内容
        //canvas.drawColor(Color.BLACK);
        canvas.drawColor(Color.parseColor("#88880000"));
    }


//    在 Android 里，每个 View 都有一个自己的坐标系，彼此之间是不影响的。
//    这个坐标系的原点是 View 左上角的那个点；
//    水平方向是 x 轴，右正左负；竖直方向是 y 轴，下正上负


    //canvas相关drawxxx方法
    //画矩形left, top, right, bottom 是矩形四条边的坐标。
    //drawRect(float left, float top, float right, float bottom, Paint paint)
    // 画点,x 和 y 是点的坐标。点的大小可以通过 paint.setStrokeWidth(width) 来设置；点的形状可以通过  paint.setStrokeCap(cap) 来设置
    //drawPoint(float x, float y, Paint paint)
    //画点（批量）
    //drawPoints(float[] pts, int offset, int count, Paint paint) /
    //drawPoints(float[] pts, Paint paint)
    //画椭圆,只能绘制横着的或者竖着的椭圆，不能绘制斜的（斜的倒是也可以，但不是直接使用 drawOval()，而是配合几何变换）
    //drawOval(float left, float top, float right, float bottom, Paint paint)
    //画线,startX, startY, stopX, stopY 分别是线的起点和终点坐标
    //drawLine(float startX, float startY, float stopX, float stopY, Paint paint)
    //画线（批量）
    //drawLines(float[] pts, int offset, int count, Paint paint) /
    //drawLines(float[] pts, Paint paint)
    //画圆角矩形,left, top, right, bottom 是四条边的坐标，rx 和 ry 是圆角的横向半径和纵向半径
    //drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, Paint paint)
    //绘制弧形或扇形
    //drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint)
    //画自定义图形
    //drawPath(Path path, Paint paint)


}
