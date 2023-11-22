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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransaction3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTransaction3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}ISODateTime"/>
 *         <element name="TradgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}RegulatoryTradingCapacity1Code"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}FinancialInstrumentQuantity25Choice"/>
 *         <element name="DgtlTknQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}DigitalTokenAmount2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DerivNtnlChng" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}VariationType1Code" minOccurs="0"/>
 *         <element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SecuritiesTransactionPrice22Choice"/>
 *         <element name="NetAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TradVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}MICIdentifier"/>
 *         <element name="CtryOfBrnch" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}CountryCode" minOccurs="0"/>
 *         <element name="UpFrntPmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}AmountAndDirection53" minOccurs="0"/>
 *         <element name="TradPlcMtchgId" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}Max52Text" minOccurs="0"/>
 *         <element name="CmplxTradCmpntId" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransaction3", propOrder = {
    "tradDt",
    "tradgCpcty",
    "qty",
    "dgtlTknQty",
    "derivNtnlChng",
    "pric",
    "netAmt",
    "tradVn",
    "ctryOfBrnch",
    "upFrntPmt",
    "tradPlcMtchgId",
    "cmplxTradCmpntId"
})
public class SecuritiesTransaction3 {

    @XmlElement(name = "TradDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "TradgCpcty", required = true)
    @XmlSchemaType(name = "string")
    protected RegulatoryTradingCapacity1Code tradgCpcty;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity25Choice qty;
    @XmlElement(name = "DgtlTknQty")
    protected List<DigitalTokenAmount2> dgtlTknQty;
    @XmlElement(name = "DerivNtnlChng")
    @XmlSchemaType(name = "string")
    protected VariationType1Code derivNtnlChng;
    @XmlElement(name = "Pric", required = true)
    protected SecuritiesTransactionPrice22Choice pric;
    @XmlElement(name = "NetAmt")
    protected BigDecimal netAmt;
    @XmlElement(name = "TradVn", required = true)
    protected String tradVn;
    @XmlElement(name = "CtryOfBrnch")
    protected String ctryOfBrnch;
    @XmlElement(name = "UpFrntPmt")
    protected AmountAndDirection53 upFrntPmt;
    @XmlElement(name = "TradPlcMtchgId")
    protected String tradPlcMtchgId;
    @XmlElement(name = "CmplxTradCmpntId")
    protected String cmplxTradCmpntId;

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
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryTradingCapacity1Code }
     *     
     */
    public RegulatoryTradingCapacity1Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryTradingCapacity1Code }
     *     
     */
    public void setTradgCpcty(RegulatoryTradingCapacity1Code value) {
        this.tradgCpcty = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity25Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the dgtlTknQty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgtlTknQty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlTknQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DigitalTokenAmount2 }
     * 
     * 
     * @return
     *     The value of the dgtlTknQty property.
     */
    public List<DigitalTokenAmount2> getDgtlTknQty() {
        if (dgtlTknQty == null) {
            dgtlTknQty = new ArrayList<>();
        }
        return this.dgtlTknQty;
    }

    /**
     * Gets the value of the derivNtnlChng property.
     * 
     * @return
     *     possible object is
     *     {@link VariationType1Code }
     *     
     */
    public VariationType1Code getDerivNtnlChng() {
        return derivNtnlChng;
    }

    /**
     * Sets the value of the derivNtnlChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationType1Code }
     *     
     */
    public void setDerivNtnlChng(VariationType1Code value) {
        this.derivNtnlChng = value;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice22Choice }
     *     
     */
    public SecuritiesTransactionPrice22Choice getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice22Choice }
     *     
     */
    public void setPric(SecuritiesTransactionPrice22Choice value) {
        this.pric = value;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmt(BigDecimal value) {
        this.netAmt = value;
    }

    /**
     * Gets the value of the tradVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradVn() {
        return tradVn;
    }

    /**
     * Sets the value of the tradVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradVn(String value) {
        this.tradVn = value;
    }

    /**
     * Gets the value of the ctryOfBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfBrnch() {
        return ctryOfBrnch;
    }

    /**
     * Sets the value of the ctryOfBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfBrnch(String value) {
        this.ctryOfBrnch = value;
    }

    /**
     * Gets the value of the upFrntPmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getUpFrntPmt() {
        return upFrntPmt;
    }

    /**
     * Sets the value of the upFrntPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public void setUpFrntPmt(AmountAndDirection53 value) {
        this.upFrntPmt = value;
    }

    /**
     * Gets the value of the tradPlcMtchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradPlcMtchgId() {
        return tradPlcMtchgId;
    }

    /**
     * Sets the value of the tradPlcMtchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradPlcMtchgId(String value) {
        this.tradPlcMtchgId = value;
    }

    /**
     * Gets the value of the cmplxTradCmpntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmplxTradCmpntId() {
        return cmplxTradCmpntId;
    }

    /**
     * Sets the value of the cmplxTradCmpntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmplxTradCmpntId(String value) {
        this.cmplxTradCmpntId = value;
    }

}
