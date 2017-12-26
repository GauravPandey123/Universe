package com.universe.android.activity;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.universe.android.R;
import com.universe.android.adapter.DashBoardAdapter;
import com.universe.android.dao.DashBoard;

import java.util.ArrayList;

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
    ArrayList<DashBoard> dashBoardArrayList;
    LinearLayoutManager linearLayoutManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
        ButterKnife.bind(this);
        setUpElement();
    }

    private void setUpElement() {
        dashBoardArrayList = new ArrayList<>();
        dashBoardAdapter = new DashBoardAdapter(mContext,dashBoardArrayList);
        linearLayoutManager=new LinearLayoutManager(mContext);
        dashboardRecyclerview.setLayoutManager(linearLayoutManager);
        dashboardRecyclerview.setItemAnimator(new DefaultItemAnimator());
        dashboardRecyclerview.setAdapter(dashBoardAdapter);
        prepareData();
    }

    private void prepareData() {
        DashBoard movie = new DashBoard("1", "1", "2");
        dashBoardArrayList.add(movie);

        movie = new DashBoard("23", "20", "20");
        dashBoardArrayList.add(movie);


        dashBoardAdapter.notifyDataSetChanged();
    }


}
