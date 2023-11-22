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

package org.jpos.iso20022.colr_003_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginCallResult2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginCallResult2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="MrgnCallRsltDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginCallResult2"/>
 *         <element name="MrgnCallAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}Result1"/>
 *         <element name="SgrtdIndpdntAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}Result1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCallResult2Choice", propOrder = {
    "mrgnCallRsltDtls",
    "mrgnCallAmt",
    "sgrtdIndpdntAmt"
})
public class MarginCallResult2Choice {

    @XmlElement(name = "MrgnCallRsltDtls")
    protected MarginCallResult2 mrgnCallRsltDtls;
    @XmlElement(name = "MrgnCallAmt")
    protected Result1 mrgnCallAmt;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected Result1 sgrtdIndpdntAmt;

    /**
     * Gets the value of the mrgnCallRsltDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCallResult2 }
     *     
     */
    public MarginCallResult2 getMrgnCallRsltDtls() {
        return mrgnCallRsltDtls;
    }

    /**
     * Sets the value of the mrgnCallRsltDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCallResult2 }
     *     
     */
    public void setMrgnCallRsltDtls(MarginCallResult2 value) {
        this.mrgnCallRsltDtls = value;
    }

    /**
     * Gets the value of the mrgnCallAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Result1 }
     *     
     */
    public Result1 getMrgnCallAmt() {
        return mrgnCallAmt;
    }

    /**
     * Sets the value of the mrgnCallAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result1 }
     *     
     */
    public void setMrgnCallAmt(Result1 value) {
        this.mrgnCallAmt = value;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Result1 }
     *     
     */
    public Result1 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result1 }
     *     
     */
    public void setSgrtdIndpdntAmt(Result1 value) {
        this.sgrtdIndpdntAmt = value;
    }

}
