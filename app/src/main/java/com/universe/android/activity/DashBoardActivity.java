package com.universe.android.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.universe.android.R;
import com.universe.android.adapter.DashBoardAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by gaurav.pandey on 25-12-2017.
 */

public class DashBoardActivity extends BaseActivity {

    @BindView(R.id.dashboard_recyclerview)
    RecyclerView dashboardRecyclerview;
    @BindView(R.id.swipe_refesh_layout_dashboard)
    SwipeRefreshLayout swipeRefeshLayoutDashboard;
    //Declares the variable and adapter here
    DashBoardAdapter dashBoardAdapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
        ButterKnife.bind(this);
        setUpElement();
    }

    private void setUpElement() {
    }


}
