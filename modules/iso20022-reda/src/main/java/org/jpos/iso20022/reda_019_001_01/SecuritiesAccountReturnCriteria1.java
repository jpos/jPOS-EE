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

package org.jpos.iso20022.reda_019_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccountReturnCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesAccountReturnCriteria1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="PtyTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="AcctTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="OpngDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="EndInvstrFlg" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="PricgSchme" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountReturnCriteria1", propOrder = {
    "acctId",
    "ptyId",
    "ptyTp",
    "acctSvcr",
    "acctTp",
    "opngDt",
    "clsgDt",
    "endInvstrFlg",
    "pricgSchme"
})
public class SecuritiesAccountReturnCriteria1 {

    @XmlElement(name = "AcctId")
    protected Boolean acctId;
    @XmlElement(name = "PtyId")
    protected Boolean ptyId;
    @XmlElement(name = "PtyTp")
    protected Boolean ptyTp;
    @XmlElement(name = "AcctSvcr")
    protected Boolean acctSvcr;
    @XmlElement(name = "AcctTp")
    protected Boolean acctTp;
    @XmlElement(name = "OpngDt")
    protected Boolean opngDt;
    @XmlElement(name = "ClsgDt")
    protected Boolean clsgDt;
    @XmlElement(name = "EndInvstrFlg")
    protected Boolean endInvstrFlg;
    @XmlElement(name = "PricgSchme")
    protected Boolean pricgSchme;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctId(Boolean value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPtyId(Boolean value) {
        this.ptyId = value;
    }

    /**
     * Gets the value of the ptyTp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPtyTp() {
        return ptyTp;
    }

    /**
     * Sets the value of the ptyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPtyTp(Boolean value) {
        this.ptyTp = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctSvcr(Boolean value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctTp(Boolean value) {
        this.acctTp = value;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpngDt(Boolean value) {
        this.opngDt = value;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClsgDt(Boolean value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the endInvstrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndInvstrFlg() {
        return endInvstrFlg;
    }

    /**
     * Sets the value of the endInvstrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndInvstrFlg(Boolean value) {
        this.endInvstrFlg = value;
    }

    /**
     * Gets the value of the pricgSchme property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricgSchme() {
        return pricgSchme;
    }

    /**
     * Sets the value of the pricgSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricgSchme(Boolean value) {
        this.pricgSchme = value;
    }

}
