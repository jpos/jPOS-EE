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

package org.jpos.iso20022.auth_033_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDefaultSwapDerivative6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CreditDefaultSwapDerivative6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UndrlygCdtDfltSwpId" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ISINOct2015Identifier" minOccurs="0"/>
 *         <element name="OblgtnId" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ISINOct2015Identifier"/>
 *         <element name="SnglNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}CreditDefaultSwapSingleName2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapDerivative6", propOrder = {
    "undrlygCdtDfltSwpId",
    "oblgtnId",
    "snglNm"
})
public class CreditDefaultSwapDerivative6 {

    @XmlElement(name = "UndrlygCdtDfltSwpId")
    protected String undrlygCdtDfltSwpId;
    @XmlElement(name = "OblgtnId", required = true)
    protected String oblgtnId;
    @XmlElement(name = "SnglNm", required = true)
    protected CreditDefaultSwapSingleName2 snglNm;

    /**
     * Gets the value of the undrlygCdtDfltSwpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndrlygCdtDfltSwpId() {
        return undrlygCdtDfltSwpId;
    }

    /**
     * Sets the value of the undrlygCdtDfltSwpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndrlygCdtDfltSwpId(String value) {
        this.undrlygCdtDfltSwpId = value;
    }

    /**
     * Gets the value of the oblgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblgtnId() {
        return oblgtnId;
    }

    /**
     * Sets the value of the oblgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOblgtnId(String value) {
        this.oblgtnId = value;
    }

    /**
     * Gets the value of the snglNm property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapSingleName2 }
     *     
     */
    public CreditDefaultSwapSingleName2 getSnglNm() {
        return snglNm;
    }

    /**
     * Sets the value of the snglNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapSingleName2 }
     *     
     */
    public void setSnglNm(CreditDefaultSwapSingleName2 value) {
        this.snglNm = value;
    }

}
