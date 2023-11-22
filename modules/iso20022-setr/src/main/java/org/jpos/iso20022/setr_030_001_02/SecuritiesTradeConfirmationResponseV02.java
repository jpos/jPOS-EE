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

package org.jpos.iso20022.setr_030_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTradeConfirmationResponseV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTradeConfirmationResponseV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}TransactiontIdentification4"/>
 *         <element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}Linkages52" maxOccurs="unbounded"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}StatusAndReason46"/>
 *         <element name="ClrDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}Clearing6" minOccurs="0"/>
 *         <element name="ConfPties" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}ConfirmationParties8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeConfirmationResponseV02", propOrder = {
    "id",
    "refs",
    "sts",
    "clrDtls",
    "confPties",
    "splmtryData"
})
public class SecuritiesTradeConfirmationResponseV02 {

    @XmlElement(name = "Id", required = true)
    protected TransactiontIdentification4 id;
    @XmlElement(name = "Refs", required = true)
    protected List<Linkages52> refs;
    @XmlElement(name = "Sts", required = true)
    protected StatusAndReason46 sts;
    @XmlElement(name = "ClrDtls")
    protected Clearing6 clrDtls;
    @XmlElement(name = "ConfPties")
    protected List<ConfirmationParties8> confPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public TransactiontIdentification4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public void setId(TransactiontIdentification4 value) {
        this.id = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages52 }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<Linkages52> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAndReason46 }
     *     
     */
    public StatusAndReason46 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAndReason46 }
     *     
     */
    public void setSts(StatusAndReason46 value) {
        this.sts = value;
    }

    /**
     * Gets the value of the clrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Clearing6 }
     *     
     */
    public Clearing6 getClrDtls() {
        return clrDtls;
    }

    /**
     * Sets the value of the clrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clearing6 }
     *     
     */
    public void setClrDtls(Clearing6 value) {
        this.clrDtls = value;
    }

    /**
     * Gets the value of the confPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the confPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationParties8 }
     * 
     * 
     * @return
     *     The value of the confPties property.
     */
    public List<ConfirmationParties8> getConfPties() {
        if (confPties == null) {
            confPties = new ArrayList<>();
        }
        return this.confPties;
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
