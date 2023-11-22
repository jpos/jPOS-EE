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

package org.jpos.iso20022.catm_003_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleToPOIProtocolParameter3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SaleToPOIProtocolParameter3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}TerminalManagementAction3Code"/>
 *         <element name="MrchntId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Organisation26" minOccurs="0"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max256Text"/>
 *         <element name="HstId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max35Text"/>
 *         <element name="MrchntPOIId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max35Text" minOccurs="0"/>
 *         <element name="SaleId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max35Text" minOccurs="0"/>
 *         <element name="AllwdSaleMsg" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}RetailerMessage1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AllwdPOIMsg" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}RetailerMessage1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AllwdPOISvc" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}RetailerService2Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AllwdSaleDvc" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}RetailerService8Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="XtrnlyTpSpprtd" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max1025Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIProtocolParameter3", propOrder = {
    "actnTp",
    "mrchntId",
    "vrsn",
    "hstId",
    "mrchntPOIId",
    "saleId",
    "allwdSaleMsg",
    "allwdPOIMsg",
    "allwdPOISvc",
    "allwdSaleDvc",
    "xtrnlyTpSpprtd"
})
public class SaleToPOIProtocolParameter3 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "MrchntId")
    protected Organisation26 mrchntId;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "HstId", required = true)
    protected String hstId;
    @XmlElement(name = "MrchntPOIId")
    protected String mrchntPOIId;
    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "AllwdSaleMsg")
    @XmlSchemaType(name = "string")
    protected List<RetailerMessage1Code> allwdSaleMsg;
    @XmlElement(name = "AllwdPOIMsg")
    @XmlSchemaType(name = "string")
    protected List<RetailerMessage1Code> allwdPOIMsg;
    @XmlElement(name = "AllwdPOISvc")
    @XmlSchemaType(name = "string")
    protected List<RetailerService2Code> allwdPOISvc;
    @XmlElement(name = "AllwdSaleDvc")
    @XmlSchemaType(name = "string")
    protected List<RetailerService8Code> allwdSaleDvc;
    @XmlElement(name = "XtrnlyTpSpprtd")
    protected List<String> xtrnlyTpSpprtd;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public void setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the mrchntId property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation26 }
     *     
     */
    public Organisation26 getMrchntId() {
        return mrchntId;
    }

    /**
     * Sets the value of the mrchntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation26 }
     *     
     */
    public void setMrchntId(Organisation26 value) {
        this.mrchntId = value;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the hstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstId() {
        return hstId;
    }

    /**
     * Sets the value of the hstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHstId(String value) {
        this.hstId = value;
    }

    /**
     * Gets the value of the mrchntPOIId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntPOIId() {
        return mrchntPOIId;
    }

    /**
     * Sets the value of the mrchntPOIId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrchntPOIId(String value) {
        this.mrchntPOIId = value;
    }

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleId(String value) {
        this.saleId = value;
    }

    /**
     * Gets the value of the allwdSaleMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdSaleMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdSaleMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailerMessage1Code }
     * 
     * 
     * @return
     *     The value of the allwdSaleMsg property.
     */
    public List<RetailerMessage1Code> getAllwdSaleMsg() {
        if (allwdSaleMsg == null) {
            allwdSaleMsg = new ArrayList<>();
        }
        return this.allwdSaleMsg;
    }

    /**
     * Gets the value of the allwdPOIMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdPOIMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdPOIMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailerMessage1Code }
     * 
     * 
     * @return
     *     The value of the allwdPOIMsg property.
     */
    public List<RetailerMessage1Code> getAllwdPOIMsg() {
        if (allwdPOIMsg == null) {
            allwdPOIMsg = new ArrayList<>();
        }
        return this.allwdPOIMsg;
    }

    /**
     * Gets the value of the allwdPOISvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdPOISvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdPOISvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailerService2Code }
     * 
     * 
     * @return
     *     The value of the allwdPOISvc property.
     */
    public List<RetailerService2Code> getAllwdPOISvc() {
        if (allwdPOISvc == null) {
            allwdPOISvc = new ArrayList<>();
        }
        return this.allwdPOISvc;
    }

    /**
     * Gets the value of the allwdSaleDvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdSaleDvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdSaleDvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailerService8Code }
     * 
     * 
     * @return
     *     The value of the allwdSaleDvc property.
     */
    public List<RetailerService8Code> getAllwdSaleDvc() {
        if (allwdSaleDvc == null) {
            allwdSaleDvc = new ArrayList<>();
        }
        return this.allwdSaleDvc;
    }

    /**
     * Gets the value of the xtrnlyTpSpprtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtrnlyTpSpprtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtrnlyTpSpprtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the xtrnlyTpSpprtd property.
     */
    public List<String> getXtrnlyTpSpprtd() {
        if (xtrnlyTpSpprtd == null) {
            xtrnlyTpSpprtd = new ArrayList<>();
        }
        return this.xtrnlyTpSpprtd;
    }

}
