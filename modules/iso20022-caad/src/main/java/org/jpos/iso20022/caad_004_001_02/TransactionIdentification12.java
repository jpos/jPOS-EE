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

package org.jpos.iso20022.caad_004_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionIdentification12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionIdentification12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysTracAudtNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max12NumericText"/>
 *         <element name="TrnsmssnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}ISODateTime"/>
 *         <element name="RtrvlRefNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Exact12Text" minOccurs="0"/>
 *         <element name="LifeCyclTracIdData" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}TransactionLifeCycleIdentification2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentification12", propOrder = {
    "sysTracAudtNb",
    "trnsmssnDtTm",
    "rtrvlRefNb",
    "lifeCyclTracIdData"
})
public class TransactionIdentification12 {

    @XmlElement(name = "SysTracAudtNb", required = true)
    protected String sysTracAudtNb;
    @XmlElement(name = "TrnsmssnDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trnsmssnDtTm;
    @XmlElement(name = "RtrvlRefNb")
    protected String rtrvlRefNb;
    @XmlElement(name = "LifeCyclTracIdData")
    protected TransactionLifeCycleIdentification2 lifeCyclTracIdData;

    /**
     * Gets the value of the sysTracAudtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysTracAudtNb() {
        return sysTracAudtNb;
    }

    /**
     * Sets the value of the sysTracAudtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysTracAudtNb(String value) {
        this.sysTracAudtNb = value;
    }

    /**
     * Gets the value of the trnsmssnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrnsmssnDtTm() {
        return trnsmssnDtTm;
    }

    /**
     * Sets the value of the trnsmssnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrnsmssnDtTm(XMLGregorianCalendar value) {
        this.trnsmssnDtTm = value;
    }

    /**
     * Gets the value of the rtrvlRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrvlRefNb() {
        return rtrvlRefNb;
    }

    /**
     * Sets the value of the rtrvlRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtrvlRefNb(String value) {
        this.rtrvlRefNb = value;
    }

    /**
     * Gets the value of the lifeCyclTracIdData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLifeCycleIdentification2 }
     *     
     */
    public TransactionLifeCycleIdentification2 getLifeCyclTracIdData() {
        return lifeCyclTracIdData;
    }

    /**
     * Sets the value of the lifeCyclTracIdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLifeCycleIdentification2 }
     *     
     */
    public void setLifeCyclTracIdData(TransactionLifeCycleIdentification2 value) {
        this.lifeCyclTracIdData = value;
    }

}
