package org.jpos.cmf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;


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
}
