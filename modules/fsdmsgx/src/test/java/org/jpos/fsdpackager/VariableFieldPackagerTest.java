package org.jpos.fsdpackager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.Map;

import org.jpos.fsdpackager.compliance.APCICompliance;
import org.jpos.fsdpackager.compliance.NoCompliance;
import org.jpos.iso.AsciiInterpreter;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOUtil;
import org.jpos.iso.Interpreter;
import org.junit.Before;
import org.junit.Test;

public class VariableFieldPackagerTest {

    private VariableFieldPackager packager;
    private Map<String, String>   fields;
    private byte                  delimiter;
    private Interpreter           interpreter;

    @Before
    public void setUp() {
        delimiter = 0x1C; // Example delimiter
        interpreter = AsciiInterpreter.INSTANCE;
        fields = new HashMap<>();
    }

    @Test
    public void testUnpack_validData() throws ISOException {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        byte[] inStream      = "test".getBytes();
        byte[] withDelimiter = new byte[inStream.length + 1];
        System.arraycopy(inStream, 0, withDelimiter, 0, inStream.length);
        withDelimiter[withDelimiter.length - 1] = delimiter;

        int offset    = 0;
        int bytesRead = packager.unpack(withDelimiter, offset, fields);
        assertEquals(5, bytesRead);
        assertEquals("test", packager.getValue());
    }

    @Test
    public void testUnpack_emptyData() throws ISOException {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        byte[] inStream  = { delimiter };
        int    offset    = 0;
        int    bytesRead = packager.unpack(inStream, offset, fields);
        assertEquals(1, bytesRead);
        assertEquals("", packager.getValue());
    }

    @Test
    public void testUnpack_noDelimiter() throws ISOException {
        // No exception as its delimiter or end of message
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        byte[] inStream = "test".getBytes();
        int    offset   = 0;
        packager.unpack(inStream, offset, fields);
    }

    @Test(expected = ISOException.class)
    public void testUnpack_exceedsMaxSize() throws ISOException {
        packager = new VariableFieldPackager("field1", 2, delimiter, interpreter);
        byte[] inStream      = "test".getBytes();
        byte[] withDelimiter = new byte[inStream.length + 1];
        System.arraycopy(inStream, 0, withDelimiter, 0, inStream.length);
        withDelimiter[withDelimiter.length - 1] = delimiter;
        int offset = 0;
        packager.unpack(withDelimiter, offset, fields);

    }

    @Test
    public void testUnpack_maxSizeEqualToData() throws ISOException {
        packager = new VariableFieldPackager("field1", 4, delimiter, interpreter);
        byte[] inStream      = "test".getBytes();
        byte[] withDelimiter = new byte[inStream.length + 1];
        System.arraycopy(inStream, 0, withDelimiter, 0, inStream.length);
        withDelimiter[withDelimiter.length - 1] = delimiter;
        int offset    = 0;
        int bytesRead = packager.unpack(withDelimiter, offset, fields);
        assertEquals(5, bytesRead);
        assertEquals("test", packager.getValue());
    }

    @Test
    public void testPack_validData() throws ISOException {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        fields.put("field1", "test");
        byte[] packed                = packager.pack(fields);
        byte[] expected              = "test".getBytes();
        byte[] expectedWithDelimiter = new byte[expected.length + 1];
        System.arraycopy(expected, 0, expectedWithDelimiter, 0, expected.length);
        expectedWithDelimiter[expectedWithDelimiter.length - 1] = delimiter;
        assertArrayEquals(expectedWithDelimiter, packed);
        assertEquals("test", packager.getValue());
    }

    @Test
    public void testPack_fieldValueNotNull() throws ISOException {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        packager.setValue("test");
        byte[] packed                = packager.pack(fields);
        byte[] expected              = "test".getBytes();
        byte[] expectedWithDelimiter = new byte[expected.length + 1];
        System.arraycopy(expected, 0, expectedWithDelimiter, 0, expected.length);
        expectedWithDelimiter[expectedWithDelimiter.length - 1] = delimiter;
        assertArrayEquals(expectedWithDelimiter, packed);
        assertEquals("test", packager.getValue());

    }

    @Test
    public void testPack_emptyData() throws ISOException {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        fields.put("field1", "");
        byte[] packed = packager.pack(fields);
        assertEquals("", packager.getValue());
        assertArrayEquals(new byte[] { delimiter }, packed);
    }

    @Test
    public void testPack_nullData() throws ISOException {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        byte[] packed = packager.pack(fields);
        assertEquals("", packager.getValue());
        assertArrayEquals(new byte[] { delimiter }, packed);
    }

    @Test(expected = ISOException.class)
    public void testPack_exceedsMaxSize() throws ISOException {
        packager = new VariableFieldPackager("field1", 2, delimiter, interpreter);
        fields.put("field1", "test");
        packager.pack(fields);
    }

    @Test
    public void testPack_maxSizeEqualToValueLength() throws ISOException {
        packager = new VariableFieldPackager("field1", 4, delimiter, interpreter);
        fields.put("field1", "test");
        byte[] packed                = packager.pack(fields);
        byte[] expected              = "test".getBytes();
        byte[] expectedWithDelimiter = new byte[expected.length + 1];
        System.arraycopy(expected, 0, expectedWithDelimiter, 0, expected.length);
        expectedWithDelimiter[expectedWithDelimiter.length - 1] = delimiter;
        assertArrayEquals(expectedWithDelimiter, packed);
        assertEquals("test", packager.getValue());
    }

    @Test
    public void testConstructorWithCompliance() {
        APCICompliance compliance = new NoCompliance();
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter, compliance);
        assertNotNull(packager);
    }

    @Test
    public void testConstructorWithoutMaxSize() {
        packager = new VariableFieldPackager("field1", delimiter, interpreter);
        assertNotNull(packager);
    }

    @Test
    public void testConstructorWithoutMaxSizeWithCompliance() {
        APCICompliance compliance = new NoCompliance();
        packager = new VariableFieldPackager("field1", delimiter, interpreter, compliance);
        assertNotNull(packager);
    }

    @Test
    public void testConstructorWithMandatory() {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter, true);
        assertNotNull(packager);
    }

    @Test
    public void testDump() {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        packager.setValue("test");
        String dump = packager.dump("", fields);
        assertEquals("<field id=\"field1\" value=\"test\"/>\n", dump);
    }

    @Test
    public void testDump_NullValue() {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        String dump = packager.dump("", fields);
        assertEquals("", dump);
    }

    @Test
    public void testHexDump_withValue() {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        packager.setValue("test");
        byte[] hexDump               = packager.hexDump("", fields);
        byte[] expected              = "test".getBytes();
        byte[] expectedWithDelimiter = new byte[expected.length + 1];
        System.arraycopy(expected, 0, expectedWithDelimiter, 0, expected.length);
        expectedWithDelimiter[expectedWithDelimiter.length - 1] = delimiter;
        assertArrayEquals(expectedWithDelimiter, hexDump);
    }

    @Test
    public void testHexDump_NullValue() {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        byte[] hexDump  = packager.hexDump("", fields);
        byte[] expected = { 0x1c };
        assertArrayEquals(hexDump, expected);

    }

    @Test
    public void testGetParserTree() {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        packager.setValue("test");
        String parserTree = packager.getParserTree("");
        assertEquals("Field [field1] : VAR[0..10] delimiter[0x1C] or EOM  : test\n", parserTree);

    }

    @Test
    public void testGetParserTree_NullValue() {
        packager = new VariableFieldPackager("field1", 10, delimiter, interpreter);
        String parserTree = packager.getParserTree("");
        assertEquals("Field [field1] : VAR[0..10] delimiter[0x1C] or EOM  \n", parserTree);

    }

    /**
     * Happy day scenario where a variable field within the max size with a
     * field separator is received. The field should be available for use
     * without the delimiter.
     * 
     * @throws ISOException
     */
    @Test
    public void unpackTest01() throws ISOException {

        VariableFieldPackager p   = new VariableFieldPackager("F1", 20, Byte.valueOf((byte) 0x1c),
                                                              AsciiInterpreter.INSTANCE);
        FSDMsgX               msg = new FSDMsgX("Test");
        msg.add("F1", p);
        String inStream = "123456" + (char) 0x1c;
        msg.unpack(inStream.getBytes());

        assertEquals("123456", msg.get("F1"));

    }

    /**
     * Happy day scenario where a variable field is set without using a
     * delimiter. The resulting byte array will have the data and the delimiter
     * in it.
     * 
     * @throws ISOException
     */
    @Test
    public void packTest01() throws ISOException {

        VariableFieldPackager f1  = new VariableFieldPackager("F1", 20, Byte.valueOf((byte) 0x1c),
                                                              AsciiInterpreter.INSTANCE);
        FSDMsgX               msg = new FSDMsgX("Test");
        msg.add("F1", f1);
        msg.set("F1", "123456");

        byte[] outStream = msg.pack();

        assertArrayEquals(("123456" + (char) 0x1c).getBytes(), outStream);

    }

    /**
     * Happy day scenario where a 2 variable field within the max size with
     * their respective delimiters is received. The field should be available
     * for use without the delimiter.
     * 
     * @throws ISOException
     */
    @Test
    public void unpackTest02() throws ISOException {

        VariableFieldPackager f1 = new VariableFieldPackager("F1", 20, Byte.valueOf((byte) 0x1c),
                                                             AsciiInterpreter.INSTANCE);
        VariableFieldPackager f2 = new VariableFieldPackager("F2", 5, Byte.valueOf((byte) 0x1d),
                                                             AsciiInterpreter.INSTANCE);

        FSDMsgX msg = new FSDMsgX("Test");
        msg.add("F1", f1);
        msg.add("F2", f2);

        String inStream = "123456" + (char) 0x1c + "ABC" + (char) 0x1d;
        msg.unpack(inStream.getBytes());

        assertEquals("123456", msg.get("F1"));
        assertEquals("ABC", msg.get("F2"));

    }

    /**
     * Happy day scenario where a multiple variable fields are set without using
     * a delimiter. The resulting byte array will have the data of the fields
     * with their respective delimiters in it.
     * 
     * @throws ISOException
     */

    @Test
    public void packTest02() throws ISOException {

        VariableFieldPackager f1 = new VariableFieldPackager("F1", 20, Byte.valueOf((byte) 0x1c),
                                                             AsciiInterpreter.INSTANCE);
        VariableFieldPackager f2 = new VariableFieldPackager("F2", 5, Byte.valueOf((byte) 0x1d),
                                                             AsciiInterpreter.INSTANCE);

        FSDMsgX msg = new FSDMsgX("Test");
        msg.add("F1", f1);
        msg.add("F2", f2);

        msg.set("F1", "123456");
        msg.set("F2", "ABC");

        byte[] outStream = msg.pack();

        assertArrayEquals(("123456" + (char) 0x1c + "ABC" + (char) 0x1d).getBytes(), outStream);

    }

    /**
     * The order of the packed fields is dependent on the FSDMsg2's add. Setting
     * of fields can be in any order.
     * 
     * @throws ISOException
     */
    @Test
    public void packTest03() throws ISOException {

        VariableFieldPackager f1 = new VariableFieldPackager("F1", 20, Byte.valueOf((byte) 0x1c),
                                                             AsciiInterpreter.INSTANCE);
        VariableFieldPackager f2 = new VariableFieldPackager("F2", 5, Byte.valueOf((byte) 0x1d),
                                                             AsciiInterpreter.INSTANCE);

        FSDMsgX msg = new FSDMsgX("Test");
        msg.add("F1", f1);
        msg.add("F2", f2);

        msg.set("F2", "ABC");
        msg.set("F1", "123456");

        byte[] outStream = msg.pack();

        assertArrayEquals(("123456" + (char) 0x1c + "ABC" + (char) 0x1d).getBytes(), outStream);

    }

    /**
     * Field size can be upto 20 followed by delimiter. The data available is 25
     * wide and no delimiter. An exception should be thrown indicating a
     * delimiter wasnt found after the max of 20 allowed.
     * 
     * @throws ISOException
     */
    @Test
    public void unpackTest03() throws ISOException {

        Throwable exception = assertThrows(ISOException.class, () -> {

            VariableFieldPackager p   = new VariableFieldPackager("F1", 20, Byte.valueOf((byte) 0x1c),
                                                                  AsciiInterpreter.INSTANCE);
            FSDMsgX               msg = new FSDMsgX("Test");
            msg.add("F1", p);

            String inStream = ISOUtil.padleft("", 25, '1') + (char) 0x1c;
            msg.unpack(inStream.getBytes());
        });
        assertEquals("Field [F1]: Delimiter 1c not present after max size 20", exception.getMessage());

    }

    /**
     * If a variable stream comes in with data that reaches end of stream and
     * does not contain a delimitter its valid. There is no point to have a
     * delimiter at the end of a field if its the last field.
     * 
     * @throws ISOException
     */
    @Test
    public void unpackTest04() throws ISOException {

        VariableFieldPackager p   = new VariableFieldPackager("F1", 20, Byte.valueOf((byte) 0x1c),
                                                              AsciiInterpreter.INSTANCE);
        FSDMsgX               msg = new FSDMsgX("Test");
        msg.add("F1", p);

        String inStream = ISOUtil.padleft("", 10, '1');
        msg.unpack(inStream.getBytes());

        assertEquals(inStream, msg.get("F1"));

    }

    /**
     * variable fields indicate their presence with the delimiter. If there is
     * no data a delimiter needs to be sent indicating the presence of the field
     * with no data. The field will be set with an empty string.
     * 
     * @throws ISOException
     */
    @Test
    public void unpackTest05() throws ISOException {

        VariableFieldPackager p   = new VariableFieldPackager("F1", 20, Byte.valueOf((byte) 0x1c),
                                                              AsciiInterpreter.INSTANCE);
        FSDMsgX               msg = new FSDMsgX("Test");
        msg.add("F1", p);

        String inStream = new String(new byte[] { 0x1c });
        msg.unpack(inStream.getBytes());

        assertEquals("", msg.get("F1"));

    }

    /**
     * At time of packing if the field is not set, make sure that the delimiter
     * is still available.
     * 
     * @throws ISOException
     */
    @Test
    public void packTest04() throws ISOException {

        VariableFieldPackager p   = new VariableFieldPackager("F1", 20, Byte.valueOf((byte) 0x1c),
                                                              AsciiInterpreter.INSTANCE);
        FSDMsgX               msg = new FSDMsgX("Test");
        msg.add("F1", p);

        byte[] outStream = msg.pack();

        assertArrayEquals(new byte[] { 0x1c }, outStream);

    }

}