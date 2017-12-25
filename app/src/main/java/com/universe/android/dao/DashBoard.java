package com.universe.android.dao;

/**
 * Created by gaurav.pandey on 25-12-2017.
 */

public class DashBoard {


    public String getCrystelNumber() {
        return crystelNumber;
    }

    public void setCrystelNumber(String crystelNumber) {
        this.crystelNumber = crystelNumber;
    }

    public String getDistributerNo() {
        return distributerNo;
    }

    public void setDistributerNo(String distributerNo) {
        this.distributerNo = distributerNo;
    }

    public String getRetailerNo() {
        return retailerNo;
    }

    public void setRetailerNo(String retailerNo) {
        this.retailerNo = retailerNo;
    }

    private String crystelNumber, distributerNo, retailerNo;

    public DashBoard(String crystelNumber, String distributerNo, String retailerNo) {
        this.crystelNumber = crystelNumber;
        this.distributerNo = distributerNo;
        this.retailerNo = retailerNo;
    }

}
