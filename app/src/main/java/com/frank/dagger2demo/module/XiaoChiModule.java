package com.frank.dagger2demo.module;

import com.frank.dagger2demo.enity.Guazi;
import com.frank.dagger2demo.enity.Huotuichang;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Frank on 2017/7/19.
 */
@Module
public class XiaoChiModule {

    @Provides
    public Guazi provideGuazi() {
        return new Guazi();
    }

    @Provides
    public Huotuichang provideHuotuichang() {
        return new Huotuichang();
    }
}
