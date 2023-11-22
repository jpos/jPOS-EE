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

package org.jpos.iso20022.semt_017_002_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrument76 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrument76">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SplmtryId" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}RestrictedFINXMax35Text" minOccurs="0"/>
 *         <element name="SctiesForm" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}FormOfSecurity1Code" minOccurs="0"/>
 *         <element name="ClssTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}RestrictedFINXMax35Text" minOccurs="0"/>
 *         <element name="DstrbtnPlcy" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}DistributionPolicy1Code" minOccurs="0"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}SecurityClassificationType3Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument76", propOrder = {
    "splmtryId",
    "sctiesForm",
    "clssTp",
    "dstrbtnPlcy",
    "clssfctnTp"
})
public class FinancialInstrument76 {

    @XmlElement(name = "SplmtryId")
    protected String splmtryId;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "DstrbtnPlcy")
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "ClssfctnTp")
    protected SecurityClassificationType3Choice clssfctnTp;

    /**
     * Gets the value of the splmtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplmtryId() {
        return splmtryId;
    }

    /**
     * Sets the value of the splmtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplmtryId(String value) {
        this.splmtryId = value;
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
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityClassificationType3Choice }
     *     
     */
    public SecurityClassificationType3Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityClassificationType3Choice }
     *     
     */
    public void setClssfctnTp(SecurityClassificationType3Choice value) {
        this.clssfctnTp = value;
    }

}
