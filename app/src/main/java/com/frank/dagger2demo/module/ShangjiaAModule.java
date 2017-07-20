package com.frank.dagger2demo.module;

import com.frank.dagger2demo.enity.Baozi;
import com.frank.dagger2demo.enity.Kangshifu;
import com.frank.dagger2demo.enity.Noodle;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Frank on 2017/7/18.
 */

@Module
public class ShangjiaAModule {

    String restaurant;

    public ShangjiaAModule(String restaurant) {
        this.restaurant = restaurant;
    }

    @Provides
     public Baozi provideBaozi() {
        return new Baozi("豆沙包");
    }
    @Provides
     public Noodle provideNoodle(Kangshifu noodle) {
        return noodle;
    }

    @Provides
     public Kangshifu provideKangshifu() {
        return new Kangshifu();
    }

    @Provides
     public String provideResturant() {
        return restaurant;
    }


//    @Provides
//     public Noodle provideNoodle(Tongyi noodle) {
//        return noodle;
//    }
}
