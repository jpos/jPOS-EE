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
 * <p>Java class for ProductClassification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProductClassification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AsstClss" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}Max35Text"/>
 *         <element name="BasePdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SubPdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SubCmmdty" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductClassification1", propOrder = {
    "asstClss",
    "basePdct",
    "subPdct",
    "subCmmdty",
    "txTp"
})
public class ProductClassification1 {

    @XmlElement(name = "AsstClss", required = true)
    protected String asstClss;
    @XmlElement(name = "BasePdct")
    protected String basePdct;
    @XmlElement(name = "SubPdct")
    protected String subPdct;
    @XmlElement(name = "SubCmmdty")
    protected String subCmmdty;
    @XmlElement(name = "TxTp")
    protected String txTp;

    /**
     * Gets the value of the asstClss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsstClss() {
        return asstClss;
    }

    /**
     * Sets the value of the asstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsstClss(String value) {
        this.asstClss = value;
    }

    /**
     * Gets the value of the basePdct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePdct() {
        return basePdct;
    }

    /**
     * Sets the value of the basePdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePdct(String value) {
        this.basePdct = value;
    }

    /**
     * Gets the value of the subPdct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPdct() {
        return subPdct;
    }

    /**
     * Sets the value of the subPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPdct(String value) {
        this.subPdct = value;
    }

    /**
     * Gets the value of the subCmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCmmdty() {
        return subCmmdty;
    }

    /**
     * Sets the value of the subCmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCmmdty(String value) {
        this.subCmmdty = value;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTp(String value) {
        this.txTp = value;
    }

}
