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

package org.jpos.iso20022.acmt_005_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentAccount77 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentAccount77">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}Max35Text"/>
 *         <element name="AcctNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}Max35Text" minOccurs="0"/>
 *         <element name="AcctDsgnt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}Max35Text" minOccurs="0"/>
 *         <element name="OwnrId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}OwnerIdentification3Choice" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}PartyIdentification125Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount77", propOrder = {
    "acctId",
    "acctNm",
    "acctDsgnt",
    "ownrId",
    "acctSvcr"
})
public class InvestmentAccount77 {

    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "AcctDsgnt")
    protected String acctDsgnt;
    @XmlElement(name = "OwnrId")
    protected OwnerIdentification3Choice ownrId;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification125Choice acctSvcr;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNm() {
        return acctNm;
    }

    /**
     * Sets the value of the acctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNm(String value) {
        this.acctNm = value;
    }

    /**
     * Gets the value of the acctDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDsgnt() {
        return acctDsgnt;
    }

    /**
     * Sets the value of the acctDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctDsgnt(String value) {
        this.acctDsgnt = value;
    }

    /**
     * Gets the value of the ownrId property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerIdentification3Choice }
     *     
     */
    public OwnerIdentification3Choice getOwnrId() {
        return ownrId;
    }

    /**
     * Sets the value of the ownrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerIdentification3Choice }
     *     
     */
    public void setOwnrId(OwnerIdentification3Choice value) {
        this.ownrId = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setAcctSvcr(PartyIdentification125Choice value) {
        this.acctSvcr = value;
    }

}
