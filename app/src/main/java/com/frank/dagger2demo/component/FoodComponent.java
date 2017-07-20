package com.frank.dagger2demo.component;

import com.frank.dagger2demo.activity.ThirdActivity;
import com.frank.dagger2demo.module.XiaoChiModule;

import dagger.Component;

/**
 * Created by Frank on 2017/7/19.
 */
@Component(modules = XiaoChiModule.class
        ,dependencies = XiaoChiComponent.class)
public interface FoodComponent {
    void inject(ThirdActivity activity);
}
