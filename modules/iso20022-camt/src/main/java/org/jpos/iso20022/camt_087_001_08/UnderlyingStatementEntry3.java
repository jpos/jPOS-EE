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

package org.jpos.iso20022.camt_087_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingStatementEntry3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnderlyingStatementEntry3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.087.001.08}OriginalGroupInformation29" minOccurs="0"/>
 *         <element name="OrgnlStmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.087.001.08}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlNtryId" type="{urn:iso:std:iso:20022:tech:xsd:camt.087.001.08}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlUETR" type="{urn:iso:std:iso:20022:tech:xsd:camt.087.001.08}UUIDv4Identifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingStatementEntry3", propOrder = {
    "orgnlGrpInf",
    "orgnlStmtId",
    "orgnlNtryId",
    "orgnlUETR"
})
public class UnderlyingStatementEntry3 {

    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation29 orgnlGrpInf;
    @XmlElement(name = "OrgnlStmtId")
    protected String orgnlStmtId;
    @XmlElement(name = "OrgnlNtryId")
    protected String orgnlNtryId;
    @XmlElement(name = "OrgnlUETR")
    protected String orgnlUETR;

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public OriginalGroupInformation29 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public void setOrgnlGrpInf(OriginalGroupInformation29 value) {
        this.orgnlGrpInf = value;
    }

    /**
     * Gets the value of the orgnlStmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlStmtId() {
        return orgnlStmtId;
    }

    /**
     * Sets the value of the orgnlStmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlStmtId(String value) {
        this.orgnlStmtId = value;
    }

    /**
     * Gets the value of the orgnlNtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNtryId() {
        return orgnlNtryId;
    }

    /**
     * Sets the value of the orgnlNtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlNtryId(String value) {
        this.orgnlNtryId = value;
    }

    /**
     * Gets the value of the orgnlUETR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlUETR() {
        return orgnlUETR;
    }

    /**
     * Sets the value of the orgnlUETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlUETR(String value) {
        this.orgnlUETR = value;
    }

}
