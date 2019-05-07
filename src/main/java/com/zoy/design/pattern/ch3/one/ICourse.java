package com.zoy.design.pattern.ch3.one;

import java.math.BigDecimal;

/**
 * Created by zoypong on 2019/5/7.
 */
public interface ICourse {
    /**
     * ·获取课程名称
     * @return
     */
    String getName();

    /**
     * ·获取课程价格
     * @return
     */
    BigDecimal getPrice();
}
