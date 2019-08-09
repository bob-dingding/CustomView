package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * 作者：created by ${zjt} on 2019/8/9
 * 描述:
 */
public class PaintColroByColorFilter_ColorMatrixColorFilter extends View {

    //ColorMatrixColorFilter 使用一个 ColorMatrix 来对颜色进行处理。
    // ColorMatrix 这个类，内部是一个 4x5 的矩阵

    public PaintColroByColorFilter_ColorMatrixColorFilter(Context context) {
        super(context);
    }

    public PaintColroByColorFilter_ColorMatrixColorFilter(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PaintColroByColorFilter_ColorMatrixColorFilter(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PaintColroByColorFilter_ColorMatrixColorFilter(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float [] mColorMatrix =new float[]{
                1,0,0,0,0,
                0,0,0,0,0,
                0,0,1,0,0,
                0,0,0,0.8f,0,};
        ColorMatrix colorMatrix = new ColorMatrix();
        //将一维数组设置到ColorMatrix
        colorMatrix.set(mColorMatrix);

        ColorFilter lightingColorFilter = new ColorMatrixColorFilter(colorMatrix);
        paint.setColorFilter(lightingColorFilter);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.timg);
        canvas.drawBitmap(bitmap,50,50,paint);

    }
}
