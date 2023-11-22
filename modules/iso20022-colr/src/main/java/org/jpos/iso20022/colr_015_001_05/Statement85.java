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

package org.jpos.iso20022.colr_015_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Statement85 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Statement85">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtId" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}Max35Text"/>
 *         <element name="ActvtyInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}YesNoIndicator"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}Frequency1Code"/>
 *         <element name="StmtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}DateAndDateTime2Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement85", propOrder = {
    "stmtId",
    "actvtyInd",
    "frqcy",
    "stmtDtTm"
})
public class Statement85 {

    @XmlElement(name = "StmtId", required = true)
    protected String stmtId;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "Frqcy", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency1Code frqcy;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTime2Choice stmtDtTm;

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtId(String value) {
        this.stmtId = value;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     */
    public boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     */
    public void setActvtyInd(boolean value) {
        this.actvtyInd = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public void setFrqcy(Frequency1Code value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the stmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getStmtDtTm() {
        return stmtDtTm;
    }

    /**
     * Sets the value of the stmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setStmtDtTm(DateAndDateTime2Choice value) {
        this.stmtDtTm = value;
    }

}
