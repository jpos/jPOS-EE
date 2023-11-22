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

package org.jpos.iso20022.sese_036_002_08;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTradeDetails103 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTradeDetails103">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="OpngSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}DateAndDateTime2Choice"/>
 *         <element name="NbOfDaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}Max3Number" minOccurs="0"/>
 *         <element name="InstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}RestrictedFINXMax350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeDetails103", propOrder = {
    "tradDt",
    "opngSttlmDt",
    "nbOfDaysAcrd",
    "instrPrcgAddtlDtls"
})
public class SecuritiesTradeDetails103 {

    @XmlElement(name = "TradDt")
    protected DateAndDateTime2Choice tradDt;
    @XmlElement(name = "OpngSttlmDt", required = true)
    protected DateAndDateTime2Choice opngSttlmDt;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "InstrPrcgAddtlDtls")
    protected String instrPrcgAddtlDtls;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setTradDt(DateAndDateTime2Choice value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the opngSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getOpngSttlmDt() {
        return opngSttlmDt;
    }

    /**
     * Sets the value of the opngSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setOpngSttlmDt(DateAndDateTime2Choice value) {
        this.opngSttlmDt = value;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
    }

    /**
     * Gets the value of the instrPrcgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrPrcgAddtlDtls() {
        return instrPrcgAddtlDtls;
    }

    /**
     * Sets the value of the instrPrcgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrPrcgAddtlDtls(String value) {
        this.instrPrcgAddtlDtls = value;
    }

}
