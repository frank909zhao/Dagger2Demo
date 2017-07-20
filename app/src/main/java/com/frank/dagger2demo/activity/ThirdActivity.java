package com.frank.dagger2demo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.frank.dagger2demo.component.DaggerFoodComponent;
import com.frank.dagger2demo.component.DaggerParentComponent;
import com.frank.dagger2demo.component.DaggerXiaoChiComponent;
import com.frank.dagger2demo.component.FoodComponent;
import com.frank.dagger2demo.component.XiaoChiComponent;
import com.frank.dagger2demo.enity.Baozi;
import com.frank.dagger2demo.enity.Noodle;
import com.frank.dagger2demo.R;
import com.frank.dagger2demo.enity.Guazi;
import com.frank.dagger2demo.enity.Huotuichang;

import javax.inject.Inject;

public class ThirdActivity extends AppCompatActivity {

    Button mBtnTest;

    @Inject
    Guazi guazi;
    @Inject
    Huotuichang huotuichang;
    @Inject
    Baozi baozi;
    @Inject
    Noodle noodle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mBtnTest = (Button) findViewById(R.id.test_dependency);
        XiaoChiComponent xiaoChiComponent = DaggerXiaoChiComponent.builder()
                .build();

        DaggerFoodComponent.builder()
                .xiaoChiComponent(xiaoChiComponent)
                .build()
                .inject(this);

        mBtnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this,
                        baozi+" "+
                        noodle+" "
                        +guazi+""+huotuichang,Toast.LENGTH_LONG).show();
            }
        });

        DaggerParentComponent.builder().build()
                .provideSubComponent().inject(this);

    }
}
