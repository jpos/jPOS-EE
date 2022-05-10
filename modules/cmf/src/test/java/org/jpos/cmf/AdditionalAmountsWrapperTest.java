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
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public final class AdditionalAmountsWrapperTest {

    @Test
    public void test_contains_amountType() {

        AdditionalAmountsWrapper wrapper = new AdditionalAmountsWrapper();

        wrapper.add(new AdditionalAmount("30", new BigDecimal("10.00"), "858", AmountType.AMOUNT_CASH, 1));
        wrapper.add(new AdditionalAmount("30", new BigDecimal("12.00"), "858", AmountType.AMOUNT_TAXABLE, 1));

        assertTrue(wrapper.containsAmountType(AmountType.AMOUNT_TAXABLE));
        assertTrue(wrapper.containsAmountType(AmountType.AMOUNT_CASH));
        assertFalse(wrapper.containsAmountType(AmountType.AMOUNT_REMAINING_THIS_CYCLE));
    }

    @Test
    public void test_get_by_amountType() {

        AdditionalAmountsWrapper wrapper = new AdditionalAmountsWrapper();

        wrapper.add(new AdditionalAmount("30", new BigDecimal("10.00"), "858", AmountType.AMOUNT_CASH, 1));
        wrapper.add(new AdditionalAmount("30", new BigDecimal("12.00"), "858", AmountType.AMOUNT_TAXABLE, 1));

        assertNotNull(wrapper.getFirstByAmountType(AmountType.AMOUNT_TAXABLE));
        assertNotNull(wrapper.getFirstByAmountType(AmountType.AMOUNT_CASH));
        assertNull(wrapper.getFirstByAmountType(AmountType.AMOUNT_REMAINING_THIS_CYCLE));
    }


    @Test
    public void testParseInvalidLengthData() {
        String sample = "00028582C00000010000000018582C0000001000";
        assertThrows(IllegalArgumentException.class, () -> AdditionalAmountsWrapper.parse(sample));
    }

   @Test
   public void testSuccessfulParse() {
       String sample =  "00" + "02" + "858"+"2" + "C"+"000000100000" +
                        "00" + "01" + "858"+"2" + "C"+"000000100000";

       AdditionalAmountsWrapper wrapper = AdditionalAmountsWrapper.parse(sample);
       assertEquals(2, wrapper.size());
   }

   @Test
   public void testParseAndSerialize() {
       String sample =  "00" + "02" + "840"+"2" + "C"+"000000100000" +
                        "00" + "01" + "858"+"2" + "C"+"000000100000";

       AdditionalAmountsWrapper wrapper = AdditionalAmountsWrapper.parse(sample);
       assertEquals(sample, wrapper.serialize());
   }

   @Test
   public void testParseAndSerializeOneItem() {

       String sample = "00" + "01" + "858"+"2" + "C"+"000000100000";

       AdditionalAmountsWrapper wrapper = AdditionalAmountsWrapper.parse(sample);

       assertEquals(1, wrapper.size());
       assertEquals(sample, wrapper.serialize());
   }

   @Test
   public void test_listByAmountType() {
       AdditionalAmountsWrapper wrapper = new AdditionalAmountsWrapper();

       wrapper.add(new AdditionalAmount("00", new BigDecimal("200.00"), "840", AmountType.AMOUNT_SURCHARGE, 1));
       wrapper.add(new AdditionalAmount("00", new BigDecimal("300.00"), "840", AmountType.AMOUNT_CASH, 1));
       wrapper.add(new AdditionalAmount("30", new BigDecimal("400.00"), "840", AmountType.AMOUNT_SURCHARGE, 1));

       List<AdditionalAmount> amounts = wrapper.listByAmountType(AmountType.AMOUNT_SURCHARGE);

       assertNotNull(amounts);
       assertEquals(2, amounts.size());
   }

   @Test
   public void test_listByTypes_WithAccountAndAmountTypes() {
       AdditionalAmountsWrapper wrapper = new AdditionalAmountsWrapper();

       wrapper.add(new AdditionalAmount("00", new BigDecimal("200.00"), "840", AmountType.AMOUNT_SURCHARGE, 1));
       wrapper.add(new AdditionalAmount("00", new BigDecimal("300.00"), "840", AmountType.AMOUNT_CASH, 1));
       wrapper.add(new AdditionalAmount("30", new BigDecimal("400.00"), "840", AmountType.AMOUNT_SURCHARGE, 1));

       List<AdditionalAmount> amounts = wrapper.listByTypes("00", AmountType.AMOUNT_SURCHARGE);
       assertNotNull(amounts);
       assertEquals(1, amounts.size());
   }

   @Test
   public void test_listByTypes_WithNullAccountType() {
       AdditionalAmountsWrapper wrapper = new AdditionalAmountsWrapper();

       wrapper.add(new AdditionalAmount("00", new BigDecimal("200.00"), "840", AmountType.AMOUNT_SURCHARGE, 1));
       wrapper.add(new AdditionalAmount("00", new BigDecimal("300.00"), "840", AmountType.AMOUNT_CASH, 1));
       wrapper.add(new AdditionalAmount("30", new BigDecimal("400.00"), "840", AmountType.AMOUNT_SURCHARGE, 1));

       List<AdditionalAmount> amounts = wrapper.listByTypes(null, AmountType.AMOUNT_SURCHARGE);
       assertNotNull(amounts);
       assertEquals(2, amounts.size());
   }



   @Test
   public void test_getFirstByAmountType() {
       AdditionalAmountsWrapper wrapper = new AdditionalAmountsWrapper();

       wrapper.add(new AdditionalAmount("00", new BigDecimal("200.00"), "840", AmountType.AMOUNT_SURCHARGE, 1));
       wrapper.add(new AdditionalAmount("00", new BigDecimal("300.00"), "840", AmountType.AMOUNT_CASH, 1));
       wrapper.add(new AdditionalAmount("30", new BigDecimal("400.00"), "840", AmountType.AMOUNT_SURCHARGE, 1));

       AdditionalAmount amount = wrapper.getFirstByAmountType(AmountType.AMOUNT_SURCHARGE);

       assertNotNull(amount);
       assertEquals(new BigDecimal("200.00"), amount.getAmount());
       assertEquals("00", amount.getAccountType());
   }

   @Test
   public void test_containsAmountType() {
       AdditionalAmountsWrapper wrapper = new AdditionalAmountsWrapper();

       wrapper.add(new AdditionalAmount("00", new BigDecimal("200.00"), "840", AmountType.AMOUNT_SURCHARGE, 1));
       wrapper.add(new AdditionalAmount("00", new BigDecimal("300.00"), "840", AmountType.AMOUNT_CASH, 1));

       assertTrue(wrapper.containsAmountType(AmountType.AMOUNT_SURCHARGE));
       assertTrue(wrapper.containsAmountType(AmountType.AMOUNT_CASH));
       assertFalse(wrapper.containsAmountType(AmountType.AMOUNT_REMAINING_THIS_CYCLE));
   }

}



