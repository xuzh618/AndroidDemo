package com.tiger.myapplication;

import android.app.Application;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

public class MainApplication extends Application {

    private static MainApplication mInstance;

    public static MainApplication getInstance() {

        if (mInstance == null) {
            synchronized (MainApplication.class) {
                if (mInstance == null) {
                    mInstance = new MainApplication();
                }
            }
        }
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
