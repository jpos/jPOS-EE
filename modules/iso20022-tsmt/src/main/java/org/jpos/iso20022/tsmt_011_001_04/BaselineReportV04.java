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

package org.jpos.iso20022.tsmt_011_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaselineReportV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BaselineReportV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}MessageIdentification1"/>
 *         <element name="RltdMsgRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}MessageIdentification1" minOccurs="0"/>
 *         <element name="RptTp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}ReportType2"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}SimpleIdentificationInformation"/>
 *         <element name="EstblishdBaselnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}DocumentIdentification6"/>
 *         <element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}TransactionStatus4"/>
 *         <element name="UsrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}DocumentIdentification5" maxOccurs="2" minOccurs="0"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}PartyIdentification26"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}PartyIdentification26"/>
 *         <element name="BuyrBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}BICIdentification1"/>
 *         <element name="SellrBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}BICIdentification1"/>
 *         <element name="RptdLineItm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}LineItem14"/>
 *         <element name="ReqForActn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}PendingActivity2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaselineReportV04", propOrder = {
    "rptId",
    "rltdMsgRef",
    "rptTp",
    "txId",
    "estblishdBaselnId",
    "txSts",
    "usrTxRef",
    "buyr",
    "sellr",
    "buyrBk",
    "sellrBk",
    "rptdLineItm",
    "reqForActn"
})
public class BaselineReportV04 {

    @XmlElement(name = "RptId", required = true)
    protected MessageIdentification1 rptId;
    @XmlElement(name = "RltdMsgRef")
    protected MessageIdentification1 rltdMsgRef;
    @XmlElement(name = "RptTp", required = true)
    protected ReportType2 rptTp;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "EstblishdBaselnId", required = true)
    protected DocumentIdentification6 estblishdBaselnId;
    @XmlElement(name = "TxSts", required = true)
    protected TransactionStatus4 txSts;
    @XmlElement(name = "UsrTxRef")
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification26 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification26 sellr;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "RptdLineItm", required = true)
    protected LineItem14 rptdLineItm;
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
     * Gets the value of the rltdMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRltdMsgRef() {
        return rltdMsgRef;
    }

    /**
     * Sets the value of the rltdMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setRltdMsgRef(MessageIdentification1 value) {
        this.rltdMsgRef = value;
    }

    /**
     * Gets the value of the rptTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReportType2 }
     *     
     */
    public ReportType2 getRptTp() {
        return rptTp;
    }

    /**
     * Sets the value of the rptTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportType2 }
     *     
     */
    public void setRptTp(ReportType2 value) {
        this.rptTp = value;
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
     *     {@link DocumentIdentification6 }
     *     
     */
    public DocumentIdentification6 getEstblishdBaselnId() {
        return estblishdBaselnId;
    }

    /**
     * Sets the value of the estblishdBaselnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification6 }
     *     
     */
    public void setEstblishdBaselnId(DocumentIdentification6 value) {
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
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setBuyr(PartyIdentification26 value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setSellr(PartyIdentification26 value) {
        this.sellr = value;
    }

    /**
     * Gets the value of the buyrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getBuyrBk() {
        return buyrBk;
    }

    /**
     * Sets the value of the buyrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setBuyrBk(BICIdentification1 value) {
        this.buyrBk = value;
    }

    /**
     * Gets the value of the sellrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSellrBk() {
        return sellrBk;
    }

    /**
     * Sets the value of the sellrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
    }

    /**
     * Gets the value of the rptdLineItm property.
     * 
     * @return
     *     possible object is
     *     {@link LineItem14 }
     *     
     */
    public LineItem14 getRptdLineItm() {
        return rptdLineItm;
    }

    /**
     * Sets the value of the rptdLineItm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItem14 }
     *     
     */
    public void setRptdLineItm(LineItem14 value) {
        this.rptdLineItm = value;
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
