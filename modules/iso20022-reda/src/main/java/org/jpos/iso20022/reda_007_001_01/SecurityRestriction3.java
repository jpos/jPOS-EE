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

package org.jpos.iso20022.reda_007_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityRestriction3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityRestriction3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FctvPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}DateTimePeriod2" minOccurs="0"/>
 *         <element name="RstrctnTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SecurityRestrictionType2Choice" minOccurs="0"/>
 *         <element name="LglRstrctnTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}LegalRestrictions5Choice" minOccurs="0"/>
 *         <element name="InvstrRstrctnTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}InvestorRestrictionType3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InvstrTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}InvestorType3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityRestriction3", propOrder = {
    "fctvPrd",
    "rstrctnTp",
    "lglRstrctnTp",
    "invstrRstrctnTp",
    "invstrTp"
})
public class SecurityRestriction3 {

    @XmlElement(name = "FctvPrd")
    protected DateTimePeriod2 fctvPrd;
    @XmlElement(name = "RstrctnTp")
    protected SecurityRestrictionType2Choice rstrctnTp;
    @XmlElement(name = "LglRstrctnTp")
    protected LegalRestrictions5Choice lglRstrctnTp;
    @XmlElement(name = "InvstrRstrctnTp")
    protected List<InvestorRestrictionType3Choice> invstrRstrctnTp;
    @XmlElement(name = "InvstrTp")
    protected List<InvestorType3Choice> invstrTp;

    /**
     * Gets the value of the fctvPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod2 }
     *     
     */
    public DateTimePeriod2 getFctvPrd() {
        return fctvPrd;
    }

    /**
     * Sets the value of the fctvPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod2 }
     *     
     */
    public void setFctvPrd(DateTimePeriod2 value) {
        this.fctvPrd = value;
    }

    /**
     * Gets the value of the rstrctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityRestrictionType2Choice }
     *     
     */
    public SecurityRestrictionType2Choice getRstrctnTp() {
        return rstrctnTp;
    }

    /**
     * Sets the value of the rstrctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityRestrictionType2Choice }
     *     
     */
    public void setRstrctnTp(SecurityRestrictionType2Choice value) {
        this.rstrctnTp = value;
    }

    /**
     * Gets the value of the lglRstrctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link LegalRestrictions5Choice }
     *     
     */
    public LegalRestrictions5Choice getLglRstrctnTp() {
        return lglRstrctnTp;
    }

    /**
     * Sets the value of the lglRstrctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalRestrictions5Choice }
     *     
     */
    public void setLglRstrctnTp(LegalRestrictions5Choice value) {
        this.lglRstrctnTp = value;
    }

    /**
     * Gets the value of the invstrRstrctnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstrRstrctnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstrRstrctnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestorRestrictionType3Choice }
     * 
     * 
     * @return
     *     The value of the invstrRstrctnTp property.
     */
    public List<InvestorRestrictionType3Choice> getInvstrRstrctnTp() {
        if (invstrRstrctnTp == null) {
            invstrRstrctnTp = new ArrayList<>();
        }
        return this.invstrRstrctnTp;
    }

    /**
     * Gets the value of the invstrTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstrTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstrTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestorType3Choice }
     * 
     * 
     * @return
     *     The value of the invstrTp property.
     */
    public List<InvestorType3Choice> getInvstrTp() {
        if (invstrTp == null) {
            invstrTp = new ArrayList<>();
        }
        return this.invstrTp;
    }

}
