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

package org.jpos.iso20022.pacs_002_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructuredRemittanceInformation17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StructuredRemittanceInformation17">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RfrdDocInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.12}ReferredDocumentInformation7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RfrdDocAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.12}RemittanceAmount2" minOccurs="0"/>
 *         <element name="CdtrRefInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.12}CreditorReferenceInformation2" minOccurs="0"/>
 *         <element name="Invcr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.12}PartyIdentification135" minOccurs="0"/>
 *         <element name="Invcee" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.12}PartyIdentification135" minOccurs="0"/>
 *         <element name="TaxRmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.12}TaxData1" minOccurs="0"/>
 *         <element name="GrnshmtRmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.12}Garnishment3" minOccurs="0"/>
 *         <element name="AddtlRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.12}Max140Text" maxOccurs="3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation17", propOrder = {
    "rfrdDocInf",
    "rfrdDocAmt",
    "cdtrRefInf",
    "invcr",
    "invcee",
    "taxRmt",
    "grnshmtRmt",
    "addtlRmtInf"
})
public class StructuredRemittanceInformation17 {

    @XmlElement(name = "RfrdDocInf")
    protected List<ReferredDocumentInformation7> rfrdDocInf;
    @XmlElement(name = "RfrdDocAmt")
    protected RemittanceAmount2 rfrdDocAmt;
    @XmlElement(name = "CdtrRefInf")
    protected CreditorReferenceInformation2 cdtrRefInf;
    @XmlElement(name = "Invcr")
    protected PartyIdentification135 invcr;
    @XmlElement(name = "Invcee")
    protected PartyIdentification135 invcee;
    @XmlElement(name = "TaxRmt")
    protected TaxData1 taxRmt;
    @XmlElement(name = "GrnshmtRmt")
    protected Garnishment3 grnshmtRmt;
    @XmlElement(name = "AddtlRmtInf")
    protected List<String> addtlRmtInf;

    /**
     * Gets the value of the rfrdDocInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rfrdDocInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDocInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredDocumentInformation7 }
     * 
     * 
     * @return
     *     The value of the rfrdDocInf property.
     */
    public List<ReferredDocumentInformation7> getRfrdDocInf() {
        if (rfrdDocInf == null) {
            rfrdDocInf = new ArrayList<>();
        }
        return this.rfrdDocInf;
    }

    /**
     * Gets the value of the rfrdDocAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceAmount2 }
     *     
     */
    public RemittanceAmount2 getRfrdDocAmt() {
        return rfrdDocAmt;
    }

    /**
     * Sets the value of the rfrdDocAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceAmount2 }
     *     
     */
    public void setRfrdDocAmt(RemittanceAmount2 value) {
        this.rfrdDocAmt = value;
    }

    /**
     * Gets the value of the cdtrRefInf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public CreditorReferenceInformation2 getCdtrRefInf() {
        return cdtrRefInf;
    }

    /**
     * Sets the value of the cdtrRefInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public void setCdtrRefInf(CreditorReferenceInformation2 value) {
        this.cdtrRefInf = value;
    }

    /**
     * Gets the value of the invcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getInvcr() {
        return invcr;
    }

    /**
     * Sets the value of the invcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setInvcr(PartyIdentification135 value) {
        this.invcr = value;
    }

    /**
     * Gets the value of the invcee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getInvcee() {
        return invcee;
    }

    /**
     * Sets the value of the invcee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setInvcee(PartyIdentification135 value) {
        this.invcee = value;
    }

    /**
     * Gets the value of the taxRmt property.
     * 
     * @return
     *     possible object is
     *     {@link TaxData1 }
     *     
     */
    public TaxData1 getTaxRmt() {
        return taxRmt;
    }

    /**
     * Sets the value of the taxRmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxData1 }
     *     
     */
    public void setTaxRmt(TaxData1 value) {
        this.taxRmt = value;
    }

    /**
     * Gets the value of the grnshmtRmt property.
     * 
     * @return
     *     possible object is
     *     {@link Garnishment3 }
     *     
     */
    public Garnishment3 getGrnshmtRmt() {
        return grnshmtRmt;
    }

    /**
     * Sets the value of the grnshmtRmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Garnishment3 }
     *     
     */
    public void setGrnshmtRmt(Garnishment3 value) {
        this.grnshmtRmt = value;
    }

    /**
     * Gets the value of the addtlRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlRmtInf property.
     */
    public List<String> getAddtlRmtInf() {
        if (addtlRmtInf == null) {
            addtlRmtInf = new ArrayList<>();
        }
        return this.addtlRmtInf;
    }

}
