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

package org.jpos.iso20022.seev_031_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityDate20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityDate20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice"/>
 *         <element name="AvlblDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="DvddRnkgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="EarlstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="PrpssDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="LastTradgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityDate20", propOrder = {
    "pmtDt",
    "avlblDt",
    "dvddRnkgDt",
    "earlstPmtDt",
    "prpssDt",
    "lastTradgDt"
})
public class SecurityDate20 {

    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat30Choice pmtDt;
    @XmlElement(name = "AvlblDt")
    protected DateFormat30Choice avlblDt;
    @XmlElement(name = "DvddRnkgDt")
    protected DateFormat30Choice dvddRnkgDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat30Choice earlstPmtDt;
    @XmlElement(name = "PrpssDt")
    protected DateFormat30Choice prpssDt;
    @XmlElement(name = "LastTradgDt")
    protected DateFormat30Choice lastTradgDt;

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setPmtDt(DateFormat30Choice value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the avlblDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getAvlblDt() {
        return avlblDt;
    }

    /**
     * Sets the value of the avlblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setAvlblDt(DateFormat30Choice value) {
        this.avlblDt = value;
    }

    /**
     * Gets the value of the dvddRnkgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getDvddRnkgDt() {
        return dvddRnkgDt;
    }

    /**
     * Sets the value of the dvddRnkgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setDvddRnkgDt(DateFormat30Choice value) {
        this.dvddRnkgDt = value;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setEarlstPmtDt(DateFormat30Choice value) {
        this.earlstPmtDt = value;
    }

    /**
     * Gets the value of the prpssDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getPrpssDt() {
        return prpssDt;
    }

    /**
     * Sets the value of the prpssDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setPrpssDt(DateFormat30Choice value) {
        this.prpssDt = value;
    }

    /**
     * Gets the value of the lastTradgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getLastTradgDt() {
        return lastTradgDt;
    }

    /**
     * Sets the value of the lastTradgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setLastTradgDt(DateFormat30Choice value) {
        this.lastTradgDt = value;
    }

}
