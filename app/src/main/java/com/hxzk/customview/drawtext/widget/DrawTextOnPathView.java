package com.hxzk.customview.drawtext.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by HaiyuKing
 * Used
 */
public class DrawTextOnPathView extends View {

	public DrawTextOnPathView(Context context) {
		super(context);
	}

	public DrawTextOnPathView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	Paint mPaint = new Paint();

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		mPaint.setColor(Color.RED);
		mPaint.setStyle(Paint.Style.STROKE);

		Path mPath =new Path();
		mPath.moveTo(100,100);
		mPath.lineTo(150, 200);
		mPath.lineTo(250,80);
		mPath.lineTo(350,300);

		//canvas.drawPath(mPath,mPaint);
		canvas.drawTextOnPath("Hellow,World,dddddddddddddddddddddddddddddd",mPath,0,0,mPaint);
	}
}
