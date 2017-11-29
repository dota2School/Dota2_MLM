package org.dota2school.mlm.wx.annotation;

import java.lang.annotation.*;

/**
 *
 * Aop 注解
 * @author Xuxue1
 */
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MLMAop {

    String value();

    int exceptionCode() default 0;
}
