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

package org.jpos.iso20022.colr_013_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reference20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Reference20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IntrstPmtReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}Max35Text"/>
 *         <element name="IntrstPmtRspnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference20", propOrder = {
    "intrstPmtReqId",
    "intrstPmtRspnId"
})
public class Reference20 {

    @XmlElement(name = "IntrstPmtReqId", required = true)
    protected String intrstPmtReqId;
    @XmlElement(name = "IntrstPmtRspnId")
    protected String intrstPmtRspnId;

    /**
     * Gets the value of the intrstPmtReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtReqId() {
        return intrstPmtReqId;
    }

    /**
     * Sets the value of the intrstPmtReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrstPmtReqId(String value) {
        this.intrstPmtReqId = value;
    }

    /**
     * Gets the value of the intrstPmtRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtRspnId() {
        return intrstPmtRspnId;
    }

    /**
     * Sets the value of the intrstPmtRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrstPmtRspnId(String value) {
        this.intrstPmtRspnId = value;
    }

}
