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

package org.jpos.iso20022.camt_086_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementGroup4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatementGroup4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GrpId" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max35Text"/>
 *         <element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}PartyIdentification138"/>
 *         <element name="SndrIndvCtct" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Contact4" maxOccurs="2" minOccurs="0"/>
 *         <element name="Rcvr" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}PartyIdentification138"/>
 *         <element name="RcvrIndvCtct" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Contact4" maxOccurs="2" minOccurs="0"/>
 *         <element name="BllgStmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingStatement4" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementGroup4", propOrder = {
    "grpId",
    "sndr",
    "sndrIndvCtct",
    "rcvr",
    "rcvrIndvCtct",
    "bllgStmt"
})
public class StatementGroup4 {

    @XmlElement(name = "GrpId", required = true)
    protected String grpId;
    @XmlElement(name = "Sndr", required = true)
    protected PartyIdentification138 sndr;
    @XmlElement(name = "SndrIndvCtct")
    protected List<Contact4> sndrIndvCtct;
    @XmlElement(name = "Rcvr", required = true)
    protected PartyIdentification138 rcvr;
    @XmlElement(name = "RcvrIndvCtct")
    protected List<Contact4> rcvrIndvCtct;
    @XmlElement(name = "BllgStmt", required = true)
    protected List<BillingStatement4> bllgStmt;

    /**
     * Gets the value of the grpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * Sets the value of the grpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpId(String value) {
        this.grpId = value;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification138 }
     *     
     */
    public PartyIdentification138 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification138 }
     *     
     */
    public void setSndr(PartyIdentification138 value) {
        this.sndr = value;
    }

    /**
     * Gets the value of the sndrIndvCtct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sndrIndvCtct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndrIndvCtct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact4 }
     * 
     * 
     * @return
     *     The value of the sndrIndvCtct property.
     */
    public List<Contact4> getSndrIndvCtct() {
        if (sndrIndvCtct == null) {
            sndrIndvCtct = new ArrayList<>();
        }
        return this.sndrIndvCtct;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification138 }
     *     
     */
    public PartyIdentification138 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification138 }
     *     
     */
    public void setRcvr(PartyIdentification138 value) {
        this.rcvr = value;
    }

    /**
     * Gets the value of the rcvrIndvCtct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcvrIndvCtct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcvrIndvCtct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact4 }
     * 
     * 
     * @return
     *     The value of the rcvrIndvCtct property.
     */
    public List<Contact4> getRcvrIndvCtct() {
        if (rcvrIndvCtct == null) {
            rcvrIndvCtct = new ArrayList<>();
        }
        return this.rcvrIndvCtct;
    }

    /**
     * Gets the value of the bllgStmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bllgStmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBllgStmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingStatement4 }
     * 
     * 
     * @return
     *     The value of the bllgStmt property.
     */
    public List<BillingStatement4> getBllgStmt() {
        if (bllgStmt == null) {
            bllgStmt = new ArrayList<>();
        }
        return this.bllgStmt;
    }

}
