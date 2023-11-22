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

package org.jpos.iso20022.auth_107_001_01;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractValuationData8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContractValuationData8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AmountAndDirection109" minOccurs="0"/>
 *         <element name="TmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ValuationType1Code" minOccurs="0"/>
 *         <element name="Dlta" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}LongFraction19DecimalNumber" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractValuationData8", propOrder = {
    "ctrctVal",
    "tmStmp",
    "tp",
    "dlta"
})
public class ContractValuationData8 {

    @XmlElement(name = "CtrctVal")
    protected AmountAndDirection109 ctrctVal;
    @XmlElement(name = "TmStmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmStmp;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ValuationType1Code tp;
    @XmlElement(name = "Dlta")
    protected BigDecimal dlta;

    /**
     * Gets the value of the ctrctVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection109 }
     *     
     */
    public AmountAndDirection109 getCtrctVal() {
        return ctrctVal;
    }

    /**
     * Sets the value of the ctrctVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection109 }
     *     
     */
    public void setCtrctVal(AmountAndDirection109 value) {
        this.ctrctVal = value;
    }

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTmStmp(XMLGregorianCalendar value) {
        this.tmStmp = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationType1Code }
     *     
     */
    public ValuationType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationType1Code }
     *     
     */
    public void setTp(ValuationType1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the dlta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDlta() {
        return dlta;
    }

    /**
     * Sets the value of the dlta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDlta(BigDecimal value) {
        this.dlta = value;
    }

}
