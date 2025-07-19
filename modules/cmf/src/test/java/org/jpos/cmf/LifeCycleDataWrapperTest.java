/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

package org.jpos.cmf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jpos.iso.ISOException;
import org.junit.jupiter.api.Test;

public class LifeCycleDataWrapperTest {

    @Test
    public void test_parse() {

        String ind = "1";
        String trace = "123456789012345";
        String seq = "12";
        String token = "1234";
        String raw = ind + trace + seq + token;

        LifeCycleDataWrapper wrapper = new LifeCycleDataWrapper(raw);
        
        assertEquals(wrapper.getIndicator(), ind);
        assertEquals(wrapper.getTrace(), trace);
        assertEquals(wrapper.getSequence(), seq);
        assertEquals(wrapper.getToken(), token);
    }

    @Test
    public void test_serialize() throws ISOException {

        String ind = "1";
        String trace = "123456789012345";
        String seq = "12";
        String token = "1234";
        String raw = ind + trace + seq + token;

        LifeCycleDataWrapper wrapper = new LifeCycleDataWrapper();
        wrapper.setIndicator(ind);
        wrapper.setTrace(trace);
        wrapper.setToken(token);
        wrapper.setSequence(seq);
        
        assertEquals(wrapper.serialize(), raw);
    }

    @Test
    public void test_serialize_with_defaults() throws ISOException {

        String ind = "1";
        String trace = "123456789012345";

        LifeCycleDataWrapper wrapper = new LifeCycleDataWrapper();
        wrapper.setIndicator(ind);
        wrapper.setTrace(trace);
        
        assertEquals(wrapper.serialize(), ind + trace + "000000");
    }
}
