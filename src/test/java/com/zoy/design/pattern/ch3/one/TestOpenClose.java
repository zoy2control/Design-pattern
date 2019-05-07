package com.zoy.design.pattern.ch3.one;

import com.zoy.design.pattern.ch3.one.impl.JavaCourse;
import com.zoy.design.pattern.ch3.one.impl.JavaDiscountCourse;

import java.math.BigDecimal;

/**
 * Created by zoypong on 2019/5/7.
 */
public class TestOpenClose {
    public static void main(String[] args) {
//        ICourse iCourse = new JavaCourse("Java设计模式", new BigDecimal(100));
        ICourse iCourse = new JavaDiscountCourse("Java设计模式", new BigDecimal(100));
        // ·直接进行 强制转换
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程名称：" + iCourse.getName() +
                "，课程原始价格：" + javaDiscountCourse.getOriginPrice() +
                "，课程折后价格：" + iCourse.getPrice());
    }
}
