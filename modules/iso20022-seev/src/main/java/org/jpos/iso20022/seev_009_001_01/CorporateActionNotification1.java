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
 * <p>Java class for CorporateActionNotification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionNotification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AnncmntDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="FrthrDtldAnncmntDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="OffclAnncmntPblctnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ProcessingStatus1FormatChoice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNotification1", propOrder = {
    "anncmntDt",
    "frthrDtldAnncmntDt",
    "offclAnncmntPblctnDt",
    "prcgSts"
})
public class CorporateActionNotification1 {

    @XmlElement(name = "AnncmntDt")
    protected DateFormat4Choice anncmntDt;
    @XmlElement(name = "FrthrDtldAnncmntDt")
    protected DateFormat4Choice frthrDtldAnncmntDt;
    @XmlElement(name = "OffclAnncmntPblctnDt")
    protected DateFormat4Choice offclAnncmntPblctnDt;
    @XmlElement(name = "PrcgSts", required = true)
    protected ProcessingStatus1FormatChoice prcgSts;

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setAnncmntDt(DateFormat4Choice value) {
        this.anncmntDt = value;
    }

    /**
     * Gets the value of the frthrDtldAnncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getFrthrDtldAnncmntDt() {
        return frthrDtldAnncmntDt;
    }

    /**
     * Sets the value of the frthrDtldAnncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setFrthrDtldAnncmntDt(DateFormat4Choice value) {
        this.frthrDtldAnncmntDt = value;
    }

    /**
     * Gets the value of the offclAnncmntPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getOffclAnncmntPblctnDt() {
        return offclAnncmntPblctnDt;
    }

    /**
     * Sets the value of the offclAnncmntPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setOffclAnncmntPblctnDt(DateFormat4Choice value) {
        this.offclAnncmntPblctnDt = value;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus1FormatChoice }
     *     
     */
    public ProcessingStatus1FormatChoice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus1FormatChoice }
     *     
     */
    public void setPrcgSts(ProcessingStatus1FormatChoice value) {
        this.prcgSts = value;
    }

}
