package com.hxzk.customview.property.weight;


import android.animation.TypeEvaluator;
import android.graphics.PointF;

/**
 * Created by HaiyuKing
 * Used
 */
public class CustomPointFEvaluator implements TypeEvaluator<PointF> {

	PointF newPoint = new PointF();


;
	// 创建 getter 方法
	public PointF getPosition() {
		return newPoint;
	}

	// 创建 setter 方法
	public void setPosition(PointF progress) {
		this.newPoint = progress;
	}

	@Override
	public PointF evaluate(float fraction, PointF startValue, PointF endValue) {
		float x = startValue.x + (fraction * (endValue.x - startValue.x));
		float y = startValue.y + (fraction * (endValue.y - startValue.y));

		newPoint.set(x, y);

		return newPoint;
	}
}
