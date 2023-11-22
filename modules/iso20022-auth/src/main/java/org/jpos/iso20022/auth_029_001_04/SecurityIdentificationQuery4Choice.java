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

package org.jpos.iso20022.auth_029_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIdentificationQuery4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityIdentificationQuery4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}ISINOct2015Identifier" maxOccurs="unbounded"/>
 *         <element name="AltrntvInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}Max52Text" maxOccurs="unbounded"/>
 *         <element name="NotAvlbl" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}NotAvailable1Code"/>
 *         <element name="UnqPdctIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}Max52Text" maxOccurs="unbounded"/>
 *         <element name="Indx" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}SecurityIdentification20Choice" maxOccurs="unbounded"/>
 *         <element name="Bskt" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}BasketQuery1" maxOccurs="unbounded"/>
 *         <element name="NotRptd" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}NotReported1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentificationQuery4Choice", propOrder = {
    "isin",
    "altrntvInstrmId",
    "notAvlbl",
    "unqPdctIdr",
    "indx",
    "bskt",
    "notRptd"
})
public class SecurityIdentificationQuery4Choice {

    @XmlElement(name = "ISIN")
    protected List<String> isin;
    @XmlElement(name = "AltrntvInstrmId")
    protected List<String> altrntvInstrmId;
    @XmlElement(name = "NotAvlbl")
    @XmlSchemaType(name = "string")
    protected NotAvailable1Code notAvlbl;
    @XmlElement(name = "UnqPdctIdr")
    protected List<String> unqPdctIdr;
    @XmlElement(name = "Indx")
    protected List<SecurityIdentification20Choice> indx;
    @XmlElement(name = "Bskt")
    protected List<BasketQuery1> bskt;
    @XmlElement(name = "NotRptd")
    @XmlSchemaType(name = "string")
    protected NotReported1Code notRptd;

    /**
     * Gets the value of the isin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the isin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the isin property.
     */
    public List<String> getISIN() {
        if (isin == null) {
            isin = new ArrayList<>();
        }
        return this.isin;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrntvInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrntvInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the altrntvInstrmId property.
     */
    public List<String> getAltrntvInstrmId() {
        if (altrntvInstrmId == null) {
            altrntvInstrmId = new ArrayList<>();
        }
        return this.altrntvInstrmId;
    }

    /**
     * Gets the value of the notAvlbl property.
     * 
     * @return
     *     possible object is
     *     {@link NotAvailable1Code }
     *     
     */
    public NotAvailable1Code getNotAvlbl() {
        return notAvlbl;
    }

    /**
     * Sets the value of the notAvlbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotAvailable1Code }
     *     
     */
    public void setNotAvlbl(NotAvailable1Code value) {
        this.notAvlbl = value;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unqPdctIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnqPdctIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the unqPdctIdr property.
     */
    public List<String> getUnqPdctIdr() {
        if (unqPdctIdr == null) {
            unqPdctIdr = new ArrayList<>();
        }
        return this.unqPdctIdr;
    }

    /**
     * Gets the value of the indx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification20Choice }
     * 
     * 
     * @return
     *     The value of the indx property.
     */
    public List<SecurityIdentification20Choice> getIndx() {
        if (indx == null) {
            indx = new ArrayList<>();
        }
        return this.indx;
    }

    /**
     * Gets the value of the bskt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bskt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBskt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketQuery1 }
     * 
     * 
     * @return
     *     The value of the bskt property.
     */
    public List<BasketQuery1> getBskt() {
        if (bskt == null) {
            bskt = new ArrayList<>();
        }
        return this.bskt;
    }

    /**
     * Gets the value of the notRptd property.
     * 
     * @return
     *     possible object is
     *     {@link NotReported1Code }
     *     
     */
    public NotReported1Code getNotRptd() {
        return notRptd;
    }

    /**
     * Sets the value of the notRptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotReported1Code }
     *     
     */
    public void setNotRptd(NotReported1Code value) {
        this.notRptd = value;
    }

}
