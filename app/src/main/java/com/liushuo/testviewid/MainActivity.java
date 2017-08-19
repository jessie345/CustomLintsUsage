package com.liushuo.testviewid;

import android.os.Bundle;
import android.support.annotation.AnyRes;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LayoutInflater.from(this);
        LayoutInflater.from(this);
        LayoutInflaterWrapper.from();

        @UniqueIndentifier(value = "v")
        ViewGroup vg = new TestViewGroup(this, 0);


    }
}
