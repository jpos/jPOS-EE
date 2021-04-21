package org.jpos.gl;

import org.jpos.util.Tags;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;

class GLTransactionTest extends TestBase{

    FinalAccount bobEquity, aliceEquity;
    GLTransaction transactionForReverse;
    static final String CREDIT_TAG = "credit";
    static final String DEBIT_TAG = "debit";
    static final String TEST_TAG = "test";
    static final short LAYER = 2;
    static final short[] LAYERS = {LAYER};

    static final BigDecimal AMOUNT = new BigDecimal(1000).setScale(2);


    @BeforeEach
    public void setUp() throws Exception {
        bobEquity = (FinalAccount) gls.getAccount ("TestChart", "31");
        aliceEquity = (FinalAccount) gls.getAccount ("TestChart", "32");
        transactionForReverse = new GLTransaction ("Single-post in layer two");
        transactionForReverse.setPostDate (new Date());
        GLEntry debit = transactionForReverse.createDebit (
                bobEquity,
                AMOUNT,
                null, (short) 2
        );
        debit.setTags(new Tags(DEBIT_TAG, TEST_TAG));
        GLEntry credit = transactionForReverse.createCredit (
                aliceEquity,
                AMOUNT,
                null, (short) 2
        );

        credit.setTags(new Tags(CREDIT_TAG, TEST_TAG));
    }

    @Test
    void testCreateReverse() {
        GLTransaction reversal = transactionForReverse. createReverse();
        Assertions.assertEquals(reversal.getImpact(bobEquity, LAYERS), transactionForReverse.getImpact(bobEquity, LAYERS).negate(), "reverse impact is not the opposite");
        Assertions.assertEquals(reversal.getImpact(aliceEquity, LAYERS), transactionForReverse.getImpact(aliceEquity, LAYERS).negate(), "reverse impact is not the opposite");
        Assertions.assertEquals(reversal.getEntries().size(), 2);
        for (GLEntry entry : reversal.getEntries()) {
            Assertions.assertNull(entry.getTags());
        }
    }

    @Test
    void testCreateReverseKeepTags() {
        GLTransaction reversal = transactionForReverse. createReverse(true);
        Assertions.assertEquals(reversal.getImpact(bobEquity, LAYERS), transactionForReverse.getImpact(bobEquity, LAYERS).negate(), "reverse impact is not the opposite");
        Assertions.assertEquals(reversal.getImpact(aliceEquity, LAYERS), transactionForReverse.getImpact(aliceEquity, LAYERS).negate(), "reverse impact is not the opposite");
        Assertions.assertEquals(reversal.getEntries().size(), 2);
        for (GLEntry entry : reversal.getEntries()) {
            Assertions.assertTrue(entry.getTags().contains(TEST_TAG));
        }
    }

    @Test
    void testCreateReverseWithTags() {
        GLTransaction reversal = transactionForReverse. createReverse(new Tags(TEST_TAG), new Tags(DEBIT_TAG));
        Assertions.assertEquals(reversal.getImpact(aliceEquity, LAYERS), transactionForReverse.getImpact(aliceEquity, LAYERS).negate(), "reverse impact is not the opposite");
        Assertions.assertEquals(0, reversal.getImpact(bobEquity, LAYERS).compareTo(BigDecimal.ZERO), "reverse impact is not the opposite");
        Assertions.assertEquals(reversal.getEntries().size(), 1);
        for (GLEntry entry : reversal.getEntries()) {
            Assertions.assertNull(entry.getTags());
        }
    }

    @Test
    void testCreateReverseWithTagsKeepTags() {
        GLTransaction reversal = transactionForReverse. createReverse(new Tags(TEST_TAG), new Tags(DEBIT_TAG),true);
        Assertions.assertEquals(reversal.getImpact(aliceEquity, LAYERS), transactionForReverse.getImpact(aliceEquity, LAYERS).negate(), "reverse impact is not the opposite");
        Assertions.assertEquals(0, reversal.getImpact(bobEquity, LAYERS).compareTo(BigDecimal.ZERO), "reverse impact is not the opposite");
        Assertions.assertEquals(reversal.getEntries().size(), 1);
        for (GLEntry entry : reversal.getEntries()) {
            Assertions.assertEquals(entry.getTags(), new Tags(TEST_TAG, CREDIT_TAG));
        }
    }
}