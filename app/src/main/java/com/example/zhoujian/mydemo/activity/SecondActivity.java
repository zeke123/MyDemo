/*
 * Copyright (c) 2016. 周建的版权信息
 */

package com.example.zhoujian.mydemo.activity;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhoujian.mydemo.R;

/**
 * Created by zhoujian on 16/7/27.
 */
public class SecondActivity extends Activity implements View.OnClickListener {

    public static final String TAG = "SecondActivity";
    private Button bt_login1;
    private Button bt_login2;
    private Button bt_login3;
    private Button bt_login4;
    private Button bt_login5;
    private String city = "南京";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        Toast.makeText(this, city, Toast.LENGTH_SHORT).show();

    }

    private void initView() {
        bt_login1 = (Button) findViewById(R.id.bt_login1);
        bt_login2 = (Button) findViewById(R.id.bt_login2);
        bt_login3 = (Button) findViewById(R.id.bt_login3);
        bt_login4 = (Button) findViewById(R.id.bt_login4);
        bt_login5 = (Button) findViewById(R.id.bt_login5);
        bt_login1.setOnClickListener(this);
        bt_login2.setOnClickListener(this);
        bt_login3.setOnClickListener(this);
        bt_login4.setOnClickListener(this);
        bt_login5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_login1:

                Toast.makeText(this, "周建", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_login2:

                Log.d(TAG, "zhoujian");

                break;
            case R.id.bt_login3:

                if(TextUtils.isEmpty("zhoujian"))
                {
                    Toast.makeText(this, "zhoujian", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.bt_login4:

                try {

                    System.out.print("测试测试测试测试");
                    System.out.print("测试测试测试测试");

                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;
            case R.id.bt_login5:

                break;
        }
    }
}
