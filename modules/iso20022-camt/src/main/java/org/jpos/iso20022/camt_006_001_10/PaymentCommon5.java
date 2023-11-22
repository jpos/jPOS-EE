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

package org.jpos.iso20022.camt_006_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCommon5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentCommon5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtFr" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}System2" minOccurs="0"/>
 *         <element name="PmtTo" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}System2" minOccurs="0"/>
 *         <element name="CmonSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PaymentStatus6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="NtryDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}CreditDebitCode" minOccurs="0"/>
 *         <element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PaymentOrigin1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCommon5", propOrder = {
    "pmtFr",
    "pmtTo",
    "cmonSts",
    "reqdExctnDt",
    "ntryDt",
    "cdtDbtInd",
    "pmtMtd"
})
public class PaymentCommon5 {

    @XmlElement(name = "PmtFr")
    protected System2 pmtFr;
    @XmlElement(name = "PmtTo")
    protected System2 pmtTo;
    @XmlElement(name = "CmonSts")
    protected List<PaymentStatus6> cmonSts;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "NtryDt")
    protected DateAndDateTime2Choice ntryDt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "PmtMtd")
    protected PaymentOrigin1Choice pmtMtd;

    /**
     * Gets the value of the pmtFr property.
     * 
     * @return
     *     possible object is
     *     {@link System2 }
     *     
     */
    public System2 getPmtFr() {
        return pmtFr;
    }

    /**
     * Sets the value of the pmtFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link System2 }
     *     
     */
    public void setPmtFr(System2 value) {
        this.pmtFr = value;
    }

    /**
     * Gets the value of the pmtTo property.
     * 
     * @return
     *     possible object is
     *     {@link System2 }
     *     
     */
    public System2 getPmtTo() {
        return pmtTo;
    }

    /**
     * Sets the value of the pmtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link System2 }
     *     
     */
    public void setPmtTo(System2 value) {
        this.pmtTo = value;
    }

    /**
     * Gets the value of the cmonSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmonSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmonSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentStatus6 }
     * 
     * 
     * @return
     *     The value of the cmonSts property.
     */
    public List<PaymentStatus6> getCmonSts() {
        if (cmonSts == null) {
            cmonSts = new ArrayList<>();
        }
        return this.cmonSts;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the ntryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getNtryDt() {
        return ntryDt;
    }

    /**
     * Sets the value of the ntryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setNtryDt(DateAndDateTime2Choice value) {
        this.ntryDt = value;
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

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public PaymentOrigin1Choice getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public void setPmtMtd(PaymentOrigin1Choice value) {
        this.pmtMtd = value;
    }

}
