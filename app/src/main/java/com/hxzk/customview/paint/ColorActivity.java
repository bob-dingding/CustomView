package com.hxzk.customview.paint;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hxzk.customview.R;
import com.hxzk.customview.paint.widget.PaintColorByShadert_ComposeShader;

/**
 * 作者：created by ${zjt} on 2019/8/8
 * 描述:
 */
public class ColorActivity extends AppCompatActivity {
    PaintColorByShadert_ComposeShader composeShader;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        //composeShader=findViewById(R.id.composeshader);
        //composeShader.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    }
}
