package com.example.bykj.dterp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.BaseBundle;
import android.os.Bundle;
import android.widget.TextView;

import com.example.bykj.dterp.R;
import com.example.bykj.dterp.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.text)
    TextView text;
    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }



    @Override
    protected void initData() {
        text.setText("控件绑定成功");
    }
}