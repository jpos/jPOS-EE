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

package org.jpos.iso20022.tsin_002_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceFinancingDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceFinancingDetails1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlInvcInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}OriginalInvoiceInformation1"/>
 *         <element name="Spplr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}PartyIdentification8" minOccurs="0"/>
 *         <element name="InvcFincgRslt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}FinancingResult1"/>
 *         <element name="InstlmtFincgInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}InstalmentFinancingInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFinancingDetails1", propOrder = {
    "orgnlInvcInf",
    "spplr",
    "invcFincgRslt",
    "instlmtFincgInf"
})
public class InvoiceFinancingDetails1 {

    @XmlElement(name = "OrgnlInvcInf", required = true)
    protected OriginalInvoiceInformation1 orgnlInvcInf;
    @XmlElement(name = "Spplr")
    protected PartyIdentification8 spplr;
    @XmlElement(name = "InvcFincgRslt", required = true)
    protected FinancingResult1 invcFincgRslt;
    @XmlElement(name = "InstlmtFincgInf")
    protected List<InstalmentFinancingInformation1> instlmtFincgInf;

    /**
     * Gets the value of the orgnlInvcInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalInvoiceInformation1 }
     *     
     */
    public OriginalInvoiceInformation1 getOrgnlInvcInf() {
        return orgnlInvcInf;
    }

    /**
     * Sets the value of the orgnlInvcInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalInvoiceInformation1 }
     *     
     */
    public void setOrgnlInvcInf(OriginalInvoiceInformation1 value) {
        this.orgnlInvcInf = value;
    }

    /**
     * Gets the value of the spplr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getSpplr() {
        return spplr;
    }

    /**
     * Sets the value of the spplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public void setSpplr(PartyIdentification8 value) {
        this.spplr = value;
    }

    /**
     * Gets the value of the invcFincgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingResult1 }
     *     
     */
    public FinancingResult1 getInvcFincgRslt() {
        return invcFincgRslt;
    }

    /**
     * Sets the value of the invcFincgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingResult1 }
     *     
     */
    public void setInvcFincgRslt(FinancingResult1 value) {
        this.invcFincgRslt = value;
    }

    /**
     * Gets the value of the instlmtFincgInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instlmtFincgInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmtFincgInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalmentFinancingInformation1 }
     * 
     * 
     * @return
     *     The value of the instlmtFincgInf property.
     */
    public List<InstalmentFinancingInformation1> getInstlmtFincgInf() {
        if (instlmtFincgInf == null) {
            instlmtFincgInf = new ArrayList<>();
        }
        return this.instlmtFincgInf;
    }

}
