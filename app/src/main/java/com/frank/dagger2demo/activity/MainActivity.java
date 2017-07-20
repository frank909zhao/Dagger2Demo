package com.frank.dagger2demo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.frank.dagger2demo.R;
import com.frank.dagger2demo.component.DaggerPlatform;
import com.frank.dagger2demo.component.DaggerTestCreateComponent;
import com.frank.dagger2demo.component.DaggerWaimaiPingTai;
import com.frank.dagger2demo.component.TestCreateComponent;
import com.frank.dagger2demo.enity.Test;
import com.frank.dagger2demo.module.ShangjiaAModule;
import com.frank.dagger2demo.enity.TestSingleton;
import com.frank.dagger2demo.component.WaimaiPingTai;
import com.frank.dagger2demo.enity.ZhaiNan;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    public  TestSingleton testSingleton;

    Button mBtnTestInject;
    Button mBtnTestModule;
    Button mBtnTestZhuru;
    Button mBtnTestActivity;
    Button mBtnJumpToSecond;
    Button mBtnJumpToThird;



    @Inject
    int testvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTestInject = (Button) findViewById(R.id.btn_test_inject);

        final ZhaiNan zainan = DaggerPlatform.builder()
                .shangjiaAModule(new ShangjiaAModule("王小二包子店"))
                .build()
                .waimai();

        mBtnTestInject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,zainan.eat(),Toast.LENGTH_LONG).show();
            }
        });

        mBtnTestModule = (Button) findViewById(R.id.btn_test_module);

        final ZhaiNan zainan1 = DaggerWaimaiPingTai.builder()
                .shangjiaAModule(new ShangjiaAModule("衡阳鱼粉店"))
                .build()
                .waimai();

        mBtnTestModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,zainan1.eat(),Toast.LENGTH_LONG).show();
            }
        });

        mBtnTestZhuru = (Button) findViewById(R.id.btn_test_zhuru);
        mBtnTestActivity = (Button) findViewById(R.id.btn_test_inject_act);
        final ZhaiNan zhaiNan = new ZhaiNan();
        WaimaiPingTai daggerWaimaiPingTai = DaggerWaimaiPingTai.builder()
                .shangjiaAModule(new ShangjiaAModule("常德津市牛肉粉"))
                .build();
        daggerWaimaiPingTai.zhuru(zhaiNan);
        mBtnTestZhuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,zhaiNan.eat(),Toast.LENGTH_LONG).show();
            }
        });
        daggerWaimaiPingTai.inject(this);
        mBtnTestActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"testvalue is "+ testvalue,Toast.LENGTH_LONG).show();
            }
        });

        mBtnJumpToSecond = (Button) findViewById(R.id.btn_jump_second);
        mBtnJumpToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this,"testsingleton is "+ testSingleton,Toast.LENGTH_LONG).show();
            }
        });
        mBtnJumpToThird = (Button) findViewById(R.id.btn_jump_third);
        mBtnJumpToThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });

        TestCreateComponent testCreateComponent = DaggerTestCreateComponent.create();
        Test test = testCreateComponent.ceshi();

    }
}
