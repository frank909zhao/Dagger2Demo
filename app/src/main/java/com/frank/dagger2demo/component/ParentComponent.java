package com.frank.dagger2demo.component;

import com.frank.dagger2demo.module.XiaoChiModule;

import dagger.Component;
import dagger.Module;

/**
 * Created by Frank on 2017/7/20.
 */
@Component(modules = XiaoChiModule.class)
public interface ParentComponent {
    SubComponent provideSubComponent();
}
