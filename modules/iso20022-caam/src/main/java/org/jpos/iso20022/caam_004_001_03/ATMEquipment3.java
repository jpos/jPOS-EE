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

package org.jpos.iso20022.caam_004_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMEquipment3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMEquipment3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Manfctr" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Mdl" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max35Text" minOccurs="0"/>
 *         <element name="SrlNb" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max35Text" minOccurs="0"/>
 *         <element name="SgndSrlNb" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}ContentInformationType14" minOccurs="0"/>
 *         <element name="FrmwrPrvdr" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max35Text" minOccurs="0"/>
 *         <element name="FrmwrId" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max35Text" minOccurs="0"/>
 *         <element name="FrmwrVrsn" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMEquipment3", propOrder = {
    "manfctr",
    "mdl",
    "vrsn",
    "srlNb",
    "sgndSrlNb",
    "frmwrPrvdr",
    "frmwrId",
    "frmwrVrsn"
})
public class ATMEquipment3 {

    @XmlElement(name = "Manfctr")
    protected String manfctr;
    @XmlElement(name = "Mdl")
    protected String mdl;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "SgndSrlNb")
    protected ContentInformationType14 sgndSrlNb;
    @XmlElement(name = "FrmwrPrvdr")
    protected String frmwrPrvdr;
    @XmlElement(name = "FrmwrId")
    protected String frmwrId;
    @XmlElement(name = "FrmwrVrsn")
    protected String frmwrVrsn;

    /**
     * Gets the value of the manfctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctr() {
        return manfctr;
    }

    /**
     * Sets the value of the manfctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManfctr(String value) {
        this.manfctr = value;
    }

    /**
     * Gets the value of the mdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdl() {
        return mdl;
    }

    /**
     * Sets the value of the mdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdl(String value) {
        this.mdl = value;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrlNb(String value) {
        this.srlNb = value;
    }

    /**
     * Gets the value of the sgndSrlNb property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType14 }
     *     
     */
    public ContentInformationType14 getSgndSrlNb() {
        return sgndSrlNb;
    }

    /**
     * Sets the value of the sgndSrlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType14 }
     *     
     */
    public void setSgndSrlNb(ContentInformationType14 value) {
        this.sgndSrlNb = value;
    }

    /**
     * Gets the value of the frmwrPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmwrPrvdr() {
        return frmwrPrvdr;
    }

    /**
     * Sets the value of the frmwrPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmwrPrvdr(String value) {
        this.frmwrPrvdr = value;
    }

    /**
     * Gets the value of the frmwrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmwrId() {
        return frmwrId;
    }

    /**
     * Sets the value of the frmwrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmwrId(String value) {
        this.frmwrId = value;
    }

    /**
     * Gets the value of the frmwrVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmwrVrsn() {
        return frmwrVrsn;
    }

    /**
     * Sets the value of the frmwrVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmwrVrsn(String value) {
        this.frmwrVrsn = value;
    }

}
