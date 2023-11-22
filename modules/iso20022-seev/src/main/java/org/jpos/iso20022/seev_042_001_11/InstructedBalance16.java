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

package org.jpos.iso20022.seev_042_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructedBalance16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstructedBalance16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlInstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}BalanceFormat11Choice"/>
 *         <element name="TtlAccptdInstrBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="TtlCancInstrBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="TtlPdgInstrBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="TtlRjctdInstrBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="TtlPrtctInstrBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="OptnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}InstructedCorporateActionOption17" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructedBalance16", propOrder = {
    "ttlInstdBal",
    "ttlAccptdInstrBal",
    "ttlCancInstrBal",
    "ttlPdgInstrBal",
    "ttlRjctdInstrBal",
    "ttlPrtctInstrBal",
    "optnDtls"
})
public class InstructedBalance16 {

    @XmlElement(name = "TtlInstdBal", required = true)
    protected BalanceFormat11Choice ttlInstdBal;
    @XmlElement(name = "TtlAccptdInstrBal")
    protected SignedQuantityFormat10 ttlAccptdInstrBal;
    @XmlElement(name = "TtlCancInstrBal")
    protected SignedQuantityFormat10 ttlCancInstrBal;
    @XmlElement(name = "TtlPdgInstrBal")
    protected SignedQuantityFormat10 ttlPdgInstrBal;
    @XmlElement(name = "TtlRjctdInstrBal")
    protected SignedQuantityFormat10 ttlRjctdInstrBal;
    @XmlElement(name = "TtlPrtctInstrBal")
    protected SignedQuantityFormat10 ttlPrtctInstrBal;
    @XmlElement(name = "OptnDtls")
    protected List<InstructedCorporateActionOption17> optnDtls;

    /**
     * Gets the value of the ttlInstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public BalanceFormat11Choice getTtlInstdBal() {
        return ttlInstdBal;
    }

    /**
     * Sets the value of the ttlInstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public void setTtlInstdBal(BalanceFormat11Choice value) {
        this.ttlInstdBal = value;
    }

    /**
     * Gets the value of the ttlAccptdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getTtlAccptdInstrBal() {
        return ttlAccptdInstrBal;
    }

    /**
     * Sets the value of the ttlAccptdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setTtlAccptdInstrBal(SignedQuantityFormat10 value) {
        this.ttlAccptdInstrBal = value;
    }

    /**
     * Gets the value of the ttlCancInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getTtlCancInstrBal() {
        return ttlCancInstrBal;
    }

    /**
     * Sets the value of the ttlCancInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setTtlCancInstrBal(SignedQuantityFormat10 value) {
        this.ttlCancInstrBal = value;
    }

    /**
     * Gets the value of the ttlPdgInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getTtlPdgInstrBal() {
        return ttlPdgInstrBal;
    }

    /**
     * Sets the value of the ttlPdgInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setTtlPdgInstrBal(SignedQuantityFormat10 value) {
        this.ttlPdgInstrBal = value;
    }

    /**
     * Gets the value of the ttlRjctdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getTtlRjctdInstrBal() {
        return ttlRjctdInstrBal;
    }

    /**
     * Sets the value of the ttlRjctdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setTtlRjctdInstrBal(SignedQuantityFormat10 value) {
        this.ttlRjctdInstrBal = value;
    }

    /**
     * Gets the value of the ttlPrtctInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getTtlPrtctInstrBal() {
        return ttlPrtctInstrBal;
    }

    /**
     * Sets the value of the ttlPrtctInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setTtlPrtctInstrBal(SignedQuantityFormat10 value) {
        this.ttlPrtctInstrBal = value;
    }

    /**
     * Gets the value of the optnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructedCorporateActionOption17 }
     * 
     * 
     * @return
     *     The value of the optnDtls property.
     */
    public List<InstructedCorporateActionOption17> getOptnDtls() {
        if (optnDtls == null) {
            optnDtls = new ArrayList<>();
        }
        return this.optnDtls;
    }

}
