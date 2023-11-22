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
 * <p>Java class for FinancingAgreementItem1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancingAgreementItem1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ItmCntxt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}FinancialItemParameters1"/>
 *         <element name="ItmActn" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}AgreementItemAction1Code" minOccurs="0"/>
 *         <element name="PmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}PaymentInstrumentCode" minOccurs="0"/>
 *         <element name="VldtnStsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}ValidationStatusInformation1" minOccurs="0"/>
 *         <element name="Ratg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}YesNoIndicator"/>
 *         <element name="ReopIndctn" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}YesNoIndicator"/>
 *         <element name="Grnt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}GuaranteeDetails1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GrntSts" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}ValidationStatusInformation1" minOccurs="0"/>
 *         <element name="RltdGrntLttr" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
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
@XmlType(name = "FinancingAgreementItem1", propOrder = {
    "itmCntxt",
    "itmActn",
    "pmtInstrm",
    "vldtnStsInf",
    "ratg",
    "reopIndctn",
    "grnt",
    "grntSts",
    "rltdGrntLttr",
    "assoctdDoc",
    "addtlInf"
})
public class FinancingAgreementItem1 {

    @XmlElement(name = "ItmCntxt", required = true)
    protected FinancialItemParameters1 itmCntxt;
    @XmlElement(name = "ItmActn")
    @XmlSchemaType(name = "string")
    protected AgreementItemAction1Code itmActn;
    @XmlElement(name = "PmtInstrm")
    @XmlSchemaType(name = "string")
    protected PaymentInstrumentCode pmtInstrm;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "Ratg")
    protected boolean ratg;
    @XmlElement(name = "ReopIndctn")
    protected boolean reopIndctn;
    @XmlElement(name = "Grnt")
    protected List<GuaranteeDetails1> grnt;
    @XmlElement(name = "GrntSts")
    protected ValidationStatusInformation1 grntSts;
    @XmlElement(name = "RltdGrntLttr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object rltdGrntLttr;
    @XmlElementRef(name = "AssoctdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> assoctdDoc;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the itmCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialItemParameters1 }
     *     
     */
    public FinancialItemParameters1 getItmCntxt() {
        return itmCntxt;
    }

    /**
     * Sets the value of the itmCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialItemParameters1 }
     *     
     */
    public void setItmCntxt(FinancialItemParameters1 value) {
        this.itmCntxt = value;
    }

    /**
     * Gets the value of the itmActn property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementItemAction1Code }
     *     
     */
    public AgreementItemAction1Code getItmActn() {
        return itmActn;
    }

    /**
     * Sets the value of the itmActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementItemAction1Code }
     *     
     */
    public void setItmActn(AgreementItemAction1Code value) {
        this.itmActn = value;
    }

    /**
     * Gets the value of the pmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentCode }
     *     
     */
    public PaymentInstrumentCode getPmtInstrm() {
        return pmtInstrm;
    }

    /**
     * Sets the value of the pmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentCode }
     *     
     */
    public void setPmtInstrm(PaymentInstrumentCode value) {
        this.pmtInstrm = value;
    }

    /**
     * Gets the value of the vldtnStsInf property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public ValidationStatusInformation1 getVldtnStsInf() {
        return vldtnStsInf;
    }

    /**
     * Sets the value of the vldtnStsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public void setVldtnStsInf(ValidationStatusInformation1 value) {
        this.vldtnStsInf = value;
    }

    /**
     * Gets the value of the ratg property.
     * 
     */
    public boolean isRatg() {
        return ratg;
    }

    /**
     * Sets the value of the ratg property.
     * 
     */
    public void setRatg(boolean value) {
        this.ratg = value;
    }

    /**
     * Gets the value of the reopIndctn property.
     * 
     */
    public boolean isReopIndctn() {
        return reopIndctn;
    }

    /**
     * Sets the value of the reopIndctn property.
     * 
     */
    public void setReopIndctn(boolean value) {
        this.reopIndctn = value;
    }

    /**
     * Gets the value of the grnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeDetails1 }
     * 
     * 
     * @return
     *     The value of the grnt property.
     */
    public List<GuaranteeDetails1> getGrnt() {
        if (grnt == null) {
            grnt = new ArrayList<>();
        }
        return this.grnt;
    }

    /**
     * Gets the value of the grntSts property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public ValidationStatusInformation1 getGrntSts() {
        return grntSts;
    }

    /**
     * Sets the value of the grntSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public void setGrntSts(ValidationStatusInformation1 value) {
        this.grntSts = value;
    }

    /**
     * Gets the value of the rltdGrntLttr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRltdGrntLttr() {
        return rltdGrntLttr;
    }

    /**
     * Sets the value of the rltdGrntLttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRltdGrntLttr(Object value) {
        this.rltdGrntLttr = value;
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
