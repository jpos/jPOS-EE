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

package org.jpos.iso20022.acmt_001_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Intermediary46 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Intermediary46">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PartyIdentification177Choice"/>
 *         <element name="LglNttyIdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}LEIIdentifier" minOccurs="0"/>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Account32" minOccurs="0"/>
 *         <element name="WvdTrlrComssnInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}YesNoIndicator" minOccurs="0"/>
 *         <element name="Role" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PartyRole2Choice" minOccurs="0"/>
 *         <element name="PmryComAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CommunicationAddress6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ScndryComAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CommunicationAddress6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}NameAndAddress4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary46", propOrder = {
    "id",
    "lglNttyIdr",
    "acct",
    "wvdTrlrComssnInd",
    "role",
    "pmryComAdr",
    "scndryComAdr",
    "nmAndAdr"
})
public class Intermediary46 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification177Choice id;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;
    @XmlElement(name = "Acct")
    protected Account32 acct;
    @XmlElement(name = "WvdTrlrComssnInd")
    protected Boolean wvdTrlrComssnInd;
    @XmlElement(name = "Role")
    protected PartyRole2Choice role;
    @XmlElement(name = "PmryComAdr")
    protected List<CommunicationAddress6> pmryComAdr;
    @XmlElement(name = "ScndryComAdr")
    protected List<CommunicationAddress6> scndryComAdr;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress4 nmAndAdr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public PartyIdentification177Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public void setId(PartyIdentification177Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the lglNttyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglNttyIdr() {
        return lglNttyIdr;
    }

    /**
     * Sets the value of the lglNttyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLglNttyIdr(String value) {
        this.lglNttyIdr = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account32 }
     *     
     */
    public Account32 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account32 }
     *     
     */
    public void setAcct(Account32 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the wvdTrlrComssnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWvdTrlrComssnInd() {
        return wvdTrlrComssnInd;
    }

    /**
     * Sets the value of the wvdTrlrComssnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWvdTrlrComssnInd(Boolean value) {
        this.wvdTrlrComssnInd = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole2Choice }
     *     
     */
    public PartyRole2Choice getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole2Choice }
     *     
     */
    public void setRole(PartyRole2Choice value) {
        this.role = value;
    }

    /**
     * Gets the value of the pmryComAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmryComAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmryComAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationAddress6 }
     * 
     * 
     * @return
     *     The value of the pmryComAdr property.
     */
    public List<CommunicationAddress6> getPmryComAdr() {
        if (pmryComAdr == null) {
            pmryComAdr = new ArrayList<>();
        }
        return this.pmryComAdr;
    }

    /**
     * Gets the value of the scndryComAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scndryComAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndryComAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationAddress6 }
     * 
     * 
     * @return
     *     The value of the scndryComAdr property.
     */
    public List<CommunicationAddress6> getScndryComAdr() {
        if (scndryComAdr == null) {
            scndryComAdr = new ArrayList<>();
        }
        return this.scndryComAdr;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress4 }
     *     
     */
    public NameAndAddress4 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress4 }
     *     
     */
    public void setNmAndAdr(NameAndAddress4 value) {
        this.nmAndAdr = value;
    }

}
