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

package org.jpos.iso20022.reda_014_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemParty4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SystemParty4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}SystemPartyIdentification9"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}PostalAddress25" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}Contact5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OpngDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}ISODate" minOccurs="0"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}ISODate" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}SystemPartyType1Choice"/>
 *         <element name="TechAdr" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}TechnicalIdentification2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MktSpcfcAttr" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}MarketSpecificAttribute1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}PartyName4" minOccurs="0"/>
 *         <element name="ResTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}ResidenceType1Code" minOccurs="0"/>
 *         <element name="LckSts" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}PartyLockStatus1" minOccurs="0"/>
 *         <element name="Rstrctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.014.001.01}SystemRestriction1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemParty4", propOrder = {
    "ptyId",
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
    "rstrctn"
})
public class SystemParty4 {

    @XmlElement(name = "PtyId", required = true)
    protected SystemPartyIdentification9 ptyId;
    @XmlElement(name = "Adr")
    protected List<PostalAddress25> adr;
    @XmlElement(name = "CtctDtls")
    protected List<Contact5> ctctDtls;
    @XmlElement(name = "OpngDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar opngDt;
    @XmlElement(name = "ClsgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clsgDt;
    @XmlElement(name = "Tp", required = true)
    protected SystemPartyType1Choice tp;
    @XmlElement(name = "TechAdr")
    protected List<TechnicalIdentification2Choice> techAdr;
    @XmlElement(name = "MktSpcfcAttr")
    protected List<MarketSpecificAttribute1> mktSpcfcAttr;
    @XmlElement(name = "Nm")
    protected PartyName4 nm;
    @XmlElement(name = "ResTp")
    @XmlSchemaType(name = "string")
    protected ResidenceType1Code resTp;
    @XmlElement(name = "LckSts")
    protected PartyLockStatus1 lckSts;
    @XmlElement(name = "Rstrctn")
    protected List<SystemRestriction1> rstrctn;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification9 }
     *     
     */
    public SystemPartyIdentification9 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification9 }
     *     
     */
    public void setPtyId(SystemPartyIdentification9 value) {
        this.ptyId = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress25 }
     * 
     * 
     * @return
     *     The value of the adr property.
     */
    public List<PostalAddress25> getAdr() {
        if (adr == null) {
            adr = new ArrayList<>();
        }
        return this.adr;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact5 }
     * 
     * 
     * @return
     *     The value of the ctctDtls property.
     */
    public List<Contact5> getCtctDtls() {
        if (ctctDtls == null) {
            ctctDtls = new ArrayList<>();
        }
        return this.ctctDtls;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpngDt(XMLGregorianCalendar value) {
        this.opngDt = value;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClsgDt(XMLGregorianCalendar value) {
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
     * Gets the value of the techAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the techAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalIdentification2Choice }
     * 
     * 
     * @return
     *     The value of the techAdr property.
     */
    public List<TechnicalIdentification2Choice> getTechAdr() {
        if (techAdr == null) {
            techAdr = new ArrayList<>();
        }
        return this.techAdr;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mktSpcfcAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMktSpcfcAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSpecificAttribute1 }
     * 
     * 
     * @return
     *     The value of the mktSpcfcAttr property.
     */
    public List<MarketSpecificAttribute1> getMktSpcfcAttr() {
        if (mktSpcfcAttr == null) {
            mktSpcfcAttr = new ArrayList<>();
        }
        return this.mktSpcfcAttr;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link PartyName4 }
     *     
     */
    public PartyName4 getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyName4 }
     *     
     */
    public void setNm(PartyName4 value) {
        this.nm = value;
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
     * Gets the value of the rstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemRestriction1 }
     * 
     * 
     * @return
     *     The value of the rstrctn property.
     */
    public List<SystemRestriction1> getRstrctn() {
        if (rstrctn == null) {
            rstrctn = new ArrayList<>();
        }
        return this.rstrctn;
    }

}
