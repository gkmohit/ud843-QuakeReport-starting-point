package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AirUnknown on 2017-05-14.
 */

public class EarthQuakeListAdaptor extends ArrayAdapter<EarthquakeData> {

    private Context mContext;
    private ArrayList<EarthquakeData> mQuakeList;

    private static class ViewHolder {
        TextView magnitudeTV;
        TextView locationTV;
        TextView dateTV;
    }

    public EarthQuakeListAdaptor(ArrayList<EarthquakeData> quakeList, Context context) {
        super(context, R.layout.earth_quake_row_item, quakeList);
        this.mContext = context;
        this.mQuakeList = quakeList;
    }

    @Override
    public int getCount() {
        return mQuakeList.size();
    }

    @Nullable
    @Override
    public EarthquakeData getItem(int position) {
        return mQuakeList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        EarthquakeData earthquakeData = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.earth_quake_row_item, parent, false);
            viewHolder.magnitudeTV = (TextView) convertView.findViewById(R.id.magnitudeTV);
            viewHolder.locationTV = (TextView) convertView.findViewById(R.id.locationTV);
            viewHolder.dateTV = (TextView) convertView.findViewById(R.id.dateTV);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.magnitudeTV.setText(earthquakeData.getMagnitude());
        viewHolder.dateTV.setText(earthquakeData.getDate());
        viewHolder.locationTV.setText(earthquakeData.getLocation());

        return convertView;
    }
}
