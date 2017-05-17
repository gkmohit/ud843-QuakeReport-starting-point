package com.example.android.quakereport;

/**
 * Created by AirUnknown on 2017-05-14.
 */

public class EarthquakeData {

    private String mLocation;
    private String mMagnitude;
    private String mDate;

    public EarthquakeData(String location, String magnitude, String date) {
        mLocation = location;
        mMagnitude = magnitude;
        mDate = date;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getDate() {
        return mDate;
    }
}
