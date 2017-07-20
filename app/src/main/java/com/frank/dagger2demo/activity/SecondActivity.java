package com.frank.dagger2demo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.frank.dagger2demo.annotation.Computer;
import com.frank.dagger2demo.annotation.Phone;
import com.frank.dagger2demo.R;
import com.frank.dagger2demo.component.DaggerActivityComponent;
import com.frank.dagger2demo.enity.TestSingleton;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    @Inject
    TestSingleton testSingleton1;
    @Inject
    TestSingleton testSingleton2;

    @Inject
    @Phone
    String phone;

    @Inject
    @Computer
    String computer;

    Button mBtnTestSingleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sencond);

        mBtnTestSingleton = (Button) findViewById(R.id.btn_test_singleton);

        DaggerActivityComponent.builder()
                .build()
                .inject(this);

        mBtnTestSingleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(SecondActivity.this,"test1 hashcode:"+testSingleton1.toString()
                    +" test2 hashcode:"+testSingleton2.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
