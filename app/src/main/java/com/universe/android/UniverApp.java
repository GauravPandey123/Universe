package com.universe.android;

import android.content.Context;
import android.support.multidex.MultiDex;

import in.editsoft.api.util.App;

/**
 * Created by gaurav.pandey on 26-12-2017.
 */

public class UniverApp extends App
{
    private static Context mContext;
    private static final String FRIENDLY_ENGAGE_TOPIC = "friendly_engage";

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();
    }

    public static Context getmContext() {
        return mContext;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
