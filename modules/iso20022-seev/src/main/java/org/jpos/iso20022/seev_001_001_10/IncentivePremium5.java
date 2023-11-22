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

package org.jpos.iso20022.seev_001_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncentivePremium5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IncentivePremium5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max350Text" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PriceRateOrAmount3Choice"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}IncentivePremiumType2Choice"/>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat3Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentivePremium5", propOrder = {
    "desc",
    "amt",
    "tp",
    "pmtDt"
})
public class IncentivePremium5 {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Amt", required = true)
    protected PriceRateOrAmount3Choice amt;
    @XmlElement(name = "Tp", required = true)
    protected IncentivePremiumType2Choice tp;
    @XmlElement(name = "PmtDt")
    protected DateFormat3Choice pmtDt;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public PriceRateOrAmount3Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public void setAmt(PriceRateOrAmount3Choice value) {
        this.amt = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link IncentivePremiumType2Choice }
     *     
     */
    public IncentivePremiumType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentivePremiumType2Choice }
     *     
     */
    public void setTp(IncentivePremiumType2Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat3Choice }
     *     
     */
    public DateFormat3Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat3Choice }
     *     
     */
    public void setPmtDt(DateFormat3Choice value) {
        this.pmtDt = value;
    }

}
