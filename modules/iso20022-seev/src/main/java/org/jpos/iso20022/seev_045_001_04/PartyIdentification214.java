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

package org.jpos.iso20022.seev_045_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification214 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification214">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}PartyIdentification203Choice"/>
 *         <element name="RcptNm" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}Max350Text"/>
 *         <element name="RspnRcptAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}PartyAddress1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification214", propOrder = {
    "id",
    "rcptNm",
    "rspnRcptAdr"
})
public class PartyIdentification214 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification203Choice id;
    @XmlElement(name = "RcptNm", required = true)
    protected String rcptNm;
    @XmlElement(name = "RspnRcptAdr", required = true)
    protected PartyAddress1 rspnRcptAdr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification203Choice }
     *     
     */
    public PartyIdentification203Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification203Choice }
     *     
     */
    public void setId(PartyIdentification203Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the rcptNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptNm() {
        return rcptNm;
    }

    /**
     * Sets the value of the rcptNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptNm(String value) {
        this.rcptNm = value;
    }

    /**
     * Gets the value of the rspnRcptAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddress1 }
     *     
     */
    public PartyAddress1 getRspnRcptAdr() {
        return rspnRcptAdr;
    }

    /**
     * Sets the value of the rspnRcptAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddress1 }
     *     
     */
    public void setRspnRcptAdr(PartyAddress1 value) {
        this.rspnRcptAdr = value;
    }

}
