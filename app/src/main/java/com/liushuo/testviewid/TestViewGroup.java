package com.liushuo.testviewid;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.luojilab.autopoint.view.DataAdapter;

import org.json.JSONObject;

/**
 * Created by liushuo on 2017/6/15.
 */

public class TestViewGroup extends LinearLayout implements DataAdapter {

    private TestBean mTB;

    public TestViewGroup(Context context) {
        super(context);

    }

    public TestViewGroup(Context context, int i) {
        super(context);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    public void bindData(JSONObject tb) {
    }

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public void setData(Object data) {

    }
}
