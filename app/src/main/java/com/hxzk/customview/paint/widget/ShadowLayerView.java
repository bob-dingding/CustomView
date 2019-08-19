package com.hxzk.customview.paint.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者：created by ${zjt} on 2019/8/19
 * 描述:
 */
public class ShadowLayerView extends View {

    public ShadowLayerView(Context context) {
        super(context);
    }

    public ShadowLayerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ShadowLayerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ShadowLayerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    Paint paint =new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
         //在之后的绘制内容下面加一层阴影,setShadowLayer() 是设置的在绘制层下方的附加效果
        //radius 是阴影的模糊范围； dx dy 是阴影的偏移量； shadowColor 是阴影的颜色。
        //如果要清除阴影层，使用 clearShadowLayer()
        //在硬件加速开启的情况下， setShadowLayer() 只支持文字的绘制，文字之外的绘制必须关闭硬件加速才能正常绘制阴影
        //如果 shadowColor 是半透明的，阴影的透明度就使用 shadowColor 自己的透明度；
        // 而如果 shadowColor 是不透明的，阴影的透明度就使用 paint 的透明度
        paint.setTextSize(18);
        paint.setColor(Color.RED);
        paint.setShadowLayer(10, 0, 0, Color.RED);
        canvas.drawText("Hellow Wordle", 80, 100, paint);
    }
}
