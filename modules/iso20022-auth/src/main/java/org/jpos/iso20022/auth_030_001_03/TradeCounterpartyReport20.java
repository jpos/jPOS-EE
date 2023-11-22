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

package org.jpos.iso20022.auth_030_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeCounterpartyReport20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeCounterpartyReport20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Counterparty45"/>
 *         <element name="OthrCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Counterparty46"/>
 *         <element name="Brkr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="SubmitgAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="ClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}PartyIdentification248Choice" minOccurs="0"/>
 *         <element name="Bnfcry" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}PartyIdentification248Choice" maxOccurs="2" minOccurs="0"/>
 *         <element name="NttyRspnsblForRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="ExctnAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}OrganisationIdentification15Choice" maxOccurs="2" minOccurs="0"/>
 *         <element name="RltshRcrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeCounterpartyRelationshipRecord1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCounterpartyReport20", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "brkr",
    "submitgAgt",
    "clrMmb",
    "bnfcry",
    "nttyRspnsblForRpt",
    "exctnAgt",
    "rltshRcrd"
})
public class TradeCounterpartyReport20 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected Counterparty45 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected Counterparty46 othrCtrPty;
    @XmlElement(name = "Brkr")
    protected OrganisationIdentification15Choice brkr;
    @XmlElement(name = "SubmitgAgt")
    protected OrganisationIdentification15Choice submitgAgt;
    @XmlElement(name = "ClrMmb")
    protected PartyIdentification248Choice clrMmb;
    @XmlElement(name = "Bnfcry")
    protected List<PartyIdentification248Choice> bnfcry;
    @XmlElement(name = "NttyRspnsblForRpt")
    protected OrganisationIdentification15Choice nttyRspnsblForRpt;
    @XmlElement(name = "ExctnAgt")
    protected List<OrganisationIdentification15Choice> exctnAgt;
    @XmlElement(name = "RltshRcrd")
    protected List<TradeCounterpartyRelationshipRecord1> rltshRcrd;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty45 }
     *     
     */
    public Counterparty45 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty45 }
     *     
     */
    public void setRptgCtrPty(Counterparty45 value) {
        this.rptgCtrPty = value;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty46 }
     *     
     */
    public Counterparty46 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty46 }
     *     
     */
    public void setOthrCtrPty(Counterparty46 value) {
        this.othrCtrPty = value;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setBrkr(OrganisationIdentification15Choice value) {
        this.brkr = value;
    }

    /**
     * Gets the value of the submitgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getSubmitgAgt() {
        return submitgAgt;
    }

    /**
     * Sets the value of the submitgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setSubmitgAgt(OrganisationIdentification15Choice value) {
        this.submitgAgt = value;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public PartyIdentification248Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public void setClrMmb(PartyIdentification248Choice value) {
        this.clrMmb = value;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfcry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfcry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification248Choice }
     * 
     * 
     * @return
     *     The value of the bnfcry property.
     */
    public List<PartyIdentification248Choice> getBnfcry() {
        if (bnfcry == null) {
            bnfcry = new ArrayList<>();
        }
        return this.bnfcry;
    }

    /**
     * Gets the value of the nttyRspnsblForRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getNttyRspnsblForRpt() {
        return nttyRspnsblForRpt;
    }

    /**
     * Sets the value of the nttyRspnsblForRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setNttyRspnsblForRpt(OrganisationIdentification15Choice value) {
        this.nttyRspnsblForRpt = value;
    }

    /**
     * Gets the value of the exctnAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the exctnAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExctnAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationIdentification15Choice }
     * 
     * 
     * @return
     *     The value of the exctnAgt property.
     */
    public List<OrganisationIdentification15Choice> getExctnAgt() {
        if (exctnAgt == null) {
            exctnAgt = new ArrayList<>();
        }
        return this.exctnAgt;
    }

    /**
     * Gets the value of the rltshRcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltshRcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltshRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeCounterpartyRelationshipRecord1 }
     * 
     * 
     * @return
     *     The value of the rltshRcrd property.
     */
    public List<TradeCounterpartyRelationshipRecord1> getRltshRcrd() {
        if (rltshRcrd == null) {
            rltshRcrd = new ArrayList<>();
        }
        return this.rltshRcrd;
    }

}
