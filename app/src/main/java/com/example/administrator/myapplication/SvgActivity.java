package com.example.administrator.myapplication;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class SvgActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_svg);

        // 代码加载 字体库 --- 推荐写个自定义view直接加载字体库,省去重复加载的代码
        Typeface iconfont = Typeface.createFromAsset(getAssets(), "iconfont/iconfont.ttf");
        TextView textview = (TextView) findViewById(R.id.like);
        textview.setTypeface(iconfont);
        textview.setTextSize(40);
    }
}
