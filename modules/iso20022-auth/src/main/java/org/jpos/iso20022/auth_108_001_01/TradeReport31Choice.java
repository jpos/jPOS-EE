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

package org.jpos.iso20022.auth_108_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeReport31Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeReport31Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="New" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}MarginReportData7"/>
 *         <element name="MrgnUpd" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}MarginReportData7"/>
 *         <element name="Err" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}MarginReportData7"/>
 *         <element name="Crrctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}MarginReportData7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReport31Choice", propOrder = {
    "_new",
    "mrgnUpd",
    "err",
    "crrctn"
})
public class TradeReport31Choice {

    @XmlElement(name = "New")
    protected MarginReportData7 _new;
    @XmlElement(name = "MrgnUpd")
    protected MarginReportData7 mrgnUpd;
    @XmlElement(name = "Err")
    protected MarginReportData7 err;
    @XmlElement(name = "Crrctn")
    protected MarginReportData7 crrctn;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData7 }
     *     
     */
    public MarginReportData7 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData7 }
     *     
     */
    public void setNew(MarginReportData7 value) {
        this._new = value;
    }

    /**
     * Gets the value of the mrgnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData7 }
     *     
     */
    public MarginReportData7 getMrgnUpd() {
        return mrgnUpd;
    }

    /**
     * Sets the value of the mrgnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData7 }
     *     
     */
    public void setMrgnUpd(MarginReportData7 value) {
        this.mrgnUpd = value;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData7 }
     *     
     */
    public MarginReportData7 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData7 }
     *     
     */
    public void setErr(MarginReportData7 value) {
        this.err = value;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData7 }
     *     
     */
    public MarginReportData7 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData7 }
     *     
     */
    public void setCrrctn(MarginReportData7 value) {
        this.crrctn = value;
    }

}
