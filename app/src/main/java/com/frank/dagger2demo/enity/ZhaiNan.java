package com.frank.dagger2demo.enity;

import com.frank.dagger2demo.enity.Baozi;
import com.frank.dagger2demo.enity.Noodle;

import javax.inject.Inject;

/**
 * Created by Frank on 2017/7/11.
 */

public class ZhaiNan {

    @Inject
    Baozi baozi;

    @Inject
    Noodle noodle;

    @Inject
    public ZhaiNan() {

    }

    @Inject
    String resturant;

    public String eat() {
        StringBuilder sb = new StringBuilder();
        sb.append("我从 ");
        sb.append(resturant.toString());
        sb.append("订的外卖，");
        sb.append("我吃的是 ");
        if ( baozi != null ) {
            sb.append(baozi.toString());
        }

        if (noodle != null) {
            sb.append("  ");
            sb.append(noodle.toString());
        }
        return sb.toString();
    }
}
