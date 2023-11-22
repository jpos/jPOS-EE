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

package org.jpos.iso20022.camt_021_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralBusinessReport6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GeneralBusinessReport6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BizInfRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.021.001.06}Max35Text"/>
 *         <element name="GnlBizOrErr" type="{urn:iso:std:iso:20022:tech:xsd:camt.021.001.06}GeneralBusinessOrError8Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessReport6", propOrder = {
    "bizInfRef",
    "gnlBizOrErr"
})
public class GeneralBusinessReport6 {

    @XmlElement(name = "BizInfRef", required = true)
    protected String bizInfRef;
    @XmlElement(name = "GnlBizOrErr", required = true)
    protected GeneralBusinessOrError8Choice gnlBizOrErr;

    /**
     * Gets the value of the bizInfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizInfRef() {
        return bizInfRef;
    }

    /**
     * Sets the value of the bizInfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizInfRef(String value) {
        this.bizInfRef = value;
    }

    /**
     * Gets the value of the gnlBizOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralBusinessOrError8Choice }
     *     
     */
    public GeneralBusinessOrError8Choice getGnlBizOrErr() {
        return gnlBizOrErr;
    }

    /**
     * Sets the value of the gnlBizOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralBusinessOrError8Choice }
     *     
     */
    public void setGnlBizOrErr(GeneralBusinessOrError8Choice value) {
        this.gnlBizOrErr = value;
    }

}
