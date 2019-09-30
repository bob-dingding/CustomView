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
public class TranslateView extends View {
	public TranslateView(Context context) {
		super(context);
	}

	public TranslateView(Context context,  AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint paint =new Paint();
		canvas.save();
		canvas.translate(200, 0);
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gaoxiao);
		canvas.drawBitmap(bitmap, 50, 50, paint);
		canvas.restore();
	}
}
