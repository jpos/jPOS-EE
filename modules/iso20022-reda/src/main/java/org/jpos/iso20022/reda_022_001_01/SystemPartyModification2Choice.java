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

package org.jpos.iso20022.reda_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemPartyModification2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SystemPartyModification2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SysPtyDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.022.001.01}SystemParty2"/>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:reda.022.001.01}SystemPartyIdentification10"/>
 *         <element name="PtyNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.022.001.01}PartyName3"/>
 *         <element name="CtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.022.001.01}Contact5"/>
 *         <element name="TechAdr" type="{urn:iso:std:iso:20022:tech:xsd:reda.022.001.01}TechnicalIdentification2Choice"/>
 *         <element name="PtyAdr" type="{urn:iso:std:iso:20022:tech:xsd:reda.022.001.01}PostalAddress25"/>
 *         <element name="ResTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.022.001.01}ResidenceType1Code"/>
 *         <element name="LckSts" type="{urn:iso:std:iso:20022:tech:xsd:reda.022.001.01}PartyLockStatus1"/>
 *         <element name="SysRstrctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.022.001.01}SystemRestriction1"/>
 *         <element name="MktSpcfcAttr" type="{urn:iso:std:iso:20022:tech:xsd:reda.022.001.01}MarketSpecificAttribute1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemPartyModification2Choice", propOrder = {
    "sysPtyDt",
    "ptyId",
    "ptyNm",
    "ctctDtls",
    "techAdr",
    "ptyAdr",
    "resTp",
    "lckSts",
    "sysRstrctn",
    "mktSpcfcAttr"
})
public class SystemPartyModification2Choice {

    @XmlElement(name = "SysPtyDt")
    protected SystemParty2 sysPtyDt;
    @XmlElement(name = "PtyId")
    protected SystemPartyIdentification10 ptyId;
    @XmlElement(name = "PtyNm")
    protected PartyName3 ptyNm;
    @XmlElement(name = "CtctDtls")
    protected Contact5 ctctDtls;
    @XmlElement(name = "TechAdr")
    protected TechnicalIdentification2Choice techAdr;
    @XmlElement(name = "PtyAdr")
    protected PostalAddress25 ptyAdr;
    @XmlElement(name = "ResTp")
    @XmlSchemaType(name = "string")
    protected ResidenceType1Code resTp;
    @XmlElement(name = "LckSts")
    protected PartyLockStatus1 lckSts;
    @XmlElement(name = "SysRstrctn")
    protected SystemRestriction1 sysRstrctn;
    @XmlElement(name = "MktSpcfcAttr")
    protected MarketSpecificAttribute1 mktSpcfcAttr;

    /**
     * Gets the value of the sysPtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link SystemParty2 }
     *     
     */
    public SystemParty2 getSysPtyDt() {
        return sysPtyDt;
    }

    /**
     * Sets the value of the sysPtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemParty2 }
     *     
     */
    public void setSysPtyDt(SystemParty2 value) {
        this.sysPtyDt = value;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification10 }
     *     
     */
    public SystemPartyIdentification10 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification10 }
     *     
     */
    public void setPtyId(SystemPartyIdentification10 value) {
        this.ptyId = value;
    }

    /**
     * Gets the value of the ptyNm property.
     * 
     * @return
     *     possible object is
     *     {@link PartyName3 }
     *     
     */
    public PartyName3 getPtyNm() {
        return ptyNm;
    }

    /**
     * Sets the value of the ptyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyName3 }
     *     
     */
    public void setPtyNm(PartyName3 value) {
        this.ptyNm = value;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Contact5 }
     *     
     */
    public Contact5 getCtctDtls() {
        return ctctDtls;
    }

    /**
     * Sets the value of the ctctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact5 }
     *     
     */
    public void setCtctDtls(Contact5 value) {
        this.ctctDtls = value;
    }

    /**
     * Gets the value of the techAdr property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalIdentification2Choice }
     *     
     */
    public TechnicalIdentification2Choice getTechAdr() {
        return techAdr;
    }

    /**
     * Sets the value of the techAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalIdentification2Choice }
     *     
     */
    public void setTechAdr(TechnicalIdentification2Choice value) {
        this.techAdr = value;
    }

    /**
     * Gets the value of the ptyAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress25 }
     *     
     */
    public PostalAddress25 getPtyAdr() {
        return ptyAdr;
    }

    /**
     * Sets the value of the ptyAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress25 }
     *     
     */
    public void setPtyAdr(PostalAddress25 value) {
        this.ptyAdr = value;
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

    /**
     * Gets the value of the sysRstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link SystemRestriction1 }
     *     
     */
    public SystemRestriction1 getSysRstrctn() {
        return sysRstrctn;
    }

    /**
     * Sets the value of the sysRstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemRestriction1 }
     *     
     */
    public void setSysRstrctn(SystemRestriction1 value) {
        this.sysRstrctn = value;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link MarketSpecificAttribute1 }
     *     
     */
    public MarketSpecificAttribute1 getMktSpcfcAttr() {
        return mktSpcfcAttr;
    }

    /**
     * Sets the value of the mktSpcfcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketSpecificAttribute1 }
     *     
     */
    public void setMktSpcfcAttr(MarketSpecificAttribute1 value) {
        this.mktSpcfcAttr = value;
    }

}
