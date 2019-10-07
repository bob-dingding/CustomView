package com.hxzk.customview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hxzk.customview.layout.InnerLayoutActivity;
import com.hxzk.customview.layout.LayoutBaseActivity;
import com.hxzk.customview.layout.ViewSizeActivity;

/**
 * Created by HaiyuKing
 * Used
 */
public class LayoutActivity extends AppCompatActivity implements View.OnClickListener {


	Button btn_layoutBase;
	Button btn_viewSize;
	Button btn_layoutInner;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_layout);
		btn_layoutBase = findViewById(R.id.btn_layoutbase);
		btn_viewSize = findViewById(R.id.btn_viewSize);
		btn_layoutInner = findViewById(R.id.btn_innerLayout);

		btn_layoutBase.setOnClickListener(this);
		btn_viewSize.setOnClickListener(this);
		btn_layoutInner.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.btn_layoutbase:
				Intent  layoutBase =new Intent(LayoutActivity.this, LayoutBaseActivity.class);
				startActivity(layoutBase);
				break;
			case R.id.btn_viewSize:
				Intent  viewSize =new Intent(LayoutActivity.this, ViewSizeActivity.class);
				startActivity(viewSize);
				break;
			case R.id.btn_innerLayout:
				Intent  innerLayout =new Intent(LayoutActivity.this, InnerLayoutActivity.class);
				startActivity(innerLayout);
				break;
		}
	}
}
