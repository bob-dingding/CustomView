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
		//参数里，需要解释的只有两个： hOffset 和 vOffset。它们是文字相对于 Path 的水平偏移量和竖直偏移量，利用它们可以调整文字的位置。例如你设置 hOffset 为 5， vOffset 为 10，文字就会右移 5 像素和下移 10 像素
		canvas.drawTextOnPath("Hellow,World,dddddddddddddddddddddddddddddd",mPath,0,0,mPaint);
	}
}
