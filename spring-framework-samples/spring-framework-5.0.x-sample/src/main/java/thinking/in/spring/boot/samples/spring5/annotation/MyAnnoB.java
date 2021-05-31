package thinking.in.spring.boot.samples.spring5.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 2021/05/31/ 13:51:00
 *
 * @author liuhongze
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@MyAnnoA
public @interface MyAnnoB {
    String value() default "";
}
