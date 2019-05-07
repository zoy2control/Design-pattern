package com.zoy.design.pattern.ch3.one.impl;

import java.math.BigDecimal;

/**
 * Created by zoypong on 2019/5/8.
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(String name, BigDecimal price) {
        super(name, price);
    }

    // ·获取原价
    public BigDecimal getOriginPrice() {
        return super.getPrice();
    }

    // ·获取折扣价
    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(new BigDecimal(0.8));
    }
}
