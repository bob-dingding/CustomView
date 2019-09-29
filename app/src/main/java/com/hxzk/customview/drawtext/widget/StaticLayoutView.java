package com.hxzk.customview.drawtext.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by HaiyuKing
 * Used
 */
public class StaticLayoutView extends View {
	public StaticLayoutView(Context context) {
		super(context);
	}

	public StaticLayoutView(Context context,  AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		TextPaint mPaint =new TextPaint();
		mPaint.setColor(Color.RED);
		String content ="11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
//		width 是文字区域的宽度，文字到达这个宽度后就会自动换行；
//		align 是文字的对齐方向；
//		spacingmult 是行间距的倍数，通常情况下填 1 就好；
//		spacingadd 是行间距的额外增加值，通常情况下填 0 就好；
//		includepad 是指是否在文字上下添加额外的空间，来避免某些过高的字符的绘制出现越界
		StaticLayout staticLayout1 = new StaticLayout(content, mPaint, 600,
				Layout.Alignment.ALIGN_NORMAL, 1, 0, true);

		//代码中出现的 Canvas.save() Canvas.translate() Canvas.restore() 配合起来可以对绘制的内容进行移动。它们的具体用法我会在下期讲
		canvas.save();
		canvas.translate(50, 100);
		staticLayout1.draw(canvas);
		canvas.translate(0, 200);
		staticLayout1.draw(canvas);
		canvas.restore();
	}
}
