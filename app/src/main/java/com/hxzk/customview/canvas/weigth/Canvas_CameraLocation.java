package com.hxzk.customview.canvas.weigth;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * Created by zjt on 2019/10/1. 13:55
 * 作用:
 */
public class Canvas_CameraLocation extends View {
    public Canvas_CameraLocation(Context context) {
        super(context);
    }

    public Canvas_CameraLocation(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Camera camera =new Camera();
        canvas.save();

        //camera.rotateX(180); // 旋转 Camera 的三维空间
        //在 Camera 中，相机的默认位置是 (0, 0, -8)（英寸）。8 x 72 = 576，所以它的默认位置是 (0, 0, -576)（像素）
        //x 和 y 参数一般不会改变，直接填 0 就好
        camera.setLocation(0,0,10);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gaoxiao);
        camera.applyToCanvas(canvas); // 把旋转投影到 Canvas


        Paint paint =new Paint();
        canvas.drawBitmap(bitmap, 100, 100, paint);
        canvas.restore();
    }
}
