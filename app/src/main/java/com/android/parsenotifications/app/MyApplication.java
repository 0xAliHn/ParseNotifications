package com.android.parsenotifications.app;


import android.app.Application;

import com.parse.Parse;

import com.android.parsenotifications.helper.ParseUtils;

public class MyApplication extends Application {

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        Parse.enableLocalDatastore(this);

        Parse.initialize(this);
        // register with parse
        ParseUtils.registerParse(this);
    }


    public static synchronized MyApplication getInstance() {
        return mInstance;
    }
}
