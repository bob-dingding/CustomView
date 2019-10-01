package com.hxzk.customview.canvas.weigth;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * Created by zjt on 2019/10/1. 13:04
 * 作用:Camera.rotate*() 三维旋转
 */
public class Canvas_CameraRotate extends View {
    public Canvas_CameraRotate(Context context) {
        super(context);
    }

    public Canvas_CameraRotate(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Camera camera =new Camera();
        canvas.save();

        camera.rotateX(30); // 旋转 Camera 的三维空间
        camera.applyToCanvas(canvas); // 把旋转投影到 Canvas

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.gaoxiao);
        Paint paint =new Paint();
        //如果不注释此代码会报错
        //camera.restore(); // 恢复 Camera 的状态

        canvas.drawBitmap(bitmap, 100, 100, paint);
        canvas.restore();
    }
}
