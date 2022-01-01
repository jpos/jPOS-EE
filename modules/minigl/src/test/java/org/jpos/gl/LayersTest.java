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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LayersTest extends TestBase {
    Journal tj;
    FinalAccount tripFund;

    @BeforeEach
    public void setUp () throws Exception {
        tj = gls.getJournal ("TestJournal");
        tripFund    = (FinalAccount) gls.getAccount ("TestChart", "114");
    }
    @Test
    public void testTripFundBalanceInLayerZero() throws Exception {
        assertEquals (
            new BigDecimal ("0.00"), 
            gls.getBalance (tj, tripFund)
        );
    }
    @Test
    public void testTripFundBalanceInLayerOne() throws Exception {
        assertEquals (
            new BigDecimal ("2000.00"), 
            gls.getBalance (tj, tripFund, new short[] { 1 })
        );
    }
    @Test
    public void testTripFundBalanceInLayerTwo() throws Exception {
        assertEquals (
            new BigDecimal ("-50000.00"), 
            gls.getBalance (tj, tripFund, new short[] { 2 })
        );
    }
    @Test
    public void testTripFundBalanceInLayerOneAndTwo() throws Exception {
        assertEquals (
            new BigDecimal ("-48000.00"), 
            gls.getBalance (tj, tripFund, new short[] { 1, 2 })
        );
    }
    @Test
    public void testTripFundBalanceInAllLayers() throws Exception {
        assertEquals (
            new BigDecimal ("-48000.00"), 
            gls.getBalance (tj, tripFund, new short[] { 0, 1, 2 })
        );
    }
    @Test
    public void testLayerCheckpoint() throws Exception {
        gls.createCheckpoint (
            tj, tripFund, Util.parseDate ("20041231"), 1, new short[] { 0, 1 }
        );
        gls.createCheckpoint (
            tj, tripFund, Util.parseDate ("20050101"), 1, new short[] { 0 }
        );
        gls.createCheckpoint (
            tj, tripFund, Util.parseDate ("20050101"), 1, new short[] { 1 }
        );
        gls.createCheckpoint (
            tj, tripFund, Util.parseDate ("20050101"), 1, new short[] { 2 }
        );
        gls.createCheckpoint (
            tj, tripFund, Util.parseDate ("20050101"), 1, new short[] { 0, 1 }
        );
        gls.createCheckpoint (
            tj, tripFund, Util.parseDate ("20050101"), 1, new short[] { 0, 1, 2 }
        );
    }
    @Test
    public void testBalancesOffCheckpoints() throws Exception {
        assertEquals (
            new BigDecimal ("2000.00"), 
            gls.getBalance (tj, tripFund, new short[] { 1 })
        );
        assertEquals (
            new BigDecimal ("-48000.00"), 
            gls.getBalance (tj, tripFund, new short[] { 1, 2 })
        );
        assertEquals (
            new BigDecimal ("-48000.00"), 
            gls.getBalance (tj, tripFund, new short[] { 0, 1, 2 })
        );
    }
    @Test
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
        assertEquals (
            new BigDecimal ("-49000.00"), 
            gls.getBalance (tj, tripFund, new short[] { 2 })
        );
        assertEquals (
            new BigDecimal ("-47000.00"), 
            gls.getBalance (tj, tripFund, new short[] { 1, 2 })
        );

        // reverse effect of this transaction to avoid breaking other tests
        tx = gls.beginTransaction();
        gls.post(tj, txn.createReverse());
        tx.commit();

        assertEquals (
            new BigDecimal ("-50000.00"),
            gls.getBalance (tj, tripFund, new short[] { 2 })
        );
        assertEquals (
            new BigDecimal ("-48000.00"),
            gls.getBalance (tj, tripFund, new short[] { 1, 2 })
        );
    }
    @Test
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
        assertEquals (
            new BigDecimal ("2000.00"), 
            gls.getBalance (tj, tripFund, new short[] { 1 })
        );
        assertEquals (
            new BigDecimal ("-48000.00"),
            gls.getBalance (tj, tripFund, new short[] { 1, 2 })
        );

        // and reverse it
        tx = gls.beginTransaction();
        gls.post (tj, txn.createReverse());
        tx.commit();

        // balance should remain the same
        assertEquals (
            new BigDecimal ("2000.00"),
            gls.getBalance (tj, tripFund, new short[] { 1 })
        );
        assertEquals (
            new BigDecimal ("-48000.00"),
            gls.getBalance (tj, tripFund, new short[] { 1, 2 })
        );


    }
}
