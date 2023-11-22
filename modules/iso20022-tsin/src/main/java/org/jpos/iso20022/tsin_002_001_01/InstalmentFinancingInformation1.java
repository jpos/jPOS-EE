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

package org.jpos.iso20022.tsin_002_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalmentFinancingInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstalmentFinancingInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstlmtSeqId" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}Max70Text"/>
 *         <element name="InstlmtTtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="InstlmtFincgRslt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}FinancingResult1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalmentFinancingInformation1", propOrder = {
    "instlmtSeqId",
    "instlmtTtlAmt",
    "instlmtFincgRslt"
})
public class InstalmentFinancingInformation1 {

    @XmlElement(name = "InstlmtSeqId", required = true)
    protected String instlmtSeqId;
    @XmlElement(name = "InstlmtTtlAmt", required = true)
    protected ActiveCurrencyAndAmount instlmtTtlAmt;
    @XmlElement(name = "InstlmtFincgRslt", required = true)
    protected FinancingResult1 instlmtFincgRslt;

    /**
     * Gets the value of the instlmtSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstlmtSeqId() {
        return instlmtSeqId;
    }

    /**
     * Sets the value of the instlmtSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstlmtSeqId(String value) {
        this.instlmtSeqId = value;
    }

    /**
     * Gets the value of the instlmtTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInstlmtTtlAmt() {
        return instlmtTtlAmt;
    }

    /**
     * Sets the value of the instlmtTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setInstlmtTtlAmt(ActiveCurrencyAndAmount value) {
        this.instlmtTtlAmt = value;
    }

    /**
     * Gets the value of the instlmtFincgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingResult1 }
     *     
     */
    public FinancingResult1 getInstlmtFincgRslt() {
        return instlmtFincgRslt;
    }

    /**
     * Sets the value of the instlmtFincgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingResult1 }
     *     
     */
    public void setInstlmtFincgRslt(FinancingResult1 value) {
        this.instlmtFincgRslt = value;
    }

}
