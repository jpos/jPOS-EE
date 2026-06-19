/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.flyway;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.FluentConfiguration;
import org.flywaydb.core.api.logging.Log;
import org.flywaydb.core.api.logging.LogCreator;
import org.flywaydb.core.api.logging.LogFactory;
import org.flywaydb.core.internal.configuration.ConfigUtils;
import org.jpos.core.Environment;
import org.jpos.ee.DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FlywaySupport implements LogCreator, Log {

    private String dbId = "";

    protected Flyway getFlyway(FlywayTarget target, String args[]) {
        LogFactory.setFallbackLogCreator(this);
        Properties p = getDbProperties(target);

        FluentConfiguration config = Flyway.configure()
          .locations("classpath:db/migration")
          .configuration(getConfigurationProperties())
          .dataSource(
            p.getProperty("hibernate.connection.url"),
            p.getProperty("hibernate.connection.username"),
            p.getProperty("hibernate.connection.password"))
          .outOfOrder(has(args, "--out-of-order"));
        String historyTable = target.historyTable();
        if (historyTable != null)
            config.table(historyTable);
        Flyway flyway = config.load();
        this.dbId = resolveDbId(target, flyway);
        return flyway;
    }

    protected Flyway getFlyway(String configModifier, String args[]) {
        return getFlyway(new FlywayTarget(configModifier, null, null), args);
    }

    public String getDbId() {
        return dbId;
    }

    private Properties getDbProperties(FlywayTarget target) {
        try {
            Properties p = DB.getProperties(target.configModifier());
            if (p.getProperty("hibernate.connection.url") == null)
                throw new IllegalArgumentException(
                  "Missing hibernate.connection.url for Flyway target " + target.label()
                );
            return p;
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to resolve Flyway DB properties for target "
              + target.label(), e);
        }
    }

    private String resolveDbId(FlywayTarget target, Flyway flyway) {
        String catalog = null;
        try (Connection c = flyway.getConfiguration().getDataSource().getConnection()) {
            catalog = c.getCatalog();
            if (catalog == null || catalog.isEmpty())
                catalog = c.getSchema();
        } catch (SQLException ignored) {
            // fall through to URL parsing
        }
        if (catalog == null || catalog.isEmpty())
            catalog = extractDbFromUrl(flyway.getConfiguration().getUrl());
        if (catalog == null || catalog.isEmpty())
            catalog = "?";
        String db = (target.configModifier() != null && !target.configModifier().isEmpty())
          ? target.configModifier() + "@" + catalog
          : catalog;
        String historyTable = target.historyTable();
        return historyTable != null ? db + "/" + historyTable : db;
    }

    private String extractDbFromUrl(String url) {
        if (url == null) return null;
        int q = url.indexOf('?');
        String base = q >= 0 ? url.substring(0, q) : url;
        int slash = base.lastIndexOf('/');
        if (slash >= 0 && slash < base.length() - 1)
            return base.substring(slash + 1);
        int colon = base.lastIndexOf(':');
        return colon >= 0 && colon < base.length() - 1 ? base.substring(colon + 1) : null;
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
        System.out.println("DEBUG: " + prefix() + message);
    }

    @Override
    public void info(String message) {
        System.out.println(prefix() + message);
    }

    @Override
    public void warn(String message) {
        System.err.println("WARNING: " + prefix() + message);
    }

    @Override
    public void error(String message) {
        System.err.println("ERROR: " + prefix() + message);
    }

    @Override
    public void error(String message, Exception e) {
        System.err.println("ERROR: " + prefix() + message);
        e.printStackTrace(System.err);
    }

    @Override
    public void notice(String message) {
        System.out.println(prefix() + message);
    }

    private String prefix() {
        return dbId.isEmpty() ? "" : "[" + dbId + "] ";
    }

    private boolean has (String[] args, String arg) {
        return Arrays.asList(args).contains(arg);
    }

    private Map<String,String> getConfigurationProperties() {
        String[] names = new String[] {
          ConfigUtils.CONFIG_FILE_NAME,
          ConfigUtils.CONFIG_FILES,
          ConfigUtils.CONFIG_FILE_ENCODING,
          ConfigUtils.BASELINE_DESCRIPTION,
          ConfigUtils.BASELINE_ON_MIGRATE,
          ConfigUtils.BASELINE_VERSION,
          ConfigUtils.BATCH,
          ConfigUtils.CALLBACKS,
          ConfigUtils.CLEAN_DISABLED,
          ConfigUtils.CLEAN_ON_VALIDATION_ERROR,
          ConfigUtils.CONNECT_RETRIES ,
          ConfigUtils.DRIVER,
          ConfigUtils.DRYRUN_OUTPUT,
          ConfigUtils.ENCODING,
          ConfigUtils.ERROR_OVERRIDES,
          ConfigUtils.GROUP,
          ConfigUtils.INIT_SQL,
          ConfigUtils.INSTALLED_BY,
          ConfigUtils.LICENSE_KEY,
          ConfigUtils.LOCATIONS,
          ConfigUtils.MIXED,
          ConfigUtils.OUT_OF_ORDER,
          ConfigUtils.OUTPUT_QUERY_RESULTS,
          ConfigUtils.PASSWORD,
          ConfigUtils.PLACEHOLDER_PREFIX,
          ConfigUtils.PLACEHOLDER_REPLACEMENT,
          ConfigUtils.PLACEHOLDER_SUFFIX,
          ConfigUtils.PLACEHOLDERS_PROPERTY_PREFIX,
          ConfigUtils.REPEATABLE_SQL_MIGRATION_PREFIX,
          ConfigUtils.RESOLVERS,
          ConfigUtils.SCHEMAS,
          ConfigUtils.SKIP_DEFAULT_CALLBACKS,
          ConfigUtils.SKIP_DEFAULT_RESOLVERS,
          ConfigUtils.SQL_MIGRATION_PREFIX,
          ConfigUtils.SQL_MIGRATION_SEPARATOR,
          ConfigUtils.SQL_MIGRATION_SUFFIXES,
          ConfigUtils.STREAM,
          ConfigUtils.TABLE,
          ConfigUtils.TABLESPACE,
          ConfigUtils.TARGET,
          ConfigUtils.UNDO_SQL_MIGRATION_PREFIX,
          ConfigUtils.URL,
          ConfigUtils.USER,
          ConfigUtils.VALIDATE_ON_MIGRATE,
          ConfigUtils.JAR_DIRS,
          ConfigUtils.CONFIGURATIONS
        };
        Map<String,String> props = new HashMap<>();
        props.put (ConfigUtils.CLEAN_DISABLED, "true");
        for (String name : names) {
            String v = Environment.get(String.format("${%s}", name), null);
            if (v != null) {
                props.put(name, v);
            }
        }
        return props;
    }
}
