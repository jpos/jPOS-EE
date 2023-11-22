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

package org.jpos.iso20022.semt_017_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentDetails41 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentDetails41">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}SecurityIdentification19"/>
 *         <element name="InvstmtFndsFinInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}FinancialInstrument72" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}PriceInformation21" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}SafeKeepingPlace3" minOccurs="0"/>
 *         <element name="OpngBal" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}OpeningBalance5" minOccurs="0"/>
 *         <element name="ClsgBal" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}ClosingBalance5" minOccurs="0"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}Transaction123" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentDetails41", propOrder = {
    "finInstrmId",
    "invstmtFndsFinInstrmAttrbts",
    "pricDtls",
    "sfkpgPlc",
    "opngBal",
    "clsgBal",
    "tx"
})
public class FinancialInstrumentDetails41 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "InvstmtFndsFinInstrmAttrbts")
    protected FinancialInstrument72 invstmtFndsFinInstrmAttrbts;
    @XmlElement(name = "PricDtls")
    protected PriceInformation21 pricDtls;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace3 sfkpgPlc;
    @XmlElement(name = "OpngBal")
    protected OpeningBalance5 opngBal;
    @XmlElement(name = "ClsgBal")
    protected ClosingBalance5 clsgBal;
    @XmlElement(name = "Tx", required = true)
    protected List<Transaction123> tx;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the invstmtFndsFinInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument72 }
     *     
     */
    public FinancialInstrument72 getInvstmtFndsFinInstrmAttrbts() {
        return invstmtFndsFinInstrmAttrbts;
    }

    /**
     * Sets the value of the invstmtFndsFinInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument72 }
     *     
     */
    public void setInvstmtFndsFinInstrmAttrbts(FinancialInstrument72 value) {
        this.invstmtFndsFinInstrmAttrbts = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformation21 }
     *     
     */
    public PriceInformation21 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformation21 }
     *     
     */
    public void setPricDtls(PriceInformation21 value) {
        this.pricDtls = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public SafeKeepingPlace3 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public void setSfkpgPlc(SafeKeepingPlace3 value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the opngBal property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningBalance5 }
     *     
     */
    public OpeningBalance5 getOpngBal() {
        return opngBal;
    }

    /**
     * Sets the value of the opngBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningBalance5 }
     *     
     */
    public void setOpngBal(OpeningBalance5 value) {
        this.opngBal = value;
    }

    /**
     * Gets the value of the clsgBal property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingBalance5 }
     *     
     */
    public ClosingBalance5 getClsgBal() {
        return clsgBal;
    }

    /**
     * Sets the value of the clsgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingBalance5 }
     *     
     */
    public void setClsgBal(ClosingBalance5 value) {
        this.clsgBal = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction123 }
     * 
     * 
     * @return
     *     The value of the tx property.
     */
    public List<Transaction123> getTx() {
        if (tx == null) {
            tx = new ArrayList<>();
        }
        return this.tx;
    }

}
