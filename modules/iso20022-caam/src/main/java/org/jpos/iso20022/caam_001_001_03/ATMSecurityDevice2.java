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

package org.jpos.iso20022.caam_001_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSecurityDevice2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMSecurityDevice2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DvcPrprty" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMEquipment2" minOccurs="0"/>
 *         <element name="CurCfgtn" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMSecurityConfiguration1"/>
 *         <element name="SpprtdCfgtn" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMSecurityConfiguration1" minOccurs="0"/>
 *         <element name="CurSts" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMStatus2Code"/>
 *         <element name="Incdnt" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}FailureReason5Code" minOccurs="0"/>
 *         <element name="BndgStat" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}TR34Status1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityDevice2", propOrder = {
    "dvcPrprty",
    "curCfgtn",
    "spprtdCfgtn",
    "curSts",
    "incdnt",
    "bndgStat"
})
public class ATMSecurityDevice2 {

    @XmlElement(name = "DvcPrprty")
    protected ATMEquipment2 dvcPrprty;
    @XmlElement(name = "CurCfgtn", required = true)
    protected ATMSecurityConfiguration1 curCfgtn;
    @XmlElement(name = "SpprtdCfgtn")
    protected ATMSecurityConfiguration1 spprtdCfgtn;
    @XmlElement(name = "CurSts", required = true)
    @XmlSchemaType(name = "string")
    protected ATMStatus2Code curSts;
    @XmlElement(name = "Incdnt")
    @XmlSchemaType(name = "string")
    protected FailureReason5Code incdnt;
    @XmlElement(name = "BndgStat")
    @XmlSchemaType(name = "string")
    protected TR34Status1Code bndgStat;

    /**
     * Gets the value of the dvcPrprty property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEquipment2 }
     *     
     */
    public ATMEquipment2 getDvcPrprty() {
        return dvcPrprty;
    }

    /**
     * Sets the value of the dvcPrprty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEquipment2 }
     *     
     */
    public void setDvcPrprty(ATMEquipment2 value) {
        this.dvcPrprty = value;
    }

    /**
     * Gets the value of the curCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public ATMSecurityConfiguration1 getCurCfgtn() {
        return curCfgtn;
    }

    /**
     * Sets the value of the curCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public void setCurCfgtn(ATMSecurityConfiguration1 value) {
        this.curCfgtn = value;
    }

    /**
     * Gets the value of the spprtdCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public ATMSecurityConfiguration1 getSpprtdCfgtn() {
        return spprtdCfgtn;
    }

    /**
     * Sets the value of the spprtdCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public void setSpprtdCfgtn(ATMSecurityConfiguration1 value) {
        this.spprtdCfgtn = value;
    }

    /**
     * Gets the value of the curSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus2Code }
     *     
     */
    public ATMStatus2Code getCurSts() {
        return curSts;
    }

    /**
     * Sets the value of the curSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus2Code }
     *     
     */
    public void setCurSts(ATMStatus2Code value) {
        this.curSts = value;
    }

    /**
     * Gets the value of the incdnt property.
     * 
     * @return
     *     possible object is
     *     {@link FailureReason5Code }
     *     
     */
    public FailureReason5Code getIncdnt() {
        return incdnt;
    }

    /**
     * Sets the value of the incdnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureReason5Code }
     *     
     */
    public void setIncdnt(FailureReason5Code value) {
        this.incdnt = value;
    }

    /**
     * Gets the value of the bndgStat property.
     * 
     * @return
     *     possible object is
     *     {@link TR34Status1Code }
     *     
     */
    public TR34Status1Code getBndgStat() {
        return bndgStat;
    }

    /**
     * Sets the value of the bndgStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TR34Status1Code }
     *     
     */
    public void setBndgStat(TR34Status1Code value) {
        this.bndgStat = value;
    }

}
