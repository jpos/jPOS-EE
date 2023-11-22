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

package org.jpos.iso20022.camt_005_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSearchCriteria10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionSearchCriteria10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtTo" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}SystemSearch4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PmtFr" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}SystemSearch4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PmtSch" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}PaymentSearch9" minOccurs="0"/>
 *         <element name="AcctNtrySch" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}CashAccountEntrySearch7" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearchCriteria10", propOrder = {
    "pmtTo",
    "pmtFr",
    "pmtSch",
    "acctNtrySch"
})
public class TransactionSearchCriteria10 {

    @XmlElement(name = "PmtTo")
    protected List<SystemSearch4> pmtTo;
    @XmlElement(name = "PmtFr")
    protected List<SystemSearch4> pmtFr;
    @XmlElement(name = "PmtSch")
    protected PaymentSearch9 pmtSch;
    @XmlElement(name = "AcctNtrySch")
    protected CashAccountEntrySearch7 acctNtrySch;

    /**
     * Gets the value of the pmtTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemSearch4 }
     * 
     * 
     * @return
     *     The value of the pmtTo property.
     */
    public List<SystemSearch4> getPmtTo() {
        if (pmtTo == null) {
            pmtTo = new ArrayList<>();
        }
        return this.pmtTo;
    }

    /**
     * Gets the value of the pmtFr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtFr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtFr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemSearch4 }
     * 
     * 
     * @return
     *     The value of the pmtFr property.
     */
    public List<SystemSearch4> getPmtFr() {
        if (pmtFr == null) {
            pmtFr = new ArrayList<>();
        }
        return this.pmtFr;
    }

    /**
     * Gets the value of the pmtSch property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSearch9 }
     *     
     */
    public PaymentSearch9 getPmtSch() {
        return pmtSch;
    }

    /**
     * Sets the value of the pmtSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSearch9 }
     *     
     */
    public void setPmtSch(PaymentSearch9 value) {
        this.pmtSch = value;
    }

    /**
     * Gets the value of the acctNtrySch property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountEntrySearch7 }
     *     
     */
    public CashAccountEntrySearch7 getAcctNtrySch() {
        return acctNtrySch;
    }

    /**
     * Sets the value of the acctNtrySch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountEntrySearch7 }
     *     
     */
    public void setAcctNtrySch(CashAccountEntrySearch7 value) {
        this.acctNtrySch = value;
    }

}
