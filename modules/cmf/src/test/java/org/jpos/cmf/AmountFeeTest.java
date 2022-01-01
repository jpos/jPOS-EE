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

package org.jpos.cmf;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


public final class AmountFeeTest
{
    @Test
    public void constructorFullWithStringConversionRate() {
        AmountFee af1 = new AmountFee(FeeType.ACQUIRER_FEE,
                                      new CMFAmount(new BigDecimal("20.00"),  "858"), // fee
                                      new CMFAmount(new BigDecimal( "0.50"),  "840"), // settlement fee
                                      "3"+"0000025");                                 // 0000.025
        AmountFee af2 = new AmountFee(FeeType.ACQUIRER_FEE,
                                      new CMFAmount(new BigDecimal("20.00"),  "858"), // fee
                                      new CMFAmount(new BigDecimal( "0.50"),  "840"), // settlement fee
                                      "4"+"0000250");                                 // 000.0250

        assertTrue(0 == af1.getConversionRate().compareTo(new BigDecimal("0000.025")), "Conversion rate doesn't match");
        assertTrue(0 == af2.getConversionRate().compareTo(new BigDecimal("000.0250")), "Conversion rate doesn't match");
    }

    @Test
    public void constructorFullWithBigDecimalConversionRate() {
        AmountFee af3 = new AmountFee(FeeType.ACQUIRER_FEE,
                                      new CMFAmount(new BigDecimal("20.00"),  "858"), // fee
                                      new CMFAmount(new BigDecimal( "0.50"),  "840"), // settlement fee
                                      new BigDecimal("5.0002508"));
        assertTrue(0 == af3.getConversionRate().compareTo(new BigDecimal("5.000251"))); // must round to precision 7
    }


    @Test
    public void constructorString() {
        String amtFee = FeeType.ACQUIRER_FEE.getCode() +        // (n2)
                        "C" + "858" + "2" + "00002000" +        // fee (x+n12)
                        "6" + "5000251" +                       // conversion rate (n8)
                        "C" + "840" + "2" + "00000050";         // settlement fee (x+n12)
        AmountFee af = new AmountFee(amtFee);
        assertEquals(af.serialize(), amtFee);
    }

    @Test
    public void constructorStringShouldFailForLength() {
        String amtFee = /*FeeType.ACQUIRER_FEE.getCode() +*/    // (n2) Forgot the fee type!
                        "C" + "858" + "2" + "00002000" +        // fee (x+n12)
                        "6" + "5000251" +                       // conversion rate (n8)
                        "C" + "840" + "2" + "00000050";         // settlement fee (x+n12)

        assertThrows(IllegalArgumentException.class, () -> new AmountFee(amtFee));
    }

}
