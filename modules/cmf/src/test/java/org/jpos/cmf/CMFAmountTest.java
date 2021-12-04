package org.jpos.cmf;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


public final class CMFAmountTest
{
    @Test
    public void constructorFromStringWithSign() {
        CMFAmount am = new CMFAmount("D" + "840" + "2" + "12345678");       // negative!
        assertEquals(am.getSign(), 'D');
        assertEquals(am.getCurrency(), "840");
        assertEquals(am.getMinorUnit(), 2);

        BigDecimal bdAmt= am.getAmount();
        BigDecimal expectedBdAmt= new BigDecimal("123456.78").negate();     // negative!

        assertEquals(0, bdAmt.compareTo(expectedBdAmt), "Expected amount '"+expectedBdAmt+"' but got '"+bdAmt+"'");
    }

    @Test
    public void constructorFromStringWithoutSign() {
        CMFAmount am = new CMFAmount("840" + "2" + "12345678");
        assertEquals(am.getSign(), 'C');                                    // no sign, asssumes positive
        assertEquals(am.getCurrency(), "840");
        assertEquals(am.getMinorUnit(), 2);

        BigDecimal bdAmt= am.getAmount();
        BigDecimal expectedBdAmt= new BigDecimal("123456.78");              // no sign, asssumes positive

        assertEquals(0, bdAmt.compareTo(expectedBdAmt), "Expected amount '"+expectedBdAmt+"' but got '"+bdAmt+"'");
    }

    @Test
    public void constructorFromStringWithSign_SerializeDefault() {
        String inpString = "D" + "840" + "2" +     "12345678";
        String outString = "D" + "840" + "2" +     "12345678";
        CMFAmount am = new CMFAmount(inpString);
        assertEquals(am.serialize(), outString);
    }

    @Test
    public void constructorFromStringWithSign_Serialize12() {
        String inpString = "D" + "840" + "2" +     "12345678";
        String outString = "D" + "840" + "2" + "000012345678";
        CMFAmount am = new CMFAmount(inpString);
        assertEquals(am.serialize(true, 12), outString);
    }

    @Test
    public void constructorFromStringWithoutSign_SerializeDefault() {
        String inpString =       "840" + "2" + "12345678";
        String outString = "C" + "840" + "2" + "12345678";
        CMFAmount am = new CMFAmount(inpString);
        assertEquals(am.serialize(), outString);
    }

    @Test
    public void constructorFromStringWithSign_Serialize12WithoutSign() {
        String inpString = "D" + "840" + "2" +     "12345678";  // negative
        String outString =       "840" + "2" + "000012345678";
        CMFAmount am = new CMFAmount(inpString);
        assertEquals(am.serialize(false, 12), outString);       // without sign (even though it was negative... just to test)
    }


}
