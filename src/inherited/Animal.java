package inherited;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited

public @interface Animal {
    /**
     * @return sound of animal
     */
    String sound();

    /**
     * @return the number of paws in the animal
     */
    int paw();

    /**
     * @return skin of animal
     */
    @Deprecated
    String skin();
}