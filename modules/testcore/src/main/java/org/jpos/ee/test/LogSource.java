package org.jpos.ee.test;

import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Injects a {@link org.jpos.util.Log} object in the declared member or parameter. It needs to be used alongside. <br>
 * {@code  @ExtendWith(LogSupplierExtension.class)}
 * <p>
 * Usage example:
 * <pre> {@code
 *  @ExtendWith(LogSupplierExtension.class)
 *  class XxxxTest ...{
 *      ...
 *      @LogSource
 *      Log log;
 *      ....
 *
 *      @AfterEach
 *      tearDown() {
 *          log.debug(...);
 *      }
 *  }
 * }</pre>
 * </p>
 */
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(LogSupplierExtension.class)
public @interface LogSource {
    String realm() default "";
    String logger() default "";
}
