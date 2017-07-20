package com.frank.dagger2demo.enity;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Provides;

/**
 * Created by Frank on 2017/7/19.
 */

public class TestProvider {
    @Inject
    Provider<Integer> randomValue;

    public int getRandomValue () {
        return randomValue.get().intValue();
    }
}
