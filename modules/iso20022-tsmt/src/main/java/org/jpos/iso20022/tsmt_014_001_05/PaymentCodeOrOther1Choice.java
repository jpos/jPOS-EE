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

package org.jpos.iso20022.tsmt_014_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCodeOrOther1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentCodeOrOther1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PmtCd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}PaymentPeriod3"/>
 *         <element name="PmtDueDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}ISODate"/>
 *         <element name="OthrPmtTerms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max140Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCodeOrOther1Choice", propOrder = {
    "pmtCd",
    "pmtDueDt",
    "othrPmtTerms"
})
public class PaymentCodeOrOther1Choice {

    @XmlElement(name = "PmtCd")
    protected PaymentPeriod3 pmtCd;
    @XmlElement(name = "PmtDueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDueDt;
    @XmlElement(name = "OthrPmtTerms")
    protected String othrPmtTerms;

    /**
     * Gets the value of the pmtCd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPeriod3 }
     *     
     */
    public PaymentPeriod3 getPmtCd() {
        return pmtCd;
    }

    /**
     * Sets the value of the pmtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPeriod3 }
     *     
     */
    public void setPmtCd(PaymentPeriod3 value) {
        this.pmtCd = value;
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
     * Gets the value of the othrPmtTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPmtTerms() {
        return othrPmtTerms;
    }

    /**
     * Sets the value of the othrPmtTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrPmtTerms(String value) {
        this.othrPmtTerms = value;
    }

}
