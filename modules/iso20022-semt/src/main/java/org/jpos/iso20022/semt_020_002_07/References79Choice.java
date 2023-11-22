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

package org.jpos.iso20022.semt_020_002_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for References79Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="References79Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SctiesSttlmTxConfId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}SettlementTypeAndIdentification22"/>
 *         <element name="IntraPosMvmntConfId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="SctiesBalAcctgRptId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="SctiesBalCtdyRptId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="IntraPosMvmntPstngRptId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="SctiesFincgConfId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}SettlementTypeAndIdentification22"/>
 *         <element name="SctiesTxPdgRptId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="SctiesTxPstngRptId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="SctiesSttlmTxAllgmtRptId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="SctiesSttlmTxAllgmtNtfctnTxId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}SettlementTypeAndIdentification22"/>
 *         <element name="PrtflTrfNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="SctiesSttlmTxGnrtnNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}SettlementTypeAndIdentification22"/>
 *         <element name="OthrMsgId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="TtlPrtflValtnRptId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="TrptyCollTxInstrPrcgStsAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="TrptyCollStsAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *         <element name="TrptyCollAndXpsrRptId" type="{urn:iso:std:iso:20022:tech:xsd:semt.020.002.07}RestrictedFINXMax16Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References79Choice", propOrder = {
    "sctiesSttlmTxConfId",
    "intraPosMvmntConfId",
    "sctiesBalAcctgRptId",
    "sctiesBalCtdyRptId",
    "intraPosMvmntPstngRptId",
    "sctiesFincgConfId",
    "sctiesTxPdgRptId",
    "sctiesTxPstngRptId",
    "sctiesSttlmTxAllgmtRptId",
    "sctiesSttlmTxAllgmtNtfctnTxId",
    "prtflTrfNtfctnId",
    "sctiesSttlmTxGnrtnNtfctnId",
    "othrMsgId",
    "ttlPrtflValtnRptId",
    "trptyCollTxInstrPrcgStsAdvcId",
    "trptyCollStsAdvcId",
    "trptyCollAndXpsrRptId"
})
public class References79Choice {

    @XmlElement(name = "SctiesSttlmTxConfId")
    protected SettlementTypeAndIdentification22 sctiesSttlmTxConfId;
    @XmlElement(name = "IntraPosMvmntConfId")
    protected String intraPosMvmntConfId;
    @XmlElement(name = "SctiesBalAcctgRptId")
    protected String sctiesBalAcctgRptId;
    @XmlElement(name = "SctiesBalCtdyRptId")
    protected String sctiesBalCtdyRptId;
    @XmlElement(name = "IntraPosMvmntPstngRptId")
    protected String intraPosMvmntPstngRptId;
    @XmlElement(name = "SctiesFincgConfId")
    protected SettlementTypeAndIdentification22 sctiesFincgConfId;
    @XmlElement(name = "SctiesTxPdgRptId")
    protected String sctiesTxPdgRptId;
    @XmlElement(name = "SctiesTxPstngRptId")
    protected String sctiesTxPstngRptId;
    @XmlElement(name = "SctiesSttlmTxAllgmtRptId")
    protected String sctiesSttlmTxAllgmtRptId;
    @XmlElement(name = "SctiesSttlmTxAllgmtNtfctnTxId")
    protected SettlementTypeAndIdentification22 sctiesSttlmTxAllgmtNtfctnTxId;
    @XmlElement(name = "PrtflTrfNtfctnId")
    protected String prtflTrfNtfctnId;
    @XmlElement(name = "SctiesSttlmTxGnrtnNtfctnId")
    protected SettlementTypeAndIdentification22 sctiesSttlmTxGnrtnNtfctnId;
    @XmlElement(name = "OthrMsgId")
    protected String othrMsgId;
    @XmlElement(name = "TtlPrtflValtnRptId")
    protected String ttlPrtflValtnRptId;
    @XmlElement(name = "TrptyCollTxInstrPrcgStsAdvcId")
    protected String trptyCollTxInstrPrcgStsAdvcId;
    @XmlElement(name = "TrptyCollStsAdvcId")
    protected String trptyCollStsAdvcId;
    @XmlElement(name = "TrptyCollAndXpsrRptId")
    protected String trptyCollAndXpsrRptId;

    /**
     * Gets the value of the sctiesSttlmTxConfId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public SettlementTypeAndIdentification22 getSctiesSttlmTxConfId() {
        return sctiesSttlmTxConfId;
    }

    /**
     * Sets the value of the sctiesSttlmTxConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public void setSctiesSttlmTxConfId(SettlementTypeAndIdentification22 value) {
        this.sctiesSttlmTxConfId = value;
    }

    /**
     * Gets the value of the intraPosMvmntConfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraPosMvmntConfId() {
        return intraPosMvmntConfId;
    }

    /**
     * Sets the value of the intraPosMvmntConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraPosMvmntConfId(String value) {
        this.intraPosMvmntConfId = value;
    }

    /**
     * Gets the value of the sctiesBalAcctgRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesBalAcctgRptId() {
        return sctiesBalAcctgRptId;
    }

    /**
     * Sets the value of the sctiesBalAcctgRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesBalAcctgRptId(String value) {
        this.sctiesBalAcctgRptId = value;
    }

    /**
     * Gets the value of the sctiesBalCtdyRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesBalCtdyRptId() {
        return sctiesBalCtdyRptId;
    }

    /**
     * Sets the value of the sctiesBalCtdyRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesBalCtdyRptId(String value) {
        this.sctiesBalCtdyRptId = value;
    }

    /**
     * Gets the value of the intraPosMvmntPstngRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraPosMvmntPstngRptId() {
        return intraPosMvmntPstngRptId;
    }

    /**
     * Sets the value of the intraPosMvmntPstngRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraPosMvmntPstngRptId(String value) {
        this.intraPosMvmntPstngRptId = value;
    }

    /**
     * Gets the value of the sctiesFincgConfId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public SettlementTypeAndIdentification22 getSctiesFincgConfId() {
        return sctiesFincgConfId;
    }

    /**
     * Sets the value of the sctiesFincgConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public void setSctiesFincgConfId(SettlementTypeAndIdentification22 value) {
        this.sctiesFincgConfId = value;
    }

    /**
     * Gets the value of the sctiesTxPdgRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesTxPdgRptId() {
        return sctiesTxPdgRptId;
    }

    /**
     * Sets the value of the sctiesTxPdgRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesTxPdgRptId(String value) {
        this.sctiesTxPdgRptId = value;
    }

    /**
     * Gets the value of the sctiesTxPstngRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesTxPstngRptId() {
        return sctiesTxPstngRptId;
    }

    /**
     * Sets the value of the sctiesTxPstngRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesTxPstngRptId(String value) {
        this.sctiesTxPstngRptId = value;
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmTxAllgmtRptId() {
        return sctiesSttlmTxAllgmtRptId;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesSttlmTxAllgmtRptId(String value) {
        this.sctiesSttlmTxAllgmtRptId = value;
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtNtfctnTxId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public SettlementTypeAndIdentification22 getSctiesSttlmTxAllgmtNtfctnTxId() {
        return sctiesSttlmTxAllgmtNtfctnTxId;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtNtfctnTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public void setSctiesSttlmTxAllgmtNtfctnTxId(SettlementTypeAndIdentification22 value) {
        this.sctiesSttlmTxAllgmtNtfctnTxId = value;
    }

    /**
     * Gets the value of the prtflTrfNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtflTrfNtfctnId() {
        return prtflTrfNtfctnId;
    }

    /**
     * Sets the value of the prtflTrfNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtflTrfNtfctnId(String value) {
        this.prtflTrfNtfctnId = value;
    }

    /**
     * Gets the value of the sctiesSttlmTxGnrtnNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public SettlementTypeAndIdentification22 getSctiesSttlmTxGnrtnNtfctnId() {
        return sctiesSttlmTxGnrtnNtfctnId;
    }

    /**
     * Sets the value of the sctiesSttlmTxGnrtnNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public void setSctiesSttlmTxGnrtnNtfctnId(SettlementTypeAndIdentification22 value) {
        this.sctiesSttlmTxGnrtnNtfctnId = value;
    }

    /**
     * Gets the value of the othrMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrMsgId() {
        return othrMsgId;
    }

    /**
     * Sets the value of the othrMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrMsgId(String value) {
        this.othrMsgId = value;
    }

    /**
     * Gets the value of the ttlPrtflValtnRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlPrtflValtnRptId() {
        return ttlPrtflValtnRptId;
    }

    /**
     * Sets the value of the ttlPrtflValtnRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlPrtflValtnRptId(String value) {
        this.ttlPrtflValtnRptId = value;
    }

    /**
     * Gets the value of the trptyCollTxInstrPrcgStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyCollTxInstrPrcgStsAdvcId() {
        return trptyCollTxInstrPrcgStsAdvcId;
    }

    /**
     * Sets the value of the trptyCollTxInstrPrcgStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyCollTxInstrPrcgStsAdvcId(String value) {
        this.trptyCollTxInstrPrcgStsAdvcId = value;
    }

    /**
     * Gets the value of the trptyCollStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyCollStsAdvcId() {
        return trptyCollStsAdvcId;
    }

    /**
     * Sets the value of the trptyCollStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyCollStsAdvcId(String value) {
        this.trptyCollStsAdvcId = value;
    }

    /**
     * Gets the value of the trptyCollAndXpsrRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyCollAndXpsrRptId() {
        return trptyCollAndXpsrRptId;
    }

    /**
     * Sets the value of the trptyCollAndXpsrRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyCollAndXpsrRptId(String value) {
        this.trptyCollAndXpsrRptId = value;
    }

}
