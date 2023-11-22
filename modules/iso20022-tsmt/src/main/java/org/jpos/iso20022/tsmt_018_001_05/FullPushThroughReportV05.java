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

package org.jpos.iso20022.tsmt_018_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FullPushThroughReportV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FullPushThroughReportV05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}MessageIdentification1"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}SimpleIdentificationInformation"/>
 *         <element name="EstblishdBaselnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}DocumentIdentification3" minOccurs="0"/>
 *         <element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}TransactionStatus4"/>
 *         <element name="UsrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}DocumentIdentification5" maxOccurs="2" minOccurs="0"/>
 *         <element name="RptPurp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}ReportType1"/>
 *         <element name="PushdThrghBaseln" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}Baseline5"/>
 *         <element name="BuyrCtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}ContactIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SellrCtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}ContactIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BuyrBkCtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}ContactIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SellrBkCtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}ContactIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrBkCtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}ContactIdentification3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ReqForActn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}PendingActivity2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullPushThroughReportV05", propOrder = {
    "rptId",
    "txId",
    "estblishdBaselnId",
    "txSts",
    "usrTxRef",
    "rptPurp",
    "pushdThrghBaseln",
    "buyrCtctPrsn",
    "sellrCtctPrsn",
    "buyrBkCtctPrsn",
    "sellrBkCtctPrsn",
    "othrBkCtctPrsn",
    "reqForActn"
})
public class FullPushThroughReportV05 {

    @XmlElement(name = "RptId", required = true)
    protected MessageIdentification1 rptId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "EstblishdBaselnId")
    protected DocumentIdentification3 estblishdBaselnId;
    @XmlElement(name = "TxSts", required = true)
    protected TransactionStatus4 txSts;
    @XmlElement(name = "UsrTxRef")
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "RptPurp", required = true)
    protected ReportType1 rptPurp;
    @XmlElement(name = "PushdThrghBaseln", required = true)
    protected Baseline5 pushdThrghBaseln;
    @XmlElement(name = "BuyrCtctPrsn")
    protected List<ContactIdentification1> buyrCtctPrsn;
    @XmlElement(name = "SellrCtctPrsn")
    protected List<ContactIdentification1> sellrCtctPrsn;
    @XmlElement(name = "BuyrBkCtctPrsn")
    protected List<ContactIdentification1> buyrBkCtctPrsn;
    @XmlElement(name = "SellrBkCtctPrsn")
    protected List<ContactIdentification1> sellrBkCtctPrsn;
    @XmlElement(name = "OthrBkCtctPrsn")
    protected List<ContactIdentification3> othrBkCtctPrsn;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the usrTxRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsrTxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification5 }
     * 
     * 
     * @return
     *     The value of the usrTxRef property.
     */
    public List<DocumentIdentification5> getUsrTxRef() {
        if (usrTxRef == null) {
            usrTxRef = new ArrayList<>();
        }
        return this.usrTxRef;
    }

    /**
     * Gets the value of the rptPurp property.
     * 
     * @return
     *     possible object is
     *     {@link ReportType1 }
     *     
     */
    public ReportType1 getRptPurp() {
        return rptPurp;
    }

    /**
     * Sets the value of the rptPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportType1 }
     *     
     */
    public void setRptPurp(ReportType1 value) {
        this.rptPurp = value;
    }

    /**
     * Gets the value of the pushdThrghBaseln property.
     * 
     * @return
     *     possible object is
     *     {@link Baseline5 }
     *     
     */
    public Baseline5 getPushdThrghBaseln() {
        return pushdThrghBaseln;
    }

    /**
     * Sets the value of the pushdThrghBaseln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Baseline5 }
     *     
     */
    public void setPushdThrghBaseln(Baseline5 value) {
        this.pushdThrghBaseln = value;
    }

    /**
     * Gets the value of the buyrCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the buyrCtctPrsn property.
     */
    public List<ContactIdentification1> getBuyrCtctPrsn() {
        if (buyrCtctPrsn == null) {
            buyrCtctPrsn = new ArrayList<>();
        }
        return this.buyrCtctPrsn;
    }

    /**
     * Gets the value of the sellrCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the sellrCtctPrsn property.
     */
    public List<ContactIdentification1> getSellrCtctPrsn() {
        if (sellrCtctPrsn == null) {
            sellrCtctPrsn = new ArrayList<>();
        }
        return this.sellrCtctPrsn;
    }

    /**
     * Gets the value of the buyrBkCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrBkCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrBkCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the buyrBkCtctPrsn property.
     */
    public List<ContactIdentification1> getBuyrBkCtctPrsn() {
        if (buyrBkCtctPrsn == null) {
            buyrBkCtctPrsn = new ArrayList<>();
        }
        return this.buyrBkCtctPrsn;
    }

    /**
     * Gets the value of the sellrBkCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrBkCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrBkCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the sellrBkCtctPrsn property.
     */
    public List<ContactIdentification1> getSellrBkCtctPrsn() {
        if (sellrBkCtctPrsn == null) {
            sellrBkCtctPrsn = new ArrayList<>();
        }
        return this.sellrBkCtctPrsn;
    }

    /**
     * Gets the value of the othrBkCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrBkCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrBkCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification3 }
     * 
     * 
     * @return
     *     The value of the othrBkCtctPrsn property.
     */
    public List<ContactIdentification3> getOthrBkCtctPrsn() {
        if (othrBkCtctPrsn == null) {
            othrBkCtctPrsn = new ArrayList<>();
        }
        return this.othrBkCtctPrsn;
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
