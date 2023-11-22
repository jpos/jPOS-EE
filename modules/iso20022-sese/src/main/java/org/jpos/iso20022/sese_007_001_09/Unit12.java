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

package org.jpos.iso20022.sese_007_001_09;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Unit12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Unit12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UnitsNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}DecimalNumber"/>
 *         <element name="OrdrDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ISODate" minOccurs="0"/>
 *         <element name="AcqstnDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ISODate" minOccurs="0"/>
 *         <element name="CertNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Grp1Or2Units" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}UKTaxGroupUnit1Code" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}Max35Text" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}UnitPrice23" minOccurs="0"/>
 *         <element name="TxOvrhd" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}TotalFeesAndTaxes42" minOccurs="0"/>
 *         <element name="OthrAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}OtherAmount1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Unit12", propOrder = {
    "unitsNb",
    "ordrDt",
    "acqstnDt",
    "certNb",
    "grp1Or2Units",
    "ref",
    "pricDtls",
    "txOvrhd",
    "othrAmt"
})
public class Unit12 {

    @XmlElement(name = "UnitsNb", required = true)
    protected BigDecimal unitsNb;
    @XmlElement(name = "OrdrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ordrDt;
    @XmlElement(name = "AcqstnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acqstnDt;
    @XmlElement(name = "CertNb")
    protected List<String> certNb;
    @XmlElement(name = "Grp1Or2Units")
    @XmlSchemaType(name = "string")
    protected UKTaxGroupUnit1Code grp1Or2Units;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "PricDtls")
    protected UnitPrice23 pricDtls;
    @XmlElement(name = "TxOvrhd")
    protected TotalFeesAndTaxes42 txOvrhd;
    @XmlElement(name = "OthrAmt")
    protected List<OtherAmount1> othrAmt;

    /**
     * Gets the value of the unitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitsNb() {
        return unitsNb;
    }

    /**
     * Sets the value of the unitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitsNb(BigDecimal value) {
        this.unitsNb = value;
    }

    /**
     * Gets the value of the ordrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdrDt() {
        return ordrDt;
    }

    /**
     * Sets the value of the ordrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdrDt(XMLGregorianCalendar value) {
        this.ordrDt = value;
    }

    /**
     * Gets the value of the acqstnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcqstnDt() {
        return acqstnDt;
    }

    /**
     * Sets the value of the acqstnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcqstnDt(XMLGregorianCalendar value) {
        this.acqstnDt = value;
    }

    /**
     * Gets the value of the certNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the certNb property.
     */
    public List<String> getCertNb() {
        if (certNb == null) {
            certNb = new ArrayList<>();
        }
        return this.certNb;
    }

    /**
     * Gets the value of the grp1Or2Units property.
     * 
     * @return
     *     possible object is
     *     {@link UKTaxGroupUnit1Code }
     *     
     */
    public UKTaxGroupUnit1Code getGrp1Or2Units() {
        return grp1Or2Units;
    }

    /**
     * Sets the value of the grp1Or2Units property.
     * 
     * @param value
     *     allowed object is
     *     {@link UKTaxGroupUnit1Code }
     *     
     */
    public void setGrp1Or2Units(UKTaxGroupUnit1Code value) {
        this.grp1Or2Units = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice23 }
     *     
     */
    public UnitPrice23 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice23 }
     *     
     */
    public void setPricDtls(UnitPrice23 value) {
        this.pricDtls = value;
    }

    /**
     * Gets the value of the txOvrhd property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFeesAndTaxes42 }
     *     
     */
    public TotalFeesAndTaxes42 getTxOvrhd() {
        return txOvrhd;
    }

    /**
     * Sets the value of the txOvrhd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFeesAndTaxes42 }
     *     
     */
    public void setTxOvrhd(TotalFeesAndTaxes42 value) {
        this.txOvrhd = value;
    }

    /**
     * Gets the value of the othrAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmount1 }
     * 
     * 
     * @return
     *     The value of the othrAmt property.
     */
    public List<OtherAmount1> getOthrAmt() {
        if (othrAmt == null) {
            othrAmt = new ArrayList<>();
        }
        return this.othrAmt;
    }

}
