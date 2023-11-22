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

package org.jpos.iso20022.secl_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Statement31 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Statement31">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtId" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}Max35Text"/>
 *         <element name="StmtDtAndTm" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}DateAndDateTimeChoice"/>
 *         <element name="UpdTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}StatementUpdateType1Code"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}EventFrequency6Code"/>
 *         <element name="RptNb" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}Exact5NumericText" minOccurs="0"/>
 *         <element name="ActvtyInd" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement31", propOrder = {
    "stmtId",
    "stmtDtAndTm",
    "updTp",
    "frqcy",
    "rptNb",
    "actvtyInd"
})
public class Statement31 {

    @XmlElement(name = "StmtId", required = true)
    protected String stmtId;
    @XmlElement(name = "StmtDtAndTm", required = true)
    protected DateAndDateTimeChoice stmtDtAndTm;
    @XmlElement(name = "UpdTp", required = true)
    @XmlSchemaType(name = "string")
    protected StatementUpdateType1Code updTp;
    @XmlElement(name = "Frqcy", required = true)
    @XmlSchemaType(name = "string")
    protected EventFrequency6Code frqcy;
    @XmlElement(name = "RptNb")
    protected String rptNb;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;

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
     * Gets the value of the stmtDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getStmtDtAndTm() {
        return stmtDtAndTm;
    }

    /**
     * Sets the value of the stmtDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setStmtDtAndTm(DateAndDateTimeChoice value) {
        this.stmtDtAndTm = value;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementUpdateType1Code }
     *     
     */
    public StatementUpdateType1Code getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementUpdateType1Code }
     *     
     */
    public void setUpdTp(StatementUpdateType1Code value) {
        this.updTp = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency6Code }
     *     
     */
    public EventFrequency6Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency6Code }
     *     
     */
    public void setFrqcy(EventFrequency6Code value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptNb(String value) {
        this.rptNb = value;
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

}
