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

package org.jpos.iso20022.cain_001_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HiredVehicle2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HiredVehicle2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CpnyTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="CpnyNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max70Text" minOccurs="0"/>
 *         <element name="TpOfVhcl" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="VhclId" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="DrvrId" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="DrvrTaxId" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Destination3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HiredVehicle2", propOrder = {
    "cpnyTp",
    "cpnyNm",
    "tpOfVhcl",
    "vhclId",
    "drvrId",
    "drvrTaxId",
    "dstn"
})
public class HiredVehicle2 {

    @XmlElement(name = "CpnyTp")
    protected String cpnyTp;
    @XmlElement(name = "CpnyNm")
    protected String cpnyNm;
    @XmlElement(name = "TpOfVhcl")
    protected String tpOfVhcl;
    @XmlElement(name = "VhclId")
    protected String vhclId;
    @XmlElement(name = "DrvrId")
    protected String drvrId;
    @XmlElement(name = "DrvrTaxId")
    protected String drvrTaxId;
    @XmlElement(name = "Dstn")
    protected Destination3 dstn;

    /**
     * Gets the value of the cpnyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyTp() {
        return cpnyTp;
    }

    /**
     * Sets the value of the cpnyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnyTp(String value) {
        this.cpnyTp = value;
    }

    /**
     * Gets the value of the cpnyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyNm() {
        return cpnyNm;
    }

    /**
     * Sets the value of the cpnyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnyNm(String value) {
        this.cpnyNm = value;
    }

    /**
     * Gets the value of the tpOfVhcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpOfVhcl() {
        return tpOfVhcl;
    }

    /**
     * Sets the value of the tpOfVhcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpOfVhcl(String value) {
        this.tpOfVhcl = value;
    }

    /**
     * Gets the value of the vhclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclId() {
        return vhclId;
    }

    /**
     * Sets the value of the vhclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhclId(String value) {
        this.vhclId = value;
    }

    /**
     * Gets the value of the drvrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrId() {
        return drvrId;
    }

    /**
     * Sets the value of the drvrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvrId(String value) {
        this.drvrId = value;
    }

    /**
     * Gets the value of the drvrTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrTaxId() {
        return drvrTaxId;
    }

    /**
     * Sets the value of the drvrTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvrTaxId(String value) {
        this.drvrTaxId = value;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link Destination3 }
     *     
     */
    public Destination3 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination3 }
     *     
     */
    public void setDstn(Destination3 value) {
        this.dstn = value;
    }

}
