package org.jpos.fsdpackager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.jpos.iso.ISOException;
import org.junit.jupiter.api.Test;

public class OptionalPackagerTest {

    @Test
    void testPack_fieldPresent() throws ISOException {
        AFSDFieldPackager   mockPackager     = new MockAFSDFieldPackager("testField", "testValue");
        OptionalPackager    optionalPackager = new OptionalPackager("optional", mockPackager);
        Map<String, String> fields           = new HashMap<>();
        fields.put("testField", "value");

        byte[] packed = optionalPackager.pack(fields);
        assertNotNull(packed);
        assertArrayEquals("testValue".getBytes(), packed);
    }

    @Test
    void testPack_fieldAbsent() throws ISOException {
        AFSDFieldPackager   mockPackager     = new MockAFSDFieldPackager("testField", "testValue");
        OptionalPackager    optionalPackager = new OptionalPackager("optional", mockPackager);
        Map<String, String> fields           = new HashMap<>();

        byte[] packed = optionalPackager.pack(fields);
        assertNull(packed);
    }

    @Test
    void testUnpack_fieldPresent() throws ISOException {
        AFSDFieldPackager   mockPackager     = new MockAFSDFieldPackager("testField", "testValue");
        OptionalPackager    optionalPackager = new OptionalPackager("optional", mockPackager);
        byte[]              inStream         = "testValue".getBytes();
        Map<String, String> fields           = new HashMap<>();
        int                 offset           = optionalPackager.unpack(inStream, 0, fields);

        assertEquals(9, offset);
        assertEquals("testValue", fields.get("testField"));
    }

    @Test
    void testUnpack_fieldAbsent() throws ISOException {
        AFSDFieldPackager   mockPackager     = new FixedFieldPackager("testField", 9);
        OptionalPackager    optionalPackager = new OptionalPackager("optional", mockPackager);
        byte[]              inStream         = {};
        Map<String, String> fields           = new HashMap<>();
        int                 offset           = optionalPackager.unpack(inStream, 0, fields);

        assertEquals(0, offset);
        assertNull(fields.get("testField"));
    }

    @Test
    void testGetParserTree() {
        AFSDFieldPackager mockPackager     = new MockAFSDFieldPackager("testField", "testValue");
        OptionalPackager  optionalPackager = new OptionalPackager("optional", mockPackager);
        String            tree             = optionalPackager.getParserTree("");
        String            expected         = String.format("Field [optional] : [OPTIONAL]%n"
                + "\tMock Field [testField] : value=testValue%n");
        assertEquals(expected, tree);
    }

    @Test
    void testDump_fieldPresent() {
        AFSDFieldPackager   mockPackager     = new MockAFSDFieldPackager("testField", "testValue");
        OptionalPackager    optionalPackager = new OptionalPackager("optional", mockPackager);
        Map<String, String> fields           = new HashMap<>();
        fields.put("testField", "value");
        String dump = optionalPackager.dump("", fields);
        assertEquals("Mock Field [testField] : value=testValue", dump);
    }

    @Test
    void testDump_fieldAbsent() {
        AFSDFieldPackager   mockPackager     = new FixedFieldPackager("testField", 9);
        OptionalPackager    optionalPackager = new OptionalPackager("optional", mockPackager);
        Map<String, String> fields           = new HashMap<>();
        String              dump             = optionalPackager.dump("", fields);
        assertEquals("", dump);
    }

    @Test
    void testHexDump_fieldPresent() {
        AFSDFieldPackager   mockPackager     = new MockAFSDFieldPackager("testField", "testValue");
        OptionalPackager    optionalPackager = new OptionalPackager("optional", mockPackager);
        Map<String, String> fields           = new HashMap<>();
        fields.put("testField", "value");
        byte[] hexDump = optionalPackager.hexDump("", fields);
        assertArrayEquals("testValue".getBytes(), hexDump);

    }

    @Test
    void testHexDump_fieldAbsent() {
        AFSDFieldPackager   mockPackager     = new MockAFSDFieldPackager("testField", "testValue");
        OptionalPackager    optionalPackager = new OptionalPackager("optional", mockPackager);
        Map<String, String> fields           = new HashMap<>();
        byte[]              hexDump          = optionalPackager.hexDump("", fields);
        assertArrayEquals("testValue".getBytes(), hexDump);

    }

    // Mock class for AFSDFieldPackager to isolate OptionalPackager logic.
    static class MockAFSDFieldPackager extends AFSDFieldPackager {
        private String value;
        private String name;

        public MockAFSDFieldPackager(String name, String value) {
            this.value = value;
            this.name = name;
        }

        @Override
        public byte[] pack(Map<String, String> setfields) throws ISOException {
            if (setfields.get(name) == null) {
                throw new ISOException("field not set");
            }
            return value.getBytes();
        }

        @Override
        public int unpack(byte[] inStream, int offset, Map<String, String> fields) throws ISOException {
            fields.put(name, value);
            return 9;
        }

        @Override
        public String dump(String prefix, Map<String, String> setfields) {
            return prefix + "Mock Field [" + name + "] : value=" + value;
        }

        @Override
        public String getParserTree(String prefix) {
            return prefix + "Mock Field [" + name + "] : value=" + value + System.lineSeparator();
        }

        @Override
        public byte[] hexDump(String prefix, Map<String, String> setfields) {
            return value.getBytes();
        }

        @Override
        public String getName() {
            return name;
        }
    }
}