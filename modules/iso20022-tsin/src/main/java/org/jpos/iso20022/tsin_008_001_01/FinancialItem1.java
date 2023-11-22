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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialItem1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialItem1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ItmCntxt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}FinancialItemParameters1"/>
 *         <element name="FinDocRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}CreditDebitCode"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}InvoiceTotals1"/>
 *         <element name="DueAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="InstlmtInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}Instalment2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}Max2000Text" minOccurs="0"/>
 *         <element name="AssoctdDoc" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="VldtnStsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}ValidationStatusInformation1" minOccurs="0"/>
 *         <element name="FincgSts" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}FinancingInformationAndStatus1" minOccurs="0"/>
 *         <element name="PrtryDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}SupplementaryData1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialItem1", propOrder = {
    "itmCntxt",
    "finDocRef",
    "cdtDbtInd",
    "ttlAmt",
    "dueAmt",
    "instlmtInf",
    "addtlInf",
    "assoctdDoc",
    "vldtnStsInf",
    "fincgSts",
    "prtryDtls"
})
public class FinancialItem1 {

    @XmlElement(name = "ItmCntxt", required = true)
    protected FinancialItemParameters1 itmCntxt;
    @XmlElementRef(name = "FinDocRef", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> finDocRef;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TtlAmt", required = true)
    protected InvoiceTotals1 ttlAmt;
    @XmlElement(name = "DueAmt")
    protected ActiveCurrencyAndAmount dueAmt;
    @XmlElement(name = "InstlmtInf")
    protected List<Instalment2> instlmtInf;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElementRef(name = "AssoctdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> assoctdDoc;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "FincgSts")
    protected FinancingInformationAndStatus1 fincgSts;
    @XmlElement(name = "PrtryDtls")
    protected SupplementaryData1 prtryDtls;

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
     * Gets the value of the finDocRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finDocRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinDocRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the finDocRef property.
     */
    public List<JAXBElement<Object>> getFinDocRef() {
        if (finDocRef == null) {
            finDocRef = new ArrayList<>();
        }
        return this.finDocRef;
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
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTotals1 }
     *     
     */
    public InvoiceTotals1 getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTotals1 }
     *     
     */
    public void setTtlAmt(InvoiceTotals1 value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the dueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDueAmt() {
        return dueAmt;
    }

    /**
     * Sets the value of the dueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDueAmt(ActiveCurrencyAndAmount value) {
        this.dueAmt = value;
    }

    /**
     * Gets the value of the instlmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instlmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instalment2 }
     * 
     * 
     * @return
     *     The value of the instlmtInf property.
     */
    public List<Instalment2> getInstlmtInf() {
        if (instlmtInf == null) {
            instlmtInf = new ArrayList<>();
        }
        return this.instlmtInf;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
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
     * Gets the value of the fincgSts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public FinancingInformationAndStatus1 getFincgSts() {
        return fincgSts;
    }

    /**
     * Sets the value of the fincgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public void setFincgSts(FinancingInformationAndStatus1 value) {
        this.fincgSts = value;
    }

    /**
     * Gets the value of the prtryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getPrtryDtls() {
        return prtryDtls;
    }

    /**
     * Sets the value of the prtryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public void setPrtryDtls(SupplementaryData1 value) {
        this.prtryDtls = value;
    }

}
