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

package org.jpos.iso20022.caad_009_001_01;

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
 * <p>Java class for ShippingPackage2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShippingPackage2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrckgNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max70Text" minOccurs="0"/>
 *         <element name="Spplr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}PartyIdentification260" minOccurs="0"/>
 *         <element name="PckpDt" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ISODate" minOccurs="0"/>
 *         <element name="PckpTm" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ISOTime" minOccurs="0"/>
 *         <element name="Dlvry" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}DeliveryInformation4" minOccurs="0"/>
 *         <element name="Wght" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}UnitOfMeasure2" minOccurs="0"/>
 *         <element name="Pdct" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Product7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="InsrncAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingPackage2", propOrder = {
    "trckgNb",
    "spplr",
    "pckpDt",
    "pckpTm",
    "dlvry",
    "wght",
    "pdct",
    "insrncInd",
    "insrncAmt"
})
public class ShippingPackage2 {

    @XmlElement(name = "TrckgNb")
    protected String trckgNb;
    @XmlElement(name = "Spplr")
    protected PartyIdentification260 spplr;
    @XmlElement(name = "PckpDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pckpDt;
    @XmlElement(name = "PckpTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar pckpTm;
    @XmlElement(name = "Dlvry")
    protected DeliveryInformation4 dlvry;
    @XmlElement(name = "Wght")
    protected UnitOfMeasure2 wght;
    @XmlElement(name = "Pdct")
    protected List<Product7> pdct;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;

    /**
     * Gets the value of the trckgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrckgNb() {
        return trckgNb;
    }

    /**
     * Sets the value of the trckgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrckgNb(String value) {
        this.trckgNb = value;
    }

    /**
     * Gets the value of the spplr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification260 }
     *     
     */
    public PartyIdentification260 getSpplr() {
        return spplr;
    }

    /**
     * Sets the value of the spplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification260 }
     *     
     */
    public void setSpplr(PartyIdentification260 value) {
        this.spplr = value;
    }

    /**
     * Gets the value of the pckpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPckpDt() {
        return pckpDt;
    }

    /**
     * Sets the value of the pckpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPckpDt(XMLGregorianCalendar value) {
        this.pckpDt = value;
    }

    /**
     * Gets the value of the pckpTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPckpTm() {
        return pckpTm;
    }

    /**
     * Sets the value of the pckpTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPckpTm(XMLGregorianCalendar value) {
        this.pckpTm = value;
    }

    /**
     * Gets the value of the dlvry property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInformation4 }
     *     
     */
    public DeliveryInformation4 getDlvry() {
        return dlvry;
    }

    /**
     * Sets the value of the dlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInformation4 }
     *     
     */
    public void setDlvry(DeliveryInformation4 value) {
        this.dlvry = value;
    }

    /**
     * Gets the value of the wght property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure2 }
     *     
     */
    public UnitOfMeasure2 getWght() {
        return wght;
    }

    /**
     * Sets the value of the wght property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure2 }
     *     
     */
    public void setWght(UnitOfMeasure2 value) {
        this.wght = value;
    }

    /**
     * Gets the value of the pdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product7 }
     * 
     * 
     * @return
     *     The value of the pdct property.
     */
    public List<Product7> getPdct() {
        if (pdct == null) {
            pdct = new ArrayList<>();
        }
        return this.pdct;
    }

    /**
     * Gets the value of the insrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrncInd() {
        return insrncInd;
    }

    /**
     * Sets the value of the insrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsrncInd(Boolean value) {
        this.insrncInd = value;
    }

    /**
     * Gets the value of the insrncAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsrncAmt() {
        return insrncAmt;
    }

    /**
     * Sets the value of the insrncAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
    }

}
