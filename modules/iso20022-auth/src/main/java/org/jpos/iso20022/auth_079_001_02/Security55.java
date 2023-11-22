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

package org.jpos.iso20022.auth_079_001_02;

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
 * <p>Java class for Security55 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Security55">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ISINOct2015Identifier" minOccurs="0"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}CFIOct2015Identifier" minOccurs="0"/>
 *         <element name="QtyOrNmnlVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}QuantityNominalValue2Choice" minOccurs="0"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}SecuritiesTransactionPrice19Choice" minOccurs="0"/>
 *         <element name="MktVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}AmountAndDirection53" minOccurs="0"/>
 *         <element name="Qlty" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}CollateralQualityType1Code" minOccurs="0"/>
 *         <element name="Mtrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ISODate" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}SecurityIssuer4" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}SecuritiesLendingType3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ExclsvArrgmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AvlblForCollReuse" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="HrcutOrMrgn" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security55", propOrder = {
    "id",
    "clssfctnTp",
    "qtyOrNmnlVal",
    "unitPric",
    "mktVal",
    "qlty",
    "mtrty",
    "issr",
    "tp",
    "exclsvArrgmnt",
    "avlblForCollReuse",
    "hrcutOrMrgn"
})
public class Security55 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ClssfctnTp")
    protected String clssfctnTp;
    @XmlElement(name = "QtyOrNmnlVal")
    protected QuantityNominalValue2Choice qtyOrNmnlVal;
    @XmlElement(name = "UnitPric")
    protected SecuritiesTransactionPrice19Choice unitPric;
    @XmlElement(name = "MktVal")
    protected AmountAndDirection53 mktVal;
    @XmlElement(name = "Qlty")
    @XmlSchemaType(name = "string")
    protected CollateralQualityType1Code qlty;
    @XmlElement(name = "Mtrty")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrty;
    @XmlElement(name = "Issr")
    protected SecurityIssuer4 issr;
    @XmlElement(name = "Tp")
    protected List<SecuritiesLendingType3Choice> tp;
    @XmlElement(name = "ExclsvArrgmnt")
    protected Boolean exclsvArrgmnt;
    @XmlElement(name = "AvlblForCollReuse")
    protected Boolean avlblForCollReuse;
    @XmlElement(name = "HrcutOrMrgn")
    protected BigDecimal hrcutOrMrgn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssfctnTp(String value) {
        this.clssfctnTp = value;
    }

    /**
     * Gets the value of the qtyOrNmnlVal property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNominalValue2Choice }
     *     
     */
    public QuantityNominalValue2Choice getQtyOrNmnlVal() {
        return qtyOrNmnlVal;
    }

    /**
     * Sets the value of the qtyOrNmnlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNominalValue2Choice }
     *     
     */
    public void setQtyOrNmnlVal(QuantityNominalValue2Choice value) {
        this.qtyOrNmnlVal = value;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice19Choice }
     *     
     */
    public SecuritiesTransactionPrice19Choice getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice19Choice }
     *     
     */
    public void setUnitPric(SecuritiesTransactionPrice19Choice value) {
        this.unitPric = value;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public void setMktVal(AmountAndDirection53 value) {
        this.mktVal = value;
    }

    /**
     * Gets the value of the qlty property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralQualityType1Code }
     *     
     */
    public CollateralQualityType1Code getQlty() {
        return qlty;
    }

    /**
     * Sets the value of the qlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralQualityType1Code }
     *     
     */
    public void setQlty(CollateralQualityType1Code value) {
        this.qlty = value;
    }

    /**
     * Gets the value of the mtrty property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrty() {
        return mtrty;
    }

    /**
     * Sets the value of the mtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrty(XMLGregorianCalendar value) {
        this.mtrty = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIssuer4 }
     *     
     */
    public SecurityIssuer4 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIssuer4 }
     *     
     */
    public void setIssr(SecurityIssuer4 value) {
        this.issr = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesLendingType3Choice }
     * 
     * 
     * @return
     *     The value of the tp property.
     */
    public List<SecuritiesLendingType3Choice> getTp() {
        if (tp == null) {
            tp = new ArrayList<>();
        }
        return this.tp;
    }

    /**
     * Gets the value of the exclsvArrgmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclsvArrgmnt() {
        return exclsvArrgmnt;
    }

    /**
     * Sets the value of the exclsvArrgmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclsvArrgmnt(Boolean value) {
        this.exclsvArrgmnt = value;
    }

    /**
     * Gets the value of the avlblForCollReuse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvlblForCollReuse() {
        return avlblForCollReuse;
    }

    /**
     * Sets the value of the avlblForCollReuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvlblForCollReuse(Boolean value) {
        this.avlblForCollReuse = value;
    }

    /**
     * Gets the value of the hrcutOrMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcutOrMrgn() {
        return hrcutOrMrgn;
    }

    /**
     * Sets the value of the hrcutOrMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHrcutOrMrgn(BigDecimal value) {
        this.hrcutOrMrgn = value;
    }

}
