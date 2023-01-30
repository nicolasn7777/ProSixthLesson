package calc_documented;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation @Values contains values that will be passed on.
 * @author Papa Carlo
 * @version 1.0
 * @since 30/01/2023
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Values {

    /**
     * @return value of number1
     */
    int number1() default 100;
    /**
     * @return value of number2
     */
    int number2() default 200;
}
