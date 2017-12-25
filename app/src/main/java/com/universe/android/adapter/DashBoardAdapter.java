package com.universe.android.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.universe.android.R;
import com.universe.android.dao.DashBoard;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by gaurav.pandey on 25-12-2017.
 */

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.DashBoardViewHolder> {

    private Context mContext;
    private ArrayList<DashBoard> dashBoardArrayList;


    public DashBoardAdapter(Context mContext, ArrayList<DashBoard> dashBoardArrayList) {
        this.mContext = mContext;
        this.dashBoardArrayList = dashBoardArrayList;
    }

    @Override
    public DashBoardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.dashboard_part_item, parent, false);
        return new DashBoardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DashBoardViewHolder holder, int position) {
        DashBoard dashBoard = dashBoardArrayList.get(position);

        holder.textViewCrystal.setText("Crystal : " + dashBoard.getCrystelNumber());
        holder.textViewDistributor.setText("Distributer : " + dashBoard.getDistributerNo());
        holder.textViewRetailer.setText("Retailer : " + dashBoard.getRetailerNo());

    }

    @Override
    public int getItemCount() {
        return dashBoardArrayList.size();
    }

    public class DashBoardViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imageViewDashBoardBackground)
        ImageView imageViewDashBoardBackground;
        @BindView(R.id.textViewCrystal)
        TextView textViewCrystal;
        @BindView(R.id.textViewDistributor)
        TextView textViewDistributor;
        @BindView(R.id.textViewRetailer)
        TextView textViewRetailer;

        public DashBoardViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
