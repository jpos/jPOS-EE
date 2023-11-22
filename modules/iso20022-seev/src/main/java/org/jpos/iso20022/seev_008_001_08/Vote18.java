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

package org.jpos.iso20022.seev_008_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vote18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Vote18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IssrLabl" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}Max35Text"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}ItemDescription1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RsltnSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}ResolutionStatus2Code"/>
 *         <element name="SubSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}ResolutionSubStatus1Code" minOccurs="0"/>
 *         <element name="For" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="Agnst" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="Abstn" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="Wthhld" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="WthMgmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="AgnstMgmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="Dscrtnry" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="OneYr" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="TwoYrs" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="ThreeYrs" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="NoActn" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="Blnk" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}ProprietaryVote2" maxOccurs="4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vote18", propOrder = {
    "issrLabl",
    "desc",
    "rsltnSts",
    "subSts",
    "_for",
    "agnst",
    "abstn",
    "wthhld",
    "wthMgmt",
    "agnstMgmt",
    "dscrtnry",
    "oneYr",
    "twoYrs",
    "threeYrs",
    "noActn",
    "blnk",
    "prtry"
})
public class Vote18 {

    @XmlElement(name = "IssrLabl", required = true)
    protected String issrLabl;
    @XmlElement(name = "Desc")
    protected List<ItemDescription1> desc;
    @XmlElement(name = "RsltnSts", required = true)
    @XmlSchemaType(name = "string")
    protected ResolutionStatus2Code rsltnSts;
    @XmlElement(name = "SubSts")
    @XmlSchemaType(name = "string")
    protected ResolutionSubStatus1Code subSts;
    @XmlElement(name = "For")
    protected FinancialInstrumentQuantity18Choice _for;
    @XmlElement(name = "Agnst")
    protected FinancialInstrumentQuantity18Choice agnst;
    @XmlElement(name = "Abstn")
    protected FinancialInstrumentQuantity18Choice abstn;
    @XmlElement(name = "Wthhld")
    protected FinancialInstrumentQuantity18Choice wthhld;
    @XmlElement(name = "WthMgmt")
    protected FinancialInstrumentQuantity18Choice wthMgmt;
    @XmlElement(name = "AgnstMgmt")
    protected FinancialInstrumentQuantity18Choice agnstMgmt;
    @XmlElement(name = "Dscrtnry")
    protected FinancialInstrumentQuantity18Choice dscrtnry;
    @XmlElement(name = "OneYr")
    protected FinancialInstrumentQuantity18Choice oneYr;
    @XmlElement(name = "TwoYrs")
    protected FinancialInstrumentQuantity18Choice twoYrs;
    @XmlElement(name = "ThreeYrs")
    protected FinancialInstrumentQuantity18Choice threeYrs;
    @XmlElement(name = "NoActn")
    protected FinancialInstrumentQuantity18Choice noActn;
    @XmlElement(name = "Blnk")
    protected FinancialInstrumentQuantity18Choice blnk;
    @XmlElement(name = "Prtry")
    protected List<ProprietaryVote2> prtry;

    /**
     * Gets the value of the issrLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrLabl() {
        return issrLabl;
    }

    /**
     * Sets the value of the issrLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrLabl(String value) {
        this.issrLabl = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDescription1 }
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<ItemDescription1> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the rsltnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionStatus2Code }
     *     
     */
    public ResolutionStatus2Code getRsltnSts() {
        return rsltnSts;
    }

    /**
     * Sets the value of the rsltnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionStatus2Code }
     *     
     */
    public void setRsltnSts(ResolutionStatus2Code value) {
        this.rsltnSts = value;
    }

    /**
     * Gets the value of the subSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionSubStatus1Code }
     *     
     */
    public ResolutionSubStatus1Code getSubSts() {
        return subSts;
    }

    /**
     * Sets the value of the subSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionSubStatus1Code }
     *     
     */
    public void setSubSts(ResolutionSubStatus1Code value) {
        this.subSts = value;
    }

    /**
     * Gets the value of the for property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getFor() {
        return _for;
    }

    /**
     * Sets the value of the for property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setFor(FinancialInstrumentQuantity18Choice value) {
        this._for = value;
    }

    /**
     * Gets the value of the agnst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getAgnst() {
        return agnst;
    }

    /**
     * Sets the value of the agnst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setAgnst(FinancialInstrumentQuantity18Choice value) {
        this.agnst = value;
    }

    /**
     * Gets the value of the abstn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getAbstn() {
        return abstn;
    }

    /**
     * Sets the value of the abstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setAbstn(FinancialInstrumentQuantity18Choice value) {
        this.abstn = value;
    }

    /**
     * Gets the value of the wthhld property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getWthhld() {
        return wthhld;
    }

    /**
     * Sets the value of the wthhld property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setWthhld(FinancialInstrumentQuantity18Choice value) {
        this.wthhld = value;
    }

    /**
     * Gets the value of the wthMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getWthMgmt() {
        return wthMgmt;
    }

    /**
     * Sets the value of the wthMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setWthMgmt(FinancialInstrumentQuantity18Choice value) {
        this.wthMgmt = value;
    }

    /**
     * Gets the value of the agnstMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getAgnstMgmt() {
        return agnstMgmt;
    }

    /**
     * Sets the value of the agnstMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setAgnstMgmt(FinancialInstrumentQuantity18Choice value) {
        this.agnstMgmt = value;
    }

    /**
     * Gets the value of the dscrtnry property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getDscrtnry() {
        return dscrtnry;
    }

    /**
     * Sets the value of the dscrtnry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setDscrtnry(FinancialInstrumentQuantity18Choice value) {
        this.dscrtnry = value;
    }

    /**
     * Gets the value of the oneYr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getOneYr() {
        return oneYr;
    }

    /**
     * Sets the value of the oneYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setOneYr(FinancialInstrumentQuantity18Choice value) {
        this.oneYr = value;
    }

    /**
     * Gets the value of the twoYrs property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getTwoYrs() {
        return twoYrs;
    }

    /**
     * Sets the value of the twoYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setTwoYrs(FinancialInstrumentQuantity18Choice value) {
        this.twoYrs = value;
    }

    /**
     * Gets the value of the threeYrs property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getThreeYrs() {
        return threeYrs;
    }

    /**
     * Sets the value of the threeYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setThreeYrs(FinancialInstrumentQuantity18Choice value) {
        this.threeYrs = value;
    }

    /**
     * Gets the value of the noActn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getNoActn() {
        return noActn;
    }

    /**
     * Sets the value of the noActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setNoActn(FinancialInstrumentQuantity18Choice value) {
        this.noActn = value;
    }

    /**
     * Gets the value of the blnk property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getBlnk() {
        return blnk;
    }

    /**
     * Sets the value of the blnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setBlnk(FinancialInstrumentQuantity18Choice value) {
        this.blnk = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryVote2 }
     * 
     * 
     * @return
     *     The value of the prtry property.
     */
    public List<ProprietaryVote2> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<>();
        }
        return this.prtry;
    }

}
