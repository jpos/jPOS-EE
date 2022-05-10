/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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

package org.jpos.gl;

import org.jpos.util.Tags;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

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

    @Test
    void testGetAffectedLayers() {
        GLTransaction txn = new GLTransaction();
        txn.createCredit(bobEquity, AMOUNT, null, LAYER);
        txn.createDebit(aliceEquity, AMOUNT, null, LAYER);
        Set<Short> affectedLayers = txn.getAffectedLayers(bobEquity);
        Set<Short> expected = Collections.singleton(LAYER);
        Assertions.assertEquals(expected, affectedLayers, "Affected layers did not match for bob");
        affectedLayers = txn.getAffectedLayers(aliceEquity);
        Assertions.assertEquals(expected, affectedLayers, "Affected layers did not match for alice");
        affectedLayers = txn.getAffectedLayers(aliceEquity, bobEquity);
        Assertions.assertEquals(expected, affectedLayers, "Affected layers did not match for both");
    }
}