package org.jpos.crypto;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SensitiveStringTest {
    @Test
    public void testSS() throws Exception {
        String s = this.toString();
        for (int i=0; i<15; i++) {
            SensitiveString ss = new SensitiveString(s);
            assertEquals("Should be equal", s, ss.get());
            s = s + System.lineSeparator() + s;
        }
    }

    @Test
    public void testSSEquals() throws Exception {
        String s = "The quick brown fox jumps over the lazy dog";
        SensitiveString ss0 = new SensitiveString(s);
        SensitiveString ss1 = new SensitiveString(s);
        assertEquals ("Equals should be true", ss0, ss1);
    }
}
