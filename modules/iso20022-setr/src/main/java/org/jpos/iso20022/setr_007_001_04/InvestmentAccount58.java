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

package org.jpos.iso20022.setr_007_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentAccount58 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentAccount58">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:setr.007.001.04}Max35Text"/>
 *         <element name="AcctNm" type="{urn:iso:std:iso:20022:tech:xsd:setr.007.001.04}Max35Text" minOccurs="0"/>
 *         <element name="AcctDsgnt" type="{urn:iso:std:iso:20022:tech:xsd:setr.007.001.04}Max35Text" minOccurs="0"/>
 *         <element name="OwnrId" type="{urn:iso:std:iso:20022:tech:xsd:setr.007.001.04}PartyIdentification113" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:setr.007.001.04}PartyIdentification113" minOccurs="0"/>
 *         <element name="OrdrOrgtrElgblty" type="{urn:iso:std:iso:20022:tech:xsd:setr.007.001.04}OrderOriginatorEligibility1Code" minOccurs="0"/>
 *         <element name="SubAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.007.001.04}SubAccount6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount58", propOrder = {
    "acctId",
    "acctNm",
    "acctDsgnt",
    "ownrId",
    "acctSvcr",
    "ordrOrgtrElgblty",
    "subAcctDtls"
})
public class InvestmentAccount58 {

    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "AcctDsgnt")
    protected String acctDsgnt;
    @XmlElement(name = "OwnrId")
    protected List<PartyIdentification113> ownrId;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification113 acctSvcr;
    @XmlElement(name = "OrdrOrgtrElgblty")
    @XmlSchemaType(name = "string")
    protected OrderOriginatorEligibility1Code ordrOrgtrElgblty;
    @XmlElement(name = "SubAcctDtls")
    protected SubAccount6 subAcctDtls;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ownrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification113 }
     * 
     * 
     * @return
     *     The value of the ownrId property.
     */
    public List<PartyIdentification113> getOwnrId() {
        if (ownrId == null) {
            ownrId = new ArrayList<>();
        }
        return this.ownrId;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public void setAcctSvcr(PartyIdentification113 value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the ordrOrgtrElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderOriginatorEligibility1Code }
     *     
     */
    public OrderOriginatorEligibility1Code getOrdrOrgtrElgblty() {
        return ordrOrgtrElgblty;
    }

    /**
     * Sets the value of the ordrOrgtrElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderOriginatorEligibility1Code }
     *     
     */
    public void setOrdrOrgtrElgblty(OrderOriginatorEligibility1Code value) {
        this.ordrOrgtrElgblty = value;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount6 }
     *     
     */
    public SubAccount6 getSubAcctDtls() {
        return subAcctDtls;
    }

    /**
     * Sets the value of the subAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount6 }
     *     
     */
    public void setSubAcctDtls(SubAccount6 value) {
        this.subAcctDtls = value;
    }

}
