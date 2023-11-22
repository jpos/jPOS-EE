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

package org.jpos.iso20022.tsin_012_001_01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuaranteeDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GuaranteeDetails1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Issr" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="Pos" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}Max2000Text" minOccurs="0"/>
 *         <element name="GrntedAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}AmountAndPeriod1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Xcss" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}AmountAndPeriod1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CvrdPctg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}PercentageAndPeriod1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AssoctdDoc" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeDetails1", propOrder = {
    "issr",
    "pos",
    "desc",
    "grntedAmt",
    "xcss",
    "cvrdPctg",
    "assoctdDoc",
    "addtlInf"
})
public class GuaranteeDetails1 {

    @XmlElement(name = "Issr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object issr;
    @XmlElement(name = "Pos")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pos;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "GrntedAmt")
    protected List<AmountAndPeriod1> grntedAmt;
    @XmlElement(name = "Xcss")
    protected List<AmountAndPeriod1> xcss;
    @XmlElement(name = "CvrdPctg")
    protected List<PercentageAndPeriod1> cvrdPctg;
    @XmlElementRef(name = "AssoctdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> assoctdDoc;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIssr(Object value) {
        this.issr = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPos(BigInteger value) {
        this.pos = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the grntedAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grntedAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrntedAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndPeriod1 }
     * 
     * 
     * @return
     *     The value of the grntedAmt property.
     */
    public List<AmountAndPeriod1> getGrntedAmt() {
        if (grntedAmt == null) {
            grntedAmt = new ArrayList<>();
        }
        return this.grntedAmt;
    }

    /**
     * Gets the value of the xcss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xcss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXcss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndPeriod1 }
     * 
     * 
     * @return
     *     The value of the xcss property.
     */
    public List<AmountAndPeriod1> getXcss() {
        if (xcss == null) {
            xcss = new ArrayList<>();
        }
        return this.xcss;
    }

    /**
     * Gets the value of the cvrdPctg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cvrdPctg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvrdPctg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PercentageAndPeriod1 }
     * 
     * 
     * @return
     *     The value of the cvrdPctg property.
     */
    public List<PercentageAndPeriod1> getCvrdPctg() {
        if (cvrdPctg == null) {
            cvrdPctg = new ArrayList<>();
        }
        return this.cvrdPctg;
    }

    /**
     * Gets the value of the assoctdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assoctdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssoctdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the assoctdDoc property.
     */
    public List<JAXBElement<Object>> getAssoctdDoc() {
        if (assoctdDoc == null) {
            assoctdDoc = new ArrayList<>();
        }
        return this.assoctdDoc;
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
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
