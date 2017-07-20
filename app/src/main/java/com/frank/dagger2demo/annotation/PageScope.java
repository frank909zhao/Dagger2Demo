package com.frank.dagger2demo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Frank on 2017/7/19.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PageScope {}
