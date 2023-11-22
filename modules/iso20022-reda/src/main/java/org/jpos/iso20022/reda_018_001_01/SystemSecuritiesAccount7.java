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

package org.jpos.iso20022.reda_018_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemSecuritiesAccount7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SystemSecuritiesAccount7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:reda.018.001.01}SystemPartyIdentification8"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:reda.018.001.01}Max35Text"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:reda.018.001.01}SystemSecuritiesAccountType1Choice"/>
 *         <element name="OpngDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.018.001.01}ISODate"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.018.001.01}ISODate" minOccurs="0"/>
 *         <element name="HldInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.018.001.01}TrueFalseIndicator"/>
 *         <element name="NegPos" type="{urn:iso:std:iso:20022:tech:xsd:reda.018.001.01}TrueFalseIndicator"/>
 *         <element name="MktSpcfcAttr" type="{urn:iso:std:iso:20022:tech:xsd:reda.018.001.01}MarketSpecificAttribute1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Rstrctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.018.001.01}SystemRestriction1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EndInvstrFlg" type="{urn:iso:std:iso:20022:tech:xsd:reda.018.001.01}Exact4AlphaNumericText" minOccurs="0"/>
 *         <element name="PricgSchme" type="{urn:iso:std:iso:20022:tech:xsd:reda.018.001.01}Exact4AlphaNumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSecuritiesAccount7", propOrder = {
    "acctOwnr",
    "id",
    "tp",
    "opngDt",
    "clsgDt",
    "hldInd",
    "negPos",
    "mktSpcfcAttr",
    "rstrctn",
    "endInvstrFlg",
    "pricgSchme"
})
public class SystemSecuritiesAccount7 {

    @XmlElement(name = "AcctOwnr", required = true)
    protected SystemPartyIdentification8 acctOwnr;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Tp", required = true)
    protected SystemSecuritiesAccountType1Choice tp;
    @XmlElement(name = "OpngDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar opngDt;
    @XmlElement(name = "ClsgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clsgDt;
    @XmlElement(name = "HldInd")
    protected boolean hldInd;
    @XmlElement(name = "NegPos")
    protected boolean negPos;
    @XmlElement(name = "MktSpcfcAttr")
    protected List<MarketSpecificAttribute1> mktSpcfcAttr;
    @XmlElement(name = "Rstrctn")
    protected List<SystemRestriction1> rstrctn;
    @XmlElement(name = "EndInvstrFlg")
    protected String endInvstrFlg;
    @XmlElement(name = "PricgSchme")
    protected String pricgSchme;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public void setAcctOwnr(SystemPartyIdentification8 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemSecuritiesAccountType1Choice }
     *     
     */
    public SystemSecuritiesAccountType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemSecuritiesAccountType1Choice }
     *     
     */
    public void setTp(SystemSecuritiesAccountType1Choice value) {
        this.tp = value;
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
     * Gets the value of the hldInd property.
     * 
     */
    public boolean isHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     */
    public void setHldInd(boolean value) {
        this.hldInd = value;
    }

    /**
     * Gets the value of the negPos property.
     * 
     */
    public boolean isNegPos() {
        return negPos;
    }

    /**
     * Sets the value of the negPos property.
     * 
     */
    public void setNegPos(boolean value) {
        this.negPos = value;
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

    /**
     * Gets the value of the endInvstrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndInvstrFlg() {
        return endInvstrFlg;
    }

    /**
     * Sets the value of the endInvstrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndInvstrFlg(String value) {
        this.endInvstrFlg = value;
    }

    /**
     * Gets the value of the pricgSchme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricgSchme() {
        return pricgSchme;
    }

    /**
     * Sets the value of the pricgSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricgSchme(String value) {
        this.pricgSchme = value;
    }

}
