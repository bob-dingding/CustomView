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
 * Created by OCN.Yang on 2019/10/1. 12:15
 * 作用:Matrix做常见变换
 */
public class Canvas_Matrix extends View {
    public Canvas_Matrix(Context context) {
        super(context);
    }

    public Canvas_Matrix(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint =new Paint();
        Matrix matrix = new Matrix();

        matrix.reset();
        //注意执行顺序是倒叙，也就是先执行postRotate，在执行postTranslate
        matrix.postTranslate(50,0);
        matrix.postRotate(180,300,150);

        canvas.save();
        canvas.concat(matrix);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gaoxiao);
        canvas.drawBitmap(bitmap, 100, 100, paint);
        canvas.restore();
    }
}
