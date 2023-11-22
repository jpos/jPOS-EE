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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeCounterpartyRelationshipRecord1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeCounterpartyRelationshipRecord1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StartRltshPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TradeCounterpartyType1Code"/>
 *         <element name="EndRltshPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TradeCounterpartyType1Code"/>
 *         <element name="RltshTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TradeCounterpartyRelationship1Choice"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Max1000Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCounterpartyRelationshipRecord1", propOrder = {
    "startRltshPty",
    "endRltshPty",
    "rltshTp",
    "desc"
})
public class TradeCounterpartyRelationshipRecord1 {

    @XmlElement(name = "StartRltshPty", required = true)
    @XmlSchemaType(name = "string")
    protected TradeCounterpartyType1Code startRltshPty;
    @XmlElement(name = "EndRltshPty", required = true)
    @XmlSchemaType(name = "string")
    protected TradeCounterpartyType1Code endRltshPty;
    @XmlElement(name = "RltshTp", required = true)
    protected TradeCounterpartyRelationship1Choice rltshTp;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the startRltshPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyType1Code }
     *     
     */
    public TradeCounterpartyType1Code getStartRltshPty() {
        return startRltshPty;
    }

    /**
     * Sets the value of the startRltshPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyType1Code }
     *     
     */
    public void setStartRltshPty(TradeCounterpartyType1Code value) {
        this.startRltshPty = value;
    }

    /**
     * Gets the value of the endRltshPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyType1Code }
     *     
     */
    public TradeCounterpartyType1Code getEndRltshPty() {
        return endRltshPty;
    }

    /**
     * Sets the value of the endRltshPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyType1Code }
     *     
     */
    public void setEndRltshPty(TradeCounterpartyType1Code value) {
        this.endRltshPty = value;
    }

    /**
     * Gets the value of the rltshTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyRelationship1Choice }
     *     
     */
    public TradeCounterpartyRelationship1Choice getRltshTp() {
        return rltshTp;
    }

    /**
     * Sets the value of the rltshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyRelationship1Choice }
     *     
     */
    public void setRltshTp(TradeCounterpartyRelationship1Choice value) {
        this.rltshTp = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
