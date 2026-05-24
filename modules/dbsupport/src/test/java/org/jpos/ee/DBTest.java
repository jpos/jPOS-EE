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

package org.jpos.ee;

import org.hibernate.Session;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.Semaphore;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class DBTest {
    @Test
    void sessionInjectionConstructorStoresSession() {
        Session session = mock(Session.class);
        DB db = new DB(session);

        assertSame(session, db.session());
    }

    @Test
    void sessionInjectionConstructorRejectsNullSession() {
        assertThrows(IllegalArgumentException.class, () -> new DB((Session) null));
    }

    @Test
    void sessionInjectionConstructorCanCarryConfigModifier() {
        DB db = new DB(mock(Session.class), "tenant-a");

        assertEquals("DB{tenant-a}", db.toString());
    }

    @Test
    void openReturnsInjectedSessionWithoutSessionFactory() {
        Session session = mock(Session.class);
        DB db = new DB(session);

        assertSame(session, db.open());
        assertSame(session, db.open());
    }

    @Test
    void closeClosesInjectedSession() {
        Session session = mock(Session.class);
        DB db = new DB(session);

        db.close();

        verify(session).close();
        assertNull(db.session());
    }

    @Test
    void sessionInjectedDBDoesNotUseWarmedDefaultSessionFactoryState() throws Exception {
        Map<String, Semaphore> sfSems = staticSemaphoreMap("sfSems");
        Map<String, Semaphore> mdSems = staticSemaphoreMap("mdSems");
        Semaphore previousSfSem = sfSems.put(null, new Semaphore(1));
        Semaphore previousMdSem = mdSems.put(null, new Semaphore(1));
        try {
            DB db = new DB(mock(Session.class));

            IllegalStateException ex = assertThrows(IllegalStateException.class, db::getSessionFactory);
            assertTrue(ex.getMessage().contains("SessionFactory not available"));
        } finally {
            restore(sfSems, null, previousSfSem);
            restore(mdSems, null, previousMdSem);
        }
    }

    @Test
    void sessionInjectedDBDoesNotUseWarmedModifiedSessionFactoryState() throws Exception {
        Map<String, Semaphore> sfSems = staticSemaphoreMap("sfSems");
        Map<String, Semaphore> mdSems = staticSemaphoreMap("mdSems");
        Semaphore previousSfSem = sfSems.put("tenant-a", new Semaphore(1));
        Semaphore previousMdSem = mdSems.put("tenant-a", new Semaphore(1));
        try {
            DB db = new DB(mock(Session.class), "tenant-a");

            IllegalStateException ex = assertThrows(IllegalStateException.class, db::getSessionFactory);
            assertTrue(ex.getMessage().contains("SessionFactory not available"));
        } finally {
            restore(sfSems, "tenant-a", previousSfSem);
            restore(mdSems, "tenant-a", previousMdSem);
        }
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Semaphore> staticSemaphoreMap(String fieldName) throws Exception {
        Field field = DB.class.getDeclaredField(fieldName);
        field.setAccessible(true);
        return (Map<String, Semaphore>) field.get(null);
    }

    private static void restore(Map<String, Semaphore> map, String key, Semaphore previous) {
        if (previous == null)
            map.remove(key);
        else
            map.put(key, previous);
    }
}
