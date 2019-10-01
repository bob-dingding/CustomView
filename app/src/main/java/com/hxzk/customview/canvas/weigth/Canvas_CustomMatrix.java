package com.hxzk.customview.canvas.weigth;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * Created by zjt on 2019/10/1. 12:37
 * 作用:使用Matrix做自定义变换
 */
public class Canvas_CustomMatrix extends View {


    public Canvas_CustomMatrix(Context context) {
        super(context);
    }

    public Canvas_CustomMatrix(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Matrix 的自定义变换使用的是 setPolyToPoly() 方法
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gaoxiao);
        Matrix matrix = new Matrix();
        Float left =100f;
        Float top =100f;
        Float bottom =bitmap.getHeight() +top;
        Float right =bitmap.getWidth()+left;
        float [] pointsSrc = {left, top, right, top, left, bottom, right, bottom};
        float [] pointsDst = {left - 10, top + 50, right + 120, top - 90, left + 20, bottom + 30, right + 20, bottom + 60};

        matrix.reset();
        //参数里，src 和 dst 是源点集和目标点集；srcIndex 和 dstIndex 是第一个点的偏移；
        // pointCount 是采集的点的个数（个数不能大于 4，因为大于 4 个点就无法计算变换了）
        matrix.setPolyToPoly(pointsSrc, 0, pointsDst, 0, 4);

        canvas.save();
        canvas.concat(matrix);

        Paint paint =new Paint();
        canvas.drawBitmap(bitmap, 100, 100, paint);
        canvas.restore();
    }
}
