package org.jpos.ee.test;

import org.jpos.util.LogListener;
import org.jpos.util.Logger;
import org.jpos.util.SimpleLogListener;

public class TestUtil {
    private final static Logger logger = new Logger();

    static {
        LogListener stdout = new SimpleLogListener();
        logger.addListener(stdout);
    }

    public static Logger getLogger() {
        return logger;
    }
}
