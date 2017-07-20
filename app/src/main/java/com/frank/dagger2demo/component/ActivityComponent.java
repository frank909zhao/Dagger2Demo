package com.frank.dagger2demo.component;

import com.frank.dagger2demo.module.SecondActivityModule;
import com.frank.dagger2demo.activity.SecondActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Frank on 2017/7/19.
 */
@Singleton
@Component(modules = SecondActivityModule.class)
public interface ActivityComponent {
    void inject(SecondActivity activity);
}
