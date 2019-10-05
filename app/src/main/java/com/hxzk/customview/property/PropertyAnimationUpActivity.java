package com.hxzk.customview.property;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.hxzk.customview.R;

/**
 * Created by HaiyuKing
 * Used
 */
public class PropertyAnimationUpActivity extends AppCompatActivity {


	ImageView mImageView;
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_propertyup);
		mImageView =findViewById(R.id.imageView);
		mImageView.animate().translationX(100);
	}
}
