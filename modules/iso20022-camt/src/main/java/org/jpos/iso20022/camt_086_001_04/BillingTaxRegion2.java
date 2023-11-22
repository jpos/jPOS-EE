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

package org.jpos.iso20022.camt_086_001_04;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingTaxRegion2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingTaxRegion2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RgnNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max40Text"/>
 *         <element name="RgnNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max40Text"/>
 *         <element name="CstmrTaxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max40Text"/>
 *         <element name="PtDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ISODate" minOccurs="0"/>
 *         <element name="SndgFI" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingTaxIdentification2" minOccurs="0"/>
 *         <element name="InvcNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max40Text" minOccurs="0"/>
 *         <element name="MtdC" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingMethod4" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34"/>
 *         <element name="TaxDueToRgn" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingTaxRegion2", propOrder = {
    "rgnNb",
    "rgnNm",
    "cstmrTaxId",
    "ptDt",
    "sndgFI",
    "invcNb",
    "mtdC",
    "sttlmAmt",
    "taxDueToRgn"
})
public class BillingTaxRegion2 {

    @XmlElement(name = "RgnNb", required = true)
    protected String rgnNb;
    @XmlElement(name = "RgnNm", required = true)
    protected String rgnNm;
    @XmlElement(name = "CstmrTaxId", required = true)
    protected String cstmrTaxId;
    @XmlElement(name = "PtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ptDt;
    @XmlElement(name = "SndgFI")
    protected BillingTaxIdentification2 sndgFI;
    @XmlElement(name = "InvcNb")
    protected String invcNb;
    @XmlElement(name = "MtdC")
    protected BillingMethod4 mtdC;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection34 sttlmAmt;
    @XmlElement(name = "TaxDueToRgn", required = true)
    protected AmountAndDirection34 taxDueToRgn;

    /**
     * Gets the value of the rgnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgnNb() {
        return rgnNb;
    }

    /**
     * Sets the value of the rgnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgnNb(String value) {
        this.rgnNb = value;
    }

    /**
     * Gets the value of the rgnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgnNm() {
        return rgnNm;
    }

    /**
     * Sets the value of the rgnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgnNm(String value) {
        this.rgnNm = value;
    }

    /**
     * Gets the value of the cstmrTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrTaxId() {
        return cstmrTaxId;
    }

    /**
     * Sets the value of the cstmrTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrTaxId(String value) {
        this.cstmrTaxId = value;
    }

    /**
     * Gets the value of the ptDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPtDt() {
        return ptDt;
    }

    /**
     * Sets the value of the ptDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPtDt(XMLGregorianCalendar value) {
        this.ptDt = value;
    }

    /**
     * Gets the value of the sndgFI property.
     * 
     * @return
     *     possible object is
     *     {@link BillingTaxIdentification2 }
     *     
     */
    public BillingTaxIdentification2 getSndgFI() {
        return sndgFI;
    }

    /**
     * Sets the value of the sndgFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingTaxIdentification2 }
     *     
     */
    public void setSndgFI(BillingTaxIdentification2 value) {
        this.sndgFI = value;
    }

    /**
     * Gets the value of the invcNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcNb() {
        return invcNb;
    }

    /**
     * Sets the value of the invcNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvcNb(String value) {
        this.invcNb = value;
    }

    /**
     * Gets the value of the mtdC property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethod4 }
     *     
     */
    public BillingMethod4 getMtdC() {
        return mtdC;
    }

    /**
     * Sets the value of the mtdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethod4 }
     *     
     */
    public void setMtdC(BillingMethod4 value) {
        this.mtdC = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setSttlmAmt(AmountAndDirection34 value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the taxDueToRgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getTaxDueToRgn() {
        return taxDueToRgn;
    }

    /**
     * Sets the value of the taxDueToRgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setTaxDueToRgn(AmountAndDirection34 value) {
        this.taxDueToRgn = value;
    }

}
