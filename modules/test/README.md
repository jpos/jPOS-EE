# Module for aiding in unit tests

This module provides annotations to inject some mock or frequently needed objects during testing. 

For example, it provides an injection for a `Log` object, and a `MUX` mock.

## Log injection example
In the following example, if the logger does not already exist, a default one, that logs to standard output is created with the given `logger` name, and assinged to the `Log` instance.
```java
@ExtendWith(LogSupplierExtension.class)
class LogTest {
    @LogSource (logger="Q2", realm="log-test")
    Log log;
    
    @Test
    public void testDebug(){
        log.debug("debug called");
    }
```


## Mux mocking injection example

This test class is actually executed in this module's test.

```java
package org.jpos.ee.test;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.MUX;
import org.jpos.q2.iso.QMUX;
import org.jpos.util.NameRegistrar;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.same;
import static org.mockito.Mockito.when;

@ExtendWith(MUXSupplierExtension.class)
class MUXSupplierExtensionTest {

    private static final String MUX_NAME = "connected-mux";
    @MUXMock(connected = true, name = MUX_NAME)
    MUX connectedMux;

    @MUXMock(connected = false)
    MUX disconnectedMux;

    @Test
    void testConnectedMux() throws NameRegistrar.NotFoundException {
        assertSame(connectedMux, QMUX.getMUX(MUX_NAME));
        assertTrue(connectedMux.isConnected());
    }

    @Test
    void testDisconnectedMux() {
        assertFalse(disconnectedMux.isConnected());
    }

    @Test
    void testMockRequest() throws NameRegistrar.NotFoundException, ISOException {
        ISOMsg request = new ISOMsg("2100");
        ISOMsg response = new ISOMsg("2110");
        when(connectedMux.request(same(request), anyLong())).thenReturn(response);
        MUX mux = QMUX.getMUX(MUX_NAME);
        assertSame(connectedMux, mux);
        assertTrue(mux.isConnected());
        assertSame(response, mux.request(request, 1000L));
    }
}
```