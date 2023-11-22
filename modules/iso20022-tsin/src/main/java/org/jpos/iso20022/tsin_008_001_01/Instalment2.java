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

package org.jpos.iso20022.tsin_008_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Instalment2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Instalment2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SeqId" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}Max70Text"/>
 *         <element name="PmtDueDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}ISODate"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="PmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}PaymentMeans1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instalment2", propOrder = {
    "seqId",
    "pmtDueDt",
    "amt",
    "pmtInstrm"
})
public class Instalment2 {

    @XmlElement(name = "SeqId", required = true)
    protected String seqId;
    @XmlElement(name = "PmtDueDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDueDt;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "PmtInstrm")
    protected PaymentMeans1 pmtInstrm;

    /**
     * Gets the value of the seqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqId() {
        return seqId;
    }

    /**
     * Sets the value of the seqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqId(String value) {
        this.seqId = value;
    }

    /**
     * Gets the value of the pmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Sets the value of the pmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtDueDt(XMLGregorianCalendar value) {
        this.pmtDueDt = value;
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
     * Gets the value of the pmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeans1 }
     *     
     */
    public PaymentMeans1 getPmtInstrm() {
        return pmtInstrm;
    }

    /**
     * Sets the value of the pmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeans1 }
     *     
     */
    public void setPmtInstrm(PaymentMeans1 value) {
        this.pmtInstrm = value;
    }

}
