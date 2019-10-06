package com.hxzk.customview.property;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.hxzk.customview.R;
import com.hxzk.customview.drawbase.widget.Canvas.drawXXX.CustomeCircleViewTwo;
import com.hxzk.customview.property.weight.CustomPointFEvaluator;
import com.hxzk.customview.property.weight.HsvEvaluator;

/**
 * Created by HaiyuKing
 * Used
 *
 * @author haiyuKing
 */
public class PropertyAnimationDownActivity extends AppCompatActivity {

	CustomeCircleViewTwo mCustomeCircleView, mCustomeCircleViewTwo;
	ImageView imageview1, imageview2, imageview3, imageview4, imageview5;

	@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_propertydown);
		mCustomeCircleView = findViewById(R.id.customCircle);
		mCustomeCircleViewTwo = findViewById(R.id.customCircleTwo);
		imageview1 = findViewById(R.id.imageview1);
		imageview2 = findViewById(R.id.imageview2);
		imageview3 = findViewById(R.id.imageview3);
		imageview4 = findViewById(R.id.imageview4);
		imageview5 = findViewById(R.id.imageview5);

		ObjectAnimator objectAnimator = ObjectAnimator.ofInt(mCustomeCircleView, "color", 0xffff0000, 0xff00ff00);
		//TypeEvaluator 最经典的用法是使用 ArgbEvaluator 来做颜色渐变的动画
		objectAnimator.setEvaluator(new ArgbEvaluator());
		objectAnimator.setDuration(6000);
		objectAnimator.start();


		//自定义Evaluator实现Hsv类型颜色值，更适合人眼
		ObjectAnimator objectAnimator2 = ObjectAnimator.ofInt(mCustomeCircleViewTwo, "color", 0xffff0000, 0xff00ff00);
		//自定义TypeEvaluator
		objectAnimator2.setEvaluator(new HsvEvaluator());
		objectAnimator2.setDuration(6000);
		objectAnimator2.start();

		//PointFEvaluator,效果不能正常显示，待定
		ObjectAnimator objectAnimator3 = ObjectAnimator.ofObject(imageview1, "position", new CustomPointFEvaluator(), new PointF(0, 0), new PointF(1, 1));
		objectAnimator3.start();

		//ViewPropertyAnimator，你可以直接用连写的方式来在一个动画中同时改变多个属性
		imageview2.animate().scaleX(2).scaleY(2).alpha(0.5f).setDuration(6000);

		//对于 ObjectAnimator你可以使用 PropertyValuesHolder 来同时在一个动画中改变多个属性。
		PropertyValuesHolder holder1 = PropertyValuesHolder.ofFloat("scaleX", 2);
		PropertyValuesHolder holder2 = PropertyValuesHolder.ofFloat("scaleY", 2);
		PropertyValuesHolder holder3 = PropertyValuesHolder.ofFloat("alpha", 0.5f);
		ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(imageview3, holder1, holder2, holder3);
		animator.setDuration(6000);
		animator.start();

		//AnimatorSet 多个动画配合执行
		ObjectAnimator animator1 = ObjectAnimator.ofPropertyValuesHolder(imageview4, holder1, holder2);
		animator1.setInterpolator(new LinearInterpolator());
		ObjectAnimator animator2 = ObjectAnimator.ofFloat(imageview4, "translationX", 500);
		animator2.setInterpolator(new DecelerateInterpolator());
		AnimatorSet animatorSet = new AnimatorSet();
		// 两个动画依次执行
		animatorSet.playSequentially(animator1, animator2);
		animatorSet.setDuration(6000);
		animatorSet.start();


		// 在 0% 处开始
		Keyframe keyframe1 = Keyframe.ofFloat(0, 0);
// 时间经过 50% 的时候，动画完成度 100%
		Keyframe keyframe2 = Keyframe.ofFloat(0.5f, 500);
// 时间见过 100% 的时候，动画完成度倒退到 80%，即反弹 20%
		Keyframe keyframe3 = Keyframe.ofFloat(1, 250);
		PropertyValuesHolder holder = PropertyValuesHolder.ofKeyframe("translationX", keyframe1, keyframe2, keyframe3);

		ObjectAnimator animator5 = ObjectAnimator.ofPropertyValuesHolder(imageview5, holder);
		animator5.setDuration(6000);
		animator5.start();
	}

}
