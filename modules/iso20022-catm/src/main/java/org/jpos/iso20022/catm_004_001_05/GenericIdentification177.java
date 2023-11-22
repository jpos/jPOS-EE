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

package org.jpos.iso20022.catm_004_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericIdentification177 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GenericIdentification177">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:catm.004.001.05}Max35Text"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:catm.004.001.05}PartyType33Code" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:catm.004.001.05}PartyType33Code" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:catm.004.001.05}Min2Max3AlphaText" minOccurs="0"/>
 *         <element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:catm.004.001.05}Max35Text" minOccurs="0"/>
 *         <element name="RmotAccs" type="{urn:iso:std:iso:20022:tech:xsd:catm.004.001.05}NetworkParameters7" minOccurs="0"/>
 *         <element name="Glctn" type="{urn:iso:std:iso:20022:tech:xsd:catm.004.001.05}Geolocation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericIdentification177", propOrder = {
    "id",
    "tp",
    "issr",
    "ctry",
    "shrtNm",
    "rmotAccs",
    "glctn"
})
public class GenericIdentification177 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected PartyType33Code tp;
    @XmlElement(name = "Issr")
    @XmlSchemaType(name = "string")
    protected PartyType33Code issr;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "RmotAccs")
    protected NetworkParameters7 rmotAccs;
    @XmlElement(name = "Glctn")
    protected Geolocation1 glctn;

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
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType33Code }
     *     
     */
    public PartyType33Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType33Code }
     *     
     */
    public void setTp(PartyType33Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType33Code }
     *     
     */
    public PartyType33Code getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType33Code }
     *     
     */
    public void setIssr(PartyType33Code value) {
        this.issr = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
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
     * Gets the value of the rmotAccs property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getRmotAccs() {
        return rmotAccs;
    }

    /**
     * Sets the value of the rmotAccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public void setRmotAccs(NetworkParameters7 value) {
        this.rmotAccs = value;
    }

    /**
     * Gets the value of the glctn property.
     * 
     * @return
     *     possible object is
     *     {@link Geolocation1 }
     *     
     */
    public Geolocation1 getGlctn() {
        return glctn;
    }

    /**
     * Sets the value of the glctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geolocation1 }
     *     
     */
    public void setGlctn(Geolocation1 value) {
        this.glctn = value;
    }

}
