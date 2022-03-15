package org.jpos.ee.test;

import org.jpos.util.Logger;
import org.junit.jupiter.api.extension.*;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.function.BiConsumer;


public class LogSupplierExtension implements BeforeEachCallback, ParameterResolver, BeforeAllCallback {

    protected static void runOnFields(ExtensionContext context, boolean staticFields, BiConsumer<Field, LogSource> action) {
        Arrays.stream(context.getRequiredTestClass().getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(LogSource.class) && Modifier.isStatic(f.getModifiers()) == staticFields)
                .forEach(f -> action.accept(f, f.getAnnotation(LogSource.class)));
    }


    protected org.jpos.util.Log getLog(LogSource annotation, Class<?> c) {
        Logger logger = annotation.logger().isEmpty() ? TestUtil.getLogger() : Logger.getLogger(annotation.logger());
        String realm = annotation.realm().isEmpty() ? c.getSimpleName() : annotation.realm();
        return  new org.jpos.util.Log(logger, realm);
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
                field.set( context.getTestInstance().orElse(null), getLog(annotation, context.getRequiredTestClass()));
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException(e);
            }
        });

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
        return parameterContext.isAnnotated(LogSource.class) && parameterContext.getTarget().map(Object::getClass).filter(c -> c.isAssignableFrom(LogSource.class)).isPresent();
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
        return getLog(parameterContext.getParameter().getAnnotation(LogSource.class), extensionContext.getRequiredTestClass());
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
