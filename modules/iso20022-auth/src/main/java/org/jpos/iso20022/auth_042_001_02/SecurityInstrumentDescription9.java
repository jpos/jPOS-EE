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

package org.jpos.iso20022.auth_042_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityInstrumentDescription9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityInstrumentDescription9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}ISINOct2015Identifier"/>
 *         <element name="FullNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}Max350Text"/>
 *         <element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}CFIOct2015Identifier"/>
 *         <element name="NtnlCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}ActiveOrHistoricCurrencyCode"/>
 *         <element name="CmmdtyDerivInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}TrueFalseIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityInstrumentDescription9", propOrder = {
    "id",
    "fullNm",
    "shrtNm",
    "clssfctnTp",
    "ntnlCcy",
    "cmmdtyDerivInd"
})
public class SecurityInstrumentDescription9 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "FullNm", required = true)
    protected String fullNm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "ClssfctnTp", required = true)
    protected String clssfctnTp;
    @XmlElement(name = "NtnlCcy", required = true)
    protected String ntnlCcy;
    @XmlElement(name = "CmmdtyDerivInd")
    protected boolean cmmdtyDerivInd;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the fullNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNm() {
        return fullNm;
    }

    /**
     * Sets the value of the fullNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNm(String value) {
        this.fullNm = value;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtNm(String value) {
        this.shrtNm = value;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssfctnTp(String value) {
        this.clssfctnTp = value;
    }

    /**
     * Gets the value of the ntnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy() {
        return ntnlCcy;
    }

    /**
     * Sets the value of the ntnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtnlCcy(String value) {
        this.ntnlCcy = value;
    }

    /**
     * Gets the value of the cmmdtyDerivInd property.
     * 
     */
    public boolean isCmmdtyDerivInd() {
        return cmmdtyDerivInd;
    }

    /**
     * Sets the value of the cmmdtyDerivInd property.
     * 
     */
    public void setCmmdtyDerivInd(boolean value) {
        this.cmmdtyDerivInd = value;
    }

}
