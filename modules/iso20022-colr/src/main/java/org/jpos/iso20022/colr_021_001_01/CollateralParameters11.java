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

package org.jpos.iso20022.colr_021_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralParameters11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralParameters11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollInstrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}CollateralTransactionType1Choice"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}ExposureType23Choice"/>
 *         <element name="CollSd" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}CollateralRole1Code"/>
 *         <element name="ValSghtMrgnRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}RateOrType1Choice" minOccurs="0"/>
 *         <element name="ElgbltySetPrfl" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}GenericIdentification1" minOccurs="0"/>
 *         <element name="TrfTitl" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="SttlmPrc" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}GenericIdentification30" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParameters11", propOrder = {
    "collInstrTp",
    "xpsrTp",
    "collSd",
    "valSghtMrgnRate",
    "elgbltySetPrfl",
    "trfTitl",
    "sttlmPrc"
})
public class CollateralParameters11 {

    @XmlElement(name = "CollInstrTp", required = true)
    protected CollateralTransactionType1Choice collInstrTp;
    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "ValSghtMrgnRate")
    protected RateOrType1Choice valSghtMrgnRate;
    @XmlElement(name = "ElgbltySetPrfl")
    protected GenericIdentification1 elgbltySetPrfl;
    @XmlElement(name = "TrfTitl")
    protected Boolean trfTitl;
    @XmlElement(name = "SttlmPrc")
    protected GenericIdentification30 sttlmPrc;

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
     * Gets the value of the valSghtMrgnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrType1Choice }
     *     
     */
    public RateOrType1Choice getValSghtMrgnRate() {
        return valSghtMrgnRate;
    }

    /**
     * Sets the value of the valSghtMrgnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrType1Choice }
     *     
     */
    public void setValSghtMrgnRate(RateOrType1Choice value) {
        this.valSghtMrgnRate = value;
    }

    /**
     * Gets the value of the elgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getElgbltySetPrfl() {
        return elgbltySetPrfl;
    }

    /**
     * Sets the value of the elgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setElgbltySetPrfl(GenericIdentification1 value) {
        this.elgbltySetPrfl = value;
    }

    /**
     * Gets the value of the trfTitl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrfTitl() {
        return trfTitl;
    }

    /**
     * Sets the value of the trfTitl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrfTitl(Boolean value) {
        this.trfTitl = value;
    }

    /**
     * Gets the value of the sttlmPrc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getSttlmPrc() {
        return sttlmPrc;
    }

    /**
     * Sets the value of the sttlmPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setSttlmPrc(GenericIdentification30 value) {
        this.sttlmPrc = value;
    }

}
