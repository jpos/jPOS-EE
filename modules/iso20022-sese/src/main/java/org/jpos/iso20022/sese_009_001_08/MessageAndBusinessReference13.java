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

package org.jpos.iso20022.sese_009_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageAndBusinessReference13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MessageAndBusinessReference13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}References68Choice" minOccurs="0"/>
 *         <element name="TpOfReq" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}TypeOfRequest1Choice" minOccurs="0"/>
 *         <element name="MstrRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Max35Text" minOccurs="0"/>
 *         <element name="TrfRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Max35Text"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}AdditionalReference10" minOccurs="0"/>
 *         <element name="CxlRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Instrm" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}FinancialInstrument63Choice" minOccurs="0"/>
 *         <element name="InvstmtAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Account33" minOccurs="0"/>
 *         <element name="IntrmyInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Intermediary48" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="QryInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}AdditionalInformation25" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ReqIssr" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}PartyIdentification139" minOccurs="0"/>
 *         <element name="ReqRcpt" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}PartyIdentification139" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageAndBusinessReference13", propOrder = {
    "ref",
    "tpOfReq",
    "mstrRef",
    "trfRef",
    "clntRef",
    "cxlRef",
    "instrm",
    "invstmtAcctDtls",
    "intrmyInf",
    "qryInf",
    "reqIssr",
    "reqRcpt"
})
public class MessageAndBusinessReference13 {

    @XmlElement(name = "Ref")
    protected References68Choice ref;
    @XmlElement(name = "TpOfReq")
    protected TypeOfRequest1Choice tpOfReq;
    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "Instrm")
    protected FinancialInstrument63Choice instrm;
    @XmlElement(name = "InvstmtAcctDtls")
    protected Account33 invstmtAcctDtls;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary48> intrmyInf;
    @XmlElement(name = "QryInf")
    protected List<AdditionalInformation25> qryInf;
    @XmlElement(name = "ReqIssr")
    protected PartyIdentification139 reqIssr;
    @XmlElement(name = "ReqRcpt")
    protected PartyIdentification139 reqRcpt;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References68Choice }
     *     
     */
    public References68Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References68Choice }
     *     
     */
    public void setRef(References68Choice value) {
        this.ref = value;
    }

    /**
     * Gets the value of the tpOfReq property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfRequest1Choice }
     *     
     */
    public TypeOfRequest1Choice getTpOfReq() {
        return tpOfReq;
    }

    /**
     * Sets the value of the tpOfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfRequest1Choice }
     *     
     */
    public void setTpOfReq(TypeOfRequest1Choice value) {
        this.tpOfReq = value;
    }

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrRef(String value) {
        this.mstrRef = value;
    }

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfRef(String value) {
        this.trfRef = value;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public void setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlRef(String value) {
        this.cxlRef = value;
    }

    /**
     * Gets the value of the instrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument63Choice }
     *     
     */
    public FinancialInstrument63Choice getInstrm() {
        return instrm;
    }

    /**
     * Sets the value of the instrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument63Choice }
     *     
     */
    public void setInstrm(FinancialInstrument63Choice value) {
        this.instrm = value;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Account33 }
     *     
     */
    public Account33 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account33 }
     *     
     */
    public void setInvstmtAcctDtls(Account33 value) {
        this.invstmtAcctDtls = value;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary48 }
     * 
     * 
     * @return
     *     The value of the intrmyInf property.
     */
    public List<Intermediary48> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the qryInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qryInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQryInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation25 }
     * 
     * 
     * @return
     *     The value of the qryInf property.
     */
    public List<AdditionalInformation25> getQryInf() {
        if (qryInf == null) {
            qryInf = new ArrayList<>();
        }
        return this.qryInf;
    }

    /**
     * Gets the value of the reqIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getReqIssr() {
        return reqIssr;
    }

    /**
     * Sets the value of the reqIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public void setReqIssr(PartyIdentification139 value) {
        this.reqIssr = value;
    }

    /**
     * Gets the value of the reqRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getReqRcpt() {
        return reqRcpt;
    }

    /**
     * Sets the value of the reqRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public void setReqRcpt(PartyIdentification139 value) {
        this.reqRcpt = value;
    }

}
