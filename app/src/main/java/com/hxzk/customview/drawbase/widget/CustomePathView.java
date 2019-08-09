package com.hxzk.customview.drawbase.widget;

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
 * 作者：created by ${zjt} on 2019/8/5
 * 描述:
 */
@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class CustomePathView extends View {
    //    drawPath() 可以绘制自定义图形
//    drawPath(path) 这个方法是通过描述路径的方式来绘制图形的，
//    它的 path 参数就是用来描述图形路径的对象。path 的类型是 Path


    Paint paint = new Paint();
    //初始化 Path 对象
    Path path = new Path();

    {
        // 使用 path 对图形进行描述
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
    }


    public CustomePathView(Context context) {
        super(context);
    }

    public CustomePathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomePathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomePathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 绘制出 path 描述的图形（心形）
        canvas.drawPath(path, paint);
    }
}
