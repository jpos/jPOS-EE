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

package org.jpos.iso20022.caad_004_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordMessage1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RecordMessage1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AdddmInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="AdddmRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="Amdmnt" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="AuthstnInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="AuthstnRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="CardMgmtInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="CardMgmtRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="ChrgBckInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="ChrgBckRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="Err" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="FeeColltnInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="FeeColltnRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="FileActnInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="FileActnRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="FinInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="FinRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="FrdDspstnInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="FrdDspstnRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="FrdRptgInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="FrdRptgRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="NqryInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="NqryRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="KeyXchgInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="KeyXchgRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="NtwkMgmtInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="NtwkMgmtRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="RcncltnInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="RcncltnRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="RtrvlInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="RtrvlRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="RtrvlFlfmtInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="RtrvlFlfmtRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="RvslInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="RvslRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="SttlmRptgInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="SttlmRptgRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="VrfctnInitn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *         <element name="VrfctnRspn" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max2MBBinary"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordMessage1Choice", propOrder = {
    "adddmInitn",
    "adddmRspn",
    "amdmnt",
    "authstnInitn",
    "authstnRspn",
    "cardMgmtInitn",
    "cardMgmtRspn",
    "chrgBckInitn",
    "chrgBckRspn",
    "err",
    "feeColltnInitn",
    "feeColltnRspn",
    "fileActnInitn",
    "fileActnRspn",
    "finInitn",
    "finRspn",
    "frdDspstnInitn",
    "frdDspstnRspn",
    "frdRptgInitn",
    "frdRptgRspn",
    "nqryInitn",
    "nqryRspn",
    "keyXchgInitn",
    "keyXchgRspn",
    "ntwkMgmtInitn",
    "ntwkMgmtRspn",
    "rcncltnInitn",
    "rcncltnRspn",
    "rtrvlInitn",
    "rtrvlRspn",
    "rtrvlFlfmtInitn",
    "rtrvlFlfmtRspn",
    "rvslInitn",
    "rvslRspn",
    "sttlmRptgInitn",
    "sttlmRptgRspn",
    "vrfctnInitn",
    "vrfctnRspn"
})
public class RecordMessage1Choice {

    @XmlElement(name = "AdddmInitn")
    protected byte[] adddmInitn;
    @XmlElement(name = "AdddmRspn")
    protected byte[] adddmRspn;
    @XmlElement(name = "Amdmnt")
    protected byte[] amdmnt;
    @XmlElement(name = "AuthstnInitn")
    protected byte[] authstnInitn;
    @XmlElement(name = "AuthstnRspn")
    protected byte[] authstnRspn;
    @XmlElement(name = "CardMgmtInitn")
    protected byte[] cardMgmtInitn;
    @XmlElement(name = "CardMgmtRspn")
    protected byte[] cardMgmtRspn;
    @XmlElement(name = "ChrgBckInitn")
    protected byte[] chrgBckInitn;
    @XmlElement(name = "ChrgBckRspn")
    protected byte[] chrgBckRspn;
    @XmlElement(name = "Err")
    protected byte[] err;
    @XmlElement(name = "FeeColltnInitn")
    protected byte[] feeColltnInitn;
    @XmlElement(name = "FeeColltnRspn")
    protected byte[] feeColltnRspn;
    @XmlElement(name = "FileActnInitn")
    protected byte[] fileActnInitn;
    @XmlElement(name = "FileActnRspn")
    protected byte[] fileActnRspn;
    @XmlElement(name = "FinInitn")
    protected byte[] finInitn;
    @XmlElement(name = "FinRspn")
    protected byte[] finRspn;
    @XmlElement(name = "FrdDspstnInitn")
    protected byte[] frdDspstnInitn;
    @XmlElement(name = "FrdDspstnRspn")
    protected byte[] frdDspstnRspn;
    @XmlElement(name = "FrdRptgInitn")
    protected byte[] frdRptgInitn;
    @XmlElement(name = "FrdRptgRspn")
    protected byte[] frdRptgRspn;
    @XmlElement(name = "NqryInitn")
    protected byte[] nqryInitn;
    @XmlElement(name = "NqryRspn")
    protected byte[] nqryRspn;
    @XmlElement(name = "KeyXchgInitn")
    protected byte[] keyXchgInitn;
    @XmlElement(name = "KeyXchgRspn")
    protected byte[] keyXchgRspn;
    @XmlElement(name = "NtwkMgmtInitn")
    protected byte[] ntwkMgmtInitn;
    @XmlElement(name = "NtwkMgmtRspn")
    protected byte[] ntwkMgmtRspn;
    @XmlElement(name = "RcncltnInitn")
    protected byte[] rcncltnInitn;
    @XmlElement(name = "RcncltnRspn")
    protected byte[] rcncltnRspn;
    @XmlElement(name = "RtrvlInitn")
    protected byte[] rtrvlInitn;
    @XmlElement(name = "RtrvlRspn")
    protected byte[] rtrvlRspn;
    @XmlElement(name = "RtrvlFlfmtInitn")
    protected byte[] rtrvlFlfmtInitn;
    @XmlElement(name = "RtrvlFlfmtRspn")
    protected byte[] rtrvlFlfmtRspn;
    @XmlElement(name = "RvslInitn")
    protected byte[] rvslInitn;
    @XmlElement(name = "RvslRspn")
    protected byte[] rvslRspn;
    @XmlElement(name = "SttlmRptgInitn")
    protected byte[] sttlmRptgInitn;
    @XmlElement(name = "SttlmRptgRspn")
    protected byte[] sttlmRptgRspn;
    @XmlElement(name = "VrfctnInitn")
    protected byte[] vrfctnInitn;
    @XmlElement(name = "VrfctnRspn")
    protected byte[] vrfctnRspn;

    /**
     * Gets the value of the adddmInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAdddmInitn() {
        return adddmInitn;
    }

    /**
     * Sets the value of the adddmInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAdddmInitn(byte[] value) {
        this.adddmInitn = value;
    }

    /**
     * Gets the value of the adddmRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAdddmRspn() {
        return adddmRspn;
    }

    /**
     * Sets the value of the adddmRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAdddmRspn(byte[] value) {
        this.adddmRspn = value;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAmdmnt() {
        return amdmnt;
    }

    /**
     * Sets the value of the amdmnt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAmdmnt(byte[] value) {
        this.amdmnt = value;
    }

    /**
     * Gets the value of the authstnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAuthstnInitn() {
        return authstnInitn;
    }

    /**
     * Sets the value of the authstnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAuthstnInitn(byte[] value) {
        this.authstnInitn = value;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAuthstnRspn(byte[] value) {
        this.authstnRspn = value;
    }

    /**
     * Gets the value of the cardMgmtInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCardMgmtInitn() {
        return cardMgmtInitn;
    }

    /**
     * Sets the value of the cardMgmtInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCardMgmtInitn(byte[] value) {
        this.cardMgmtInitn = value;
    }

    /**
     * Gets the value of the cardMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCardMgmtRspn() {
        return cardMgmtRspn;
    }

    /**
     * Sets the value of the cardMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCardMgmtRspn(byte[] value) {
        this.cardMgmtRspn = value;
    }

    /**
     * Gets the value of the chrgBckInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getChrgBckInitn() {
        return chrgBckInitn;
    }

    /**
     * Sets the value of the chrgBckInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setChrgBckInitn(byte[] value) {
        this.chrgBckInitn = value;
    }

    /**
     * Gets the value of the chrgBckRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getChrgBckRspn() {
        return chrgBckRspn;
    }

    /**
     * Sets the value of the chrgBckRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setChrgBckRspn(byte[] value) {
        this.chrgBckRspn = value;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setErr(byte[] value) {
        this.err = value;
    }

    /**
     * Gets the value of the feeColltnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFeeColltnInitn() {
        return feeColltnInitn;
    }

    /**
     * Sets the value of the feeColltnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFeeColltnInitn(byte[] value) {
        this.feeColltnInitn = value;
    }

    /**
     * Gets the value of the feeColltnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFeeColltnRspn() {
        return feeColltnRspn;
    }

    /**
     * Sets the value of the feeColltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFeeColltnRspn(byte[] value) {
        this.feeColltnRspn = value;
    }

    /**
     * Gets the value of the fileActnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileActnInitn() {
        return fileActnInitn;
    }

    /**
     * Sets the value of the fileActnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileActnInitn(byte[] value) {
        this.fileActnInitn = value;
    }

    /**
     * Gets the value of the fileActnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileActnRspn() {
        return fileActnRspn;
    }

    /**
     * Sets the value of the fileActnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileActnRspn(byte[] value) {
        this.fileActnRspn = value;
    }

    /**
     * Gets the value of the finInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFinInitn() {
        return finInitn;
    }

    /**
     * Sets the value of the finInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFinInitn(byte[] value) {
        this.finInitn = value;
    }

    /**
     * Gets the value of the finRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFinRspn() {
        return finRspn;
    }

    /**
     * Sets the value of the finRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFinRspn(byte[] value) {
        this.finRspn = value;
    }

    /**
     * Gets the value of the frdDspstnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFrdDspstnInitn() {
        return frdDspstnInitn;
    }

    /**
     * Sets the value of the frdDspstnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFrdDspstnInitn(byte[] value) {
        this.frdDspstnInitn = value;
    }

    /**
     * Gets the value of the frdDspstnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFrdDspstnRspn() {
        return frdDspstnRspn;
    }

    /**
     * Sets the value of the frdDspstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFrdDspstnRspn(byte[] value) {
        this.frdDspstnRspn = value;
    }

    /**
     * Gets the value of the frdRptgInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFrdRptgInitn() {
        return frdRptgInitn;
    }

    /**
     * Sets the value of the frdRptgInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFrdRptgInitn(byte[] value) {
        this.frdRptgInitn = value;
    }

    /**
     * Gets the value of the frdRptgRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFrdRptgRspn() {
        return frdRptgRspn;
    }

    /**
     * Sets the value of the frdRptgRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFrdRptgRspn(byte[] value) {
        this.frdRptgRspn = value;
    }

    /**
     * Gets the value of the nqryInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNqryInitn() {
        return nqryInitn;
    }

    /**
     * Sets the value of the nqryInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNqryInitn(byte[] value) {
        this.nqryInitn = value;
    }

    /**
     * Gets the value of the nqryRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNqryRspn() {
        return nqryRspn;
    }

    /**
     * Sets the value of the nqryRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNqryRspn(byte[] value) {
        this.nqryRspn = value;
    }

    /**
     * Gets the value of the keyXchgInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyXchgInitn() {
        return keyXchgInitn;
    }

    /**
     * Sets the value of the keyXchgInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setKeyXchgInitn(byte[] value) {
        this.keyXchgInitn = value;
    }

    /**
     * Gets the value of the keyXchgRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyXchgRspn() {
        return keyXchgRspn;
    }

    /**
     * Sets the value of the keyXchgRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setKeyXchgRspn(byte[] value) {
        this.keyXchgRspn = value;
    }

    /**
     * Gets the value of the ntwkMgmtInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNtwkMgmtInitn() {
        return ntwkMgmtInitn;
    }

    /**
     * Sets the value of the ntwkMgmtInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNtwkMgmtInitn(byte[] value) {
        this.ntwkMgmtInitn = value;
    }

    /**
     * Gets the value of the ntwkMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNtwkMgmtRspn() {
        return ntwkMgmtRspn;
    }

    /**
     * Sets the value of the ntwkMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNtwkMgmtRspn(byte[] value) {
        this.ntwkMgmtRspn = value;
    }

    /**
     * Gets the value of the rcncltnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRcncltnInitn() {
        return rcncltnInitn;
    }

    /**
     * Sets the value of the rcncltnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRcncltnInitn(byte[] value) {
        this.rcncltnInitn = value;
    }

    /**
     * Gets the value of the rcncltnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRcncltnRspn() {
        return rcncltnRspn;
    }

    /**
     * Sets the value of the rcncltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRcncltnRspn(byte[] value) {
        this.rcncltnRspn = value;
    }

    /**
     * Gets the value of the rtrvlInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRtrvlInitn() {
        return rtrvlInitn;
    }

    /**
     * Sets the value of the rtrvlInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRtrvlInitn(byte[] value) {
        this.rtrvlInitn = value;
    }

    /**
     * Gets the value of the rtrvlRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRtrvlRspn() {
        return rtrvlRspn;
    }

    /**
     * Sets the value of the rtrvlRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRtrvlRspn(byte[] value) {
        this.rtrvlRspn = value;
    }

    /**
     * Gets the value of the rtrvlFlfmtInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRtrvlFlfmtInitn() {
        return rtrvlFlfmtInitn;
    }

    /**
     * Sets the value of the rtrvlFlfmtInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRtrvlFlfmtInitn(byte[] value) {
        this.rtrvlFlfmtInitn = value;
    }

    /**
     * Gets the value of the rtrvlFlfmtRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRtrvlFlfmtRspn() {
        return rtrvlFlfmtRspn;
    }

    /**
     * Sets the value of the rtrvlFlfmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRtrvlFlfmtRspn(byte[] value) {
        this.rtrvlFlfmtRspn = value;
    }

    /**
     * Gets the value of the rvslInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRvslInitn() {
        return rvslInitn;
    }

    /**
     * Sets the value of the rvslInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRvslInitn(byte[] value) {
        this.rvslInitn = value;
    }

    /**
     * Gets the value of the rvslRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRvslRspn() {
        return rvslRspn;
    }

    /**
     * Sets the value of the rvslRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRvslRspn(byte[] value) {
        this.rvslRspn = value;
    }

    /**
     * Gets the value of the sttlmRptgInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSttlmRptgInitn() {
        return sttlmRptgInitn;
    }

    /**
     * Sets the value of the sttlmRptgInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSttlmRptgInitn(byte[] value) {
        this.sttlmRptgInitn = value;
    }

    /**
     * Gets the value of the sttlmRptgRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSttlmRptgRspn() {
        return sttlmRptgRspn;
    }

    /**
     * Sets the value of the sttlmRptgRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSttlmRptgRspn(byte[] value) {
        this.sttlmRptgRspn = value;
    }

    /**
     * Gets the value of the vrfctnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVrfctnInitn() {
        return vrfctnInitn;
    }

    /**
     * Sets the value of the vrfctnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setVrfctnInitn(byte[] value) {
        this.vrfctnInitn = value;
    }

    /**
     * Gets the value of the vrfctnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVrfctnRspn() {
        return vrfctnRspn;
    }

    /**
     * Sets the value of the vrfctnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setVrfctnRspn(byte[] value) {
        this.vrfctnRspn = value;
    }

}
