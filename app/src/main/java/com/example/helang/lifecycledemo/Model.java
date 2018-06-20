package com.example.helang.lifecycledemo;

import android.util.Log;

/**
 * Created by helang on 2018/6/19.
 */

public class Model {
    private static final String TAG = "MODEL";

    public void startWork(){
        Log.e(TAG,"startWork");
    }

    public void endWork(){
        Log.e(TAG,"endWork");
    }
}
