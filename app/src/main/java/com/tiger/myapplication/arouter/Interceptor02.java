package com.tiger.myapplication.arouter;


import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

import java.lang.annotation.Annotation;

//@Interceptor(priority = 2)
public class Interceptor02 implements IInterceptor {

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {

        Log.d("Interceptor02","process : Thread is " +Thread.currentThread().getName());

    }

    @Override
    public void init(Context context) {

        Log.d("Interceptor02","----init()");
    }
}
