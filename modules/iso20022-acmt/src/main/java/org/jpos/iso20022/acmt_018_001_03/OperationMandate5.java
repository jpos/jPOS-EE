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

package org.jpos.iso20022.acmt_018_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationMandate5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OperationMandate5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ModCd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}Modification1Code" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}Max35Text"/>
 *         <element name="AplblChanl" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}Channel2Choice" maxOccurs="unbounded"/>
 *         <element name="ReqrdSgntrNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}Max15PlusSignedNumericText"/>
 *         <element name="SgntrOrdrInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}YesNoIndicator"/>
 *         <element name="MndtHldr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}PartyAndAuthorisation5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BkOpr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}BankTransactionCodeStructure4" maxOccurs="unbounded"/>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}ISODate" minOccurs="0"/>
 *         <element name="EndDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationMandate5", propOrder = {
    "modCd",
    "id",
    "aplblChanl",
    "reqrdSgntrNb",
    "sgntrOrdrInd",
    "mndtHldr",
    "bkOpr",
    "startDt",
    "endDt"
})
public class OperationMandate5 {

    @XmlElement(name = "ModCd")
    @XmlSchemaType(name = "string")
    protected Modification1Code modCd;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AplblChanl", required = true)
    protected List<Channel2Choice> aplblChanl;
    @XmlElement(name = "ReqrdSgntrNb", required = true)
    protected String reqrdSgntrNb;
    @XmlElement(name = "SgntrOrdrInd")
    protected boolean sgntrOrdrInd;
    @XmlElement(name = "MndtHldr")
    protected List<PartyAndAuthorisation5> mndtHldr;
    @XmlElement(name = "BkOpr", required = true)
    protected List<BankTransactionCodeStructure4> bkOpr;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDt;

    /**
     * Gets the value of the modCd property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getModCd() {
        return modCd;
    }

    /**
     * Sets the value of the modCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public void setModCd(Modification1Code value) {
        this.modCd = value;
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
     * Gets the value of the aplblChanl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the aplblChanl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAplblChanl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Channel2Choice }
     * 
     * 
     * @return
     *     The value of the aplblChanl property.
     */
    public List<Channel2Choice> getAplblChanl() {
        if (aplblChanl == null) {
            aplblChanl = new ArrayList<>();
        }
        return this.aplblChanl;
    }

    /**
     * Gets the value of the reqrdSgntrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqrdSgntrNb() {
        return reqrdSgntrNb;
    }

    /**
     * Sets the value of the reqrdSgntrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqrdSgntrNb(String value) {
        this.reqrdSgntrNb = value;
    }

    /**
     * Gets the value of the sgntrOrdrInd property.
     * 
     */
    public boolean isSgntrOrdrInd() {
        return sgntrOrdrInd;
    }

    /**
     * Sets the value of the sgntrOrdrInd property.
     * 
     */
    public void setSgntrOrdrInd(boolean value) {
        this.sgntrOrdrInd = value;
    }

    /**
     * Gets the value of the mndtHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mndtHldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMndtHldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndAuthorisation5 }
     * 
     * 
     * @return
     *     The value of the mndtHldr property.
     */
    public List<PartyAndAuthorisation5> getMndtHldr() {
        if (mndtHldr == null) {
            mndtHldr = new ArrayList<>();
        }
        return this.mndtHldr;
    }

    /**
     * Gets the value of the bkOpr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bkOpr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkOpr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankTransactionCodeStructure4 }
     * 
     * 
     * @return
     *     The value of the bkOpr property.
     */
    public List<BankTransactionCodeStructure4> getBkOpr() {
        if (bkOpr == null) {
            bkOpr = new ArrayList<>();
        }
        return this.bkOpr;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
    }

}
