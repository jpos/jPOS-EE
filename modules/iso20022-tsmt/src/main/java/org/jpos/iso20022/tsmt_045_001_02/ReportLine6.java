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

package org.jpos.iso20022.tsmt_045_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportLine6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportLine6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ComrclDocRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.045.001.02}InvoiceIdentification1"/>
 *         <element name="Adjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.045.001.02}Adjustment6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NetAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.045.001.02}CurrencyAndAmount"/>
 *         <element name="BrkdwnByPurchsOrdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.045.001.02}ReportLine7" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportLine6", propOrder = {
    "comrclDocRef",
    "adjstmnt",
    "netAmt",
    "brkdwnByPurchsOrdr"
})
public class ReportLine6 {

    @XmlElement(name = "ComrclDocRef", required = true)
    protected InvoiceIdentification1 comrclDocRef;
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment6> adjstmnt;
    @XmlElement(name = "NetAmt", required = true)
    protected CurrencyAndAmount netAmt;
    @XmlElement(name = "BrkdwnByPurchsOrdr", required = true)
    protected List<ReportLine7> brkdwnByPurchsOrdr;

    /**
     * Gets the value of the comrclDocRef property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceIdentification1 }
     *     
     */
    public InvoiceIdentification1 getComrclDocRef() {
        return comrclDocRef;
    }

    /**
     * Sets the value of the comrclDocRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceIdentification1 }
     *     
     */
    public void setComrclDocRef(InvoiceIdentification1 value) {
        this.comrclDocRef = value;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment6 }
     * 
     * 
     * @return
     *     The value of the adjstmnt property.
     */
    public List<Adjustment6> getAdjstmnt() {
        if (adjstmnt == null) {
            adjstmnt = new ArrayList<>();
        }
        return this.adjstmnt;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setNetAmt(CurrencyAndAmount value) {
        this.netAmt = value;
    }

    /**
     * Gets the value of the brkdwnByPurchsOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the brkdwnByPurchsOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByPurchsOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportLine7 }
     * 
     * 
     * @return
     *     The value of the brkdwnByPurchsOrdr property.
     */
    public List<ReportLine7> getBrkdwnByPurchsOrdr() {
        if (brkdwnByPurchsOrdr == null) {
            brkdwnByPurchsOrdr = new ArrayList<>();
        }
        return this.brkdwnByPurchsOrdr;
    }

}
