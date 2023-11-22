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

package org.jpos.iso20022.auth_020_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisteredContract15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegisteredContract15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RegdCtrctClsrId" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}Max35Text"/>
 *         <element name="RptgPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}TradeParty5"/>
 *         <element name="RegnAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="OrgnlRegdCtrct" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}DocumentIdentification29"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}Priority2Code"/>
 *         <element name="ClsrRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}ContractClosureReason1Choice"/>
 *         <element name="Cssn" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}ContractCessionData1" minOccurs="0"/>
 *         <element name="Attchmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}DocumentGeneralInformation5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredContract15", propOrder = {
    "regdCtrctClsrId",
    "rptgPty",
    "regnAgt",
    "orgnlRegdCtrct",
    "prty",
    "clsrRsn",
    "cssn",
    "attchmnt",
    "splmtryData"
})
public class RegisteredContract15 {

    @XmlElement(name = "RegdCtrctClsrId", required = true)
    protected String regdCtrctClsrId;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty5 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 regnAgt;
    @XmlElement(name = "OrgnlRegdCtrct", required = true)
    protected DocumentIdentification29 orgnlRegdCtrct;
    @XmlElement(name = "Prty", required = true)
    @XmlSchemaType(name = "string")
    protected Priority2Code prty;
    @XmlElement(name = "ClsrRsn", required = true)
    protected ContractClosureReason1Choice clsrRsn;
    @XmlElement(name = "Cssn")
    protected ContractCessionData1 cssn;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the regdCtrctClsrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdCtrctClsrId() {
        return regdCtrctClsrId;
    }

    /**
     * Sets the value of the regdCtrctClsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegdCtrctClsrId(String value) {
        this.regdCtrctClsrId = value;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty5 }
     *     
     */
    public TradeParty5 getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty5 }
     *     
     */
    public void setRptgPty(TradeParty5 value) {
        this.rptgPty = value;
    }

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setRegnAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.regnAgt = value;
    }

    /**
     * Gets the value of the orgnlRegdCtrct property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification29 }
     *     
     */
    public DocumentIdentification29 getOrgnlRegdCtrct() {
        return orgnlRegdCtrct;
    }

    /**
     * Sets the value of the orgnlRegdCtrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification29 }
     *     
     */
    public void setOrgnlRegdCtrct(DocumentIdentification29 value) {
        this.orgnlRegdCtrct = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public void setPrty(Priority2Code value) {
        this.prty = value;
    }

    /**
     * Gets the value of the clsrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractClosureReason1Choice }
     *     
     */
    public ContractClosureReason1Choice getClsrRsn() {
        return clsrRsn;
    }

    /**
     * Sets the value of the clsrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractClosureReason1Choice }
     *     
     */
    public void setClsrRsn(ContractClosureReason1Choice value) {
        this.clsrRsn = value;
    }

    /**
     * Gets the value of the cssn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractCessionData1 }
     *     
     */
    public ContractCessionData1 getCssn() {
        return cssn;
    }

    /**
     * Sets the value of the cssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractCessionData1 }
     *     
     */
    public void setCssn(ContractCessionData1 value) {
        this.cssn = value;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     * @return
     *     The value of the attchmnt property.
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<>();
        }
        return this.attchmnt;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
