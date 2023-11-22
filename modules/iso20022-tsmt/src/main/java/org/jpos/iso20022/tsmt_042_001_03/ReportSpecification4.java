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

package org.jpos.iso20022.tsmt_042_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportSpecification4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportSpecification4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}TransactionStatus4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SubmitrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NttiesToBeRptd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}BICIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Crspdt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}BICIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SubmitgBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}BICIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OblgrBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}BICIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}PartyIdentification28" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}PartyIdentification28" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BuyrCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SellrCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CrspdtCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdgReqForActn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}PendingActivity1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSpecification4", propOrder = {
    "txId",
    "txSts",
    "submitrTxRef",
    "nttiesToBeRptd",
    "crspdt",
    "submitgBk",
    "oblgrBk",
    "buyr",
    "sellr",
    "buyrCtry",
    "sellrCtry",
    "crspdtCtry",
    "pdgReqForActn"
})
public class ReportSpecification4 {

    @XmlElement(name = "TxId")
    protected List<String> txId;
    @XmlElement(name = "TxSts")
    protected List<TransactionStatus4> txSts;
    @XmlElement(name = "SubmitrTxRef")
    protected List<String> submitrTxRef;
    @XmlElement(name = "NttiesToBeRptd")
    protected List<BICIdentification1> nttiesToBeRptd;
    @XmlElement(name = "Crspdt")
    protected List<BICIdentification1> crspdt;
    @XmlElement(name = "SubmitgBk")
    protected List<BICIdentification1> submitgBk;
    @XmlElement(name = "OblgrBk")
    protected List<BICIdentification1> oblgrBk;
    @XmlElement(name = "Buyr")
    protected List<PartyIdentification28> buyr;
    @XmlElement(name = "Sellr")
    protected List<PartyIdentification28> sellr;
    @XmlElement(name = "BuyrCtry")
    protected List<String> buyrCtry;
    @XmlElement(name = "SellrCtry")
    protected List<String> sellrCtry;
    @XmlElement(name = "CrspdtCtry")
    protected List<String> crspdtCtry;
    @XmlElement(name = "PdgReqForActn")
    protected List<PendingActivity1> pdgReqForActn;

    /**
     * Gets the value of the txId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the txId property.
     */
    public List<String> getTxId() {
        if (txId == null) {
            txId = new ArrayList<>();
        }
        return this.txId;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionStatus4 }
     * 
     * 
     * @return
     *     The value of the txSts property.
     */
    public List<TransactionStatus4> getTxSts() {
        if (txSts == null) {
            txSts = new ArrayList<>();
        }
        return this.txSts;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the submitrTxRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitrTxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the submitrTxRef property.
     */
    public List<String> getSubmitrTxRef() {
        if (submitrTxRef == null) {
            submitrTxRef = new ArrayList<>();
        }
        return this.submitrTxRef;
    }

    /**
     * Gets the value of the nttiesToBeRptd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nttiesToBeRptd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNttiesToBeRptd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the nttiesToBeRptd property.
     */
    public List<BICIdentification1> getNttiesToBeRptd() {
        if (nttiesToBeRptd == null) {
            nttiesToBeRptd = new ArrayList<>();
        }
        return this.nttiesToBeRptd;
    }

    /**
     * Gets the value of the crspdt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crspdt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrspdt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the crspdt property.
     */
    public List<BICIdentification1> getCrspdt() {
        if (crspdt == null) {
            crspdt = new ArrayList<>();
        }
        return this.crspdt;
    }

    /**
     * Gets the value of the submitgBk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the submitgBk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitgBk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the submitgBk property.
     */
    public List<BICIdentification1> getSubmitgBk() {
        if (submitgBk == null) {
            submitgBk = new ArrayList<>();
        }
        return this.submitgBk;
    }

    /**
     * Gets the value of the oblgrBk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the oblgrBk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOblgrBk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the oblgrBk property.
     */
    public List<BICIdentification1> getOblgrBk() {
        if (oblgrBk == null) {
            oblgrBk = new ArrayList<>();
        }
        return this.oblgrBk;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification28 }
     * 
     * 
     * @return
     *     The value of the buyr property.
     */
    public List<PartyIdentification28> getBuyr() {
        if (buyr == null) {
            buyr = new ArrayList<>();
        }
        return this.buyr;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification28 }
     * 
     * 
     * @return
     *     The value of the sellr property.
     */
    public List<PartyIdentification28> getSellr() {
        if (sellr == null) {
            sellr = new ArrayList<>();
        }
        return this.sellr;
    }

    /**
     * Gets the value of the buyrCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the buyrCtry property.
     */
    public List<String> getBuyrCtry() {
        if (buyrCtry == null) {
            buyrCtry = new ArrayList<>();
        }
        return this.buyrCtry;
    }

    /**
     * Gets the value of the sellrCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the sellrCtry property.
     */
    public List<String> getSellrCtry() {
        if (sellrCtry == null) {
            sellrCtry = new ArrayList<>();
        }
        return this.sellrCtry;
    }

    /**
     * Gets the value of the crspdtCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crspdtCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrspdtCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the crspdtCtry property.
     */
    public List<String> getCrspdtCtry() {
        if (crspdtCtry == null) {
            crspdtCtry = new ArrayList<>();
        }
        return this.crspdtCtry;
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
     * {@link PendingActivity1 }
     * 
     * 
     * @return
     *     The value of the pdgReqForActn property.
     */
    public List<PendingActivity1> getPdgReqForActn() {
        if (pdgReqForActn == null) {
            pdgReqForActn = new ArrayList<>();
        }
        return this.pdgReqForActn;
    }

}
