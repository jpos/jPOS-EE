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

package org.jpos.iso20022.auth_069_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentAttributes89 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentAttributes89">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctSz" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}ContractSize1"/>
 *         <element name="DlvryTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}PhysicalTransferType4Code"/>
 *         <element name="UndrlygId" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}GenericIdentification165"/>
 *         <element name="PricCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}ActiveCurrencyCode"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes89", propOrder = {
    "ctrctSz",
    "dlvryTp",
    "undrlygId",
    "pricCcy"
})
public class FinancialInstrumentAttributes89 {

    @XmlElement(name = "CtrctSz", required = true)
    protected ContractSize1 ctrctSz;
    @XmlElement(name = "DlvryTp", required = true)
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType4Code dlvryTp;
    @XmlElement(name = "UndrlygId", required = true)
    protected GenericIdentification165 undrlygId;
    @XmlElement(name = "PricCcy", required = true)
    protected String pricCcy;

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link ContractSize1 }
     *     
     */
    public ContractSize1 getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSize1 }
     *     
     */
    public void setCtrctSz(ContractSize1 value) {
        this.ctrctSz = value;
    }

    /**
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public PhysicalTransferType4Code getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public void setDlvryTp(PhysicalTransferType4Code value) {
        this.dlvryTp = value;
    }

    /**
     * Gets the value of the undrlygId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getUndrlygId() {
        return undrlygId;
    }

    /**
     * Sets the value of the undrlygId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public void setUndrlygId(GenericIdentification165 value) {
        this.undrlygId = value;
    }

    /**
     * Gets the value of the pricCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricCcy() {
        return pricCcy;
    }

    /**
     * Sets the value of the pricCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricCcy(String value) {
        this.pricCcy = value;
    }

}
