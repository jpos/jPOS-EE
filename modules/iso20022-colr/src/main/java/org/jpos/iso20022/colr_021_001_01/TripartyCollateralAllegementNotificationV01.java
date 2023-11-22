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

package org.jpos.iso20022.colr_021_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripartyCollateralAllegementNotificationV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TripartyCollateralAllegementNotificationV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}TransactionIdentifications44"/>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Pagination1"/>
 *         <element name="GnlParams" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}CollateralParameters11"/>
 *         <element name="CollPties" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}CollateralParties8"/>
 *         <element name="DealTxDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}DealTransactionDetails6"/>
 *         <element name="DealTxDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}CollateralDate2"/>
 *         <element name="SctiesMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}SecuritiesMovement7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}CashMovement5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralAllegementNotificationV01", propOrder = {
    "txInstrId",
    "pgntn",
    "gnlParams",
    "collPties",
    "dealTxDtls",
    "dealTxDt",
    "sctiesMvmnt",
    "cshMvmnt",
    "splmtryData"
})
public class TripartyCollateralAllegementNotificationV01 {

    @XmlElement(name = "TxInstrId", required = true)
    protected TransactionIdentifications44 txInstrId;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "GnlParams", required = true)
    protected CollateralParameters11 gnlParams;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties8 collPties;
    @XmlElement(name = "DealTxDtls", required = true)
    protected DealTransactionDetails6 dealTxDtls;
    @XmlElement(name = "DealTxDt", required = true)
    protected CollateralDate2 dealTxDt;
    @XmlElement(name = "SctiesMvmnt")
    protected List<SecuritiesMovement7> sctiesMvmnt;
    @XmlElement(name = "CshMvmnt")
    protected List<CashMovement5> cshMvmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications44 }
     *     
     */
    public TransactionIdentifications44 getTxInstrId() {
        return txInstrId;
    }

    /**
     * Sets the value of the txInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications44 }
     *     
     */
    public void setTxInstrId(TransactionIdentifications44 value) {
        this.txInstrId = value;
    }

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
     * Gets the value of the gnlParams property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParameters11 }
     *     
     */
    public CollateralParameters11 getGnlParams() {
        return gnlParams;
    }

    /**
     * Sets the value of the gnlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParameters11 }
     *     
     */
    public void setGnlParams(CollateralParameters11 value) {
        this.gnlParams = value;
    }

    /**
     * Gets the value of the collPties property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties8 }
     *     
     */
    public CollateralParties8 getCollPties() {
        return collPties;
    }

    /**
     * Sets the value of the collPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties8 }
     *     
     */
    public void setCollPties(CollateralParties8 value) {
        this.collPties = value;
    }

    /**
     * Gets the value of the dealTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DealTransactionDetails6 }
     *     
     */
    public DealTransactionDetails6 getDealTxDtls() {
        return dealTxDtls;
    }

    /**
     * Sets the value of the dealTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealTransactionDetails6 }
     *     
     */
    public void setDealTxDtls(DealTransactionDetails6 value) {
        this.dealTxDtls = value;
    }

    /**
     * Gets the value of the dealTxDt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralDate2 }
     *     
     */
    public CollateralDate2 getDealTxDt() {
        return dealTxDt;
    }

    /**
     * Sets the value of the dealTxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralDate2 }
     *     
     */
    public void setDealTxDt(CollateralDate2 value) {
        this.dealTxDt = value;
    }

    /**
     * Gets the value of the sctiesMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesMovement7 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmnt property.
     */
    public List<SecuritiesMovement7> getSctiesMvmnt() {
        if (sctiesMvmnt == null) {
            sctiesMvmnt = new ArrayList<>();
        }
        return this.sctiesMvmnt;
    }

    /**
     * Gets the value of the cshMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMovement5 }
     * 
     * 
     * @return
     *     The value of the cshMvmnt property.
     */
    public List<CashMovement5> getCshMvmnt() {
        if (cshMvmnt == null) {
            cshMvmnt = new ArrayList<>();
        }
        return this.cshMvmnt;
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
