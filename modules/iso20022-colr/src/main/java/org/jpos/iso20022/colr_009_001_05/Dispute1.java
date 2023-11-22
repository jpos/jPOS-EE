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

package org.jpos.iso20022.colr_009_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dispute1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Dispute1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MrgnCallReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.009.001.05}Max35Text"/>
 *         <element name="DsptdAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.009.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="DsptDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.009.001.05}ISODate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dispute1", propOrder = {
    "mrgnCallReqId",
    "dsptdAmt",
    "dsptDt"
})
public class Dispute1 {

    @XmlElement(name = "MrgnCallReqId", required = true)
    protected String mrgnCallReqId;
    @XmlElement(name = "DsptdAmt", required = true)
    protected ActiveCurrencyAndAmount dsptdAmt;
    @XmlElement(name = "DsptDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dsptDt;

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
     * Gets the value of the dsptdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDsptdAmt() {
        return dsptdAmt;
    }

    /**
     * Sets the value of the dsptdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDsptdAmt(ActiveCurrencyAndAmount value) {
        this.dsptdAmt = value;
    }

    /**
     * Gets the value of the dsptDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDsptDt() {
        return dsptDt;
    }

    /**
     * Sets the value of the dsptDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDsptDt(XMLGregorianCalendar value) {
        this.dsptDt = value;
    }

}
