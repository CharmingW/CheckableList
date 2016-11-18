package com.charming.demo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by 56223 on 2016/11/18.
 */

public class MyAdapter extends BaseAdapter {
    public MyAdapter(Context context, List<String> data) {
        mContext = context;
        mData = data;
    }

    private Context mContext;
    private List<String> mData;

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItemLayout listItemLayout = new ListItemLayout(mContext);
        listItemLayout.setTitle(getItem(position).toString());
        return listItemLayout;
    }
}
