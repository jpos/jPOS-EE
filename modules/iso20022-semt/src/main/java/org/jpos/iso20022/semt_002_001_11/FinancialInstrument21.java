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

package org.jpos.iso20022.semt_002_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrument21 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrument21">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClssTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}Max35Text" minOccurs="0"/>
 *         <element name="SctiesForm" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}FormOfSecurity1Code" minOccurs="0"/>
 *         <element name="DstrbtnPlcy" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}DistributionPolicy1Code" minOccurs="0"/>
 *         <element name="PdctGrp" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}Max140Text" minOccurs="0"/>
 *         <element name="UmbrllNm" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}Max35Text" minOccurs="0"/>
 *         <element name="BaseCcy" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="DnmtnCcy" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="ReqdNAVCcy" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="DualFndInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="CtryOfDmcl" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}CountryCode" minOccurs="0"/>
 *         <element name="RegdDstrbtnCtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument21", propOrder = {
    "clssTp",
    "sctiesForm",
    "dstrbtnPlcy",
    "pdctGrp",
    "umbrllNm",
    "baseCcy",
    "dnmtnCcy",
    "reqdNAVCcy",
    "dualFndInd",
    "ctryOfDmcl",
    "regdDstrbtnCtry"
})
public class FinancialInstrument21 {

    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "DstrbtnPlcy")
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "PdctGrp")
    protected String pdctGrp;
    @XmlElement(name = "UmbrllNm")
    protected String umbrllNm;
    @XmlElement(name = "BaseCcy")
    protected String baseCcy;
    @XmlElement(name = "DnmtnCcy")
    protected String dnmtnCcy;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "DualFndInd")
    protected Boolean dualFndInd;
    @XmlElement(name = "CtryOfDmcl")
    protected String ctryOfDmcl;
    @XmlElement(name = "RegdDstrbtnCtry")
    protected List<String> regdDstrbtnCtry;

    /**
     * Gets the value of the clssTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssTp() {
        return clssTp;
    }

    /**
     * Sets the value of the clssTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssTp(String value) {
        this.clssTp = value;
    }

    /**
     * Gets the value of the sctiesForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctiesForm() {
        return sctiesForm;
    }

    /**
     * Sets the value of the sctiesForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public void setSctiesForm(FormOfSecurity1Code value) {
        this.sctiesForm = value;
    }

    /**
     * Gets the value of the dstrbtnPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public DistributionPolicy1Code getDstrbtnPlcy() {
        return dstrbtnPlcy;
    }

    /**
     * Sets the value of the dstrbtnPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public void setDstrbtnPlcy(DistributionPolicy1Code value) {
        this.dstrbtnPlcy = value;
    }

    /**
     * Gets the value of the pdctGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctGrp() {
        return pdctGrp;
    }

    /**
     * Sets the value of the pdctGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctGrp(String value) {
        this.pdctGrp = value;
    }

    /**
     * Gets the value of the umbrllNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmbrllNm() {
        return umbrllNm;
    }

    /**
     * Sets the value of the umbrllNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmbrllNm(String value) {
        this.umbrllNm = value;
    }

    /**
     * Gets the value of the baseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcy() {
        return baseCcy;
    }

    /**
     * Sets the value of the baseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCcy(String value) {
        this.baseCcy = value;
    }

    /**
     * Gets the value of the dnmtnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnCcy() {
        return dnmtnCcy;
    }

    /**
     * Sets the value of the dnmtnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnmtnCcy(String value) {
        this.dnmtnCcy = value;
    }

    /**
     * Gets the value of the reqdNAVCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdNAVCcy() {
        return reqdNAVCcy;
    }

    /**
     * Sets the value of the reqdNAVCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
    }

    /**
     * Gets the value of the dualFndInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDualFndInd() {
        return dualFndInd;
    }

    /**
     * Sets the value of the dualFndInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDualFndInd(Boolean value) {
        this.dualFndInd = value;
    }

    /**
     * Gets the value of the ctryOfDmcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfDmcl() {
        return ctryOfDmcl;
    }

    /**
     * Sets the value of the ctryOfDmcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfDmcl(String value) {
        this.ctryOfDmcl = value;
    }

    /**
     * Gets the value of the regdDstrbtnCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the regdDstrbtnCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdDstrbtnCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the regdDstrbtnCtry property.
     */
    public List<String> getRegdDstrbtnCtry() {
        if (regdDstrbtnCtry == null) {
            regdDstrbtnCtry = new ArrayList<>();
        }
        return this.regdDstrbtnCtry;
    }

}
