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

package org.jpos.iso20022.reda_037_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccountAuditTrailReport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesAccountAuditTrailReport3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesAcctAudtTrlOrErr" type="{urn:iso:std:iso:20022:tech:xsd:reda.037.001.01}AuditTrailOrBusinessError6Choice"/>
 *         <element name="DtPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.037.001.01}DatePeriodSearch1Choice" minOccurs="0"/>
 *         <element name="SctiesAcctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.037.001.01}SecuritiesAccount19"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountAuditTrailReport3", propOrder = {
    "sctiesAcctAudtTrlOrErr",
    "dtPrd",
    "sctiesAcctId"
})
public class SecuritiesAccountAuditTrailReport3 {

    @XmlElement(name = "SctiesAcctAudtTrlOrErr", required = true)
    protected AuditTrailOrBusinessError6Choice sctiesAcctAudtTrlOrErr;
    @XmlElement(name = "DtPrd")
    protected DatePeriodSearch1Choice dtPrd;
    @XmlElement(name = "SctiesAcctId", required = true)
    protected SecuritiesAccount19 sctiesAcctId;

    /**
     * Gets the value of the sctiesAcctAudtTrlOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTrailOrBusinessError6Choice }
     *     
     */
    public AuditTrailOrBusinessError6Choice getSctiesAcctAudtTrlOrErr() {
        return sctiesAcctAudtTrlOrErr;
    }

    /**
     * Sets the value of the sctiesAcctAudtTrlOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTrailOrBusinessError6Choice }
     *     
     */
    public void setSctiesAcctAudtTrlOrErr(AuditTrailOrBusinessError6Choice value) {
        this.sctiesAcctAudtTrlOrErr = value;
    }

    /**
     * Gets the value of the dtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getDtPrd() {
        return dtPrd;
    }

    /**
     * Sets the value of the dtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public void setDtPrd(DatePeriodSearch1Choice value) {
        this.dtPrd = value;
    }

    /**
     * Gets the value of the sctiesAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSctiesAcctId() {
        return sctiesAcctId;
    }

    /**
     * Sets the value of the sctiesAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSctiesAcctId(SecuritiesAccount19 value) {
        this.sctiesAcctId = value;
    }

}
