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

package org.jpos.iso20022.colr_024_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripartyCollateralAllegementNotificationCancellationAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TripartyCollateralAllegementNotificationCancellationAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}TransactionIdentifications44"/>
 *         <element name="CollTxTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}CollateralTransactionType1Choice"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}ExposureType23Choice"/>
 *         <element name="CollSd" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}CollateralRole1Code"/>
 *         <element name="ElgbltySetPrfl" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}GenericIdentification1" minOccurs="0"/>
 *         <element name="CollPties" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}CollateralParties8"/>
 *         <element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}AmountAndDirection49" minOccurs="0"/>
 *         <element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}SupplementaryData1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralAllegementNotificationCancellationAdviceV01", propOrder = {
    "txInstrId",
    "collTxTp",
    "xpsrTp",
    "collSd",
    "elgbltySetPrfl",
    "collPties",
    "txAmt",
    "reqdExctnDt",
    "splmtryData"
})
public class TripartyCollateralAllegementNotificationCancellationAdviceV01 {

    @XmlElement(name = "TxInstrId", required = true)
    protected TransactionIdentifications44 txInstrId;
    @XmlElement(name = "CollTxTp", required = true)
    protected CollateralTransactionType1Choice collTxTp;
    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "ElgbltySetPrfl")
    protected GenericIdentification1 elgbltySetPrfl;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties8 collPties;
    @XmlElement(name = "TxAmt")
    protected AmountAndDirection49 txAmt;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "SplmtryData")
    protected SupplementaryData1 splmtryData;

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
     * Gets the value of the collTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public CollateralTransactionType1Choice getCollTxTp() {
        return collTxTp;
    }

    /**
     * Sets the value of the collTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public void setCollTxTp(CollateralTransactionType1Choice value) {
        this.collTxTp = value;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType23Choice }
     *     
     */
    public ExposureType23Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType23Choice }
     *     
     */
    public void setXpsrTp(ExposureType23Choice value) {
        this.xpsrTp = value;
    }

    /**
     * Gets the value of the collSd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Sets the value of the collSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public void setCollSd(CollateralRole1Code value) {
        this.collSd = value;
    }

    /**
     * Gets the value of the elgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getElgbltySetPrfl() {
        return elgbltySetPrfl;
    }

    /**
     * Sets the value of the elgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setElgbltySetPrfl(GenericIdentification1 value) {
        this.elgbltySetPrfl = value;
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
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setTxAmt(AmountAndDirection49 value) {
        this.txAmt = value;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getSplmtryData() {
        return splmtryData;
    }

    /**
     * Sets the value of the splmtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public void setSplmtryData(SupplementaryData1 value) {
        this.splmtryData = value;
    }

}
