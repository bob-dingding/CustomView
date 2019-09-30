package com.hxzk.customview.canvas.weigth;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * Created by HaiyuKing
 * Used
 */
public class Canvas_Rotate extends View {

	public Canvas_Rotate(Context context) {
		super(context);
	}

	public Canvas_Rotate(Context context,  AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint paint =new Paint();
		canvas.save();
		//参数里的 degrees 是旋转角度，单位是度（也就是一周有 360° 的那个单位），方向是顺时针为正向； px 和 py 是轴心的位置。
		canvas.rotate(45, 150, 150);
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gaoxiao);
		canvas.drawBitmap(bitmap, 50, 50, paint);
		canvas.restore();
	}
}
