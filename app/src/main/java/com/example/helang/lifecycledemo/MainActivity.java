package com.example.helang.lifecycledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 利用MVP加lifeCycle就可以解耦更加彻底，减少了Activity中的代码量和各种重复的代码
 * 同时也可以更好地处理MVP中的生命周期的问题，防止发生内存泄漏
 */
public class MainActivity extends AppCompatActivity {

    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        presenter = new Presenter(this);
        getLifecycle().addObserver(presenter);//为Lifecycle注册生命周期监听器
        presenter.doWork();

    }

}
