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

package org.jpos.iso20022.caad_009_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferService2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransferService2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SvcPrvdr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SvcNm" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="BizPurp" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max500Text" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferService2", propOrder = {
    "svcPrvdr",
    "svcNm",
    "ref",
    "bizPurp",
    "desc"
})
public class TransferService2 {

    @XmlElement(name = "SvcPrvdr")
    protected String svcPrvdr;
    @XmlElement(name = "SvcNm")
    protected String svcNm;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "BizPurp")
    protected String bizPurp;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the svcPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcPrvdr() {
        return svcPrvdr;
    }

    /**
     * Sets the value of the svcPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcPrvdr(String value) {
        this.svcPrvdr = value;
    }

    /**
     * Gets the value of the svcNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcNm() {
        return svcNm;
    }

    /**
     * Sets the value of the svcNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcNm(String value) {
        this.svcNm = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the bizPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizPurp() {
        return bizPurp;
    }

    /**
     * Sets the value of the bizPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizPurp(String value) {
        this.bizPurp = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
