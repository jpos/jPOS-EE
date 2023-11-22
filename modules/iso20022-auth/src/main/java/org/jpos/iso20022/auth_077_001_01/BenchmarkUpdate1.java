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

package org.jpos.iso20022.auth_077_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenchmarkUpdate1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BenchmarkUpdate1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}SecurityIdentification19"/>
 *         <element name="PrvsId" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}SecurityIdentification19" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}BenchmarkDetail1"/>
 *         <element name="Admstr" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}PartyIdentification136"/>
 *         <element name="NdrsngPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}PartyIdentification136" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}StatusDetail1" minOccurs="0"/>
 *         <element name="TechVldtyPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}Period4Choice" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenchmarkUpdate1", propOrder = {
    "techRcrdId",
    "id",
    "prvsId",
    "othr",
    "admstr",
    "ndrsngPty",
    "sts",
    "techVldtyPrd",
    "splmtryData"
})
public class BenchmarkUpdate1 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification19 id;
    @XmlElement(name = "PrvsId")
    protected SecurityIdentification19 prvsId;
    @XmlElement(name = "Othr", required = true)
    protected BenchmarkDetail1 othr;
    @XmlElement(name = "Admstr", required = true)
    protected PartyIdentification136 admstr;
    @XmlElement(name = "NdrsngPty")
    protected PartyIdentification136 ndrsngPty;
    @XmlElement(name = "Sts")
    protected StatusDetail1 sts;
    @XmlElement(name = "TechVldtyPrd")
    protected Period4Choice techVldtyPrd;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechRcrdId(String value) {
        this.techRcrdId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setId(SecurityIdentification19 value) {
        this.id = value;
    }

    /**
     * Gets the value of the prvsId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getPrvsId() {
        return prvsId;
    }

    /**
     * Sets the value of the prvsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setPrvsId(SecurityIdentification19 value) {
        this.prvsId = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkDetail1 }
     *     
     */
    public BenchmarkDetail1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkDetail1 }
     *     
     */
    public void setOthr(BenchmarkDetail1 value) {
        this.othr = value;
    }

    /**
     * Gets the value of the admstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getAdmstr() {
        return admstr;
    }

    /**
     * Sets the value of the admstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setAdmstr(PartyIdentification136 value) {
        this.admstr = value;
    }

    /**
     * Gets the value of the ndrsngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getNdrsngPty() {
        return ndrsngPty;
    }

    /**
     * Sets the value of the ndrsngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setNdrsngPty(PartyIdentification136 value) {
        this.ndrsngPty = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetail1 }
     *     
     */
    public StatusDetail1 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetail1 }
     *     
     */
    public void setSts(StatusDetail1 value) {
        this.sts = value;
    }

    /**
     * Gets the value of the techVldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getTechVldtyPrd() {
        return techVldtyPrd;
    }

    /**
     * Sets the value of the techVldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setTechVldtyPrd(Period4Choice value) {
        this.techVldtyPrd = value;
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
