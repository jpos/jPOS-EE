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

package org.jpos.iso20022.sese_018_001_09;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioTransfer9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PortfolioTransfer9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MstrRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Max35Text" minOccurs="0"/>
 *         <element name="TrfId" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Max35Text"/>
 *         <element name="TrfConfId" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Max35Text" minOccurs="0"/>
 *         <element name="Prtfl" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}FundPortfolio7Choice" minOccurs="0"/>
 *         <element name="PrtlDscvry" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="RsdlCsh" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ResidualCash1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ISODate" minOccurs="0"/>
 *         <element name="FinInstrmAsstForTrf" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}FinancialInstrument99" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioTransfer9", propOrder = {
    "mstrRef",
    "trfId",
    "trfConfId",
    "prtfl",
    "prtlDscvry",
    "rsdlCsh",
    "taxDt",
    "finInstrmAsstForTrf",
    "addtlInf"
})
public class PortfolioTransfer9 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfId", required = true)
    protected String trfId;
    @XmlElement(name = "TrfConfId")
    protected String trfConfId;
    @XmlElement(name = "Prtfl")
    protected FundPortfolio7Choice prtfl;
    @XmlElement(name = "PrtlDscvry")
    protected Boolean prtlDscvry;
    @XmlElement(name = "RsdlCsh")
    protected List<ResidualCash1> rsdlCsh;
    @XmlElement(name = "TaxDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDt;
    @XmlElement(name = "FinInstrmAsstForTrf")
    protected List<FinancialInstrument99> finInstrmAsstForTrf;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrRef(String value) {
        this.mstrRef = value;
    }

    /**
     * Gets the value of the trfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfId() {
        return trfId;
    }

    /**
     * Sets the value of the trfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfId(String value) {
        this.trfId = value;
    }

    /**
     * Gets the value of the trfConfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfConfId() {
        return trfConfId;
    }

    /**
     * Sets the value of the trfConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfConfId(String value) {
        this.trfConfId = value;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link FundPortfolio7Choice }
     *     
     */
    public FundPortfolio7Choice getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundPortfolio7Choice }
     *     
     */
    public void setPrtfl(FundPortfolio7Choice value) {
        this.prtfl = value;
    }

    /**
     * Gets the value of the prtlDscvry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlDscvry() {
        return prtlDscvry;
    }

    /**
     * Sets the value of the prtlDscvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtlDscvry(Boolean value) {
        this.prtlDscvry = value;
    }

    /**
     * Gets the value of the rsdlCsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsdlCsh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsdlCsh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResidualCash1 }
     * 
     * 
     * @return
     *     The value of the rsdlCsh property.
     */
    public List<ResidualCash1> getRsdlCsh() {
        if (rsdlCsh == null) {
            rsdlCsh = new ArrayList<>();
        }
        return this.rsdlCsh;
    }

    /**
     * Gets the value of the taxDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxDt() {
        return taxDt;
    }

    /**
     * Sets the value of the taxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxDt(XMLGregorianCalendar value) {
        this.taxDt = value;
    }

    /**
     * Gets the value of the finInstrmAsstForTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmAsstForTrf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmAsstForTrf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument99 }
     * 
     * 
     * @return
     *     The value of the finInstrmAsstForTrf property.
     */
    public List<FinancialInstrument99> getFinInstrmAsstForTrf() {
        if (finInstrmAsstForTrf == null) {
            finInstrmAsstForTrf = new ArrayList<>();
        }
        return this.finInstrmAsstForTrf;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
