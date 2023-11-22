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

package org.jpos.iso20022.reda_041_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLogPartyRecord1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UpdateLogPartyRecord1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogAddress1"/>
 *         <element name="CtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogContact1"/>
 *         <element name="OpngDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogDate1"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogDate1"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogSystemPartyType1"/>
 *         <element name="TechAdr" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogTechnicalAddress1"/>
 *         <element name="MktSpcfcAttr" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogMarketSpecificAttribute1"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogPartyName1"/>
 *         <element name="ResTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogResidenceType1"/>
 *         <element name="LckSts" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogPartyLockStatus1"/>
 *         <element name="Rstrctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogRestriction1"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}UpdateLogProprietary1" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLogPartyRecord1Choice", propOrder = {
    "adr",
    "ctctDtls",
    "opngDt",
    "clsgDt",
    "tp",
    "techAdr",
    "mktSpcfcAttr",
    "nm",
    "resTp",
    "lckSts",
    "rstrctn",
    "othr"
})
public class UpdateLogPartyRecord1Choice {

    @XmlElement(name = "Adr")
    protected UpdateLogAddress1 adr;
    @XmlElement(name = "CtctDtls")
    protected UpdateLogContact1 ctctDtls;
    @XmlElement(name = "OpngDt")
    protected UpdateLogDate1 opngDt;
    @XmlElement(name = "ClsgDt")
    protected UpdateLogDate1 clsgDt;
    @XmlElement(name = "Tp")
    protected UpdateLogSystemPartyType1 tp;
    @XmlElement(name = "TechAdr")
    protected UpdateLogTechnicalAddress1 techAdr;
    @XmlElement(name = "MktSpcfcAttr")
    protected UpdateLogMarketSpecificAttribute1 mktSpcfcAttr;
    @XmlElement(name = "Nm")
    protected UpdateLogPartyName1 nm;
    @XmlElement(name = "ResTp")
    protected UpdateLogResidenceType1 resTp;
    @XmlElement(name = "LckSts")
    protected UpdateLogPartyLockStatus1 lckSts;
    @XmlElement(name = "Rstrctn")
    protected UpdateLogRestriction1 rstrctn;
    @XmlElement(name = "Othr")
    protected List<UpdateLogProprietary1> othr;

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogAddress1 }
     *     
     */
    public UpdateLogAddress1 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogAddress1 }
     *     
     */
    public void setAdr(UpdateLogAddress1 value) {
        this.adr = value;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogContact1 }
     *     
     */
    public UpdateLogContact1 getCtctDtls() {
        return ctctDtls;
    }

    /**
     * Sets the value of the ctctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogContact1 }
     *     
     */
    public void setCtctDtls(UpdateLogContact1 value) {
        this.ctctDtls = value;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogDate1 }
     *     
     */
    public UpdateLogDate1 getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogDate1 }
     *     
     */
    public void setOpngDt(UpdateLogDate1 value) {
        this.opngDt = value;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogDate1 }
     *     
     */
    public UpdateLogDate1 getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogDate1 }
     *     
     */
    public void setClsgDt(UpdateLogDate1 value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogSystemPartyType1 }
     *     
     */
    public UpdateLogSystemPartyType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogSystemPartyType1 }
     *     
     */
    public void setTp(UpdateLogSystemPartyType1 value) {
        this.tp = value;
    }

    /**
     * Gets the value of the techAdr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogTechnicalAddress1 }
     *     
     */
    public UpdateLogTechnicalAddress1 getTechAdr() {
        return techAdr;
    }

    /**
     * Sets the value of the techAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogTechnicalAddress1 }
     *     
     */
    public void setTechAdr(UpdateLogTechnicalAddress1 value) {
        this.techAdr = value;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogMarketSpecificAttribute1 }
     *     
     */
    public UpdateLogMarketSpecificAttribute1 getMktSpcfcAttr() {
        return mktSpcfcAttr;
    }

    /**
     * Sets the value of the mktSpcfcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogMarketSpecificAttribute1 }
     *     
     */
    public void setMktSpcfcAttr(UpdateLogMarketSpecificAttribute1 value) {
        this.mktSpcfcAttr = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogPartyName1 }
     *     
     */
    public UpdateLogPartyName1 getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogPartyName1 }
     *     
     */
    public void setNm(UpdateLogPartyName1 value) {
        this.nm = value;
    }

    /**
     * Gets the value of the resTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogResidenceType1 }
     *     
     */
    public UpdateLogResidenceType1 getResTp() {
        return resTp;
    }

    /**
     * Sets the value of the resTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogResidenceType1 }
     *     
     */
    public void setResTp(UpdateLogResidenceType1 value) {
        this.resTp = value;
    }

    /**
     * Gets the value of the lckSts property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogPartyLockStatus1 }
     *     
     */
    public UpdateLogPartyLockStatus1 getLckSts() {
        return lckSts;
    }

    /**
     * Sets the value of the lckSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogPartyLockStatus1 }
     *     
     */
    public void setLckSts(UpdateLogPartyLockStatus1 value) {
        this.lckSts = value;
    }

    /**
     * Gets the value of the rstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogRestriction1 }
     *     
     */
    public UpdateLogRestriction1 getRstrctn() {
        return rstrctn;
    }

    /**
     * Sets the value of the rstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogRestriction1 }
     *     
     */
    public void setRstrctn(UpdateLogRestriction1 value) {
        this.rstrctn = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateLogProprietary1 }
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<UpdateLogProprietary1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

}
