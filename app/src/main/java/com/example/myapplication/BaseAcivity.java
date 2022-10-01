package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseAcivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        initView();
        initData();
        initEvent();
    }

    public abstract int bindLayout();

    public abstract void initView();

    public abstract void initData();

    public abstract void initEvent();

    public abstract View bindView(int resId);
}
