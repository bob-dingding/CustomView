package com.hxzk.customview.drawbase.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/7
 * 描述:
 */
public class CustomePath_addCircle extends View {
    //画笔
    Paint paint = new Paint();
    //路径
    Path path =new Path();



    public CustomePath_addCircle(Context context) {
        super(context);
    }

    public CustomePath_addCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomePath_addCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomePath_addCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        //用path对象画一个圆，x, y, radius 这三个参数是圆的基本信息，最后一个参数 dir 是画圆的路径的方向
        //路径方向有两种：顺时针 (CW clockwise) 和逆时针 (CCW counter-clockwise)
        path.addCircle(300, 300, 200, Path.Direction.CW);
        path.addCircle(200, 200, 200, Path.Direction.CW);
        path.setFillType(Path.FillType.INVERSE_WINDING);
        canvas.drawPath(path, paint);
    }



//    其他的 Path.add-() 方法和这类似，例如：
//    addOval(float left, float top, float right, float bottom, Direction dir) / addOval(RectF oval, Direction dir) 添加椭圆
//    addRect(float left, float top, float right, float bottom, Direction dir) / addRect(RectF rect, Direction dir) 添加矩形
//    addRoundRect(RectF rect, float rx, float ry, Direction dir) / addRoundRect(float left, float top, float right, float bottom, float rx, float ry, Direction dir) / addRoundRect(RectF rect, float[] radii, Direction dir) / addRoundRect(float left, float top, float right, float bottom, float[] radii, Direction dir) 添加圆角矩形
//    addPath(Path path) 添加另一个 Path


}
