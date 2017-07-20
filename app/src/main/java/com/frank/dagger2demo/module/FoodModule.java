package com.frank.dagger2demo.module;

import com.frank.dagger2demo.enity.Baozi;
import com.frank.dagger2demo.enity.Kangshifu;
import com.frank.dagger2demo.enity.Noodle;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Frank on 2017/7/19.
 */
@Module
public class FoodModule {

    @Provides
    public Baozi provideBaozi() {
        return new Baozi();
    }

    @Provides
    public Noodle provideNoodle() {
        return new Kangshifu();
    }
}
