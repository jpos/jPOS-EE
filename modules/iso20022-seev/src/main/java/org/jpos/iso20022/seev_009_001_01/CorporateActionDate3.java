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

package org.jpos.iso20022.seev_009_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionDate3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionDate3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="AvlblDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="DvddRnkgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="PrpssDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="FrstDealgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="EarlstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate3", propOrder = {
    "pmtDt",
    "avlblDt",
    "dvddRnkgDt",
    "prpssDt",
    "frstDealgDt",
    "earlstPmtDt"
})
public class CorporateActionDate3 {

    @XmlElement(name = "PmtDt")
    protected DateFormat4Choice pmtDt;
    @XmlElement(name = "AvlblDt")
    protected DateFormat4Choice avlblDt;
    @XmlElement(name = "DvddRnkgDt")
    protected DateFormat4Choice dvddRnkgDt;
    @XmlElement(name = "PrpssDt")
    protected DateFormat4Choice prpssDt;
    @XmlElement(name = "FrstDealgDt")
    protected DateFormat4Choice frstDealgDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat4Choice earlstPmtDt;

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setPmtDt(DateFormat4Choice value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the avlblDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getAvlblDt() {
        return avlblDt;
    }

    /**
     * Sets the value of the avlblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setAvlblDt(DateFormat4Choice value) {
        this.avlblDt = value;
    }

    /**
     * Gets the value of the dvddRnkgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getDvddRnkgDt() {
        return dvddRnkgDt;
    }

    /**
     * Sets the value of the dvddRnkgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setDvddRnkgDt(DateFormat4Choice value) {
        this.dvddRnkgDt = value;
    }

    /**
     * Gets the value of the prpssDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getPrpssDt() {
        return prpssDt;
    }

    /**
     * Sets the value of the prpssDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setPrpssDt(DateFormat4Choice value) {
        this.prpssDt = value;
    }

    /**
     * Gets the value of the frstDealgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getFrstDealgDt() {
        return frstDealgDt;
    }

    /**
     * Sets the value of the frstDealgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setFrstDealgDt(DateFormat4Choice value) {
        this.frstDealgDt = value;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setEarlstPmtDt(DateFormat4Choice value) {
        this.earlstPmtDt = value;
    }

}
