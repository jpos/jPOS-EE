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

package org.jpos.iso20022.auth_001_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriteria1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SearchCriteria1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}AccountAndParties1"/>
 *         <element name="CstmrId" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}CustomerIdentification1"/>
 *         <element name="PmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}PaymentInstrumentType1"/>
 *         <element name="OrgnlTxNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}RequestType1" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria1Choice", propOrder = {
    "acct",
    "cstmrId",
    "pmtInstrm",
    "orgnlTxNb"
})
public class SearchCriteria1Choice {

    @XmlElement(name = "Acct")
    protected AccountAndParties1 acct;
    @XmlElement(name = "CstmrId")
    protected CustomerIdentification1 cstmrId;
    @XmlElement(name = "PmtInstrm")
    protected PaymentInstrumentType1 pmtInstrm;
    @XmlElement(name = "OrgnlTxNb")
    protected List<RequestType1> orgnlTxNb;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountAndParties1 }
     *     
     */
    public AccountAndParties1 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAndParties1 }
     *     
     */
    public void setAcct(AccountAndParties1 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the cstmrId property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentification1 }
     *     
     */
    public CustomerIdentification1 getCstmrId() {
        return cstmrId;
    }

    /**
     * Sets the value of the cstmrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentification1 }
     *     
     */
    public void setCstmrId(CustomerIdentification1 value) {
        this.cstmrId = value;
    }

    /**
     * Gets the value of the pmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentType1 }
     *     
     */
    public PaymentInstrumentType1 getPmtInstrm() {
        return pmtInstrm;
    }

    /**
     * Sets the value of the pmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentType1 }
     *     
     */
    public void setPmtInstrm(PaymentInstrumentType1 value) {
        this.pmtInstrm = value;
    }

    /**
     * Gets the value of the orgnlTxNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlTxNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlTxNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestType1 }
     * 
     * 
     * @return
     *     The value of the orgnlTxNb property.
     */
    public List<RequestType1> getOrgnlTxNb() {
        if (orgnlTxNb == null) {
            orgnlTxNb = new ArrayList<>();
        }
        return this.orgnlTxNb;
    }

}
