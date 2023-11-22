/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2023 jPOS Software SRL
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

package org.jpos.iso20022.acmt_001_001_08;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reinvestment4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Reinvestment4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}FinancialInstrument87"/>
 *         <element name="ReqdNAVCcy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="RinvstmtPctg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PercentageRate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reinvestment4", propOrder = {
    "finInstrmDtls",
    "reqdNAVCcy",
    "rinvstmtPctg"
})
public class Reinvestment4 {

    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument87 finInstrmDtls;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "RinvstmtPctg", required = true)
    protected BigDecimal rinvstmtPctg;

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument87 }
     *     
     */
    public FinancialInstrument87 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument87 }
     *     
     */
    public void setFinInstrmDtls(FinancialInstrument87 value) {
        this.finInstrmDtls = value;
    }

    /**
     * Gets the value of the reqdNAVCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdNAVCcy() {
        return reqdNAVCcy;
    }

    /**
     * Sets the value of the reqdNAVCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
    }

    /**
     * Gets the value of the rinvstmtPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRinvstmtPctg() {
        return rinvstmtPctg;
    }

    /**
     * Sets the value of the rinvstmtPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRinvstmtPctg(BigDecimal value) {
        this.rinvstmtPctg = value;
    }

}
