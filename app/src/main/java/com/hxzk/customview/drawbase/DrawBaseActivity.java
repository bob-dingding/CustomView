package com.hxzk.customview.drawbase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hxzk.customview.R;

/**
 * 作者：created by ${zjt} on 2019/8/7
 * 描述:
 */
public class DrawBaseActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnDrawCircle;
    Button btnDrawPath;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawbase);
        btnDrawCircle = findViewById(R.id.btn_drawCircle);
        btnDrawPath = findViewById(R.id.btn_drawpath);

        btnDrawCircle.setOnClickListener(this);
        btnDrawPath.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_drawCircle:
                Intent drawCircle =new Intent(DrawBaseActivity.this,DrawCircleActivity.class);
                startActivity(drawCircle);
                break;
            case R.id.btn_drawpath:
                Intent darwPath =new Intent(DrawBaseActivity.this, DrawPathActivity.class);
                startActivity(darwPath);
                break;
        }
    }


}
