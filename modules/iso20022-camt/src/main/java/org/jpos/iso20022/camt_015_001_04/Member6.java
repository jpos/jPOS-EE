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

package org.jpos.iso20022.camt_015_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Member6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Member6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MmbRtrAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.015.001.04}MemberIdentification3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtctRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.015.001.04}ContactIdentificationAndAddress1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ComAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.015.001.04}CommunicationAddress8" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Member6", propOrder = {
    "mmbRtrAdr",
    "ctctRef",
    "comAdr"
})
public class Member6 {

    @XmlElement(name = "MmbRtrAdr")
    protected List<MemberIdentification3Choice> mmbRtrAdr;
    @XmlElement(name = "CtctRef")
    protected List<ContactIdentificationAndAddress1> ctctRef;
    @XmlElement(name = "ComAdr")
    protected CommunicationAddress8 comAdr;

    /**
     * Gets the value of the mmbRtrAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mmbRtrAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmbRtrAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberIdentification3Choice }
     * 
     * 
     * @return
     *     The value of the mmbRtrAdr property.
     */
    public List<MemberIdentification3Choice> getMmbRtrAdr() {
        if (mmbRtrAdr == null) {
            mmbRtrAdr = new ArrayList<>();
        }
        return this.mmbRtrAdr;
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
     * {@link ContactIdentificationAndAddress1 }
     * 
     * 
     * @return
     *     The value of the ctctRef property.
     */
    public List<ContactIdentificationAndAddress1> getCtctRef() {
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
     *     {@link CommunicationAddress8 }
     *     
     */
    public CommunicationAddress8 getComAdr() {
        return comAdr;
    }

    /**
     * Sets the value of the comAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress8 }
     *     
     */
    public void setComAdr(CommunicationAddress8 value) {
        this.comAdr = value;
    }

}
