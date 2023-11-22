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

package org.jpos.iso20022.auth_016_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionReport7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTransactionReport7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}Max52Text"/>
 *         <element name="ExctgPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}LEIIdentifier"/>
 *         <element name="InvstmtPtyInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}TrueFalseIndicator"/>
 *         <element name="SubmitgPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}LEIIdentifier"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}PartyIdentification79"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}PartyIdentification79"/>
 *         <element name="OrdrTrnsmssn" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SecuritiesTransactionTransmission2"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SecuritiesTransaction3"/>
 *         <element name="FinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}FinancialInstrumentAttributes5Choice"/>
 *         <element name="InvstmtDcsnPrsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}InvestmentParty1Choice" minOccurs="0"/>
 *         <element name="ExctgPrsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}ExecutingParty1Choice"/>
 *         <element name="AddtlAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SecuritiesTransactionIndicator2"/>
 *         <element name="TechAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}RecordTechnicalData5" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionReport7", propOrder = {
    "txId",
    "exctgPty",
    "invstmtPtyInd",
    "submitgPty",
    "buyr",
    "sellr",
    "ordrTrnsmssn",
    "tx",
    "finInstrm",
    "invstmtDcsnPrsn",
    "exctgPrsn",
    "addtlAttrbts",
    "techAttrbts",
    "splmtryData"
})
public class SecuritiesTransactionReport7 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "ExctgPty", required = true)
    protected String exctgPty;
    @XmlElement(name = "InvstmtPtyInd")
    protected boolean invstmtPtyInd;
    @XmlElement(name = "SubmitgPty", required = true)
    protected String submitgPty;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification79 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification79 sellr;
    @XmlElement(name = "OrdrTrnsmssn", required = true)
    protected SecuritiesTransactionTransmission2 ordrTrnsmssn;
    @XmlElement(name = "Tx", required = true)
    protected SecuritiesTransaction3 tx;
    @XmlElement(name = "FinInstrm", required = true)
    protected FinancialInstrumentAttributes5Choice finInstrm;
    @XmlElement(name = "InvstmtDcsnPrsn")
    protected InvestmentParty1Choice invstmtDcsnPrsn;
    @XmlElement(name = "ExctgPrsn", required = true)
    protected ExecutingParty1Choice exctgPrsn;
    @XmlElement(name = "AddtlAttrbts", required = true)
    protected SecuritiesTransactionIndicator2 addtlAttrbts;
    @XmlElement(name = "TechAttrbts")
    protected RecordTechnicalData5 techAttrbts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
     * Gets the value of the exctgPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExctgPty() {
        return exctgPty;
    }

    /**
     * Sets the value of the exctgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExctgPty(String value) {
        this.exctgPty = value;
    }

    /**
     * Gets the value of the invstmtPtyInd property.
     * 
     */
    public boolean isInvstmtPtyInd() {
        return invstmtPtyInd;
    }

    /**
     * Sets the value of the invstmtPtyInd property.
     * 
     */
    public void setInvstmtPtyInd(boolean value) {
        this.invstmtPtyInd = value;
    }

    /**
     * Gets the value of the submitgPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitgPty() {
        return submitgPty;
    }

    /**
     * Sets the value of the submitgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitgPty(String value) {
        this.submitgPty = value;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification79 }
     *     
     */
    public PartyIdentification79 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification79 }
     *     
     */
    public void setBuyr(PartyIdentification79 value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification79 }
     *     
     */
    public PartyIdentification79 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification79 }
     *     
     */
    public void setSellr(PartyIdentification79 value) {
        this.sellr = value;
    }

    /**
     * Gets the value of the ordrTrnsmssn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionTransmission2 }
     *     
     */
    public SecuritiesTransactionTransmission2 getOrdrTrnsmssn() {
        return ordrTrnsmssn;
    }

    /**
     * Sets the value of the ordrTrnsmssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionTransmission2 }
     *     
     */
    public void setOrdrTrnsmssn(SecuritiesTransactionTransmission2 value) {
        this.ordrTrnsmssn = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransaction3 }
     *     
     */
    public SecuritiesTransaction3 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransaction3 }
     *     
     */
    public void setTx(SecuritiesTransaction3 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes5Choice }
     *     
     */
    public FinancialInstrumentAttributes5Choice getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes5Choice }
     *     
     */
    public void setFinInstrm(FinancialInstrumentAttributes5Choice value) {
        this.finInstrm = value;
    }

    /**
     * Gets the value of the invstmtDcsnPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentParty1Choice }
     *     
     */
    public InvestmentParty1Choice getInvstmtDcsnPrsn() {
        return invstmtDcsnPrsn;
    }

    /**
     * Sets the value of the invstmtDcsnPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentParty1Choice }
     *     
     */
    public void setInvstmtDcsnPrsn(InvestmentParty1Choice value) {
        this.invstmtDcsnPrsn = value;
    }

    /**
     * Gets the value of the exctgPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutingParty1Choice }
     *     
     */
    public ExecutingParty1Choice getExctgPrsn() {
        return exctgPrsn;
    }

    /**
     * Sets the value of the exctgPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutingParty1Choice }
     *     
     */
    public void setExctgPrsn(ExecutingParty1Choice value) {
        this.exctgPrsn = value;
    }

    /**
     * Gets the value of the addtlAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionIndicator2 }
     *     
     */
    public SecuritiesTransactionIndicator2 getAddtlAttrbts() {
        return addtlAttrbts;
    }

    /**
     * Sets the value of the addtlAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionIndicator2 }
     *     
     */
    public void setAddtlAttrbts(SecuritiesTransactionIndicator2 value) {
        this.addtlAttrbts = value;
    }

    /**
     * Gets the value of the techAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTechnicalData5 }
     *     
     */
    public RecordTechnicalData5 getTechAttrbts() {
        return techAttrbts;
    }

    /**
     * Sets the value of the techAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTechnicalData5 }
     *     
     */
    public void setTechAttrbts(RecordTechnicalData5 value) {
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
