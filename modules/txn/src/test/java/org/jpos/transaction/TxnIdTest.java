package org.jpos.transaction;

import org.joda.time.DateTime;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TxnIdTest {
    @Test
    public void test() {
        TxnId txnId = TxnId.create(DateTime.now(), 0, 1L);
        TxnId txnId1 = TxnId.parse(txnId.toString());
        TxnId txnId2 = TxnId.parse(txnId.id());
        TxnId txnId3 = TxnId.fromRrn(txnId.toRrn());
        assertEquals(txnId1, txnId2);
        assertEquals(txnId1.toString(), txnId2.toString());
        assertEquals(txnId2, txnId3);
        assertEquals(txnId2.toString(), txnId3.toString());
        assertEquals(12, txnId.toRrn().length());
    }

    @Test
    public void testBigId() {
        try {
            TxnId.parse(Long.MAX_VALUE);
            fail ("Should raise exception");
        } catch (IllegalArgumentException ignored) { }
    }

    @Test
    public void testNegativeId() {
        try {
            TxnId.parse(-Long.MAX_VALUE);
            fail ("Should raise exception");
        } catch (IllegalArgumentException ignored) { }
    }

    @Test
    public void testInvalidRrn() {
        try {
            TxnId id = TxnId.fromRrn(Long.toString(Long.MAX_VALUE,36));
            fail ("Should raise exception - TxnId=" + id);
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid rrn 1y2p0ij32e8e7", e.getMessage());
        }
    }

    @Test
    public void testMaxValue() {
        TxnId txnId = TxnId.parse(4738381338321616895L);
        TxnId txnId1 = TxnId.parse(txnId.toString());
        TxnId txnId2 = TxnId.parse(txnId.id());
        TxnId txnId3 = TxnId.fromRrn(txnId.toRrn());
        assertEquals(txnId1, txnId2);
        assertEquals(txnId1.toString(), txnId2.toString());
        assertEquals(txnId2, txnId3);
        assertEquals(txnId2.toString(), txnId3.toString());
        assertEquals(12, txnId.toRrn().length());
    }
}
