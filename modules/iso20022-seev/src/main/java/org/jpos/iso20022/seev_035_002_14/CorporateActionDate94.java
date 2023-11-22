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
 * <p>Java class for CorporateActionDate94 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionDate94">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}DateFormat41Choice"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}DateFormat64Choice" minOccurs="0"/>
 *         <element name="FXRateFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}DateFormat49Choice" minOccurs="0"/>
 *         <element name="EarlstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}DateFormat41Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate94", propOrder = {
    "pmtDt",
    "valDt",
    "fxRateFxgDt",
    "earlstPmtDt"
})
public class CorporateActionDate94 {

    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat41Choice pmtDt;
    @XmlElement(name = "ValDt")
    protected DateFormat64Choice valDt;
    @XmlElement(name = "FXRateFxgDt")
    protected DateFormat49Choice fxRateFxgDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat41Choice earlstPmtDt;

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
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat64Choice }
     *     
     */
    public DateFormat64Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat64Choice }
     *     
     */
    public void setValDt(DateFormat64Choice value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the fxRateFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getFXRateFxgDt() {
        return fxRateFxgDt;
    }

    /**
     * Sets the value of the fxRateFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public void setFXRateFxgDt(DateFormat49Choice value) {
        this.fxRateFxgDt = value;
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

}
