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

package org.jpos.iso20022.colr_023_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralParameters13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralParameters13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollInstrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}CollateralTransactionType1Choice"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ExposureType23Choice"/>
 *         <element name="CollSd" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}CollateralRole1Code"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}GenericIdentification30" minOccurs="0"/>
 *         <element name="AutomtcAllcn" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="CollApprvd" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="SttlmApprvd" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="CollAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}CollateralAmount5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParameters13", propOrder = {
    "collInstrTp",
    "xpsrTp",
    "collSd",
    "prty",
    "automtcAllcn",
    "collApprvd",
    "sttlmApprvd",
    "collAmt"
})
public class CollateralParameters13 {

    @XmlElement(name = "CollInstrTp", required = true)
    protected CollateralTransactionType1Choice collInstrTp;
    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "Prty")
    protected GenericIdentification30 prty;
    @XmlElement(name = "AutomtcAllcn")
    protected Boolean automtcAllcn;
    @XmlElement(name = "CollApprvd")
    protected Boolean collApprvd;
    @XmlElement(name = "SttlmApprvd")
    protected Boolean sttlmApprvd;
    @XmlElement(name = "CollAmt")
    protected CollateralAmount5 collAmt;

    /**
     * Gets the value of the collInstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public CollateralTransactionType1Choice getCollInstrTp() {
        return collInstrTp;
    }

    /**
     * Sets the value of the collInstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public void setCollInstrTp(CollateralTransactionType1Choice value) {
        this.collInstrTp = value;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType23Choice }
     *     
     */
    public ExposureType23Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType23Choice }
     *     
     */
    public void setXpsrTp(ExposureType23Choice value) {
        this.xpsrTp = value;
    }

    /**
     * Gets the value of the collSd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Sets the value of the collSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public void setCollSd(CollateralRole1Code value) {
        this.collSd = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setPrty(GenericIdentification30 value) {
        this.prty = value;
    }

    /**
     * Gets the value of the automtcAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomtcAllcn() {
        return automtcAllcn;
    }

    /**
     * Sets the value of the automtcAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomtcAllcn(Boolean value) {
        this.automtcAllcn = value;
    }

    /**
     * Gets the value of the collApprvd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollApprvd() {
        return collApprvd;
    }

    /**
     * Sets the value of the collApprvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollApprvd(Boolean value) {
        this.collApprvd = value;
    }

    /**
     * Gets the value of the sttlmApprvd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSttlmApprvd() {
        return sttlmApprvd;
    }

    /**
     * Sets the value of the sttlmApprvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSttlmApprvd(Boolean value) {
        this.sttlmApprvd = value;
    }

    /**
     * Gets the value of the collAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount5 }
     *     
     */
    public CollateralAmount5 getCollAmt() {
        return collAmt;
    }

    /**
     * Sets the value of the collAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount5 }
     *     
     */
    public void setCollAmt(CollateralAmount5 value) {
        this.collAmt = value;
    }

}
