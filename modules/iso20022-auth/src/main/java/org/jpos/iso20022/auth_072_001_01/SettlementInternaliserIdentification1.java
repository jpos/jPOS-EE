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

package org.jpos.iso20022.auth_072_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementInternaliserIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementInternaliserIdentification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}LEIIdentifier"/>
 *         <element name="RspnsblPrsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}ContactDetails4"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}CountryCode"/>
 *         <element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}Exact2UpperCaseAlphaText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInternaliserIdentification1", propOrder = {
    "lei",
    "rspnsblPrsn",
    "ctry",
    "brnchId"
})
public class SettlementInternaliserIdentification1 {

    @XmlElement(name = "LEI", required = true)
    protected String lei;
    @XmlElement(name = "RspnsblPrsn", required = true)
    protected ContactDetails4 rspnsblPrsn;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "BrnchId")
    protected String brnchId;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Gets the value of the rspnsblPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails4 }
     *     
     */
    public ContactDetails4 getRspnsblPrsn() {
        return rspnsblPrsn;
    }

    /**
     * Sets the value of the rspnsblPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails4 }
     *     
     */
    public void setRspnsblPrsn(ContactDetails4 value) {
        this.rspnsblPrsn = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnchId(String value) {
        this.brnchId = value;
    }

}
