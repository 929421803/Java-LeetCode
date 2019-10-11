package com.wanghy.test.demo;

import java.lang.annotation.*;

/**
 * @author WangHY
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NewAnnotation {
}
