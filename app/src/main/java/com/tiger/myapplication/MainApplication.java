package com.tiger.myapplication;

import android.app.Application;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainApplication extends Application {

    private static MainApplication mAppInstance;


    @Override
    public void onCreate() {
        super.onCreate();

        mAppInstance = this;

        initArouterConfig();
    }

    private final static boolean DEBUG = true;

    private void initArouterConfig() {

        if (DEBUG) {           // These two lines must be written before init, otherwise these configurations will be invalid in the init process
            ARouter.openLog();     // Print log
            ARouter.openDebug();   // Turn on debugging mode (If you are running in InstantRun mode, you must turn on debug mode! Online version needs to be closed, otherwise there is a security risk)
        }
        ARouter.init(mAppInstance); // As early as possible, it is recommended to initialize in the Application
    }


    @Override
    public void onTerminate() {
        super.onTerminate();

        //destroy
        ARouter.getInstance().destroy();
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
