package com.zoy.design.pattern.ch3.one.impl;

import com.zoy.design.pattern.ch3.one.ICourse;

import java.math.BigDecimal;

/**
 * Created by zoypong on 2019/5/7.
 */
public class JavaCourse implements ICourse {
    private String name;
    private BigDecimal price;

    public JavaCourse(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
