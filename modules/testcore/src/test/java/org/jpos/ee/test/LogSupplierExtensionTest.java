package org.jpos.ee.test;

import org.jpos.util.Log;
import org.jpos.util.Logger;
import org.jpos.util.SimpleLogListener;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(LogSupplierExtension.class)
class LogSupplierExtensionTest {
    static final String LOGGER_NAME = "test-logger";
    @LogSource (logger=LOGGER_NAME, realm="log-test")
    Log log;

    Logger logger;

    SimpleLogListener logListener = new SimpleLogListener();

    @BeforeEach
    void setUp() {
        logger = Logger.getLogger(LOGGER_NAME);
        logListener = spy(new SimpleLogListener());
        logger.addListener(logListener);
    }

    @AfterEach
    void tearDown() {
        logger.removeListener(logListener);
    }

    @Test
    public void testDebug(){
        log.debug("debug called");
        verify(logListener, times(1)).log(argThat(event -> {
            assertSame(log, event.getSource());
            assertEquals(Log.DEBUG, event.getTag());
            assertEquals(1, event.getPayLoad().size());
            assertEquals("debug called", event.getPayLoad().get(0));
            return true;
        }));
    }

}