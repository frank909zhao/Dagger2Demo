package com.frank.dagger2demo.module;

import com.frank.dagger2demo.enity.Test;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Frank on 2017/7/20.
 */
@Module
public class TestCreate {

    @Provides
    public static int provideTest1() {
        return 1;
    }

    @Provides
    public static String provideTest2() {
        return "test component create()";
    }

    @Provides
    public static Test provideTest(){
        return new Test();
    }
}
