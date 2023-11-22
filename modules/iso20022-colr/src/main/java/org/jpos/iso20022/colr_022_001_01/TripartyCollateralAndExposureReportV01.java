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

package org.jpos.iso20022.colr_022_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripartyCollateralAndExposureReportV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TripartyCollateralAndExposureReportV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Pagination1"/>
 *         <element name="StmtGnlDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Statement78"/>
 *         <element name="CollPties" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralParties9"/>
 *         <element name="OvrllCollAggtn" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}OverallCollateralDetails2" minOccurs="0"/>
 *         <element name="XpsrTpAggtn" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ExposureTypeAggregation3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtrPtyAggtn" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CounterpartyAggregation3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Txs" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Transaction124" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctBaseCcyTtlAmts" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}TotalValueInPageAndStatement5" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralAndExposureReportV01", propOrder = {
    "pgntn",
    "stmtGnlDtls",
    "collPties",
    "ovrllCollAggtn",
    "xpsrTpAggtn",
    "ctrPtyAggtn",
    "txs",
    "acctBaseCcyTtlAmts",
    "splmtryData"
})
public class TripartyCollateralAndExposureReportV01 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement78 stmtGnlDtls;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties9 collPties;
    @XmlElement(name = "OvrllCollAggtn")
    protected OverallCollateralDetails2 ovrllCollAggtn;
    @XmlElement(name = "XpsrTpAggtn")
    protected List<ExposureTypeAggregation3> xpsrTpAggtn;
    @XmlElement(name = "CtrPtyAggtn")
    protected List<CounterpartyAggregation3> ctrPtyAggtn;
    @XmlElement(name = "Txs")
    protected List<Transaction124> txs;
    @XmlElement(name = "AcctBaseCcyTtlAmts")
    protected TotalValueInPageAndStatement5 acctBaseCcyTtlAmts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setPgntn(Pagination1 value) {
        this.pgntn = value;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement78 }
     *     
     */
    public Statement78 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement78 }
     *     
     */
    public void setStmtGnlDtls(Statement78 value) {
        this.stmtGnlDtls = value;
    }

    /**
     * Gets the value of the collPties property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties9 }
     *     
     */
    public CollateralParties9 getCollPties() {
        return collPties;
    }

    /**
     * Sets the value of the collPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties9 }
     *     
     */
    public void setCollPties(CollateralParties9 value) {
        this.collPties = value;
    }

    /**
     * Gets the value of the ovrllCollAggtn property.
     * 
     * @return
     *     possible object is
     *     {@link OverallCollateralDetails2 }
     *     
     */
    public OverallCollateralDetails2 getOvrllCollAggtn() {
        return ovrllCollAggtn;
    }

    /**
     * Sets the value of the ovrllCollAggtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallCollateralDetails2 }
     *     
     */
    public void setOvrllCollAggtn(OverallCollateralDetails2 value) {
        this.ovrllCollAggtn = value;
    }

    /**
     * Gets the value of the xpsrTpAggtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xpsrTpAggtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXpsrTpAggtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposureTypeAggregation3 }
     * 
     * 
     * @return
     *     The value of the xpsrTpAggtn property.
     */
    public List<ExposureTypeAggregation3> getXpsrTpAggtn() {
        if (xpsrTpAggtn == null) {
            xpsrTpAggtn = new ArrayList<>();
        }
        return this.xpsrTpAggtn;
    }

    /**
     * Gets the value of the ctrPtyAggtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrPtyAggtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtyAggtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterpartyAggregation3 }
     * 
     * 
     * @return
     *     The value of the ctrPtyAggtn property.
     */
    public List<CounterpartyAggregation3> getCtrPtyAggtn() {
        if (ctrPtyAggtn == null) {
            ctrPtyAggtn = new ArrayList<>();
        }
        return this.ctrPtyAggtn;
    }

    /**
     * Gets the value of the txs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction124 }
     * 
     * 
     * @return
     *     The value of the txs property.
     */
    public List<Transaction124> getTxs() {
        if (txs == null) {
            txs = new ArrayList<>();
        }
        return this.txs;
    }

    /**
     * Gets the value of the acctBaseCcyTtlAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TotalValueInPageAndStatement5 }
     *     
     */
    public TotalValueInPageAndStatement5 getAcctBaseCcyTtlAmts() {
        return acctBaseCcyTtlAmts;
    }

    /**
     * Sets the value of the acctBaseCcyTtlAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalValueInPageAndStatement5 }
     *     
     */
    public void setAcctBaseCcyTtlAmts(TotalValueInPageAndStatement5 value) {
        this.acctBaseCcyTtlAmts = value;
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
