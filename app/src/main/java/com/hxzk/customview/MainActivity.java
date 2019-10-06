package com.hxzk.customview;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tbruyelle.rxpermissions2.RxPermissions;

import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnDraw;
    Button btnLayout;
    Button btnTouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDraw = findViewById(R.id.button);
        btnLayout = findViewById(R.id.button2);
        btnTouch = findViewById(R.id.button3);

        btnDraw.setOnClickListener(this);
        btnLayout.setOnClickListener(this);
        btnTouch.setOnClickListener(this);

        MultPermission();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent draw  =new Intent(MainActivity.this,OnDrawActivity.class);
                startActivity(draw);
            break;
            case R.id.button2:
            break;
            case R.id.button3:
                Intent touchFeedBack  =new Intent(MainActivity.this,TouchFeedBackActivity.class);
                startActivity(touchFeedBack);
            break;
        }
    }

    private void MultPermission() {
        RxPermissions rxPermissions = new RxPermissions(MainActivity.this); // 创建实例
        rxPermissions.request(Manifest.permission.CAMERA,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE
        )//权限名称，多个权限之间逗号分隔ca
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean granted) throws Exception {
                        // 在android 6.0之前会默认返回true,6.0之后如果所有申请权限都运行则返回true
                        if (granted) {

                        } else {
                            // 未获取权限
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        //可能是授权异常的情况下的处理

                    }
                }, new Action() {
                    @Override
                    public void run() throws Exception {

                    }
                });
    }
}
