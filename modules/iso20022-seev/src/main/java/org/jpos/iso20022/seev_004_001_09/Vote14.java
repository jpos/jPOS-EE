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

package org.jpos.iso20022.seev_004_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vote14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Vote14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IssrLabl" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Max35Text"/>
 *         <element name="ListgGrpRsltnLabl" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Max35Text" minOccurs="0"/>
 *         <element name="For" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="Agnst" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="Abstn" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="Wthhld" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="WthMgmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="AgnstMgmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="Dscrtnry" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="OneYr" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="TwoYrs" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="ThreeYrs" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="NoActn" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="Blnk" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}QuantityOrCode1Choice" minOccurs="0"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}ProprietaryVote1" maxOccurs="4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vote14", propOrder = {
    "issrLabl",
    "listgGrpRsltnLabl",
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
public class Vote14 {

    @XmlElement(name = "IssrLabl", required = true)
    protected String issrLabl;
    @XmlElement(name = "ListgGrpRsltnLabl")
    protected String listgGrpRsltnLabl;
    @XmlElement(name = "For")
    protected QuantityOrCode1Choice _for;
    @XmlElement(name = "Agnst")
    protected QuantityOrCode1Choice agnst;
    @XmlElement(name = "Abstn")
    protected QuantityOrCode1Choice abstn;
    @XmlElement(name = "Wthhld")
    protected QuantityOrCode1Choice wthhld;
    @XmlElement(name = "WthMgmt")
    protected QuantityOrCode1Choice wthMgmt;
    @XmlElement(name = "AgnstMgmt")
    protected QuantityOrCode1Choice agnstMgmt;
    @XmlElement(name = "Dscrtnry")
    protected QuantityOrCode1Choice dscrtnry;
    @XmlElement(name = "OneYr")
    protected QuantityOrCode1Choice oneYr;
    @XmlElement(name = "TwoYrs")
    protected QuantityOrCode1Choice twoYrs;
    @XmlElement(name = "ThreeYrs")
    protected QuantityOrCode1Choice threeYrs;
    @XmlElement(name = "NoActn")
    protected QuantityOrCode1Choice noActn;
    @XmlElement(name = "Blnk")
    protected QuantityOrCode1Choice blnk;
    @XmlElement(name = "Prtry")
    protected List<ProprietaryVote1> prtry;

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
     * Gets the value of the listgGrpRsltnLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListgGrpRsltnLabl() {
        return listgGrpRsltnLabl;
    }

    /**
     * Sets the value of the listgGrpRsltnLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListgGrpRsltnLabl(String value) {
        this.listgGrpRsltnLabl = value;
    }

    /**
     * Gets the value of the for property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getFor() {
        return _for;
    }

    /**
     * Sets the value of the for property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setFor(QuantityOrCode1Choice value) {
        this._for = value;
    }

    /**
     * Gets the value of the agnst property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getAgnst() {
        return agnst;
    }

    /**
     * Sets the value of the agnst property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setAgnst(QuantityOrCode1Choice value) {
        this.agnst = value;
    }

    /**
     * Gets the value of the abstn property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getAbstn() {
        return abstn;
    }

    /**
     * Sets the value of the abstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setAbstn(QuantityOrCode1Choice value) {
        this.abstn = value;
    }

    /**
     * Gets the value of the wthhld property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getWthhld() {
        return wthhld;
    }

    /**
     * Sets the value of the wthhld property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setWthhld(QuantityOrCode1Choice value) {
        this.wthhld = value;
    }

    /**
     * Gets the value of the wthMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getWthMgmt() {
        return wthMgmt;
    }

    /**
     * Sets the value of the wthMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setWthMgmt(QuantityOrCode1Choice value) {
        this.wthMgmt = value;
    }

    /**
     * Gets the value of the agnstMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getAgnstMgmt() {
        return agnstMgmt;
    }

    /**
     * Sets the value of the agnstMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setAgnstMgmt(QuantityOrCode1Choice value) {
        this.agnstMgmt = value;
    }

    /**
     * Gets the value of the dscrtnry property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getDscrtnry() {
        return dscrtnry;
    }

    /**
     * Sets the value of the dscrtnry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setDscrtnry(QuantityOrCode1Choice value) {
        this.dscrtnry = value;
    }

    /**
     * Gets the value of the oneYr property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getOneYr() {
        return oneYr;
    }

    /**
     * Sets the value of the oneYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setOneYr(QuantityOrCode1Choice value) {
        this.oneYr = value;
    }

    /**
     * Gets the value of the twoYrs property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getTwoYrs() {
        return twoYrs;
    }

    /**
     * Sets the value of the twoYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setTwoYrs(QuantityOrCode1Choice value) {
        this.twoYrs = value;
    }

    /**
     * Gets the value of the threeYrs property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getThreeYrs() {
        return threeYrs;
    }

    /**
     * Sets the value of the threeYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setThreeYrs(QuantityOrCode1Choice value) {
        this.threeYrs = value;
    }

    /**
     * Gets the value of the noActn property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getNoActn() {
        return noActn;
    }

    /**
     * Sets the value of the noActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setNoActn(QuantityOrCode1Choice value) {
        this.noActn = value;
    }

    /**
     * Gets the value of the blnk property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getBlnk() {
        return blnk;
    }

    /**
     * Sets the value of the blnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public void setBlnk(QuantityOrCode1Choice value) {
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
     * {@link ProprietaryVote1 }
     * 
     * 
     * @return
     *     The value of the prtry property.
     */
    public List<ProprietaryVote1> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<>();
        }
        return this.prtry;
    }

}
