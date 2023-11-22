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

package org.jpos.iso20022.caad_006_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialReconciliation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialReconciliation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RcncltnImpct" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}ReconciliationImpact1Code"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}ReconciliationCategory1Code"/>
 *         <element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}ImpliedCurrencyAndAmount"/>
 *         <element name="Cnt" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}Number"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialReconciliation2", propOrder = {
    "rcncltnImpct",
    "tp",
    "othrTp",
    "amt",
    "cnt"
})
public class FinancialReconciliation2 {

    @XmlElement(name = "RcncltnImpct", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationImpact1Code rcncltnImpct;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationCategory1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Cnt", required = true)
    protected BigDecimal cnt;

    /**
     * Gets the value of the rcncltnImpct property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationImpact1Code }
     *     
     */
    public ReconciliationImpact1Code getRcncltnImpct() {
        return rcncltnImpct;
    }

    /**
     * Sets the value of the rcncltnImpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationImpact1Code }
     *     
     */
    public void setRcncltnImpct(ReconciliationImpact1Code value) {
        this.rcncltnImpct = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationCategory1Code }
     *     
     */
    public ReconciliationCategory1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationCategory1Code }
     *     
     */
    public void setTp(ReconciliationCategory1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the cnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCnt() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCnt(BigDecimal value) {
        this.cnt = value;
    }

}
