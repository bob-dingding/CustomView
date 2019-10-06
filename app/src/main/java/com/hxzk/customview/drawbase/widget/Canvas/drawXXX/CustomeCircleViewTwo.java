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

     int color =0;
    // 创建 getter 方法
    public int getColor() {
        return color;
    }

    // 创建 setter 方法
    public void setColor(int progress) {
        this.color = progress;
        invalidate();
    }




    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint =new Paint();
        if(color != 0){
            paint.setColor(color);
        }else{
            paint.setColor(Color.RED);
        }

        //注意Paint参数不能传空
        canvas.drawCircle(150,150,100,paint);
    }
}
