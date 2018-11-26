package org.jpos.ee;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HashVersionTest {
    @Test
    public void testV0() throws Exception {
        String hash = "31c1ffc755678596c7d76756b45b157f8dbda90a";
        assertEquals ("version is ZERO", HashVersion.ZERO, HashVersion.getVersion(hash));
        assertEquals("V0 hash", hash, HashVersion.ZERO.hash("17", "test", null));
        assertTrue ("V0 check", HashVersion.ZERO.check ("17", "test", hash));
    }

    @Test
    public void testV1() throws Exception {
        String h0 = "AQvfqET1cLIS/TTO6m2oDy4+oFHRyW1yC68nV0aByCctgp+SrGehxrjq5Iq6+TZcqUeUeD5oZn+uIgW8AoVhHPWP6kyYVaYEULuWLq8/ScIgMMPPoFRNNbRAoB83GfP5XmnFk3ibivz3ewlKAH3eDDwpxpNIxbv544FFX2bwjUhzwRR6J5fT6bEoB8vgzdNpMhfoN9V+r5otAfG2XUMnBXleNKL0naHsyCFRgXchrKr/Dgt8d0as/VAZcJ1YkDSzzGM/AIZ4jxPt7KYpXmdnDyN1xK4FyDlj/6UbeR4Xsddfdfh77bsA/wL0sOEBu6AA/7FQm+9MqD2aigckU9YgLPYzKc54DItfMV8Z0mHqQXg2";
        String h1 = "ARQ4ElU1RyJ2gULoUhqJXYu8EYYM6bJa1FE0sGR2O3NpcWT65t925nCv2SUL11vnObEgS4ZsbQ/ZUQ6CO9G0VzkPaHOj2IE2q1oa+IAbFab+W81o6QdY9ejjkZaQXzAOOXABtO+1v/iOvRGsne9nUaNjsrBqma4oi9gKcECO9ekEi2rZ1cY3Rt6iL92GTI6YH2x4yyLfZ0KXXC469zl6Cc8R9MgncX7LqawpxRQlMv3JXgodnjUxVQG+o/d46TCNGEDW4s45vS3G73Zp+wr3cK9A9sm5DWsBotvI2inI2BTEBgJ1v5xbc2YPFx9KfGIVaERwgLefet85kcyWc83myFxiODAkcVhlyzxOAjHE5BFC";
        String h2 = "AQAAAAAAAAAAAAAAAAAAAACN+69cqNcdLS2Y2qJV7sCiDI+1C90wJm6OIgGjgKLDiOwmGLgjNTHwAvf8BBJ6Hv1vAfbiSKk7wWqatZZxugEKydBUgiHp5oB7hAAK5JsN72GZCwqbOPkgeaXLyNVBNEg8UUkhPV5RVkHcf4MpQ3UML59zepEcxY9Cfv0Dy1/q5vFvd5mbRzaTi0B8ayLRQN/zXerQuAryne4FPHaudODi6wes6dObTJXHUiwe9FR4yzCxp5D/4tTFpFKc6NTVz92x4DP+ZSXtCvQaTDgpr/zXqXkB3i3/6/Gnx8Kk8j2527wKIQhW92OwXVXHWflFUWs9deXLkuOoi6oqxXHDiJ3A";

        assertEquals ("h0 version is ONE", HashVersion.ONE, HashVersion.getVersion(h0));
        assertEquals ("h1 version is ONE", HashVersion.ONE, HashVersion.getVersion(h1));
        assertEquals ("h2 version is ONE", HashVersion.ONE, HashVersion.getVersion(h2));

        assertTrue("V1 check (h0)", HashVersion.ONE.check ("", "test", h0));
        assertTrue("V1 check (h1)", HashVersion.ONE.check ("", "test", h1));
        assertTrue("V1 check (h2)", HashVersion.ONE.check ("", "test2", h2));
    }
}
