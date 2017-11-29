package org.dota2school.mlm.wx.annotation;

import java.lang.annotation.*;

/**
 * 用这个注解注解的方法标识这个方法已经测试通过了
 * 用这个注解注解的类表示这个类已经测试通过了
 * @author Xuxue1
 */
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Tested {

}
