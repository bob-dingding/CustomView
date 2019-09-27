package com.hxzk.customview.drawtext.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by HaiyuKing
 * Used
 */
public class DrawTextView extends View {
	public DrawTextView(Context context) {
		super(context);
	}

	public DrawTextView(Context context , AttributeSet attrs) {
		super(context, attrs);
	}


	Paint mPaint =new Paint();
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		mPaint.setColor(Color.RED);
		mPaint.setTextSize(18);
		canvas.drawText("Hellow,World",100,100,mPaint);

	}
}
