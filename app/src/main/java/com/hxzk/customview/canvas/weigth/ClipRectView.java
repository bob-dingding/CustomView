package com.hxzk.customview.canvas.weigth;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * Created by HaiyuKing
 * Used
 */
public class ClipRectView extends View {
	public ClipRectView(Context context) {
		super(context);
	}

	public ClipRectView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint mPaint =new Paint();
		mPaint.setColor(Color.RED);

		//裁剪
		canvas.save();
		canvas.clipRect(100, 100, 200, 200);
		Bitmap bitmap = BitmapFactory.decodeResource(this.getContext().getResources(), R.drawable.gaoxiao);
		//Bitmap bitmap=BitmapFactory.decodeStream(getClass().getResourceAsStream("/res/mipmap/ic_launcher.png"));
		if(bitmap != null){
			canvas.drawBitmap(bitmap, 100, 100, mPaint);
		}
		canvas.restore();
	}
}
