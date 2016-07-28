package net.shopin.spring;

import java.lang.annotation.*;

/**
 * Created by travis on 2016/7/28.
 */
@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {
    String name();
}
