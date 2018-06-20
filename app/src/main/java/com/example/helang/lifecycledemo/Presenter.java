package com.example.helang.lifecycledemo;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Presenter承担更多业务上的操作，但是，也不易把过多的业务转到Presenter中，不然会造成Presenter变成第二个"Activity"
 * Created by helang on 2018/6/19.
 */

public class Presenter implements IPresenter {

    private static final String TAG = "Presenter";

    private Model model = new Model();
    private Context context;

    public Presenter(Context context) {
        this.context = context;
    }

    public void doWork(){
        model.startWork();
    }

    /**
     * 创建资源等
     * @param owner
     */
    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        Log.e(TAG,"onCreate");
        register();
    }

    /**
     * 释放资源等
     * @param owner
     */
    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        Log.e(TAG,"onDestroy");
        model.endWork();
        unregister();

    }

    /**
     * 比如注册动态广播等操作可以转移到Presenter中，进一步降低Activity的复杂性
     */
    private void register(){
//        context.registerReceiver(null,null);
    }

    private void unregister(){
//        context.unregisterReceiver(null);
    }


}
