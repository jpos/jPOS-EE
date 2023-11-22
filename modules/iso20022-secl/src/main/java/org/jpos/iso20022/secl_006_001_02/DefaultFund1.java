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

package org.jpos.iso20022.secl_006_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultFund1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DefaultFund1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DfltFndAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}AccountIdentification4Choice"/>
 *         <element name="TtlDfltFndAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}ActiveCurrencyAndAmount"/>
 *         <element name="Cntrbtn" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}Contribution1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IncrCvrgAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultFund1", propOrder = {
    "dfltFndAcct",
    "ttlDfltFndAmt",
    "cntrbtn",
    "incrCvrgAmt"
})
public class DefaultFund1 {

    @XmlElement(name = "DfltFndAcct", required = true)
    protected AccountIdentification4Choice dfltFndAcct;
    @XmlElement(name = "TtlDfltFndAmt", required = true)
    protected ActiveCurrencyAndAmount ttlDfltFndAmt;
    @XmlElement(name = "Cntrbtn")
    protected List<Contribution1> cntrbtn;
    @XmlElement(name = "IncrCvrgAmt")
    protected ActiveCurrencyAndAmount incrCvrgAmt;

    /**
     * Gets the value of the dfltFndAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getDfltFndAcct() {
        return dfltFndAcct;
    }

    /**
     * Sets the value of the dfltFndAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setDfltFndAcct(AccountIdentification4Choice value) {
        this.dfltFndAcct = value;
    }

    /**
     * Gets the value of the ttlDfltFndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlDfltFndAmt() {
        return ttlDfltFndAmt;
    }

    /**
     * Sets the value of the ttlDfltFndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlDfltFndAmt(ActiveCurrencyAndAmount value) {
        this.ttlDfltFndAmt = value;
    }

    /**
     * Gets the value of the cntrbtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cntrbtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCntrbtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contribution1 }
     * 
     * 
     * @return
     *     The value of the cntrbtn property.
     */
    public List<Contribution1> getCntrbtn() {
        if (cntrbtn == null) {
            cntrbtn = new ArrayList<>();
        }
        return this.cntrbtn;
    }

    /**
     * Gets the value of the incrCvrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncrCvrgAmt() {
        return incrCvrgAmt;
    }

    /**
     * Sets the value of the incrCvrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIncrCvrgAmt(ActiveCurrencyAndAmount value) {
        this.incrCvrgAmt = value;
    }

}
