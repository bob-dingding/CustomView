package com.hxzk.customview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
            break;
        }
    }
}
