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

package org.jpos.iso20022.auth_034_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReport1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TaxReport1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TaxRptHdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}GroupHeader69"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}PartyIdentification72"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}PartyIdentification72" minOccurs="0"/>
 *         <element name="TradSttlm" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}TradeSettlement2"/>
 *         <element name="OthrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}PartyIdentification72" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}AdditionalInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlRef" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}DocumentGeneralInformation2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReport1", propOrder = {
    "taxRptHdr",
    "sellr",
    "buyr",
    "tradSttlm",
    "othrPty",
    "addtlInf",
    "addtlRef",
    "splmtryData"
})
public class TaxReport1 {

    @XmlElement(name = "TaxRptHdr", required = true)
    protected GroupHeader69 taxRptHdr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification72 sellr;
    @XmlElement(name = "Buyr")
    protected PartyIdentification72 buyr;
    @XmlElement(name = "TradSttlm", required = true)
    protected TradeSettlement2 tradSttlm;
    @XmlElement(name = "OthrPty")
    protected List<PartyIdentification72> othrPty;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation1> addtlInf;
    @XmlElement(name = "AddtlRef")
    protected List<DocumentGeneralInformation2> addtlRef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the taxRptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader69 }
     *     
     */
    public GroupHeader69 getTaxRptHdr() {
        return taxRptHdr;
    }

    /**
     * Sets the value of the taxRptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader69 }
     *     
     */
    public void setTaxRptHdr(GroupHeader69 value) {
        this.taxRptHdr = value;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification72 }
     *     
     */
    public PartyIdentification72 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification72 }
     *     
     */
    public void setSellr(PartyIdentification72 value) {
        this.sellr = value;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification72 }
     *     
     */
    public PartyIdentification72 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification72 }
     *     
     */
    public void setBuyr(PartyIdentification72 value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the tradSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link TradeSettlement2 }
     *     
     */
    public TradeSettlement2 getTradSttlm() {
        return tradSttlm;
    }

    /**
     * Sets the value of the tradSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeSettlement2 }
     *     
     */
    public void setTradSttlm(TradeSettlement2 value) {
        this.tradSttlm = value;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification72 }
     * 
     * 
     * @return
     *     The value of the othrPty property.
     */
    public List<PartyIdentification72> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<>();
        }
        return this.othrPty;
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
     * {@link AdditionalInformation1 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation1> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

    /**
     * Gets the value of the addtlRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation2 }
     * 
     * 
     * @return
     *     The value of the addtlRef property.
     */
    public List<DocumentGeneralInformation2> getAddtlRef() {
        if (addtlRef == null) {
            addtlRef = new ArrayList<>();
        }
        return this.addtlRef;
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
