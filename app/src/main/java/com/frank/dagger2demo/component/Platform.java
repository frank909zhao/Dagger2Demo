package com.frank.dagger2demo.component;

import com.frank.dagger2demo.enity.ZhaiNan;
import com.frank.dagger2demo.module.ShangjiaAModule;

import dagger.Component;

/**
 * Created by Frank on 2017/7/11.
 */
@Component(modules=ShangjiaAModule.class)
public interface Platform {
    ZhaiNan waimai();
}
