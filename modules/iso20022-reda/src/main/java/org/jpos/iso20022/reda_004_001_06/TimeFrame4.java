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

package org.jpos.iso20022.reda_004_001_06;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeFrame4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TimeFrame4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OthrTmFrameDesc" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max350Text" minOccurs="0"/>
 *         <element name="TMns" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Number" minOccurs="0"/>
 *         <element name="NonWorkgDayAdjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}BusinessDayConvention1Code" minOccurs="0"/>
 *         <element name="RefrToOrdrDsk" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ReferToFundOrderDesk1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeFrame4", propOrder = {
    "othrTmFrameDesc",
    "tMns",
    "nonWorkgDayAdjstmnt",
    "refrToOrdrDsk"
})
public class TimeFrame4 {

    @XmlElement(name = "OthrTmFrameDesc")
    protected String othrTmFrameDesc;
    @XmlElement(name = "TMns")
    protected BigDecimal tMns;
    @XmlElement(name = "NonWorkgDayAdjstmnt")
    @XmlSchemaType(name = "string")
    protected BusinessDayConvention1Code nonWorkgDayAdjstmnt;
    @XmlElement(name = "RefrToOrdrDsk")
    @XmlSchemaType(name = "string")
    protected ReferToFundOrderDesk1Code refrToOrdrDsk;

    /**
     * Gets the value of the othrTmFrameDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTmFrameDesc() {
        return othrTmFrameDesc;
    }

    /**
     * Sets the value of the othrTmFrameDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTmFrameDesc(String value) {
        this.othrTmFrameDesc = value;
    }

    /**
     * Gets the value of the tMns property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTMns() {
        return tMns;
    }

    /**
     * Sets the value of the tMns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTMns(BigDecimal value) {
        this.tMns = value;
    }

    /**
     * Gets the value of the nonWorkgDayAdjstmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayConvention1Code }
     *     
     */
    public BusinessDayConvention1Code getNonWorkgDayAdjstmnt() {
        return nonWorkgDayAdjstmnt;
    }

    /**
     * Sets the value of the nonWorkgDayAdjstmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayConvention1Code }
     *     
     */
    public void setNonWorkgDayAdjstmnt(BusinessDayConvention1Code value) {
        this.nonWorkgDayAdjstmnt = value;
    }

    /**
     * Gets the value of the refrToOrdrDsk property.
     * 
     * @return
     *     possible object is
     *     {@link ReferToFundOrderDesk1Code }
     *     
     */
    public ReferToFundOrderDesk1Code getRefrToOrdrDsk() {
        return refrToOrdrDsk;
    }

    /**
     * Sets the value of the refrToOrdrDsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferToFundOrderDesk1Code }
     *     
     */
    public void setRefrToOrdrDsk(ReferToFundOrderDesk1Code value) {
        this.refrToOrdrDsk = value;
    }

}
