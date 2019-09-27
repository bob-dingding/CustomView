package com.hxzk.customview.drawtext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

import com.hxzk.customview.R;

/**
 * Used
 * Created by HaiyuKing
 */
public class DrawTextActivity extends AppCompatActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_draw);
	}


	class InnerDrawText extends View{

		public InnerDrawText(Context context) {
			super(context);
		}

		public InnerDrawText(Context context,  AttributeSet attrs) {
			super(context, attrs);
		}

		Paint mPaint =new Paint();
		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			mPaint.setColor(Color.RED);
			canvas.drawText("zjt",200,200,mPaint);
		}
	}
}
