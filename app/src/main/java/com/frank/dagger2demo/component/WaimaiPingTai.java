package com.frank.dagger2demo.component;

import com.frank.dagger2demo.activity.MainActivity;
import com.frank.dagger2demo.enity.ZhaiNan;
import com.frank.dagger2demo.module.ActivityModule;
import com.frank.dagger2demo.module.ShangjiaAModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Frank on 2017/7/18.
 */
@Singleton
@Component(modules = {ShangjiaAModule.class,ActivityModule.class})
public interface WaimaiPingTai {
    ZhaiNan waimai();

    void zhuru(ZhaiNan zhaiNan);

    void inject(MainActivity mainActivity);
}
