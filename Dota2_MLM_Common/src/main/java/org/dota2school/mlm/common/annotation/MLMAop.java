package org.dota2school.mlm.common.annotation;

import java.lang.annotation.*;

/**
 * Created by nt on 2017/9/7.
 */
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MLMAop {

    String value();

    int exceptionCode() default 0;
}
