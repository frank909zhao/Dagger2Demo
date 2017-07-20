package com.frank.dagger2demo.component;

import com.frank.dagger2demo.enity.Test;
import com.frank.dagger2demo.module.TestCreate;

import dagger.Component;
import dagger.Module;

/**
 * Created by Frank on 2017/7/20.
 */
@Component(modules = TestCreate.class)
public interface TestCreateComponent {
    Test ceshi();
}
