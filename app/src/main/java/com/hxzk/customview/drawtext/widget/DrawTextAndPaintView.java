package com.hxzk.customview.drawtext.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import java.util.Locale;

/**
 * Created by HaiyuKing
 * Used
 */
public class DrawTextAndPaintView extends View {
	public DrawTextAndPaintView(Context context) {
		super(context);
	}

	public DrawTextAndPaintView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@TargetApi(Build.VERSION_CODES.LOLLIPOP)
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		//String content ="Paint对文字绘制的辅助";
		String content ="Paint对文字绘制的辅助 \uD83C\uDDE8\uD83C\uDDF3";

		//默认文字
		Paint defaultPaint =new Paint();
		canvas.drawText(content,100,100,defaultPaint);
		//更改字体大小
		Paint textSizePaint =new Paint();
		textSizePaint.setTextSize(36);
		canvas.drawText(content,100,200,textSizePaint);
		//设置字体
		Paint typeFacePaint =new Paint();
		typeFacePaint.setTypeface(Typeface.SERIF);
		canvas.drawText(content,100,300,typeFacePaint);
		//设置粗体
		Paint fakeBold =new Paint();
		fakeBold.setFakeBoldText(true);
		canvas.drawText(content,100,400,fakeBold);
		//设置删除线
		Paint strikeThru =new Paint();
		strikeThru.setStrikeThruText(true);
		canvas.drawText(content,100,500,strikeThru);
		//设置下划线
		Paint underLine =new Paint();
		underLine.setUnderlineText(true);
		canvas.drawText(content,100,600,underLine);
		//设置文字倾斜度
		Paint skewX =new Paint();
		skewX.setTextSkewX(-0.5f);
		canvas.drawText(content,100,700,skewX);
		//设置文字变胖变瘦
		Paint scaleX =new Paint();
		scaleX.setTextScaleX(1.5f);
		canvas.drawText(content,100,800,scaleX);
		//设置字符间距
		Paint spacing =new Paint();
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
			spacing.setLetterSpacing(0.2f);
		}
		canvas.drawText(content,100,900,spacing);
		//用css设置font-feature-settings方式设置文字
		Paint feature =new Paint();
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
			// 设置 "small caps"
			feature.setFontFeatureSettings("smcp");
		}
		canvas.drawText(content,100,1000,feature);
       //设置对其方式
		Paint align =new Paint();
		align.setTextAlign(Paint.Align.CENTER);
		canvas.drawText(content,100,1100,align);
		//设置系统语言
		Paint local =new Paint();
		//日语
		local.setTextLocale(Locale.JAPAN);
		canvas.drawText(content,100,1200,local);
		//设置开启抗锯齿
		Paint elegant =new Paint();
		elegant.setElegantTextHeight(true);
		canvas.drawText(content,100,1300,elegant);



	}
}
