package com.hxzk.customview.draworder.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.TextView;

/**
 * Created by zjt on 2019/10/1. 21:07
 * 作用:
 */
@SuppressLint("AppCompatCustomView")
public class CustomOrderTextView extends TextView {



    public CustomOrderTextView(Context context) {
        super(context);
    }

    public CustomOrderTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint =new Paint();
        paint.setColor(Color.RED);
        RectF rec = new RectF(100, 100, 1000, 200);
        canvas.drawRoundRect(rec, 15, 15, paint);
        super.onDraw(canvas);
        //重新设置画笔颜色
        paint.setColor(Color.GREEN);
        paint.setTextSize(25);
        String text ="绘制文字之前，先绘制出被强调的文字的背景";
        canvas.drawText(text,150,150,paint);
    }

}
