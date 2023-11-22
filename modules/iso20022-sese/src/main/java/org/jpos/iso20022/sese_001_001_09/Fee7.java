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

package org.jpos.iso20022.sese_001_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fee7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Fee7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}ChargeType6Choice"/>
 *         <element name="Bsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}ChargeBasis2Choice" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}ActiveCurrencyAndAmount"/>
 *         <element name="DscntDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}ChargeOrCommissionDiscount2" minOccurs="0"/>
 *         <element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}ChargeBearer1Code" minOccurs="0"/>
 *         <element name="RcptId" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}PartyIdentification139" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee7", propOrder = {
    "tp",
    "bsis",
    "amt",
    "dscntDtls",
    "chrgBr",
    "rcptId"
})
public class Fee7 {

    @XmlElement(name = "Tp", required = true)
    protected ChargeType6Choice tp;
    @XmlElement(name = "Bsis")
    protected ChargeBasis2Choice bsis;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "DscntDtls")
    protected ChargeOrCommissionDiscount2 dscntDtls;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearer1Code chrgBr;
    @XmlElement(name = "RcptId")
    protected PartyIdentification139 rcptId;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType6Choice }
     *     
     */
    public ChargeType6Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType6Choice }
     *     
     */
    public void setTp(ChargeType6Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBasis2Choice }
     *     
     */
    public ChargeBasis2Choice getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBasis2Choice }
     *     
     */
    public void setBsis(ChargeBasis2Choice value) {
        this.bsis = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the dscntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeOrCommissionDiscount2 }
     *     
     */
    public ChargeOrCommissionDiscount2 getDscntDtls() {
        return dscntDtls;
    }

    /**
     * Sets the value of the dscntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeOrCommissionDiscount2 }
     *     
     */
    public void setDscntDtls(ChargeOrCommissionDiscount2 value) {
        this.dscntDtls = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearer1Code }
     *     
     */
    public ChargeBearer1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearer1Code }
     *     
     */
    public void setChrgBr(ChargeBearer1Code value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public void setRcptId(PartyIdentification139 value) {
        this.rcptId = value;
    }

}
