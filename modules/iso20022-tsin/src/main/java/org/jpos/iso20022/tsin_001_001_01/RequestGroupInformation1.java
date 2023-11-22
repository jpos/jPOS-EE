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

package org.jpos.iso20022.tsin_001_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestGroupInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestGroupInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GrpId" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}Max35Text"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}ISODateTime"/>
 *         <element name="Authstn" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}Max128Text" maxOccurs="2" minOccurs="0"/>
 *         <element name="NbOfInvcReqs" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}Max15NumericText" minOccurs="0"/>
 *         <element name="TtlBlkInvcAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}CurrencyCode"/>
 *         <element name="FincgAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}Max350Text" minOccurs="0"/>
 *         <element name="FincgRqstr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}PartyIdentificationAndAccount6"/>
 *         <element name="IntrmyAgt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}FinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="FrstAgt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}FinancialInstitutionIdentification6"/>
 *         <element name="AgrmtClauses" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}AgreementClauses1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}AdditionalInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestGroupInformation1", propOrder = {
    "grpId",
    "creDtTm",
    "authstn",
    "nbOfInvcReqs",
    "ttlBlkInvcAmt",
    "ccy",
    "fincgAgrmt",
    "fincgRqstr",
    "intrmyAgt",
    "frstAgt",
    "agrmtClauses",
    "addtlInf"
})
public class RequestGroupInformation1 {

    @XmlElement(name = "GrpId", required = true)
    protected String grpId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "Authstn")
    protected List<String> authstn;
    @XmlElement(name = "NbOfInvcReqs")
    protected String nbOfInvcReqs;
    @XmlElement(name = "TtlBlkInvcAmt")
    protected ActiveCurrencyAndAmount ttlBlkInvcAmt;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "FincgAgrmt")
    protected String fincgAgrmt;
    @XmlElement(name = "FincgRqstr", required = true)
    protected PartyIdentificationAndAccount6 fincgRqstr;
    @XmlElement(name = "IntrmyAgt")
    protected FinancialInstitutionIdentification6 intrmyAgt;
    @XmlElement(name = "FrstAgt", required = true)
    protected FinancialInstitutionIdentification6 frstAgt;
    @XmlElement(name = "AgrmtClauses")
    protected List<AgreementClauses1> agrmtClauses;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation1> addtlInf;

    /**
     * Gets the value of the grpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * Sets the value of the grpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpId(String value) {
        this.grpId = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the authstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the authstn property.
     */
    public List<String> getAuthstn() {
        if (authstn == null) {
            authstn = new ArrayList<>();
        }
        return this.authstn;
    }

    /**
     * Gets the value of the nbOfInvcReqs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfInvcReqs() {
        return nbOfInvcReqs;
    }

    /**
     * Sets the value of the nbOfInvcReqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfInvcReqs(String value) {
        this.nbOfInvcReqs = value;
    }

    /**
     * Gets the value of the ttlBlkInvcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlBlkInvcAmt() {
        return ttlBlkInvcAmt;
    }

    /**
     * Sets the value of the ttlBlkInvcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlBlkInvcAmt(ActiveCurrencyAndAmount value) {
        this.ttlBlkInvcAmt = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the fincgAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFincgAgrmt() {
        return fincgAgrmt;
    }

    /**
     * Sets the value of the fincgAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFincgAgrmt(String value) {
        this.fincgAgrmt = value;
    }

    /**
     * Gets the value of the fincgRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount6 }
     *     
     */
    public PartyIdentificationAndAccount6 getFincgRqstr() {
        return fincgRqstr;
    }

    /**
     * Sets the value of the fincgRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount6 }
     *     
     */
    public void setFincgRqstr(PartyIdentificationAndAccount6 value) {
        this.fincgRqstr = value;
    }

    /**
     * Gets the value of the intrmyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public FinancialInstitutionIdentification6 getIntrmyAgt() {
        return intrmyAgt;
    }

    /**
     * Sets the value of the intrmyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public void setIntrmyAgt(FinancialInstitutionIdentification6 value) {
        this.intrmyAgt = value;
    }

    /**
     * Gets the value of the frstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public FinancialInstitutionIdentification6 getFrstAgt() {
        return frstAgt;
    }

    /**
     * Sets the value of the frstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public void setFrstAgt(FinancialInstitutionIdentification6 value) {
        this.frstAgt = value;
    }

    /**
     * Gets the value of the agrmtClauses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the agrmtClauses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgrmtClauses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementClauses1 }
     * 
     * 
     * @return
     *     The value of the agrmtClauses property.
     */
    public List<AgreementClauses1> getAgrmtClauses() {
        if (agrmtClauses == null) {
            agrmtClauses = new ArrayList<>();
        }
        return this.agrmtClauses;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation1 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation1> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
