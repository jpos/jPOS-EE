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

package org.jpos.iso20022.tsmt_011_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItem14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LineItem14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LineItmDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}LineItemDetails12" maxOccurs="unbounded"/>
 *         <element name="OrdrdLineItmsTtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *         <element name="AccptdLineItmsTtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *         <element name="OutsdngLineItmsTtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *         <element name="PdgLineItmsTtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *         <element name="OrdrdTtlNetAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *         <element name="AccptdTtlNetAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *         <element name="OutsdngTtlNetAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *         <element name="PdgTtlNetAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem14", propOrder = {
    "lineItmDtls",
    "ordrdLineItmsTtlAmt",
    "accptdLineItmsTtlAmt",
    "outsdngLineItmsTtlAmt",
    "pdgLineItmsTtlAmt",
    "ordrdTtlNetAmt",
    "accptdTtlNetAmt",
    "outsdngTtlNetAmt",
    "pdgTtlNetAmt"
})
public class LineItem14 {

    @XmlElement(name = "LineItmDtls", required = true)
    protected List<LineItemDetails12> lineItmDtls;
    @XmlElement(name = "OrdrdLineItmsTtlAmt", required = true)
    protected CurrencyAndAmount ordrdLineItmsTtlAmt;
    @XmlElement(name = "AccptdLineItmsTtlAmt", required = true)
    protected CurrencyAndAmount accptdLineItmsTtlAmt;
    @XmlElement(name = "OutsdngLineItmsTtlAmt", required = true)
    protected CurrencyAndAmount outsdngLineItmsTtlAmt;
    @XmlElement(name = "PdgLineItmsTtlAmt", required = true)
    protected CurrencyAndAmount pdgLineItmsTtlAmt;
    @XmlElement(name = "OrdrdTtlNetAmt", required = true)
    protected CurrencyAndAmount ordrdTtlNetAmt;
    @XmlElement(name = "AccptdTtlNetAmt", required = true)
    protected CurrencyAndAmount accptdTtlNetAmt;
    @XmlElement(name = "OutsdngTtlNetAmt", required = true)
    protected CurrencyAndAmount outsdngTtlNetAmt;
    @XmlElement(name = "PdgTtlNetAmt", required = true)
    protected CurrencyAndAmount pdgTtlNetAmt;

    /**
     * Gets the value of the lineItmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemDetails12 }
     * 
     * 
     * @return
     *     The value of the lineItmDtls property.
     */
    public List<LineItemDetails12> getLineItmDtls() {
        if (lineItmDtls == null) {
            lineItmDtls = new ArrayList<>();
        }
        return this.lineItmDtls;
    }

    /**
     * Gets the value of the ordrdLineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOrdrdLineItmsTtlAmt() {
        return ordrdLineItmsTtlAmt;
    }

    /**
     * Sets the value of the ordrdLineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setOrdrdLineItmsTtlAmt(CurrencyAndAmount value) {
        this.ordrdLineItmsTtlAmt = value;
    }

    /**
     * Gets the value of the accptdLineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAccptdLineItmsTtlAmt() {
        return accptdLineItmsTtlAmt;
    }

    /**
     * Sets the value of the accptdLineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setAccptdLineItmsTtlAmt(CurrencyAndAmount value) {
        this.accptdLineItmsTtlAmt = value;
    }

    /**
     * Gets the value of the outsdngLineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOutsdngLineItmsTtlAmt() {
        return outsdngLineItmsTtlAmt;
    }

    /**
     * Sets the value of the outsdngLineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setOutsdngLineItmsTtlAmt(CurrencyAndAmount value) {
        this.outsdngLineItmsTtlAmt = value;
    }

    /**
     * Gets the value of the pdgLineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPdgLineItmsTtlAmt() {
        return pdgLineItmsTtlAmt;
    }

    /**
     * Sets the value of the pdgLineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setPdgLineItmsTtlAmt(CurrencyAndAmount value) {
        this.pdgLineItmsTtlAmt = value;
    }

    /**
     * Gets the value of the ordrdTtlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOrdrdTtlNetAmt() {
        return ordrdTtlNetAmt;
    }

    /**
     * Sets the value of the ordrdTtlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setOrdrdTtlNetAmt(CurrencyAndAmount value) {
        this.ordrdTtlNetAmt = value;
    }

    /**
     * Gets the value of the accptdTtlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAccptdTtlNetAmt() {
        return accptdTtlNetAmt;
    }

    /**
     * Sets the value of the accptdTtlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setAccptdTtlNetAmt(CurrencyAndAmount value) {
        this.accptdTtlNetAmt = value;
    }

    /**
     * Gets the value of the outsdngTtlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOutsdngTtlNetAmt() {
        return outsdngTtlNetAmt;
    }

    /**
     * Sets the value of the outsdngTtlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setOutsdngTtlNetAmt(CurrencyAndAmount value) {
        this.outsdngTtlNetAmt = value;
    }

    /**
     * Gets the value of the pdgTtlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPdgTtlNetAmt() {
        return pdgTtlNetAmt;
    }

    /**
     * Sets the value of the pdgTtlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setPdgTtlNetAmt(CurrencyAndAmount value) {
        this.pdgTtlNetAmt = value;
    }

}
