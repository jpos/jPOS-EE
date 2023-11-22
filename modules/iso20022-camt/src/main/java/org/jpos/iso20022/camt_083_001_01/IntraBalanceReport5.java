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

package org.jpos.iso20022.camt_083_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalanceReport5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalanceReport5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}Number3Choice" minOccurs="0"/>
 *         <element name="QryRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}Max35Text" minOccurs="0"/>
 *         <element name="RptId" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}Max35Text" minOccurs="0"/>
 *         <element name="RptDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="RptPrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}Period7Choice" minOccurs="0"/>
 *         <element name="QryTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}MovementResponseType1Code" minOccurs="0"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}Frequency22Choice" minOccurs="0"/>
 *         <element name="UpdTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}UpdateType15Choice"/>
 *         <element name="ActvtyInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceReport5", propOrder = {
    "rptNb",
    "qryRef",
    "rptId",
    "rptDtTm",
    "rptPrd",
    "qryTp",
    "frqcy",
    "updTp",
    "actvtyInd"
})
public class IntraBalanceReport5 {

    @XmlElement(name = "RptNb")
    protected Number3Choice rptNb;
    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "RptId")
    protected String rptId;
    @XmlElement(name = "RptDtTm")
    protected DateAndDateTime2Choice rptDtTm;
    @XmlElement(name = "RptPrd")
    protected Period7Choice rptPrd;
    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected MovementResponseType1Code qryTp;
    @XmlElement(name = "Frqcy")
    protected Frequency22Choice frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected UpdateType15Choice updTp;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number3Choice }
     *     
     */
    public Number3Choice getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number3Choice }
     *     
     */
    public void setRptNb(Number3Choice value) {
        this.rptNb = value;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryRef(String value) {
        this.qryRef = value;
    }

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptId(String value) {
        this.rptId = value;
    }

    /**
     * Gets the value of the rptDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getRptDtTm() {
        return rptDtTm;
    }

    /**
     * Sets the value of the rptDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setRptDtTm(DateAndDateTime2Choice value) {
        this.rptDtTm = value;
    }

    /**
     * Gets the value of the rptPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period7Choice }
     *     
     */
    public Period7Choice getRptPrd() {
        return rptPrd;
    }

    /**
     * Sets the value of the rptPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period7Choice }
     *     
     */
    public void setRptPrd(Period7Choice value) {
        this.rptPrd = value;
    }

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link MovementResponseType1Code }
     *     
     */
    public MovementResponseType1Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementResponseType1Code }
     *     
     */
    public void setQryTp(MovementResponseType1Code value) {
        this.qryTp = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency22Choice }
     *     
     */
    public Frequency22Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency22Choice }
     *     
     */
    public void setFrqcy(Frequency22Choice value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType15Choice }
     *     
     */
    public UpdateType15Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType15Choice }
     *     
     */
    public void setUpdTp(UpdateType15Choice value) {
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

}
