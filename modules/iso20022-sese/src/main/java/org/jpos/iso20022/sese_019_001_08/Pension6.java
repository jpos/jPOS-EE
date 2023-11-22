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

package org.jpos.iso20022.sese_019_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pension6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Pension6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}PensionPolicy1" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}PensionSchemeType3Choice" minOccurs="0"/>
 *         <element name="TrfScp" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}PensionTransferScope1Choice" minOccurs="0"/>
 *         <element name="TaxRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}TaxReference1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DrwdwnTrchId" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}Max35Text" minOccurs="0"/>
 *         <element name="NonWrpprTrf" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pension6", propOrder = {
    "id",
    "tp",
    "trfScp",
    "taxRef",
    "drwdwnTrchId",
    "nonWrpprTrf",
    "addtlInf"
})
public class Pension6 {

    @XmlElement(name = "Id")
    protected PensionPolicy1 id;
    @XmlElement(name = "Tp")
    protected PensionSchemeType3Choice tp;
    @XmlElement(name = "TrfScp")
    protected PensionTransferScope1Choice trfScp;
    @XmlElement(name = "TaxRef")
    protected List<TaxReference1> taxRef;
    @XmlElement(name = "DrwdwnTrchId")
    protected String drwdwnTrchId;
    @XmlElement(name = "NonWrpprTrf")
    protected Boolean nonWrpprTrf;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PensionPolicy1 }
     *     
     */
    public PensionPolicy1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionPolicy1 }
     *     
     */
    public void setId(PensionPolicy1 value) {
        this.id = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PensionSchemeType3Choice }
     *     
     */
    public PensionSchemeType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionSchemeType3Choice }
     *     
     */
    public void setTp(PensionSchemeType3Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the trfScp property.
     * 
     * @return
     *     possible object is
     *     {@link PensionTransferScope1Choice }
     *     
     */
    public PensionTransferScope1Choice getTrfScp() {
        return trfScp;
    }

    /**
     * Sets the value of the trfScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionTransferScope1Choice }
     *     
     */
    public void setTrfScp(PensionTransferScope1Choice value) {
        this.trfScp = value;
    }

    /**
     * Gets the value of the taxRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReference1 }
     * 
     * 
     * @return
     *     The value of the taxRef property.
     */
    public List<TaxReference1> getTaxRef() {
        if (taxRef == null) {
            taxRef = new ArrayList<>();
        }
        return this.taxRef;
    }

    /**
     * Gets the value of the drwdwnTrchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrwdwnTrchId() {
        return drwdwnTrchId;
    }

    /**
     * Sets the value of the drwdwnTrchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrwdwnTrchId(String value) {
        this.drwdwnTrchId = value;
    }

    /**
     * Gets the value of the nonWrpprTrf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonWrpprTrf() {
        return nonWrpprTrf;
    }

    /**
     * Sets the value of the nonWrpprTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonWrpprTrf(Boolean value) {
        this.nonWrpprTrf = value;
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
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
