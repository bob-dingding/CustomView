package com.hxzk.customview.draworder.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by zjt on 2019/10/2. 10:55
 * 作用:
 */
public class CustomOrderDrawForegroundTwo extends ImageView {

    public CustomOrderDrawForegroundTwo(Context context) {
        super(context);
    }

    public CustomOrderDrawForegroundTwo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDrawForeground(Canvas canvas) {

            Paint paint =new Paint();
            paint.setColor(Color.RED);
            RectF rec = new RectF(50, 50, 150, 100);
            canvas.drawRoundRect(rec, 15, 15, paint);
            //重新设置画笔颜色
            paint.setColor(Color.GREEN);
            paint.setTextSize(25);
            String text ="NEW";
            canvas.drawText(text,70,90,paint);
        super.onDrawForeground(canvas);
    }
}
