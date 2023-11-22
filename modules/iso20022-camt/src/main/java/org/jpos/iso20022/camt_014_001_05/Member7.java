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

package org.jpos.iso20022.camt_014_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Member7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Member7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}Max35Text" minOccurs="0"/>
 *         <element name="RtrAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}MemberIdentification3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}CashAccount40" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}SystemMemberType1Choice" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}SystemMemberStatus1Choice" minOccurs="0"/>
 *         <element name="CtctRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}ContactIdentificationAndAddress2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ComAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}CommunicationAddress10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Member7", propOrder = {
    "nm",
    "rtrAdr",
    "acct",
    "tp",
    "sts",
    "ctctRef",
    "comAdr"
})
public class Member7 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "RtrAdr")
    protected List<MemberIdentification3Choice> rtrAdr;
    @XmlElement(name = "Acct")
    protected List<CashAccount40> acct;
    @XmlElement(name = "Tp")
    protected SystemMemberType1Choice tp;
    @XmlElement(name = "Sts")
    protected SystemMemberStatus1Choice sts;
    @XmlElement(name = "CtctRef")
    protected List<ContactIdentificationAndAddress2> ctctRef;
    @XmlElement(name = "ComAdr")
    protected CommunicationAddress10 comAdr;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the rtrAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtrAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtrAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberIdentification3Choice }
     * 
     * 
     * @return
     *     The value of the rtrAdr property.
     */
    public List<MemberIdentification3Choice> getRtrAdr() {
        if (rtrAdr == null) {
            rtrAdr = new ArrayList<>();
        }
        return this.rtrAdr;
    }

    /**
     * Gets the value of the acct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount40 }
     * 
     * 
     * @return
     *     The value of the acct property.
     */
    public List<CashAccount40> getAcct() {
        if (acct == null) {
            acct = new ArrayList<>();
        }
        return this.acct;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMemberType1Choice }
     *     
     */
    public SystemMemberType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMemberType1Choice }
     *     
     */
    public void setTp(SystemMemberType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMemberStatus1Choice }
     *     
     */
    public SystemMemberStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMemberStatus1Choice }
     *     
     */
    public void setSts(SystemMemberStatus1Choice value) {
        this.sts = value;
    }

    /**
     * Gets the value of the ctctRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctctRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtctRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentificationAndAddress2 }
     * 
     * 
     * @return
     *     The value of the ctctRef property.
     */
    public List<ContactIdentificationAndAddress2> getCtctRef() {
        if (ctctRef == null) {
            ctctRef = new ArrayList<>();
        }
        return this.ctctRef;
    }

    /**
     * Gets the value of the comAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress10 }
     *     
     */
    public CommunicationAddress10 getComAdr() {
        return comAdr;
    }

    /**
     * Sets the value of the comAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress10 }
     *     
     */
    public void setComAdr(CommunicationAddress10 value) {
        this.comAdr = value;
    }

}
