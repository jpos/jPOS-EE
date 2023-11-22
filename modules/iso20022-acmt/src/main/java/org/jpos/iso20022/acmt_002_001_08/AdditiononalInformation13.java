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

package org.jpos.iso20022.acmt_002_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditiononalInformation13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditiononalInformation13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Lmttn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max350Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max350Text" minOccurs="0"/>
 *         <element name="AcctVldtn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max350Text" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Rgltr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PartyIdentification125Choice" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}RestrictionStatus1Choice" minOccurs="0"/>
 *         <element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}DateTimePeriod2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditiononalInformation13", propOrder = {
    "lmttn",
    "addtlInf",
    "acctVldtn",
    "tp",
    "rgltr",
    "sts",
    "prd"
})
public class AdditiononalInformation13 {

    @XmlElement(name = "Lmttn")
    protected String lmttn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "AcctVldtn")
    protected String acctVldtn;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Rgltr")
    protected PartyIdentification125Choice rgltr;
    @XmlElement(name = "Sts")
    protected RestrictionStatus1Choice sts;
    @XmlElement(name = "Prd")
    protected DateTimePeriod2 prd;

    /**
     * Gets the value of the lmttn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmttn() {
        return lmttn;
    }

    /**
     * Sets the value of the lmttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLmttn(String value) {
        this.lmttn = value;
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

    /**
     * Gets the value of the acctVldtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctVldtn() {
        return acctVldtn;
    }

    /**
     * Sets the value of the acctVldtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctVldtn(String value) {
        this.acctVldtn = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getRgltr() {
        return rgltr;
    }

    /**
     * Sets the value of the rgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setRgltr(PartyIdentification125Choice value) {
        this.rgltr = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionStatus1Choice }
     *     
     */
    public RestrictionStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionStatus1Choice }
     *     
     */
    public void setSts(RestrictionStatus1Choice value) {
        this.sts = value;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod2 }
     *     
     */
    public DateTimePeriod2 getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod2 }
     *     
     */
    public void setPrd(DateTimePeriod2 value) {
        this.prd = value;
    }

}
