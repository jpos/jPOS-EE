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

package org.jpos.iso20022.reda_034_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAuditTrailReport4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesAuditTrailReport4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesAudtTrlOrErr" type="{urn:iso:std:iso:20022:tech:xsd:reda.034.001.01}AuditTrailOrBusinessError6Choice"/>
 *         <element name="DtPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.034.001.01}DatePeriodSearch1Choice" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:reda.034.001.01}SecurityIdentification39"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAuditTrailReport4", propOrder = {
    "sctiesAudtTrlOrErr",
    "dtPrd",
    "finInstrmId"
})
public class SecuritiesAuditTrailReport4 {

    @XmlElement(name = "SctiesAudtTrlOrErr", required = true)
    protected AuditTrailOrBusinessError6Choice sctiesAudtTrlOrErr;
    @XmlElement(name = "DtPrd")
    protected DatePeriodSearch1Choice dtPrd;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification39 finInstrmId;

    /**
     * Gets the value of the sctiesAudtTrlOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTrailOrBusinessError6Choice }
     *     
     */
    public AuditTrailOrBusinessError6Choice getSctiesAudtTrlOrErr() {
        return sctiesAudtTrlOrErr;
    }

    /**
     * Sets the value of the sctiesAudtTrlOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTrailOrBusinessError6Choice }
     *     
     */
    public void setSctiesAudtTrlOrErr(AuditTrailOrBusinessError6Choice value) {
        this.sctiesAudtTrlOrErr = value;
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
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification39 value) {
        this.finInstrmId = value;
    }

}
