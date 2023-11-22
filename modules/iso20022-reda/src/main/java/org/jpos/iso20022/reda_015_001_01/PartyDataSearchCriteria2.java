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

package org.jpos.iso20022.reda_015_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyDataSearchCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyDataSearchCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OpngDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}DatePeriodSearch1Choice" minOccurs="0"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}DatePeriodSearch1Choice" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}SystemPartyType1Choice" minOccurs="0"/>
 *         <element name="RspnsblPtyId" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}PartyIdentification136" minOccurs="0"/>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}PartyIdentification136" minOccurs="0"/>
 *         <element name="RstrctnId" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}Max35Text" minOccurs="0"/>
 *         <element name="RstrctnIsseDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}DateAndDateTimeSearch4Choice" minOccurs="0"/>
 *         <element name="ResTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}ResidenceType1Code" minOccurs="0"/>
 *         <element name="LckSts" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}PartyLockStatus1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyDataSearchCriteria2", propOrder = {
    "opngDt",
    "clsgDt",
    "tp",
    "rspnsblPtyId",
    "ptyId",
    "rstrctnId",
    "rstrctnIsseDt",
    "resTp",
    "lckSts"
})
public class PartyDataSearchCriteria2 {

    @XmlElement(name = "OpngDt")
    protected DatePeriodSearch1Choice opngDt;
    @XmlElement(name = "ClsgDt")
    protected DatePeriodSearch1Choice clsgDt;
    @XmlElement(name = "Tp")
    protected SystemPartyType1Choice tp;
    @XmlElement(name = "RspnsblPtyId")
    protected PartyIdentification136 rspnsblPtyId;
    @XmlElement(name = "PtyId")
    protected PartyIdentification136 ptyId;
    @XmlElement(name = "RstrctnId")
    protected String rstrctnId;
    @XmlElement(name = "RstrctnIsseDt")
    protected DateAndDateTimeSearch4Choice rstrctnIsseDt;
    @XmlElement(name = "ResTp")
    @XmlSchemaType(name = "string")
    protected ResidenceType1Code resTp;
    @XmlElement(name = "LckSts")
    protected PartyLockStatus1 lckSts;

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public void setOpngDt(DatePeriodSearch1Choice value) {
        this.opngDt = value;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public void setClsgDt(DatePeriodSearch1Choice value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public SystemPartyType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public void setTp(SystemPartyType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rspnsblPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getRspnsblPtyId() {
        return rspnsblPtyId;
    }

    /**
     * Sets the value of the rspnsblPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setRspnsblPtyId(PartyIdentification136 value) {
        this.rspnsblPtyId = value;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setPtyId(PartyIdentification136 value) {
        this.ptyId = value;
    }

    /**
     * Gets the value of the rstrctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstrctnId() {
        return rstrctnId;
    }

    /**
     * Sets the value of the rstrctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstrctnId(String value) {
        this.rstrctnId = value;
    }

    /**
     * Gets the value of the rstrctnIsseDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch4Choice }
     *     
     */
    public DateAndDateTimeSearch4Choice getRstrctnIsseDt() {
        return rstrctnIsseDt;
    }

    /**
     * Sets the value of the rstrctnIsseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch4Choice }
     *     
     */
    public void setRstrctnIsseDt(DateAndDateTimeSearch4Choice value) {
        this.rstrctnIsseDt = value;
    }

    /**
     * Gets the value of the resTp property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceType1Code }
     *     
     */
    public ResidenceType1Code getResTp() {
        return resTp;
    }

    /**
     * Sets the value of the resTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceType1Code }
     *     
     */
    public void setResTp(ResidenceType1Code value) {
        this.resTp = value;
    }

    /**
     * Gets the value of the lckSts property.
     * 
     * @return
     *     possible object is
     *     {@link PartyLockStatus1 }
     *     
     */
    public PartyLockStatus1 getLckSts() {
        return lckSts;
    }

    /**
     * Sets the value of the lckSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyLockStatus1 }
     *     
     */
    public void setLckSts(PartyLockStatus1 value) {
        this.lckSts = value;
    }

}
