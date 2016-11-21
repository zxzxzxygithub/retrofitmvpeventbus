package com.test.retrofit;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by michael on 16/11/21.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }

    }
}
