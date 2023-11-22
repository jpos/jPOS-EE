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

package org.jpos.iso20022.tsmt_002_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityReportItems3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ActivityReportItems3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.002.001.04}Max35Text"/>
 *         <element name="UsrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.002.001.04}DocumentIdentification5" maxOccurs="2" minOccurs="0"/>
 *         <element name="RptdNtty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.002.001.04}BICIdentification1" maxOccurs="unbounded"/>
 *         <element name="RptdItm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.002.001.04}ActivityDetails1" maxOccurs="unbounded"/>
 *         <element name="PdgReqForActn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.002.001.04}PendingActivity2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityReportItems3", propOrder = {
    "txId",
    "usrTxRef",
    "rptdNtty",
    "rptdItm",
    "pdgReqForActn"
})
public class ActivityReportItems3 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "UsrTxRef")
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "RptdNtty", required = true)
    protected List<BICIdentification1> rptdNtty;
    @XmlElement(name = "RptdItm", required = true)
    protected List<ActivityDetails1> rptdItm;
    @XmlElement(name = "PdgReqForActn")
    protected List<PendingActivity2> pdgReqForActn;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
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
     * Gets the value of the rptdNtty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptdNtty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptdNtty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the rptdNtty property.
     */
    public List<BICIdentification1> getRptdNtty() {
        if (rptdNtty == null) {
            rptdNtty = new ArrayList<>();
        }
        return this.rptdNtty;
    }

    /**
     * Gets the value of the rptdItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptdItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptdItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityDetails1 }
     * 
     * 
     * @return
     *     The value of the rptdItm property.
     */
    public List<ActivityDetails1> getRptdItm() {
        if (rptdItm == null) {
            rptdItm = new ArrayList<>();
        }
        return this.rptdItm;
    }

    /**
     * Gets the value of the pdgReqForActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdgReqForActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdgReqForActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingActivity2 }
     * 
     * 
     * @return
     *     The value of the pdgReqForActn property.
     */
    public List<PendingActivity2> getPdgReqForActn() {
        if (pdgReqForActn == null) {
            pdgReqForActn = new ArrayList<>();
        }
        return this.pdgReqForActn;
    }

}
