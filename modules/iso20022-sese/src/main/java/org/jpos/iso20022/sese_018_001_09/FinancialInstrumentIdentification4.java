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

package org.jpos.iso20022.sese_018_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentIdentification4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentIdentification4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}SecurityIdentification25Choice"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Max350Text" minOccurs="0"/>
 *         <element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Max35Text" minOccurs="0"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ClassificationType32Choice" minOccurs="0"/>
 *         <element name="AltrnSctyTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}GenericIdentification1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentIdentification4", propOrder = {
    "id",
    "nm",
    "shrtNm",
    "clssfctnTp",
    "altrnSctyTp"
})
public class FinancialInstrumentIdentification4 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification25Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType32Choice clssfctnTp;
    @XmlElement(name = "AltrnSctyTp")
    protected GenericIdentification1 altrnSctyTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public SecurityIdentification25Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public void setId(SecurityIdentification25Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
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
     *     {@link ClassificationType32Choice }
     *     
     */
    public ClassificationType32Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public void setClssfctnTp(ClassificationType32Choice value) {
        this.clssfctnTp = value;
    }

    /**
     * Gets the value of the altrnSctyTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getAltrnSctyTp() {
        return altrnSctyTp;
    }

    /**
     * Sets the value of the altrnSctyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setAltrnSctyTp(GenericIdentification1 value) {
        this.altrnSctyTp = value;
    }

}
