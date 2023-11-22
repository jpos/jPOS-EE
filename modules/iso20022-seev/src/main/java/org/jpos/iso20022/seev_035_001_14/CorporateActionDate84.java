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

package org.jpos.iso20022.seev_035_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionDate84 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionDate84">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat30Choice"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat57Choice" minOccurs="0"/>
 *         <element name="FXRateFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat43Choice" minOccurs="0"/>
 *         <element name="EarlstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat30Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate84", propOrder = {
    "pmtDt",
    "valDt",
    "fxRateFxgDt",
    "earlstPmtDt"
})
public class CorporateActionDate84 {

    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat30Choice pmtDt;
    @XmlElement(name = "ValDt")
    protected DateFormat57Choice valDt;
    @XmlElement(name = "FXRateFxgDt")
    protected DateFormat43Choice fxRateFxgDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat30Choice earlstPmtDt;

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
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat57Choice }
     *     
     */
    public DateFormat57Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat57Choice }
     *     
     */
    public void setValDt(DateFormat57Choice value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the fxRateFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getFXRateFxgDt() {
        return fxRateFxgDt;
    }

    /**
     * Sets the value of the fxRateFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setFXRateFxgDt(DateFormat43Choice value) {
        this.fxRateFxgDt = value;
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

}
