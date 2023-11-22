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

package org.jpos.iso20022.auth_063_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiquidResourceInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LiquidResourceInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CntrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}Max35Text" minOccurs="0"/>
 *         <element name="LqdRsrcVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}AmountAndDirection102"/>
 *         <element name="MktVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}AmountAndDirection102" minOccurs="0"/>
 *         <element name="Scrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}TrueFalseIndicator"/>
 *         <element name="AsstNcmbrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}TrueFalseIndicator"/>
 *         <element name="QlfygRsrc" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}TrueFalseIndicator"/>
 *         <element name="AgcyArrgmnts" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}TrueFalseIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidResourceInformation1", propOrder = {
    "cntrPtyId",
    "lqdRsrcVal",
    "mktVal",
    "scrd",
    "asstNcmbrd",
    "qlfygRsrc",
    "agcyArrgmnts"
})
public class LiquidResourceInformation1 {

    @XmlElement(name = "CntrPtyId")
    protected String cntrPtyId;
    @XmlElement(name = "LqdRsrcVal", required = true)
    protected AmountAndDirection102 lqdRsrcVal;
    @XmlElement(name = "MktVal")
    protected AmountAndDirection102 mktVal;
    @XmlElement(name = "Scrd")
    protected boolean scrd;
    @XmlElement(name = "AsstNcmbrd")
    protected boolean asstNcmbrd;
    @XmlElement(name = "QlfygRsrc")
    protected boolean qlfygRsrc;
    @XmlElement(name = "AgcyArrgmnts")
    protected boolean agcyArrgmnts;

    /**
     * Gets the value of the cntrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrPtyId() {
        return cntrPtyId;
    }

    /**
     * Sets the value of the cntrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrPtyId(String value) {
        this.cntrPtyId = value;
    }

    /**
     * Gets the value of the lqdRsrcVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getLqdRsrcVal() {
        return lqdRsrcVal;
    }

    /**
     * Sets the value of the lqdRsrcVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setLqdRsrcVal(AmountAndDirection102 value) {
        this.lqdRsrcVal = value;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setMktVal(AmountAndDirection102 value) {
        this.mktVal = value;
    }

    /**
     * Gets the value of the scrd property.
     * 
     */
    public boolean isScrd() {
        return scrd;
    }

    /**
     * Sets the value of the scrd property.
     * 
     */
    public void setScrd(boolean value) {
        this.scrd = value;
    }

    /**
     * Gets the value of the asstNcmbrd property.
     * 
     */
    public boolean isAsstNcmbrd() {
        return asstNcmbrd;
    }

    /**
     * Sets the value of the asstNcmbrd property.
     * 
     */
    public void setAsstNcmbrd(boolean value) {
        this.asstNcmbrd = value;
    }

    /**
     * Gets the value of the qlfygRsrc property.
     * 
     */
    public boolean isQlfygRsrc() {
        return qlfygRsrc;
    }

    /**
     * Sets the value of the qlfygRsrc property.
     * 
     */
    public void setQlfygRsrc(boolean value) {
        this.qlfygRsrc = value;
    }

    /**
     * Gets the value of the agcyArrgmnts property.
     * 
     */
    public boolean isAgcyArrgmnts() {
        return agcyArrgmnts;
    }

    /**
     * Sets the value of the agcyArrgmnts property.
     * 
     */
    public void setAgcyArrgmnts(boolean value) {
        this.agcyArrgmnts = value;
    }

}
