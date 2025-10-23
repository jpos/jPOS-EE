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

package org.jpos.gl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.Transaction;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LayersTest extends TestBase {
    Journal tj;
    FinalAccount tripFund;


    @BeforeEach
    public void setUp () throws Exception {
        tj = gls.getJournal ("TestJournal");
        tripFund    = (FinalAccount) gls.getAccount ("TestChart", "114");
    }
    @Test
    @Order(1)
    public void testTripFundBalanceInLayerZero() throws Exception {
        var tx = gls.beginTransaction();
        try {
            assertEquals(
              new BigDecimal("0.00"),
              gls.getBalance(tj, tripFund)
            );
        } finally {
            tx.commit();
        }
    }
    @Test
    @Order(2)
    public void testTripFundBalanceInLayerOne() throws Exception {
        var tx = gls.beginTransaction();
        try {
            assertEquals(
              new BigDecimal("2000.00"),
              gls.getBalance(tj, tripFund, new short[]{1})
            );
        } finally {
            tx.commit();
        }
    }
    @Test
    @Order(3)
    public void testTripFundBalanceInLayerTwo() throws Exception {
        var tx = gls.beginTransaction();
        try {
            assertEquals(
              new BigDecimal("-50000.00"),
              gls.getBalance(tj, tripFund, new short[]{2})
            );
        } finally {
            tx.commit();
        }
    }
    @Test
    @Order(4)
    public void testTripFundBalanceInLayerOneAndTwo() throws Exception {
        var tx = gls.beginTransaction();
        try {
            assertEquals(
              new BigDecimal("-48000.00"),
              gls.getBalance(tj, tripFund, new short[]{1, 2})
            );
        } finally {
            tx.commit();
        }
    }
    @Test
    @Order(5)
    public void testTripFundBalanceInAllLayers() throws Exception {
        var tx = gls.beginTransaction();
        try {
            assertEquals(
              new BigDecimal("-48000.00"),
              gls.getBalance(tj, tripFund, new short[]{0, 1, 2})
            );
        } finally {
            tx.commit();
        }
    }
    @Test
    @Order(6)
    public void testLayerCheckpoint() throws Exception {
        var tx = gls.beginTransaction();
        try {
            gls.createCheckpoint(
              tj, tripFund, Util.parseDate("20041231"), 1, new short[]{0, 1}
            );
            gls.createCheckpoint(
              tj, tripFund, Util.parseDate("20050101"), 1, new short[]{0}
            );
            gls.createCheckpoint(
              tj, tripFund, Util.parseDate("20050101"), 1, new short[]{1}
            );
            gls.createCheckpoint(
              tj, tripFund, Util.parseDate("20050101"), 1, new short[]{2}
            );
            gls.createCheckpoint(
              tj, tripFund, Util.parseDate("20050101"), 1, new short[]{0, 1}
            );
            gls.createCheckpoint(
              tj, tripFund, Util.parseDate("20050101"), 1, new short[]{0, 1, 2}
            );
        } finally {
            tx.commit();
        }
    }
    @Test
    @Order(6)
    public void testBalancesOffCheckpoints() throws Exception {
        var tx = gls.beginTransaction();
        try {
            assertEquals(
              new BigDecimal("2000.00"),
              gls.getBalance(tj, tripFund, new short[]{1})
            );
            assertEquals(
              new BigDecimal("-48000.00"),
              gls.getBalance(tj, tripFund, new short[]{1, 2})
            );
            assertEquals(
              new BigDecimal("-48000.00"),
              gls.getBalance(tj, tripFund, new short[]{0, 1, 2})
            );
        } finally {
            tx.commit();
        }
    }
    @Test
    @Order(7)
    public void testSinglePostInLayerTwo() throws Exception {
        Transaction tx = gls.beginTransaction();
        GLTransaction txn = new GLTransaction ("Single-post in layer two");
        txn.setPostDate (new Date());
        txn.createDebit (
            tripFund,
            new BigDecimal ("1000.00"), 
            null, (short) 2
        );
        gls.post (tj, txn);
        tx.commit();
        try {
            gls.beginTransaction();
            assertEquals (
              new BigDecimal ("-49000.00"),
              gls.getBalance (tj, tripFund, new short[] { 2 })
            );
            assertEquals (
              new BigDecimal ("-47000.00"),
              gls.getBalance (tj, tripFund, new short[] { 1, 2 })
            );
        } finally {
            tx.commit();
        }

        // reverse effect of this transaction to avoid breaking other tests
        tx = gls.beginTransaction();
        gls.post(tj, txn.createReverse());
        tx.commit();

        tx = gls.beginTransaction();
        try {
            assertEquals(
              new BigDecimal("-50000.00"),
              gls.getBalance(tj, tripFund, new short[]{2})
            );
            assertEquals(
              new BigDecimal("-48000.00"),
              gls.getBalance(tj, tripFund, new short[]{1, 2})
            );
        } finally {
            tx.commit();
        }
    }
    @Test
    @Order(8)
    public void testDoublePostInLayerOne() throws Exception {
        Transaction tx = gls.beginTransaction();
        GLTransaction txn = new 
            GLTransaction ("Valid-post in layer one - no balance change");
        txn.setPostDate (new Date());
        txn.createDebit (
            tripFund,
            new BigDecimal ("10.00"), 
            null , (short) 1
        );
        txn.createCredit (
            tripFund,
            new BigDecimal ("5.00"), 
            null , (short) 1
        );
        txn.createCredit (
            tripFund,
            new BigDecimal ("5.00"), 
            null , (short) 1
        );
        gls.post (tj, txn);
        tx.commit();

        tx = gls.beginTransaction();
        try {
            assertEquals(
              new BigDecimal("2000.00"),
              gls.getBalance(tj, tripFund, new short[]{1})
            );
            assertEquals(
              new BigDecimal("-48000.00"),
              gls.getBalance(tj, tripFund, new short[]{1, 2})
            );
        } finally {
            tx.commit();
        }

        // and reverse it
        tx = gls.beginTransaction();
        gls.post (tj, txn.createReverse());
        tx.commit();

        tx = gls.beginTransaction();
        try {
            // balance should remain the same
            assertEquals(
              new BigDecimal("2000.00"),
              gls.getBalance(tj, tripFund, new short[]{1})
            );
            assertEquals(
              new BigDecimal("-48000.00"),
              gls.getBalance(tj, tripFund, new short[]{1, 2})
            );
        } finally {
            tx.commit();
        }
    }
}
