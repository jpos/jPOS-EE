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

package org.jpos.iso20022.auth_094_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeDateTimeQueryCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeDateTimeQueryCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}DateTimePeriod1" minOccurs="0"/>
 *         <element name="ExctnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}DateTimePeriod1" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}DateOrBlankQuery2Choice" minOccurs="0"/>
 *         <element name="TermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}DateOrBlankQuery2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeDateTimeQueryCriteria2", propOrder = {
    "rptgDtTm",
    "exctnDtTm",
    "mtrtyDt",
    "termntnDt"
})
public class TradeDateTimeQueryCriteria2 {

    @XmlElement(name = "RptgDtTm")
    protected DateTimePeriod1 rptgDtTm;
    @XmlElement(name = "ExctnDtTm")
    protected DateTimePeriod1 exctnDtTm;
    @XmlElement(name = "MtrtyDt")
    protected DateOrBlankQuery2Choice mtrtyDt;
    @XmlElement(name = "TermntnDt")
    protected DateOrBlankQuery2Choice termntnDt;

    /**
     * Gets the value of the rptgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getRptgDtTm() {
        return rptgDtTm;
    }

    /**
     * Sets the value of the rptgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setRptgDtTm(DateTimePeriod1 value) {
        this.rptgDtTm = value;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setExctnDtTm(DateTimePeriod1 value) {
        this.exctnDtTm = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public DateOrBlankQuery2Choice getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public void setMtrtyDt(DateOrBlankQuery2Choice value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public DateOrBlankQuery2Choice getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public void setTermntnDt(DateOrBlankQuery2Choice value) {
        this.termntnDt = value;
    }

}
