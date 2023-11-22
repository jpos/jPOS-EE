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

package org.jpos.iso20022.auth_101_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementSystemIdentification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesSettlementSystemIdentification2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysId" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}Max35Text"/>
 *         <element name="SysNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}Max140Text" minOccurs="0"/>
 *         <element name="CtryOfJursdctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}CountryCode" minOccurs="0"/>
 *         <element name="CSDLglNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}Max140Text" minOccurs="0"/>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}LEIIdentifier" minOccurs="0"/>
 *         <element name="RspnsblPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}Contact9" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementSystemIdentification2", propOrder = {
    "sysId",
    "sysNm",
    "ctryOfJursdctn",
    "csdLglNm",
    "lei",
    "rspnsblPty"
})
public class SecuritiesSettlementSystemIdentification2 {

    @XmlElement(name = "SysId", required = true)
    protected String sysId;
    @XmlElement(name = "SysNm")
    protected String sysNm;
    @XmlElement(name = "CtryOfJursdctn")
    protected String ctryOfJursdctn;
    @XmlElement(name = "CSDLglNm")
    protected String csdLglNm;
    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "RspnsblPty")
    protected List<Contact9> rspnsblPty;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysId(String value) {
        this.sysId = value;
    }

    /**
     * Gets the value of the sysNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysNm() {
        return sysNm;
    }

    /**
     * Sets the value of the sysNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysNm(String value) {
        this.sysNm = value;
    }

    /**
     * Gets the value of the ctryOfJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfJursdctn() {
        return ctryOfJursdctn;
    }

    /**
     * Sets the value of the ctryOfJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfJursdctn(String value) {
        this.ctryOfJursdctn = value;
    }

    /**
     * Gets the value of the csdLglNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSDLglNm() {
        return csdLglNm;
    }

    /**
     * Sets the value of the csdLglNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSDLglNm(String value) {
        this.csdLglNm = value;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Gets the value of the rspnsblPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rspnsblPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspnsblPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact9 }
     * 
     * 
     * @return
     *     The value of the rspnsblPty property.
     */
    public List<Contact9> getRspnsblPty() {
        if (rspnsblPty == null) {
            rspnsblPty = new ArrayList<>();
        }
        return this.rspnsblPty;
    }

}
