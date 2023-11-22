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

package org.jpos.iso20022.camt_021_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralBusinessInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GeneralBusinessInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Qlfr" type="{urn:iso:std:iso:20022:tech:xsd:camt.021.001.06}InformationQualifierType1" minOccurs="0"/>
 *         <element name="Sbjt" type="{urn:iso:std:iso:20022:tech:xsd:camt.021.001.06}Max35Text" minOccurs="0"/>
 *         <element name="SbjtDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.021.001.06}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessInformation1", propOrder = {
    "qlfr",
    "sbjt",
    "sbjtDtls"
})
public class GeneralBusinessInformation1 {

    @XmlElement(name = "Qlfr")
    protected InformationQualifierType1 qlfr;
    @XmlElement(name = "Sbjt")
    protected String sbjt;
    @XmlElement(name = "SbjtDtls")
    protected String sbjtDtls;

    /**
     * Gets the value of the qlfr property.
     * 
     * @return
     *     possible object is
     *     {@link InformationQualifierType1 }
     *     
     */
    public InformationQualifierType1 getQlfr() {
        return qlfr;
    }

    /**
     * Sets the value of the qlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationQualifierType1 }
     *     
     */
    public void setQlfr(InformationQualifierType1 value) {
        this.qlfr = value;
    }

    /**
     * Gets the value of the sbjt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbjt() {
        return sbjt;
    }

    /**
     * Sets the value of the sbjt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbjt(String value) {
        this.sbjt = value;
    }

    /**
     * Gets the value of the sbjtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbjtDtls() {
        return sbjtDtls;
    }

    /**
     * Sets the value of the sbjtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbjtDtls(String value) {
        this.sbjtDtls = value;
    }

}
