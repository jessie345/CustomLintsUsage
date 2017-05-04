package com.liushuo.testviewid;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LayoutInflater.from(this);
        LayoutInflater.from(this);
        LayoutInflaterWrapper.from();

    }
}
