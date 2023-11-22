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

package org.jpos.iso20022.auth_069_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepurchaseAgreement3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RepurchaseAgreement3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PdctClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}ProductClassification1"/>
 *         <element name="RpAgrmtTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}RepurchaseAgreementType1Choice"/>
 *         <element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}LEIIdentifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepurchaseAgreement3", propOrder = {
    "pdctClssfctn",
    "rpAgrmtTp",
    "trptyAgt"
})
public class RepurchaseAgreement3 {

    @XmlElement(name = "PdctClssfctn", required = true)
    protected ProductClassification1 pdctClssfctn;
    @XmlElement(name = "RpAgrmtTp", required = true)
    protected RepurchaseAgreementType1Choice rpAgrmtTp;
    @XmlElement(name = "TrptyAgt")
    protected String trptyAgt;

    /**
     * Gets the value of the pdctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassification1 }
     *     
     */
    public ProductClassification1 getPdctClssfctn() {
        return pdctClssfctn;
    }

    /**
     * Sets the value of the pdctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassification1 }
     *     
     */
    public void setPdctClssfctn(ProductClassification1 value) {
        this.pdctClssfctn = value;
    }

    /**
     * Gets the value of the rpAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseAgreementType1Choice }
     *     
     */
    public RepurchaseAgreementType1Choice getRpAgrmtTp() {
        return rpAgrmtTp;
    }

    /**
     * Sets the value of the rpAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseAgreementType1Choice }
     *     
     */
    public void setRpAgrmtTp(RepurchaseAgreementType1Choice value) {
        this.rpAgrmtTp = value;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgt(String value) {
        this.trptyAgt = value;
    }

}
