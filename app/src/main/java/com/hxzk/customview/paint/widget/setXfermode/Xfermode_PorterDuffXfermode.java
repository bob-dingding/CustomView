package com.hxzk.customview.paint.widget.setXfermode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * 作者：created by ${zjt} on 2019/8/14
 * 描述:
 */
public class Xfermode_PorterDuffXfermode extends View {
    public Xfermode_PorterDuffXfermode(Context context) {
        super(context);
    }

    public Xfermode_PorterDuffXfermode(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Xfermode_PorterDuffXfermode(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Xfermode_PorterDuffXfermode(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //使用离屏缓冲，把要绘制的内容单独绘制在缓冲层， Xfermode 的使用就不会出现奇怪的结果了。使用离屏缓冲有两种方式：
        //Canvas.saveLayer()
        //View.setLayerType()
        int saved = canvas.saveLayer(null, null, Canvas.ALL_SAVE_FLAG);


        Xfermode xfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

        Bitmap rectBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.shinvtu);
        Bitmap circleBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.shinvtu);
        //画方
        canvas.drawBitmap(rectBitmap, 0, 0, paint);
        //canvas.drawRect(0,50,500,500,paint);
        // 设置 Xfermode
        paint.setXfermode(xfermode);
        //画圆
        canvas.drawBitmap(circleBitmap,0, 0, paint);
        //canvas.drawCircle(70,70,100,paint);

        // 用完及时清除 Xfermode
        paint.setXfermode(null);

        canvas.restoreToCount(saved);
    }
}
