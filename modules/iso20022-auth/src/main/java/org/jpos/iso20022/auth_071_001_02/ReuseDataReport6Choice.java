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

package org.jpos.iso20022.auth_071_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReuseDataReport6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReuseDataReport6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="New" type="{urn:iso:std:iso:20022:tech:xsd:auth.071.001.02}ReuseDataReportNew6"/>
 *         <element name="Err" type="{urn:iso:std:iso:20022:tech:xsd:auth.071.001.02}ReuseDataReportError5"/>
 *         <element name="Crrctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.071.001.02}ReuseDataReportCorrection14"/>
 *         <element name="CollReuseUpd" type="{urn:iso:std:iso:20022:tech:xsd:auth.071.001.02}ReuseDataReportCorrection14"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReuseDataReport6Choice", propOrder = {
    "_new",
    "err",
    "crrctn",
    "collReuseUpd"
})
public class ReuseDataReport6Choice {

    @XmlElement(name = "New")
    protected ReuseDataReportNew6 _new;
    @XmlElement(name = "Err")
    protected ReuseDataReportError5 err;
    @XmlElement(name = "Crrctn")
    protected ReuseDataReportCorrection14 crrctn;
    @XmlElement(name = "CollReuseUpd")
    protected ReuseDataReportCorrection14 collReuseUpd;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportNew6 }
     *     
     */
    public ReuseDataReportNew6 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportNew6 }
     *     
     */
    public void setNew(ReuseDataReportNew6 value) {
        this._new = value;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportError5 }
     *     
     */
    public ReuseDataReportError5 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportError5 }
     *     
     */
    public void setErr(ReuseDataReportError5 value) {
        this.err = value;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportCorrection14 }
     *     
     */
    public ReuseDataReportCorrection14 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportCorrection14 }
     *     
     */
    public void setCrrctn(ReuseDataReportCorrection14 value) {
        this.crrctn = value;
    }

    /**
     * Gets the value of the collReuseUpd property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportCorrection14 }
     *     
     */
    public ReuseDataReportCorrection14 getCollReuseUpd() {
        return collReuseUpd;
    }

    /**
     * Sets the value of the collReuseUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportCorrection14 }
     *     
     */
    public void setCollReuseUpd(ReuseDataReportCorrection14 value) {
        this.collReuseUpd = value;
    }

}
