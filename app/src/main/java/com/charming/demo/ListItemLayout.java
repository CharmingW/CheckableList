package com.charming.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by 56223 on 2016/11/18.
 */

public class ListItemLayout extends LinearLayout implements Checkable{

    private TextView mTextView;
    private CheckBox mCheckBox;

    public ListItemLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ListItemLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public ListItemLayout(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_checkable_list, this, true);
        mTextView = (TextView) view.findViewById(R.id.text);
        mCheckBox = (CheckBox) view.findViewById(R.id.check_box);
    }

    public void setTitle(String title) {
        mTextView.setText(title);
    }

    @Override
    public void setChecked(boolean checked) {
        mCheckBox.setChecked(checked);
    }

    @Override
    public boolean isChecked() {
        return mCheckBox.isChecked();
    }

    @Override
    public void toggle() {
        mCheckBox.toggle();
    }
}
