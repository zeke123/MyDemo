/* * Copyright (c) 2016. &#x5468;&#x5efa;&#x7684;&#x7248;&#x6743;&#x4fe1;&#x606f; */package com.example.zhoujian.mydemo.activity;import android.content.Intent;import android.os.Bundle;import android.support.v7.app.AppCompatActivity;import android.text.TextUtils;import android.util.Log;import android.view.View;import android.widget.Button;import android.widget.Toast;import com.example.zhoujian.mydemo.R;import butterknife.ButterKnife;import butterknife.InjectView;public class FirstActivity extends AppCompatActivity{    public static final String TAG = "FirstActivity";    @InjectView(R.id.bt_login1)    Button btLogin1;    @InjectView(R.id.bt_login2)    Button btLogin2;    @InjectView(R.id.bt_login3)    Button btLogin3;    @InjectView(R.id.bt_login4)    Button btLogin4;    @InjectView(R.id.bt_login5)    Button btLogin5;    @InjectView(R.id.bt_login6)    Button btLogin6;    @Override    protected void onStop() {        super.onStop();    }    @Override    protected void onDestroy() {        super.onDestroy();    }    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);        initView();        ButterKnife.inject(this);        initDatas();        test();        initData();        init();        intiview();    }    private void intiview() {    }    private void initData() {        TextUtils.isEmpty("周建");        //TODO 这里有bug哦        Toast.makeText(this, "zhoujian", Toast.LENGTH_SHORT).show();        Log.d(TAG, "zhoujian");    }    private void init() {    }    public void initDatas() {    }    private void test() {        initView();    }    private void initView() {        btLogin1.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View view) {                Toast.makeText(FirstActivity.this, "哦哦哦哦哦", Toast.LENGTH_LONG).show();                System.out.print("name");                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);                startActivity(intent);            }        });        btLogin2.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View view) {            }        });        btLogin3.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View view) {            }        });        btLogin4.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View view) {            }        });        btLogin5.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View view) {            }        });        btLogin6.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View view) {            }        });    }}