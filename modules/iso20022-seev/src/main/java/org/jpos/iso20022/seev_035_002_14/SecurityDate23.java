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

package org.jpos.iso20022.seev_035_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityDate23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityDate23">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}DateFormat41Choice"/>
 *         <element name="AvlblDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}DateFormat41Choice" minOccurs="0"/>
 *         <element name="DvddRnkgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}DateFormat41Choice" minOccurs="0"/>
 *         <element name="EarlstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}DateFormat41Choice" minOccurs="0"/>
 *         <element name="PrpssDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}DateFormat41Choice" minOccurs="0"/>
 *         <element name="LastTradgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}DateFormat41Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityDate23", propOrder = {
    "pmtDt",
    "avlblDt",
    "dvddRnkgDt",
    "earlstPmtDt",
    "prpssDt",
    "lastTradgDt"
})
public class SecurityDate23 {

    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat41Choice pmtDt;
    @XmlElement(name = "AvlblDt")
    protected DateFormat41Choice avlblDt;
    @XmlElement(name = "DvddRnkgDt")
    protected DateFormat41Choice dvddRnkgDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat41Choice earlstPmtDt;
    @XmlElement(name = "PrpssDt")
    protected DateFormat41Choice prpssDt;
    @XmlElement(name = "LastTradgDt")
    protected DateFormat41Choice lastTradgDt;

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat41Choice }
     *     
     */
    public DateFormat41Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat41Choice }
     *     
     */
    public void setPmtDt(DateFormat41Choice value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the avlblDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat41Choice }
     *     
     */
    public DateFormat41Choice getAvlblDt() {
        return avlblDt;
    }

    /**
     * Sets the value of the avlblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat41Choice }
     *     
     */
    public void setAvlblDt(DateFormat41Choice value) {
        this.avlblDt = value;
    }

    /**
     * Gets the value of the dvddRnkgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat41Choice }
     *     
     */
    public DateFormat41Choice getDvddRnkgDt() {
        return dvddRnkgDt;
    }

    /**
     * Sets the value of the dvddRnkgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat41Choice }
     *     
     */
    public void setDvddRnkgDt(DateFormat41Choice value) {
        this.dvddRnkgDt = value;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat41Choice }
     *     
     */
    public DateFormat41Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat41Choice }
     *     
     */
    public void setEarlstPmtDt(DateFormat41Choice value) {
        this.earlstPmtDt = value;
    }

    /**
     * Gets the value of the prpssDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat41Choice }
     *     
     */
    public DateFormat41Choice getPrpssDt() {
        return prpssDt;
    }

    /**
     * Sets the value of the prpssDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat41Choice }
     *     
     */
    public void setPrpssDt(DateFormat41Choice value) {
        this.prpssDt = value;
    }

    /**
     * Gets the value of the lastTradgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat41Choice }
     *     
     */
    public DateFormat41Choice getLastTradgDt() {
        return lastTradgDt;
    }

    /**
     * Sets the value of the lastTradgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat41Choice }
     *     
     */
    public void setLastTradgDt(DateFormat41Choice value) {
        this.lastTradgDt = value;
    }

}
