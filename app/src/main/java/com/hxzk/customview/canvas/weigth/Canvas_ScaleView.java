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
public class Canvas_ScaleView extends View {

	public Canvas_ScaleView(Context context) {
		super(context);
	}

	public Canvas_ScaleView(Context context,  AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.save();

		Bitmap bitmap =  BitmapFactory.decodeResource(getResources(), R.drawable.gaoxiao);
		int x =100;
		int y =100;
		int bitmapWidth =bitmap.getWidth();
		int bitmapHeight =bitmap.getHeight();
		//参数里的 sx sy 是横向和纵向的放缩倍数； px py 是放缩的轴心
		canvas.scale(2.0f, 2.0f, x + bitmapWidth / 2, y + bitmapHeight / 2);
		Paint paint =new Paint();
		canvas.drawBitmap(bitmap, x, y, paint);
		canvas.restore();
	}
}
