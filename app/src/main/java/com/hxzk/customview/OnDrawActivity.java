package com.hxzk.customview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hxzk.customview.drawbase.DrawBaseActivity;
import com.hxzk.customview.paint.PaintActivity;

/**
 * 作者：created by ${zjt} on 2019/8/7
 * 描述:
 */
public class OnDrawActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_drawbase;
    Button btn_paint;
    Button btn_drawtext;
    Button btn_clipAndmatrix;
    Button btn_draworder;
    Button btn_property;
    Button btn_propertyadvanced;
    Button btn_hardware;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ondraw);
        btn_drawbase=findViewById(R.id.btn_drawbase);
        btn_paint=findViewById(R.id.btn_paint);
        btn_drawtext=findViewById(R.id.btn_drawtext);
        btn_clipAndmatrix=findViewById(R.id.btn_clipAndmatrix);
        btn_draworder=findViewById(R.id.btn_draworder);
        btn_property=findViewById(R.id.btn_property);
        btn_propertyadvanced=findViewById(R.id.btn_propertyadvanced);
        btn_hardware=findViewById(R.id.btn_hardware);


        btn_drawbase.setOnClickListener(this);
        btn_paint.setOnClickListener(this);
        btn_drawtext.setOnClickListener(this);
        btn_clipAndmatrix.setOnClickListener(this);
        btn_draworder.setOnClickListener(this);
        btn_property.setOnClickListener(this);
        btn_propertyadvanced.setOnClickListener(this);
        btn_hardware.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_drawbase:
                Intent drawBase =new Intent(OnDrawActivity.this, DrawBaseActivity.class);
                startActivity(drawBase);
                break;
            case R.id.btn_paint:
                Intent paint =new Intent(OnDrawActivity.this, PaintActivity.class);
                startActivity(paint);
                break;
            case R.id.btn_drawtext:
                break;
            case R.id.btn_clipAndmatrix:
                break;
            case R.id.btn_property:
                break;
            case R.id.btn_draworder:
                break;
            case R.id.btn_propertyadvanced:
                break;
            case R.id.btn_hardware:
                break;
        }
    }
}