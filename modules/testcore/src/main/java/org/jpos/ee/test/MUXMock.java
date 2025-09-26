package org.jpos.ee.test;

import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Injects a muck mux in the declared member or parameter. It needs to be used alongside <br>
 * {@code  @ExtendWith(MUXSupplierExtension.class)}. </p>
 * <p>
 * Usage example:
 * </p>
 * <pre>{@code
 *  @ExtendWith(MUXSupplierExtension.class)
 *  class XxxxTest ...{
 *      ...
 *      @MUXMock //register the mux mock in name registrar, if not already registered, and injects it
 *      MUX mux
 *      ....
 *
 *      testXxx() {
 *          //define return for some condition, this example uses mockito
 *          when(mux.request(same(request), anyLong())).thenReturn(response);
 *      }
 *  }
 * }</pre>
 */
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(MUXSupplierExtension.class)
public @interface MUXMock {
    String MUX_NAME = "";

    /**
     * <p>Name by which the mux is going tobe registered in Name Registrar</p>
     *
     * <p>Don't use the same name for instance and static, unless you don't care the static is unregistered from
     * {@link org.jpos.util.NameRegistrar}</p>
     *
     * Defaults to {@code ""}, in which case one with a random name will be generated
     *
     * @return the name under which the mux mock will be registered.
     */
    String name() default MUX_NAME;

    /**
     * Tells if the mocked mux should return true when its {@code isConnected()} method is called.
     * @return the value the mocked mux {@code isConnected()} method should return.
     */
    boolean connected() default true;
}
