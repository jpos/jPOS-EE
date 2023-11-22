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

package org.jpos.iso20022.secl_004_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetPosition3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetPosition3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClrAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}SecuritiesAccount18"/>
 *         <element name="NonClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}PartyIdentificationAndAccount31" minOccurs="0"/>
 *         <element name="DlvryAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}SecurityIdentification14"/>
 *         <element name="InitlPosAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}AmountAndDirection21" minOccurs="0"/>
 *         <element name="NetPosAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}AmountAndDirection21"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}AmountAndDirection21" minOccurs="0"/>
 *         <element name="AvrgDealPric" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}Price4" minOccurs="0"/>
 *         <element name="NetQty" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}FinancialInstrumentQuantity1Choice"/>
 *         <element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}ReceiveDelivery1Code"/>
 *         <element name="Dpstry" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}PartyIdentification34Choice"/>
 *         <element name="TradgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}TradingCapacity5Code" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}MarketIdentification20" minOccurs="0"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}ISODate" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}DateFormat15Choice" minOccurs="0"/>
 *         <element name="TradLegDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}TradeLeg10" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetPosition3", propOrder = {
    "clrAcct",
    "nonClrMmb",
    "dlvryAcct",
    "finInstrmId",
    "initlPosAmt",
    "netPosAmt",
    "acrdIntrstAmt",
    "avrgDealPric",
    "netQty",
    "sctiesMvmntTp",
    "dpstry",
    "tradgCpcty",
    "plcOfTrad",
    "tradDt",
    "sttlmDt",
    "tradLegDtls"
})
public class NetPosition3 {

    @XmlElement(name = "ClrAcct", required = true)
    protected SecuritiesAccount18 clrAcct;
    @XmlElement(name = "NonClrMmb")
    protected PartyIdentificationAndAccount31 nonClrMmb;
    @XmlElement(name = "DlvryAcct")
    protected SecuritiesAccount19 dlvryAcct;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "InitlPosAmt")
    protected AmountAndDirection21 initlPosAmt;
    @XmlElement(name = "NetPosAmt", required = true)
    protected AmountAndDirection21 netPosAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection21 acrdIntrstAmt;
    @XmlElement(name = "AvrgDealPric")
    protected Price4 avrgDealPric;
    @XmlElement(name = "NetQty", required = true)
    protected FinancialInstrumentQuantity1Choice netQty;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Dpstry", required = true)
    protected PartyIdentification34Choice dpstry;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity5Code tradgCpcty;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification20 plcOfTrad;
    @XmlElement(name = "TradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "SttlmDt")
    protected DateFormat15Choice sttlmDt;
    @XmlElement(name = "TradLegDtls")
    protected List<TradeLeg10> tradLegDtls;

    /**
     * Gets the value of the clrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public SecuritiesAccount18 getClrAcct() {
        return clrAcct;
    }

    /**
     * Sets the value of the clrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public void setClrAcct(SecuritiesAccount18 value) {
        this.clrAcct = value;
    }

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public PartyIdentificationAndAccount31 getNonClrMmb() {
        return nonClrMmb;
    }

    /**
     * Sets the value of the nonClrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public void setNonClrMmb(PartyIdentificationAndAccount31 value) {
        this.nonClrMmb = value;
    }

    /**
     * Gets the value of the dlvryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getDlvryAcct() {
        return dlvryAcct;
    }

    /**
     * Sets the value of the dlvryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setDlvryAcct(SecuritiesAccount19 value) {
        this.dlvryAcct = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the initlPosAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getInitlPosAmt() {
        return initlPosAmt;
    }

    /**
     * Sets the value of the initlPosAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setInitlPosAmt(AmountAndDirection21 value) {
        this.initlPosAmt = value;
    }

    /**
     * Gets the value of the netPosAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getNetPosAmt() {
        return netPosAmt;
    }

    /**
     * Sets the value of the netPosAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setNetPosAmt(AmountAndDirection21 value) {
        this.netPosAmt = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection21 value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the avrgDealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getAvrgDealPric() {
        return avrgDealPric;
    }

    /**
     * Sets the value of the avrgDealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public void setAvrgDealPric(Price4 value) {
        this.avrgDealPric = value;
    }

    /**
     * Gets the value of the netQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getNetQty() {
        return netQty;
    }

    /**
     * Sets the value of the netQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setNetQty(FinancialInstrumentQuantity1Choice value) {
        this.netQty = value;
    }

    /**
     * Gets the value of the sctiesMvmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public ReceiveDelivery1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Sets the value of the sctiesMvmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public void setSctiesMvmntTp(ReceiveDelivery1Code value) {
        this.sctiesMvmntTp = value;
    }

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public PartyIdentification34Choice getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public void setDpstry(PartyIdentification34Choice value) {
        this.dpstry = value;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public TradingCapacity5Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public void setTradgCpcty(TradingCapacity5Code value) {
        this.tradgCpcty = value;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification20 }
     *     
     */
    public MarketIdentification20 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification20 }
     *     
     */
    public void setPlcOfTrad(MarketIdentification20 value) {
        this.plcOfTrad = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat15Choice }
     *     
     */
    public DateFormat15Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat15Choice }
     *     
     */
    public void setSttlmDt(DateFormat15Choice value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the tradLegDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradLegDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradLegDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeLeg10 }
     * 
     * 
     * @return
     *     The value of the tradLegDtls property.
     */
    public List<TradeLeg10> getTradLegDtls() {
        if (tradLegDtls == null) {
            tradLegDtls = new ArrayList<>();
        }
        return this.tradLegDtls;
    }

}
