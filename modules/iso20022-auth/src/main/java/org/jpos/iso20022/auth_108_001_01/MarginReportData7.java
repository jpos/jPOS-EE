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

package org.jpos.iso20022.auth_108_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginReportData7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginReportData7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="CtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}TradeCounterpartyReport20"/>
 *         <element name="EvtDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}ISODate" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}UniqueTransactionIdentifier2Choice" minOccurs="0"/>
 *         <element name="Coll" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}MarginCollateralReport4"/>
 *         <element name="PstdMrgnOrColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}PostedMarginOrCollateral6" minOccurs="0"/>
 *         <element name="RcvdMrgnOrColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}ReceivedMarginOrCollateral6" minOccurs="0"/>
 *         <element name="CtrPtyRatgTrggrInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CtrPtyRatgThrshldInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TechAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}TechnicalAttributes6" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.108.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginReportData7", propOrder = {
    "rptgTmStmp",
    "ctrPtyId",
    "evtDt",
    "txId",
    "coll",
    "pstdMrgnOrColl",
    "rcvdMrgnOrColl",
    "ctrPtyRatgTrggrInd",
    "ctrPtyRatgThrshldInd",
    "techAttrbts",
    "splmtryData"
})
public class MarginReportData7 {

    @XmlElement(name = "RptgTmStmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rptgTmStmp;
    @XmlElement(name = "CtrPtyId", required = true)
    protected TradeCounterpartyReport20 ctrPtyId;
    @XmlElement(name = "EvtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(name = "TxId")
    protected UniqueTransactionIdentifier2Choice txId;
    @XmlElement(name = "Coll", required = true)
    protected MarginCollateralReport4 coll;
    @XmlElement(name = "PstdMrgnOrColl")
    protected PostedMarginOrCollateral6 pstdMrgnOrColl;
    @XmlElement(name = "RcvdMrgnOrColl")
    protected ReceivedMarginOrCollateral6 rcvdMrgnOrColl;
    @XmlElement(name = "CtrPtyRatgTrggrInd")
    protected Boolean ctrPtyRatgTrggrInd;
    @XmlElement(name = "CtrPtyRatgThrshldInd")
    protected Boolean ctrPtyRatgThrshldInd;
    @XmlElement(name = "TechAttrbts")
    protected TechnicalAttributes6 techAttrbts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptgTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptgTmStmp() {
        return rptgTmStmp;
    }

    /**
     * Sets the value of the rptgTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRptgTmStmp(XMLGregorianCalendar value) {
        this.rptgTmStmp = value;
    }

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public TradeCounterpartyReport20 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public void setCtrPtyId(TradeCounterpartyReport20 value) {
        this.ctrPtyId = value;
    }

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvtDt(XMLGregorianCalendar value) {
        this.evtDt = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public UniqueTransactionIdentifier2Choice getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public void setTxId(UniqueTransactionIdentifier2Choice value) {
        this.txId = value;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public MarginCollateralReport4 getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public void setColl(MarginCollateralReport4 value) {
        this.coll = value;
    }

    /**
     * Gets the value of the pstdMrgnOrColl property.
     * 
     * @return
     *     possible object is
     *     {@link PostedMarginOrCollateral6 }
     *     
     */
    public PostedMarginOrCollateral6 getPstdMrgnOrColl() {
        return pstdMrgnOrColl;
    }

    /**
     * Sets the value of the pstdMrgnOrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostedMarginOrCollateral6 }
     *     
     */
    public void setPstdMrgnOrColl(PostedMarginOrCollateral6 value) {
        this.pstdMrgnOrColl = value;
    }

    /**
     * Gets the value of the rcvdMrgnOrColl property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedMarginOrCollateral6 }
     *     
     */
    public ReceivedMarginOrCollateral6 getRcvdMrgnOrColl() {
        return rcvdMrgnOrColl;
    }

    /**
     * Sets the value of the rcvdMrgnOrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedMarginOrCollateral6 }
     *     
     */
    public void setRcvdMrgnOrColl(ReceivedMarginOrCollateral6 value) {
        this.rcvdMrgnOrColl = value;
    }

    /**
     * Gets the value of the ctrPtyRatgTrggrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtrPtyRatgTrggrInd() {
        return ctrPtyRatgTrggrInd;
    }

    /**
     * Sets the value of the ctrPtyRatgTrggrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCtrPtyRatgTrggrInd(Boolean value) {
        this.ctrPtyRatgTrggrInd = value;
    }

    /**
     * Gets the value of the ctrPtyRatgThrshldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtrPtyRatgThrshldInd() {
        return ctrPtyRatgThrshldInd;
    }

    /**
     * Sets the value of the ctrPtyRatgThrshldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCtrPtyRatgThrshldInd(Boolean value) {
        this.ctrPtyRatgThrshldInd = value;
    }

    /**
     * Gets the value of the techAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalAttributes6 }
     *     
     */
    public TechnicalAttributes6 getTechAttrbts() {
        return techAttrbts;
    }

    /**
     * Sets the value of the techAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalAttributes6 }
     *     
     */
    public void setTechAttrbts(TechnicalAttributes6 value) {
        this.techAttrbts = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
