package com.example.administrator.myapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Author: 0027008122 [yang.jianan@zte.com.cn]
 * Time: 2016-05-23 13:47
 * Version: 1.0
 * TaskId:
 * Description: 字体图片 view , 用于setText("&#xe611;") , 具体教程来自 http://www.jianshu.com/p/313912ff2f37,
 * iconfont 来自阿里妈妈 http://www.iconfont.cn/collections?spm=a313x.7781069.1998698872.2.SW5VXX&personal=1
 */
public class IconfontView extends TextView {


    public IconfontView(Context context) {
        super(context);
        initFont();
    }

    public IconfontView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFont();
    }

    public IconfontView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initFont();
    }

    private void initFont() {
        //直接加载 字体库
        final Typeface iconfont = Typeface.createFromAsset(getContext().getApplicationContext().getAssets(), "iconfont/iconfont.ttf");
        setTypeface(iconfont);
    }
}

