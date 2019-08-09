package com.hxzk.customview.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hxzk.customview.R;

/**
 * 作者：created by ${zjt} on 2019/8/8
 * 描述:
 */
public class PaintActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnColor;
    Button btnEffect;
    Button btnDrawText;
    Button btnInit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);
        btnColor = findViewById(R.id.btn_color);
        btnEffect = findViewById(R.id.btn_effect);
        btnDrawText = findViewById(R.id.btn_drawText);
        btnInit = findViewById(R.id.btn_init);


        btnColor.setOnClickListener(this);
        btnEffect.setOnClickListener(this);
        btnDrawText.setOnClickListener(this);
        btnInit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_color:
                Intent intent =new Intent(PaintActivity.this,ColorActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_effect:
                break;
            case R.id.btn_drawText:
                break;
            case R.id.btn_init:
                break;
        }
    }
}
