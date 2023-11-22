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

package org.jpos.iso20022.auth_090_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDerivative7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CreditDerivative7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Snrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}DebtInstrumentSeniorityType2Code" minOccurs="0"/>
 *         <element name="RefPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}DerivativePartyIdentification1Choice" minOccurs="0"/>
 *         <element name="PmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}Frequency13Code" minOccurs="0"/>
 *         <element name="ClctnBsis" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Srs" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}Number" minOccurs="0"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}Number" minOccurs="0"/>
 *         <element name="IndxFctr" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PercentageRate" minOccurs="0"/>
 *         <element name="TrchInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDerivative7", propOrder = {
    "snrty",
    "refPty",
    "pmtFrqcy",
    "clctnBsis",
    "srs",
    "vrsn",
    "indxFctr",
    "trchInd"
})
public class CreditDerivative7 {

    @XmlElement(name = "Snrty")
    @XmlSchemaType(name = "string")
    protected DebtInstrumentSeniorityType2Code snrty;
    @XmlElement(name = "RefPty")
    protected DerivativePartyIdentification1Choice refPty;
    @XmlElement(name = "PmtFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency13Code pmtFrqcy;
    @XmlElement(name = "ClctnBsis")
    protected String clctnBsis;
    @XmlElement(name = "Srs")
    protected BigDecimal srs;
    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "IndxFctr")
    protected BigDecimal indxFctr;
    @XmlElement(name = "TrchInd")
    protected Boolean trchInd;

    /**
     * Gets the value of the snrty property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrumentSeniorityType2Code }
     *     
     */
    public DebtInstrumentSeniorityType2Code getSnrty() {
        return snrty;
    }

    /**
     * Sets the value of the snrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrumentSeniorityType2Code }
     *     
     */
    public void setSnrty(DebtInstrumentSeniorityType2Code value) {
        this.snrty = value;
    }

    /**
     * Gets the value of the refPty property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativePartyIdentification1Choice }
     *     
     */
    public DerivativePartyIdentification1Choice getRefPty() {
        return refPty;
    }

    /**
     * Sets the value of the refPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativePartyIdentification1Choice }
     *     
     */
    public void setRefPty(DerivativePartyIdentification1Choice value) {
        this.refPty = value;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency13Code }
     *     
     */
    public Frequency13Code getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency13Code }
     *     
     */
    public void setPmtFrqcy(Frequency13Code value) {
        this.pmtFrqcy = value;
    }

    /**
     * Gets the value of the clctnBsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClctnBsis() {
        return clctnBsis;
    }

    /**
     * Sets the value of the clctnBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClctnBsis(String value) {
        this.clctnBsis = value;
    }

    /**
     * Gets the value of the srs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrs() {
        return srs;
    }

    /**
     * Sets the value of the srs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSrs(BigDecimal value) {
        this.srs = value;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrsn(BigDecimal value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the indxFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndxFctr() {
        return indxFctr;
    }

    /**
     * Sets the value of the indxFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndxFctr(BigDecimal value) {
        this.indxFctr = value;
    }

    /**
     * Gets the value of the trchInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrchInd() {
        return trchInd;
    }

    /**
     * Sets the value of the trchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrchInd(Boolean value) {
        this.trchInd = value;
    }

}
