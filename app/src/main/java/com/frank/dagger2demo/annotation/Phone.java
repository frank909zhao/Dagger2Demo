package com.frank.dagger2demo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Frank on 2017/7/19.
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Phone {
}
