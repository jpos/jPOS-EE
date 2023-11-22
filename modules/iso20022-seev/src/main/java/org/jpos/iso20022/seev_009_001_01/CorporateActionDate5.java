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
 * <p>Java class for CorporateActionDate5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionDate5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FXRateFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DateFormat4Choice" minOccurs="0"/>
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
@XmlType(name = "CorporateActionDate5", propOrder = {
    "fxRateFxgDt",
    "valDt",
    "pmtDt",
    "earlstPmtDt"
})
public class CorporateActionDate5 {

    @XmlElement(name = "FXRateFxgDt")
    protected DateFormat4Choice fxRateFxgDt;
    @XmlElement(name = "ValDt")
    protected DateFormat4Choice valDt;
    @XmlElement(name = "PmtDt")
    protected DateFormat4Choice pmtDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat4Choice earlstPmtDt;

    /**
     * Gets the value of the fxRateFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getFXRateFxgDt() {
        return fxRateFxgDt;
    }

    /**
     * Sets the value of the fxRateFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setFXRateFxgDt(DateFormat4Choice value) {
        this.fxRateFxgDt = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setValDt(DateFormat4Choice value) {
        this.valDt = value;
    }

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
