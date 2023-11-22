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

package org.jpos.iso20022.colr_021_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralAmount12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralAmount12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}AmountAndDirection49" minOccurs="0"/>
 *         <element name="Termntn" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}AmountAndDirection49" minOccurs="0"/>
 *         <element name="Acrd" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}AmountAndDirection49" minOccurs="0"/>
 *         <element name="CmpndSmplAcrlClctn" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}CalculationMethod1Code" minOccurs="0"/>
 *         <element name="PmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Frequency38Choice" minOccurs="0"/>
 *         <element name="IntrstPmtDely" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max3NumericText" minOccurs="0"/>
 *         <element name="ValSght" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}AmountAndDirection49" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount12", propOrder = {
    "tx",
    "termntn",
    "acrd",
    "cmpndSmplAcrlClctn",
    "pmtFrqcy",
    "intrstPmtDely",
    "valSght"
})
public class CollateralAmount12 {

    @XmlElement(name = "Tx")
    protected AmountAndDirection49 tx;
    @XmlElement(name = "Termntn")
    protected AmountAndDirection49 termntn;
    @XmlElement(name = "Acrd")
    protected AmountAndDirection49 acrd;
    @XmlElement(name = "CmpndSmplAcrlClctn")
    @XmlSchemaType(name = "string")
    protected CalculationMethod1Code cmpndSmplAcrlClctn;
    @XmlElement(name = "PmtFrqcy")
    protected Frequency38Choice pmtFrqcy;
    @XmlElement(name = "IntrstPmtDely")
    protected String intrstPmtDely;
    @XmlElement(name = "ValSght")
    protected AmountAndDirection49 valSght;

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setTx(AmountAndDirection49 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the termntn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getTermntn() {
        return termntn;
    }

    /**
     * Sets the value of the termntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setTermntn(AmountAndDirection49 value) {
        this.termntn = value;
    }

    /**
     * Gets the value of the acrd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getAcrd() {
        return acrd;
    }

    /**
     * Sets the value of the acrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setAcrd(AmountAndDirection49 value) {
        this.acrd = value;
    }

    /**
     * Gets the value of the cmpndSmplAcrlClctn property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationMethod1Code }
     *     
     */
    public CalculationMethod1Code getCmpndSmplAcrlClctn() {
        return cmpndSmplAcrlClctn;
    }

    /**
     * Sets the value of the cmpndSmplAcrlClctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationMethod1Code }
     *     
     */
    public void setCmpndSmplAcrlClctn(CalculationMethod1Code value) {
        this.cmpndSmplAcrlClctn = value;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency38Choice }
     *     
     */
    public Frequency38Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency38Choice }
     *     
     */
    public void setPmtFrqcy(Frequency38Choice value) {
        this.pmtFrqcy = value;
    }

    /**
     * Gets the value of the intrstPmtDely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtDely() {
        return intrstPmtDely;
    }

    /**
     * Sets the value of the intrstPmtDely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrstPmtDely(String value) {
        this.intrstPmtDely = value;
    }

    /**
     * Gets the value of the valSght property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getValSght() {
        return valSght;
    }

    /**
     * Sets the value of the valSght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setValSght(AmountAndDirection49 value) {
        this.valSght = value;
    }

}
