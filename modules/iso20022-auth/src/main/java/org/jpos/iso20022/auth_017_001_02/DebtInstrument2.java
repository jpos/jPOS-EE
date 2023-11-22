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

package org.jpos.iso20022.auth_017_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtInstrument2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DebtInstrument2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlIssdNmnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}ISODate" minOccurs="0"/>
 *         <element name="NmnlValPerUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}InterestRate6Choice"/>
 *         <element name="DebtSnrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}DebtInstrumentSeniorityType1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtInstrument2", propOrder = {
    "ttlIssdNmnlAmt",
    "mtrtyDt",
    "nmnlValPerUnit",
    "intrstRate",
    "debtSnrty"
})
public class DebtInstrument2 {

    @XmlElement(name = "TtlIssdNmnlAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount ttlIssdNmnlAmt;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "NmnlValPerUnit", required = true)
    protected ActiveOrHistoricCurrencyAndAmount nmnlValPerUnit;
    @XmlElement(name = "IntrstRate", required = true)
    protected InterestRate6Choice intrstRate;
    @XmlElement(name = "DebtSnrty")
    @XmlSchemaType(name = "string")
    protected DebtInstrumentSeniorityType1Code debtSnrty;

    /**
     * Gets the value of the ttlIssdNmnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlIssdNmnlAmt() {
        return ttlIssdNmnlAmt;
    }

    /**
     * Sets the value of the ttlIssdNmnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlIssdNmnlAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlIssdNmnlAmt = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the nmnlValPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getNmnlValPerUnit() {
        return nmnlValPerUnit;
    }

    /**
     * Sets the value of the nmnlValPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setNmnlValPerUnit(ActiveOrHistoricCurrencyAndAmount value) {
        this.nmnlValPerUnit = value;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate6Choice }
     *     
     */
    public InterestRate6Choice getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate6Choice }
     *     
     */
    public void setIntrstRate(InterestRate6Choice value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the debtSnrty property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrumentSeniorityType1Code }
     *     
     */
    public DebtInstrumentSeniorityType1Code getDebtSnrty() {
        return debtSnrty;
    }

    /**
     * Sets the value of the debtSnrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrumentSeniorityType1Code }
     *     
     */
    public void setDebtSnrty(DebtInstrumentSeniorityType1Code value) {
        this.debtSnrty = value;
    }

}
