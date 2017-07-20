package com.frank.dagger2demo.enity;

import com.frank.dagger2demo.enity.Noodle;

import javax.inject.Inject;

/**
 * Created by Frank on 2017/7/11.
 */

public class Tongyi extends Noodle {

    @Inject
    public Tongyi() {
    }

    @Override
    public String toString() {
        return "统一方便面";
    }
}
