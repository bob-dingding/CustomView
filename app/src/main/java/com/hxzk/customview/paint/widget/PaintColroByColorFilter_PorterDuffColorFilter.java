package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * 作者：created by ${zjt} on 2019/8/9
 * 描述:
 */
public class PaintColroByColorFilter_PorterDuffColorFilter extends View {

    //PorterDuffColorFilter 的作用是使用一个指定的颜色和一种指定的 PorterDuff.Mode 来与绘制对象进行合成

    public PaintColroByColorFilter_PorterDuffColorFilter(Context context) {
        super(context);
    }

    public PaintColroByColorFilter_PorterDuffColorFilter(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PaintColroByColorFilter_PorterDuffColorFilter(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PaintColroByColorFilter_PorterDuffColorFilter(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //构造方法是 PorterDuffColorFilter(int color, PorterDuff.Mode mode) 其中的 color 参数是指定的颜色， mode 参数是指定的 Mode
        ColorFilter lightingColorFilter = new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.ADD);
        paint.setColorFilter(lightingColorFilter);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.timg);
        canvas.drawBitmap(bitmap,50,50,paint);
    }
}
