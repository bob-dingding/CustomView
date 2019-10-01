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
 * Created by zjt on 2019/10/1. 13:46
 * 作用:
 */
public class Canvas_CameraTranslate extends View {
    public Canvas_CameraTranslate(Context context) {
        super(context);
    }

    public Canvas_CameraTranslate(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Camera camera =new Camera();
        canvas.save();

        camera.rotateX(30); // 旋转 Camera 的三维空间

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gaoxiao);
        Float centerX=bitmap.getWidth()/2f+100;
        Float centerY=bitmap.getHeight()/2f+100;
        //Canvas 的几何变换顺序是反的，所以要把移动到中心的代码写在下面，把从中心移动回来的代码写在上面。
        canvas.translate(centerX, centerY); // 旋转之后把投影移动回来
        camera.applyToCanvas(canvas); // 把旋转投影到 Canvas


        Paint paint =new Paint();
        canvas.translate(-centerX, -centerY); // 旋转之前把绘制内容移动到轴心（原点）
        //如果不注释此代码会报错
        //camera.restore(); // 恢复 Camera 的状态

        canvas.drawBitmap(bitmap, 100, 100, paint);
        canvas.restore();
    }
}
