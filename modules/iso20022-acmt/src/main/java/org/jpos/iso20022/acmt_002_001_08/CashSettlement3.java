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

package org.jpos.iso20022.acmt_002_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashSettlement3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashSettlement3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}CashAccount204" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrCshSttlmDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PaymentInstrument17" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashSettlement3", propOrder = {
    "cshAcctDtls",
    "othrCshSttlmDtls"
})
public class CashSettlement3 {

    @XmlElement(name = "CshAcctDtls")
    protected List<CashAccount204> cshAcctDtls;
    @XmlElement(name = "OthrCshSttlmDtls")
    protected List<PaymentInstrument17> othrCshSttlmDtls;

    /**
     * Gets the value of the cshAcctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshAcctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount204 }
     * 
     * 
     * @return
     *     The value of the cshAcctDtls property.
     */
    public List<CashAccount204> getCshAcctDtls() {
        if (cshAcctDtls == null) {
            cshAcctDtls = new ArrayList<>();
        }
        return this.cshAcctDtls;
    }

    /**
     * Gets the value of the othrCshSttlmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrCshSttlmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCshSttlmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstrument17 }
     * 
     * 
     * @return
     *     The value of the othrCshSttlmDtls property.
     */
    public List<PaymentInstrument17> getOthrCshSttlmDtls() {
        if (othrCshSttlmDtls == null) {
            othrCshSttlmDtls = new ArrayList<>();
        }
        return this.othrCshSttlmDtls;
    }

}
