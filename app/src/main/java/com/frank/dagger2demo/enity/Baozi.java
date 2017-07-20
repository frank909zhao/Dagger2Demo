package com.frank.dagger2demo.enity;

import javax.inject.Inject;

/**
 * Created by Frank on 2017/7/11.
 */

public class Baozi {

    String name;

    @Inject
    public Baozi() {
        name = "小笼包";
    }

    public Baozi(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
