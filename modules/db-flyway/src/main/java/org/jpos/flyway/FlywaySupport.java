package org.jpos.flyway;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.FluentConfiguration;
import org.flywaydb.core.api.logging.Log;
import org.flywaydb.core.api.logging.LogCreator;
import org.flywaydb.core.api.logging.LogFactory;
import org.jpos.ee.DB;

import java.util.Arrays;
import java.util.Properties;

public class FlywaySupport implements LogCreator, Log {
    protected Flyway getFlyway(String configModifier, String args[]) {
        LogFactory.setFallbackLogCreator(this);
        Properties p = new DB(configModifier).getProperties();
        FluentConfiguration config = Flyway.configure().dataSource(
          p.getProperty("hibernate.connection.url"),
          p.getProperty("hibernate.connection.username"),
          p.getProperty("hibernate.connection.password"))
          .outOfOrder(has(args, "--out-of-order"));
        return config.load();
    }

    public Log createLogger(Class<?> clazz) {
        return this;
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public void debug(String message) {
        System.out.println("DEBUG: " + message);
    }

    @Override
    public void info(String message) {
        System.out.println(message);
    }

    @Override
    public void warn(String message) {
        System.err.println("WARNING: " + message);
    }

    @Override
    public void error(String message) {
        System.err.println("ERROR: " + message);
    }

    @Override
    public void error(String message, Exception e) {
        System.err.println("ERROR: " + message);
        e.printStackTrace(System.err);
    }

    private boolean has (String[] args, String arg) {
        return Arrays.stream(args).anyMatch(s -> s.equals(arg));
    }
}
