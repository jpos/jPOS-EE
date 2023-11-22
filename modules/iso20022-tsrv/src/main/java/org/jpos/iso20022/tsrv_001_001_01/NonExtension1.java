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

package org.jpos.iso20022.tsrv_001_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonExtension1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NonExtension1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtfctnPrd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}Number" minOccurs="0"/>
 *         <element name="NtfctnMtd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}CommunicationMethod1Choice" minOccurs="0"/>
 *         <element name="NtfctnRcptTp" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}PartyType1Choice" minOccurs="0"/>
 *         <element name="NtfctnRcptNm" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}Max140Text" minOccurs="0"/>
 *         <element name="NtfctnRcptAdr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}PostalAddress6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonExtension1", propOrder = {
    "ntfctnPrd",
    "ntfctnMtd",
    "ntfctnRcptTp",
    "ntfctnRcptNm",
    "ntfctnRcptAdr"
})
public class NonExtension1 {

    @XmlElement(name = "NtfctnPrd")
    protected BigDecimal ntfctnPrd;
    @XmlElement(name = "NtfctnMtd")
    protected CommunicationMethod1Choice ntfctnMtd;
    @XmlElement(name = "NtfctnRcptTp")
    protected PartyType1Choice ntfctnRcptTp;
    @XmlElement(name = "NtfctnRcptNm")
    protected String ntfctnRcptNm;
    @XmlElement(name = "NtfctnRcptAdr")
    protected PostalAddress6 ntfctnRcptAdr;

    /**
     * Gets the value of the ntfctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNtfctnPrd() {
        return ntfctnPrd;
    }

    /**
     * Sets the value of the ntfctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNtfctnPrd(BigDecimal value) {
        this.ntfctnPrd = value;
    }

    /**
     * Gets the value of the ntfctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMethod1Choice }
     *     
     */
    public CommunicationMethod1Choice getNtfctnMtd() {
        return ntfctnMtd;
    }

    /**
     * Sets the value of the ntfctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMethod1Choice }
     *     
     */
    public void setNtfctnMtd(CommunicationMethod1Choice value) {
        this.ntfctnMtd = value;
    }

    /**
     * Gets the value of the ntfctnRcptTp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType1Choice }
     *     
     */
    public PartyType1Choice getNtfctnRcptTp() {
        return ntfctnRcptTp;
    }

    /**
     * Sets the value of the ntfctnRcptTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType1Choice }
     *     
     */
    public void setNtfctnRcptTp(PartyType1Choice value) {
        this.ntfctnRcptTp = value;
    }

    /**
     * Gets the value of the ntfctnRcptNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnRcptNm() {
        return ntfctnRcptNm;
    }

    /**
     * Sets the value of the ntfctnRcptNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtfctnRcptNm(String value) {
        this.ntfctnRcptNm = value;
    }

    /**
     * Gets the value of the ntfctnRcptAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getNtfctnRcptAdr() {
        return ntfctnRcptAdr;
    }

    /**
     * Sets the value of the ntfctnRcptAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public void setNtfctnRcptAdr(PostalAddress6 value) {
        this.ntfctnRcptAdr = value;
    }

}
