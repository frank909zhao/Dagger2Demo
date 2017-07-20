package com.frank.dagger2demo.component;

import com.frank.dagger2demo.activity.ThirdActivity;
import com.frank.dagger2demo.module.FoodModule;

import dagger.Subcomponent;

/**
 * Created by Frank on 2017/7/20.
 */
@Subcomponent(modules = FoodModule.class)
public interface SubComponent {
    void inject(ThirdActivity activity);
}
