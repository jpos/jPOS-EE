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

package org.jpos.iso20022.tsrv_002_001_01;

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
 * <p>Java class for UnderlyingTradeTransaction1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnderlyingTradeTransaction1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}UnderlyingTradeTransactionType1Choice"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TxDt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}ISODate" minOccurs="0"/>
 *         <element name="TndrClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}ISODate" minOccurs="0"/>
 *         <element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CtrctAmtPctg" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTradeTransaction1", propOrder = {
    "tp",
    "id",
    "txDt",
    "tndrClsgDt",
    "txAmt",
    "ctrctAmtPctg",
    "addtlInf"
})
public class UnderlyingTradeTransaction1 {

    @XmlElement(name = "Tp", required = true)
    protected UnderlyingTradeTransactionType1Choice tp;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "TxDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar txDt;
    @XmlElement(name = "TndrClsgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tndrClsgDt;
    @XmlElement(name = "TxAmt")
    protected ActiveCurrencyAndAmount txAmt;
    @XmlElement(name = "CtrctAmtPctg")
    protected BigDecimal ctrctAmtPctg;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTradeTransactionType1Choice }
     *     
     */
    public UnderlyingTradeTransactionType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTradeTransactionType1Choice }
     *     
     */
    public void setTp(UnderlyingTradeTransactionType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the txDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDt() {
        return txDt;
    }

    /**
     * Sets the value of the txDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDt(XMLGregorianCalendar value) {
        this.txDt = value;
    }

    /**
     * Gets the value of the tndrClsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTndrClsgDt() {
        return tndrClsgDt;
    }

    /**
     * Sets the value of the tndrClsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTndrClsgDt(XMLGregorianCalendar value) {
        this.tndrClsgDt = value;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTxAmt(ActiveCurrencyAndAmount value) {
        this.txAmt = value;
    }

    /**
     * Gets the value of the ctrctAmtPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrctAmtPctg() {
        return ctrctAmtPctg;
    }

    /**
     * Sets the value of the ctrctAmtPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtrctAmtPctg(BigDecimal value) {
        this.ctrctAmtPctg = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
