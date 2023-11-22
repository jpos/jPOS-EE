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

package org.jpos.iso20022.camt_005_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentReturnCriteria4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentReturnCriteria4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgIdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="ReqdExctnDtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="InstrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="InstrStsRtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}InstructionStatusReturnCriteria1" minOccurs="0"/>
 *         <element name="InstdAmtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="IntrBkSttlmAmtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="PrtyInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="PrcgVldtyTmInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="PurpInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="InstrCpyInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="PmtMTInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="PmtTpInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="TxIdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="IntrBkSttlmDtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="EndToEndIdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="PmtMtdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="DbtrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="DbtrAgtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="InstgRmbrsmntAgtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="InstdRmbrsmntAgtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="IntrmyInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="CdtrAgtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="CdtrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReturnCriteria4", propOrder = {
    "msgIdInd",
    "reqdExctnDtInd",
    "instrInd",
    "instrStsRtrCrit",
    "instdAmtInd",
    "cdtDbtInd",
    "intrBkSttlmAmtInd",
    "prtyInd",
    "prcgVldtyTmInd",
    "purpInd",
    "instrCpyInd",
    "pmtMTInd",
    "pmtTpInd",
    "txIdInd",
    "intrBkSttlmDtInd",
    "endToEndIdInd",
    "pmtMtdInd",
    "dbtrInd",
    "dbtrAgtInd",
    "instgRmbrsmntAgtInd",
    "instdRmbrsmntAgtInd",
    "intrmyInd",
    "cdtrAgtInd",
    "cdtrInd"
})
public class PaymentReturnCriteria4 {

    @XmlElement(name = "MsgIdInd")
    protected Boolean msgIdInd;
    @XmlElement(name = "ReqdExctnDtInd")
    protected Boolean reqdExctnDtInd;
    @XmlElement(name = "InstrInd")
    protected Boolean instrInd;
    @XmlElement(name = "InstrStsRtrCrit")
    protected InstructionStatusReturnCriteria1 instrStsRtrCrit;
    @XmlElement(name = "InstdAmtInd")
    protected Boolean instdAmtInd;
    @XmlElement(name = "CdtDbtInd")
    protected Boolean cdtDbtInd;
    @XmlElement(name = "IntrBkSttlmAmtInd")
    protected Boolean intrBkSttlmAmtInd;
    @XmlElement(name = "PrtyInd")
    protected Boolean prtyInd;
    @XmlElement(name = "PrcgVldtyTmInd")
    protected Boolean prcgVldtyTmInd;
    @XmlElement(name = "PurpInd")
    protected Boolean purpInd;
    @XmlElement(name = "InstrCpyInd")
    protected Boolean instrCpyInd;
    @XmlElement(name = "PmtMTInd")
    protected Boolean pmtMTInd;
    @XmlElement(name = "PmtTpInd")
    protected Boolean pmtTpInd;
    @XmlElement(name = "TxIdInd")
    protected Boolean txIdInd;
    @XmlElement(name = "IntrBkSttlmDtInd")
    protected Boolean intrBkSttlmDtInd;
    @XmlElement(name = "EndToEndIdInd")
    protected Boolean endToEndIdInd;
    @XmlElement(name = "PmtMtdInd")
    protected Boolean pmtMtdInd;
    @XmlElement(name = "DbtrInd")
    protected Boolean dbtrInd;
    @XmlElement(name = "DbtrAgtInd")
    protected Boolean dbtrAgtInd;
    @XmlElement(name = "InstgRmbrsmntAgtInd")
    protected Boolean instgRmbrsmntAgtInd;
    @XmlElement(name = "InstdRmbrsmntAgtInd")
    protected Boolean instdRmbrsmntAgtInd;
    @XmlElement(name = "IntrmyInd")
    protected Boolean intrmyInd;
    @XmlElement(name = "CdtrAgtInd")
    protected Boolean cdtrAgtInd;
    @XmlElement(name = "CdtrInd")
    protected Boolean cdtrInd;

    /**
     * Gets the value of the msgIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMsgIdInd() {
        return msgIdInd;
    }

    /**
     * Sets the value of the msgIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMsgIdInd(Boolean value) {
        this.msgIdInd = value;
    }

    /**
     * Gets the value of the reqdExctnDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqdExctnDtInd() {
        return reqdExctnDtInd;
    }

    /**
     * Sets the value of the reqdExctnDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReqdExctnDtInd(Boolean value) {
        this.reqdExctnDtInd = value;
    }

    /**
     * Gets the value of the instrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstrInd() {
        return instrInd;
    }

    /**
     * Sets the value of the instrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstrInd(Boolean value) {
        this.instrInd = value;
    }

    /**
     * Gets the value of the instrStsRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionStatusReturnCriteria1 }
     *     
     */
    public InstructionStatusReturnCriteria1 getInstrStsRtrCrit() {
        return instrStsRtrCrit;
    }

    /**
     * Sets the value of the instrStsRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionStatusReturnCriteria1 }
     *     
     */
    public void setInstrStsRtrCrit(InstructionStatusReturnCriteria1 value) {
        this.instrStsRtrCrit = value;
    }

    /**
     * Gets the value of the instdAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstdAmtInd() {
        return instdAmtInd;
    }

    /**
     * Sets the value of the instdAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstdAmtInd(Boolean value) {
        this.instdAmtInd = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdtDbtInd(Boolean value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the intrBkSttlmAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrBkSttlmAmtInd() {
        return intrBkSttlmAmtInd;
    }

    /**
     * Sets the value of the intrBkSttlmAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrBkSttlmAmtInd(Boolean value) {
        this.intrBkSttlmAmtInd = value;
    }

    /**
     * Gets the value of the prtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtyInd() {
        return prtyInd;
    }

    /**
     * Sets the value of the prtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtyInd(Boolean value) {
        this.prtyInd = value;
    }

    /**
     * Gets the value of the prcgVldtyTmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrcgVldtyTmInd() {
        return prcgVldtyTmInd;
    }

    /**
     * Sets the value of the prcgVldtyTmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrcgVldtyTmInd(Boolean value) {
        this.prcgVldtyTmInd = value;
    }

    /**
     * Gets the value of the purpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurpInd() {
        return purpInd;
    }

    /**
     * Sets the value of the purpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurpInd(Boolean value) {
        this.purpInd = value;
    }

    /**
     * Gets the value of the instrCpyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstrCpyInd() {
        return instrCpyInd;
    }

    /**
     * Sets the value of the instrCpyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstrCpyInd(Boolean value) {
        this.instrCpyInd = value;
    }

    /**
     * Gets the value of the pmtMTInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtMTInd() {
        return pmtMTInd;
    }

    /**
     * Sets the value of the pmtMTInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtMTInd(Boolean value) {
        this.pmtMTInd = value;
    }

    /**
     * Gets the value of the pmtTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtTpInd() {
        return pmtTpInd;
    }

    /**
     * Sets the value of the pmtTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtTpInd(Boolean value) {
        this.pmtTpInd = value;
    }

    /**
     * Gets the value of the txIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxIdInd() {
        return txIdInd;
    }

    /**
     * Sets the value of the txIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTxIdInd(Boolean value) {
        this.txIdInd = value;
    }

    /**
     * Gets the value of the intrBkSttlmDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrBkSttlmDtInd() {
        return intrBkSttlmDtInd;
    }

    /**
     * Sets the value of the intrBkSttlmDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrBkSttlmDtInd(Boolean value) {
        this.intrBkSttlmDtInd = value;
    }

    /**
     * Gets the value of the endToEndIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndToEndIdInd() {
        return endToEndIdInd;
    }

    /**
     * Sets the value of the endToEndIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndToEndIdInd(Boolean value) {
        this.endToEndIdInd = value;
    }

    /**
     * Gets the value of the pmtMtdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtMtdInd() {
        return pmtMtdInd;
    }

    /**
     * Sets the value of the pmtMtdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtMtdInd(Boolean value) {
        this.pmtMtdInd = value;
    }

    /**
     * Gets the value of the dbtrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbtrInd() {
        return dbtrInd;
    }

    /**
     * Sets the value of the dbtrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDbtrInd(Boolean value) {
        this.dbtrInd = value;
    }

    /**
     * Gets the value of the dbtrAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbtrAgtInd() {
        return dbtrAgtInd;
    }

    /**
     * Sets the value of the dbtrAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDbtrAgtInd(Boolean value) {
        this.dbtrAgtInd = value;
    }

    /**
     * Gets the value of the instgRmbrsmntAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstgRmbrsmntAgtInd() {
        return instgRmbrsmntAgtInd;
    }

    /**
     * Sets the value of the instgRmbrsmntAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstgRmbrsmntAgtInd(Boolean value) {
        this.instgRmbrsmntAgtInd = value;
    }

    /**
     * Gets the value of the instdRmbrsmntAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstdRmbrsmntAgtInd() {
        return instdRmbrsmntAgtInd;
    }

    /**
     * Sets the value of the instdRmbrsmntAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstdRmbrsmntAgtInd(Boolean value) {
        this.instdRmbrsmntAgtInd = value;
    }

    /**
     * Gets the value of the intrmyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrmyInd() {
        return intrmyInd;
    }

    /**
     * Sets the value of the intrmyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrmyInd(Boolean value) {
        this.intrmyInd = value;
    }

    /**
     * Gets the value of the cdtrAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtrAgtInd() {
        return cdtrAgtInd;
    }

    /**
     * Sets the value of the cdtrAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdtrAgtInd(Boolean value) {
        this.cdtrAgtInd = value;
    }

    /**
     * Gets the value of the cdtrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtrInd() {
        return cdtrInd;
    }

    /**
     * Sets the value of the cdtrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdtrInd(Boolean value) {
        this.cdtrInd = value;
    }

}
