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

package org.jpos.iso20022.colr_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestResponse1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InterestResponse1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RspnTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.014.001.05}Status4Code"/>
 *         <element name="RjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:colr.014.001.05}RejectionReason21FormatChoice" minOccurs="0"/>
 *         <element name="RjctnRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:colr.014.001.05}Max140Text" minOccurs="0"/>
 *         <element name="IntrstPmtReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.014.001.05}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestResponse1", propOrder = {
    "rspnTp",
    "rjctnRsn",
    "rjctnRsnInf",
    "intrstPmtReqId"
})
public class InterestResponse1 {

    @XmlElement(name = "RspnTp", required = true)
    @XmlSchemaType(name = "string")
    protected Status4Code rspnTp;
    @XmlElement(name = "RjctnRsn")
    protected RejectionReason21FormatChoice rjctnRsn;
    @XmlElement(name = "RjctnRsnInf")
    protected String rjctnRsnInf;
    @XmlElement(name = "IntrstPmtReqId", required = true)
    protected String intrstPmtReqId;

    /**
     * Gets the value of the rspnTp property.
     * 
     * @return
     *     possible object is
     *     {@link Status4Code }
     *     
     */
    public Status4Code getRspnTp() {
        return rspnTp;
    }

    /**
     * Sets the value of the rspnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status4Code }
     *     
     */
    public void setRspnTp(Status4Code value) {
        this.rspnTp = value;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason21FormatChoice }
     *     
     */
    public RejectionReason21FormatChoice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason21FormatChoice }
     *     
     */
    public void setRjctnRsn(RejectionReason21FormatChoice value) {
        this.rjctnRsn = value;
    }

    /**
     * Gets the value of the rjctnRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctnRsnInf() {
        return rjctnRsnInf;
    }

    /**
     * Sets the value of the rjctnRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctnRsnInf(String value) {
        this.rjctnRsnInf = value;
    }

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

}
