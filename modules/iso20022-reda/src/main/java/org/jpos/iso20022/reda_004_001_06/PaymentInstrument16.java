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

package org.jpos.iso20022.reda_004_001_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrument16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentInstrument16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrdrTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}FundOrderType5Choice"/>
 *         <element name="InstrmTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}FundPaymentType1Choice"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument16", propOrder = {
    "ordrTp",
    "instrmTp",
    "addtlInf"
})
public class PaymentInstrument16 {

    @XmlElement(name = "OrdrTp", required = true)
    protected FundOrderType5Choice ordrTp;
    @XmlElement(name = "InstrmTp", required = true)
    protected FundPaymentType1Choice instrmTp;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the ordrTp property.
     * 
     * @return
     *     possible object is
     *     {@link FundOrderType5Choice }
     *     
     */
    public FundOrderType5Choice getOrdrTp() {
        return ordrTp;
    }

    /**
     * Sets the value of the ordrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundOrderType5Choice }
     *     
     */
    public void setOrdrTp(FundOrderType5Choice value) {
        this.ordrTp = value;
    }

    /**
     * Gets the value of the instrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link FundPaymentType1Choice }
     *     
     */
    public FundPaymentType1Choice getInstrmTp() {
        return instrmTp;
    }

    /**
     * Sets the value of the instrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundPaymentType1Choice }
     *     
     */
    public void setInstrmTp(FundPaymentType1Choice value) {
        this.instrmTp = value;
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
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
