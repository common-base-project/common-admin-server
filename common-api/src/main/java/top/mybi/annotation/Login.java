package top.mybi.annotation;

import java.lang.annotation.*;

/**
 * 登录效验
 * @author Mustang mustang2247@gmail.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}
