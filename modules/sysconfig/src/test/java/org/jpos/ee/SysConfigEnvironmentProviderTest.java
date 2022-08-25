package org.jpos.ee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SysConfigEnvironmentProviderTest {

    @SuppressWarnings("unchecked")
    SysConfigEnvironmentProvider getProvider() {
        return new SysConfigEnvironmentProvider() {
            @Override
            protected <T> T exec(DBAction<T> action) throws Exception {
                return (T) "someValue";
            }
        };
    }

    @Test
    void testGetValue() {
        SysConfigEnvironmentProvider p = getProvider();
        String value = p.get("someKey");
        assertEquals("someValue", value);
    }

    @Test
    void testKeyIsNull() {
        assertThrows(NullPointerException.class, () -> getProvider().get(null));
    }
}
