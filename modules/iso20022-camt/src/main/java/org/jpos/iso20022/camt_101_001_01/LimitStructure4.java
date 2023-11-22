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

package org.jpos.iso20022.camt_101_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitStructure4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LimitStructure4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.101.001.01}LimitIdentification5"/>
 *         <element name="StartDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.101.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.101.001.01}Amount2Choice"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.101.001.01}CreditDebitCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitStructure4", propOrder = {
    "lmtId",
    "startDtTm",
    "amt",
    "cdtDbtInd"
})
public class LimitStructure4 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentification5 lmtId;
    @XmlElement(name = "StartDtTm")
    protected DateAndDateTime2Choice startDtTm;
    @XmlElement(name = "Amt", required = true)
    protected Amount2Choice amt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;

    /**
     * Gets the value of the lmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification5 }
     *     
     */
    public LimitIdentification5 getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification5 }
     *     
     */
    public void setLmtId(LimitIdentification5 value) {
        this.lmtId = value;
    }

    /**
     * Gets the value of the startDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getStartDtTm() {
        return startDtTm;
    }

    /**
     * Sets the value of the startDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setStartDtTm(DateAndDateTime2Choice value) {
        this.startDtTm = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setAmt(Amount2Choice value) {
        this.amt = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

}
