package com.hxzk.customview.canvas.weigth;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * Created by HaiyuKing
 * Used
 */
public class ClipPathView extends View {

	public ClipPathView(Context context) {
		super(context);
	}

	public ClipPathView(Context context,  AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		canvas.save();

		Path path =new Path();
		path.moveTo(100, 100);
		path.lineTo(200, 100);
		path.lineTo(150, 150);
		path.close();

		canvas.clipPath(path);

		Paint paint = new Paint();
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gaoxiao);
		canvas.drawBitmap(bitmap, 50, 50, paint);
		canvas.restore();

	}
}
