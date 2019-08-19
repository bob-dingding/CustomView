package com.hxzk.customview.drawbase.widget.Canvas.drawXXX;

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
 * 描述:
 */
public class CustomeCircleViewTwo extends View {

    public CustomeCircleViewTwo(Context context) {
        super(context);
    }

    public CustomeCircleViewTwo(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomeCircleViewTwo(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomeCircleViewTwo(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    Paint paint =new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //给画布设置颜色可以理解为背景色
        //canvas.drawColor(Color.RED);
        paint.setColor(Color.RED);
        //注意Paint参数不能传空
        canvas.drawCircle(150,150,50,paint);
    }
}
