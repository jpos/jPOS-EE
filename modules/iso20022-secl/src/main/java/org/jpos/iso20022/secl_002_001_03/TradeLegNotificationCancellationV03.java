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

package org.jpos.iso20022.secl_002_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeLegNotificationCancellationV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeLegNotificationCancellationV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}PartyIdentification35Choice"/>
 *         <element name="ClrAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}SecuritiesAccount18"/>
 *         <element name="DlvryAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="NonClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}PartyIdentificationAndAccount31" minOccurs="0"/>
 *         <element name="ClrDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}Clearing4" minOccurs="0"/>
 *         <element name="TradLegDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}TradeLeg8"/>
 *         <element name="SttlmDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}Settlement1"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeLegNotificationCancellationV03", propOrder = {
    "clrMmb",
    "clrAcct",
    "dlvryAcct",
    "nonClrMmb",
    "clrDtls",
    "tradLegDtls",
    "sttlmDtls",
    "splmtryData"
})
public class TradeLegNotificationCancellationV03 {

    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "ClrAcct", required = true)
    protected SecuritiesAccount18 clrAcct;
    @XmlElement(name = "DlvryAcct")
    protected SecuritiesAccount19 dlvryAcct;
    @XmlElement(name = "NonClrMmb")
    protected PartyIdentificationAndAccount31 nonClrMmb;
    @XmlElement(name = "ClrDtls")
    protected Clearing4 clrDtls;
    @XmlElement(name = "TradLegDtls", required = true)
    protected TradeLeg8 tradLegDtls;
    @XmlElement(name = "SttlmDtls", required = true)
    protected Settlement1 sttlmDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
    }

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
     * Gets the value of the clrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Clearing4 }
     *     
     */
    public Clearing4 getClrDtls() {
        return clrDtls;
    }

    /**
     * Sets the value of the clrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clearing4 }
     *     
     */
    public void setClrDtls(Clearing4 value) {
        this.clrDtls = value;
    }

    /**
     * Gets the value of the tradLegDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeLeg8 }
     *     
     */
    public TradeLeg8 getTradLegDtls() {
        return tradLegDtls;
    }

    /**
     * Sets the value of the tradLegDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeLeg8 }
     *     
     */
    public void setTradLegDtls(TradeLeg8 value) {
        this.tradLegDtls = value;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Settlement1 }
     *     
     */
    public Settlement1 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Settlement1 }
     *     
     */
    public void setSttlmDtls(Settlement1 value) {
        this.sttlmDtls = value;
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
