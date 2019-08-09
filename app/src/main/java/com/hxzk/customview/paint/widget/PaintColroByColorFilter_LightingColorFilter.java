package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
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
public class PaintColroByColorFilter_LightingColorFilter extends View {


//    在 Paint 里设置 ColorFilter ，使用的是 Paint.setColorFilter(ColorFilter filter) 方法。
//    android.graphics.ColorFilter 并不直接使用，而是使用它的子类。它共有三个子类：
//    LightingColorFilter PorterDuffColorFilter 和  ColorMatrixColorFilter。


    public PaintColroByColorFilter_LightingColorFilter(Context context) {
        super(context);
    }

    public PaintColroByColorFilter_LightingColorFilter(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PaintColroByColorFilter_LightingColorFilter(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PaintColroByColorFilter_LightingColorFilter(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        LightingColorFilter 的构造方法是 LightingColorFilter(int mul, int add) ，
//        参数里的 mul 和 add 都是和颜色值格式相同的 int 值，
//        其中 mul 用来和目标像素相乘，add 用来和目标像素相加：
        //去掉原像素中的红色，可以把它的 mul 改为 0x00ffff （红色部分为 0 ）
//        计算过程为:
//        R ' = R * 0x0 / 0xff + 0x0 = 0 // 红色被移除
//        G' = G * 0xff / 0xff + 0x0 = G
//        B' = B * 0xff / 0xff + 0x0 = B
        ColorFilter lightingColorFilter = new LightingColorFilter(0x00ffff, 0x000000);
        paint.setColorFilter(lightingColorFilter);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.timg);
        canvas.drawBitmap(bitmap,50,50,paint);
    }
}
