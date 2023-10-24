package org.jpos.ee.test;

import org.jpos.iso.MUX;
import org.jpos.util.NameRegistrar;
import org.junit.jupiter.api.extension.*;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Random;
import java.util.function.BiConsumer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MUXSupplierExtension implements BeforeEachCallback, AfterEachCallback, ParameterResolver, BeforeAllCallback, AfterAllCallback {

    protected static void runOnFields(ExtensionContext context, boolean staticFields, BiConsumer<Field, MUXMock> action) {
        Arrays.stream(context.getRequiredTestClass().getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(MUXMock.class) && Modifier.isStatic(f.getModifiers()) == staticFields)
                .forEach(f -> action.accept(f, f.getAnnotation(MUXMock.class)));
    }


    protected MUX getMUXMock(MUXMock annotation) {
        String name = annotation.name().isEmpty() ? "mux-" + new Random().nextLong() : annotation.name();
        MUX mux = NameRegistrar.getIfExists(name);
        if (mux == null) {
            mux = mock(MUX.class);
            when(mux.isConnected()).thenReturn(annotation.connected());
            NameRegistrar.register("mux." + name, mux);
        }
        return mux;
    }

    /**
     * Called to set up all MUX fields
     * @param context   The extension context
     * @param beforeAll if this is for a beforeAll method set static fields otherwise set instance ones
     */
    protected void setUp(ExtensionContext context, boolean beforeAll) {
        runOnFields(context, beforeAll, (field, annotation) -> {
            try {
                if (!field.isAccessible()) field.setAccessible(true);
                field.set( context.getTestInstance().orElse(null), getMUXMock(annotation));
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException(e);
            }
        });

    }

    /**
     * Called to tear down all MUX fields
     * @param context   The extension context
     * @param afterAll if this is for an afterAll method unregister only static muxes otherwise only instences.
     */
    protected void tearDown(ExtensionContext context, boolean afterAll){
        runOnFields(context, afterAll, (ignored, annotation) -> NameRegistrar.unregister("mux." + annotation.name()));

    }
    /**
     * Callback that is invoked <em>before</em> an individual test and any
     * user-defined setup methods for that test have been executed.
     *
     * @param context the current extension context; never {@code null}
     */
    @Override
    public void beforeEach(ExtensionContext context) throws IllegalArgumentException{
        setUp(context, false);
    }

    /**
     * Callback that is invoked <em>after</em> an individual test and any
     * user-defined teardown methods for that test have been executed.
     *
     * @param context the current extension context; never {@code null}
     */
    @Override
    public void afterEach(ExtensionContext context) {
        tearDown(context, false);
    }

    /**
     * Determine if this resolver supports resolution of an argument for the
     * {@link Parameter} in the supplied {@link ParameterContext} for the supplied
     * {@link ExtensionContext}.
     *
     * <p>The {@link Method} or {@link Constructor}
     * in which the parameter is declared can be retrieved via
     * {@link ParameterContext#getDeclaringExecutable()}.
     *
     * @param parameterContext the context for the parameter for which an argument should
     *                         be resolved; never {@code null}
     * @param extensionContext the extension context for the {@code Executable}
     *                         about to be invoked; never {@code null}
     * @return {@code true} if this resolver can resolve an argument for the parameter
     * @see #resolveParameter
     * @see ParameterContext
     */
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.isAnnotated(MUXMock.class);
    }

    /**
     * Resolve an argument for the parameter in the supplied {@link ParameterContext}
     * for the supplied {@link ExtensionContext}.
     *
     * <p>This method is only called by the framework if {@link #supportsParameter}
     * previously returned {@code true} for the same {@link ParameterContext}
     * and {@link ExtensionContext}.
     *
     * <p>The {@link Method} or {@link Constructor}
     * in which the parameter is declared can be retrieved via
     * {@link ParameterContext#getDeclaringExecutable()}.
     *
     * @param parameterContext the context for the parameter for which an argument should
     *                         be resolved; never {@code null}
     * @param extensionContext the extension context for the {@code Executable}
     *                         about to be invoked; never {@code null}
     * @return the resolved argument for the parameter; may only be {@code null} if the
     * parameter type is not a primitive
     * @see #supportsParameter
     * @see ParameterContext
     */
    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return getMUXMock(parameterContext.getParameter().getAnnotation(MUXMock.class));
    }

    /**
     * Callback that is invoked once <em>after</em> all tests in the current
     * container.
     *
     * @param context the current extension context; never {@code null}
     */
    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        tearDown(context, true);
    }

    /**
     * Callback that is invoked once <em>before</em> all tests in the current
     * container.
     *
     * @param context the current extension context; never {@code null}
     */
    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        setUp(context, true);
    }
}
