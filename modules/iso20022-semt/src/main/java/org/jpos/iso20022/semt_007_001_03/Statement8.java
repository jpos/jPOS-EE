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

package org.jpos.iso20022.semt_007_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Statement8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Statement8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ref" type="{urn:swift:xsd:semt.007.001.03}Max35Text"/>
 *         <element name="StmtPrd" type="{urn:swift:xsd:semt.007.001.03}DatePeriodDetails"/>
 *         <element name="CreDtTm" type="{urn:swift:xsd:semt.007.001.03}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="Frqcy" type="{urn:swift:xsd:semt.007.001.03}EventFrequency1Code" minOccurs="0"/>
 *         <element name="UpdTp" type="{urn:swift:xsd:semt.007.001.03}StatementUpdateTypeCode"/>
 *         <element name="ActvtyInd" type="{urn:swift:xsd:semt.007.001.03}YesNoIndicator"/>
 *         <element name="RptNb" type="{urn:swift:xsd:semt.007.001.03}Max5NumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement8", propOrder = {
    "ref",
    "stmtPrd",
    "creDtTm",
    "frqcy",
    "updTp",
    "actvtyInd",
    "rptNb"
})
public class Statement8 {

    @XmlElement(name = "Ref", required = true)
    protected String ref;
    @XmlElement(name = "StmtPrd", required = true)
    protected DatePeriodDetails stmtPrd;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTimeChoice creDtTm;
    @XmlElement(name = "Frqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency1Code frqcy;
    @XmlElement(name = "UpdTp", required = true)
    @XmlSchemaType(name = "string")
    protected StatementUpdateTypeCode updTp;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "RptNb")
    protected String rptNb;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the stmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DatePeriodDetails getStmtPrd() {
        return stmtPrd;
    }

    /**
     * Sets the value of the stmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails }
     *     
     */
    public void setStmtPrd(DatePeriodDetails value) {
        this.stmtPrd = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setCreDtTm(DateAndDateTimeChoice value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency1Code }
     *     
     */
    public EventFrequency1Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency1Code }
     *     
     */
    public void setFrqcy(EventFrequency1Code value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementUpdateTypeCode }
     *     
     */
    public StatementUpdateTypeCode getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementUpdateTypeCode }
     *     
     */
    public void setUpdTp(StatementUpdateTypeCode value) {
        this.updTp = value;
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

}
