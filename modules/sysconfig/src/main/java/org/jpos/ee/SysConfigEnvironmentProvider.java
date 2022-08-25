package org.jpos.ee;

import org.jpos.core.EnvironmentProvider;
import java.util.Objects;

public class SysConfigEnvironmentProvider implements EnvironmentProvider {
    protected <T> T exec(DBAction<T> action) throws Exception {
        return org.jpos.ee.DB.exec(action);
    }

    public String prefix() {
        return "sys::";
    }

    @Override
    public String get(String config) {
        Objects.requireNonNull(config);

        try {
            return exec(db -> {
                SysConfigManager scm = new SysConfigManager(db);
                return scm.get(config);
            });
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
