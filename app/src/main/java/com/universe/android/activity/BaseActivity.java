package com.universe.android.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.universe.android.R;

/**
 * Created by gaurav.pandey on 24-12-2017.
 */

public class BaseActivity extends AppCompatActivity {
    protected Context mContext;
    private boolean isReplaced = false;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(setLayoutId());
        mContext=this;

    }

    private int setLayoutId() {
        return R.layout.activity_main;
    }


    public void addFragment(Fragment fragment, int containerId) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(containerId, fragment)
                .commitAllowingStateLoss();
    }

    public void replaceFragment(Fragment fragment, int containerId) {
        isReplaced = true;
        getSupportFragmentManager()
                .beginTransaction()
                .replace(containerId, fragment)
                .commitAllowingStateLoss();
    }

}

