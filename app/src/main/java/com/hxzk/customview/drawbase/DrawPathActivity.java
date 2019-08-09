package com.hxzk.customview.drawbase;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.hxzk.customview.R;

/**
 * 作者：created by ${zjt} on 2019/8/7
 * 描述:
 */
public class DrawPathActivity extends AppCompatActivity {
    //Path 可以描述直线、二次曲线、三次曲线、圆、椭圆、弧形、矩形、圆角矩形。
    //Path 有两类方法，一类是直接描述路径的，另一类是辅助的设置或计算。
    //直接描述路径这一类方法还可以细分为两组：添加子图形和画线（直线或曲线）
    //添加子图像如：CustomePath_addCircle
    //画线如：CustomePath_Line
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawpath);
    }
}
