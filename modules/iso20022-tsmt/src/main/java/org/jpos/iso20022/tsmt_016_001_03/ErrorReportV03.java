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

package org.jpos.iso20022.tsmt_016_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorReportV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ErrorReportV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}MessageIdentification1"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}SimpleIdentificationInformation" minOccurs="0"/>
 *         <element name="EstblishdBaselnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}DocumentIdentification3" minOccurs="0"/>
 *         <element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}TransactionStatus4" minOccurs="0"/>
 *         <element name="UsrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}DocumentIdentification5" minOccurs="0"/>
 *         <element name="RjctdMsgRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}MessageIdentification1" minOccurs="0"/>
 *         <element name="NbOfErrs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}Count1"/>
 *         <element name="ErrDesc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}ValidationResult3" maxOccurs="unbounded"/>
 *         <element name="ReqForActn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}PendingActivity2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorReportV03", propOrder = {
    "rptId",
    "txId",
    "estblishdBaselnId",
    "txSts",
    "usrTxRef",
    "rjctdMsgRef",
    "nbOfErrs",
    "errDesc",
    "reqForActn"
})
public class ErrorReportV03 {

    @XmlElement(name = "RptId", required = true)
    protected MessageIdentification1 rptId;
    @XmlElement(name = "TxId")
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "EstblishdBaselnId")
    protected DocumentIdentification3 estblishdBaselnId;
    @XmlElement(name = "TxSts")
    protected TransactionStatus4 txSts;
    @XmlElement(name = "UsrTxRef")
    protected DocumentIdentification5 usrTxRef;
    @XmlElement(name = "RjctdMsgRef")
    protected MessageIdentification1 rjctdMsgRef;
    @XmlElement(name = "NbOfErrs", required = true)
    protected Count1 nbOfErrs;
    @XmlElement(name = "ErrDesc", required = true)
    protected List<ValidationResult3> errDesc;
    @XmlElement(name = "ReqForActn")
    protected PendingActivity2 reqForActn;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setRptId(MessageIdentification1 value) {
        this.rptId = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public void setTxId(SimpleIdentificationInformation value) {
        this.txId = value;
    }

    /**
     * Gets the value of the estblishdBaselnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public DocumentIdentification3 getEstblishdBaselnId() {
        return estblishdBaselnId;
    }

    /**
     * Sets the value of the estblishdBaselnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public void setEstblishdBaselnId(DocumentIdentification3 value) {
        this.estblishdBaselnId = value;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus4 }
     *     
     */
    public TransactionStatus4 getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus4 }
     *     
     */
    public void setTxSts(TransactionStatus4 value) {
        this.txSts = value;
    }

    /**
     * Gets the value of the usrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification5 }
     *     
     */
    public DocumentIdentification5 getUsrTxRef() {
        return usrTxRef;
    }

    /**
     * Sets the value of the usrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification5 }
     *     
     */
    public void setUsrTxRef(DocumentIdentification5 value) {
        this.usrTxRef = value;
    }

    /**
     * Gets the value of the rjctdMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRjctdMsgRef() {
        return rjctdMsgRef;
    }

    /**
     * Sets the value of the rjctdMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setRjctdMsgRef(MessageIdentification1 value) {
        this.rjctdMsgRef = value;
    }

    /**
     * Gets the value of the nbOfErrs property.
     * 
     * @return
     *     possible object is
     *     {@link Count1 }
     *     
     */
    public Count1 getNbOfErrs() {
        return nbOfErrs;
    }

    /**
     * Sets the value of the nbOfErrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Count1 }
     *     
     */
    public void setNbOfErrs(Count1 value) {
        this.nbOfErrs = value;
    }

    /**
     * Gets the value of the errDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationResult3 }
     * 
     * 
     * @return
     *     The value of the errDesc property.
     */
    public List<ValidationResult3> getErrDesc() {
        if (errDesc == null) {
            errDesc = new ArrayList<>();
        }
        return this.errDesc;
    }

    /**
     * Gets the value of the reqForActn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingActivity2 }
     *     
     */
    public PendingActivity2 getReqForActn() {
        return reqForActn;
    }

    /**
     * Sets the value of the reqForActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingActivity2 }
     *     
     */
    public void setReqForActn(PendingActivity2 value) {
        this.reqForActn = value;
    }

}
