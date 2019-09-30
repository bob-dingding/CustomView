package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * 作者：created by ${zjt} on 2019/8/8
 * 描述:用 Bitmap 来着色,其实也就是用 Bitmap 的像素来作为图形或文字的填充
 */
public class PaintColorByShadert_BitmapShader extends View {

    public PaintColorByShadert_BitmapShader(Context context) {
        super(context);
    }

    public PaintColorByShadert_BitmapShader(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PaintColorByShadert_BitmapShader(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PaintColorByShadert_BitmapShader(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.shinvtu);
//        bitmap：用来做模板的 Bitmap 对象
//        tileX：横向的 TileMode
//        tileY：纵向的 TileMode。
        Shader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawCircle(70,70,80,paint);
    }
}
