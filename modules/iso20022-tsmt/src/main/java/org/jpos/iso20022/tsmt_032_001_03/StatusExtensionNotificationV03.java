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

package org.jpos.iso20022.tsmt_032_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusExtensionNotificationV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusExtensionNotificationV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.032.001.03}MessageIdentification1"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.032.001.03}SimpleIdentificationInformation"/>
 *         <element name="EstblishdBaselnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.032.001.03}DocumentIdentification3" minOccurs="0"/>
 *         <element name="UsrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.032.001.03}DocumentIdentification5" maxOccurs="2" minOccurs="0"/>
 *         <element name="XtndedSts" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.032.001.03}TransactionStatus5"/>
 *         <element name="ReqForActn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.032.001.03}PendingActivity2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusExtensionNotificationV03", propOrder = {
    "ntfctnId",
    "txId",
    "estblishdBaselnId",
    "usrTxRef",
    "xtndedSts",
    "reqForActn"
})
public class StatusExtensionNotificationV03 {

    @XmlElement(name = "NtfctnId", required = true)
    protected MessageIdentification1 ntfctnId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "EstblishdBaselnId")
    protected DocumentIdentification3 estblishdBaselnId;
    @XmlElement(name = "UsrTxRef")
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "XtndedSts", required = true)
    protected TransactionStatus5 xtndedSts;
    @XmlElement(name = "ReqForActn")
    protected PendingActivity2 reqForActn;

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setNtfctnId(MessageIdentification1 value) {
        this.ntfctnId = value;
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
     * Gets the value of the xtndedSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus5 }
     *     
     */
    public TransactionStatus5 getXtndedSts() {
        return xtndedSts;
    }

    /**
     * Sets the value of the xtndedSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus5 }
     *     
     */
    public void setXtndedSts(TransactionStatus5 value) {
        this.xtndedSts = value;
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
