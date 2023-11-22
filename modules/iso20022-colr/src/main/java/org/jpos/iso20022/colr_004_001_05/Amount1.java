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

package org.jpos.iso20022.colr_004_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Amount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgrdAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="MrgnCallReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}Max35Text"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}Max210Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount1", propOrder = {
    "agrdAmt",
    "mrgnCallReqId",
    "addtlInf"
})
public class Amount1 {

    @XmlElement(name = "AgrdAmt", required = true)
    protected ActiveCurrencyAndAmount agrdAmt;
    @XmlElement(name = "MrgnCallReqId", required = true)
    protected String mrgnCallReqId;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the agrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAgrdAmt() {
        return agrdAmt;
    }

    /**
     * Sets the value of the agrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAgrdAmt(ActiveCurrencyAndAmount value) {
        this.agrdAmt = value;
    }

    /**
     * Gets the value of the mrgnCallReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrgnCallReqId() {
        return mrgnCallReqId;
    }

    /**
     * Sets the value of the mrgnCallReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrgnCallReqId(String value) {
        this.mrgnCallReqId = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
