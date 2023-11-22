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

package org.jpos.iso20022.reda_012_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityCSDLink7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityCSDLink7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VldFr" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}DateAndDateTime2Choice"/>
 *         <element name="VldTo" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="SctyMntnc" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="IssrCSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}SystemPartyIdentification2Choice" minOccurs="0"/>
 *         <element name="InvstrCSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}SystemPartyIdentification2Choice" minOccurs="0"/>
 *         <element name="TechIssrCSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}SystemPartyIdentification2Choice" minOccurs="0"/>
 *         <element name="IssncAcct" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}IssuanceAccount2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCSDLink7", propOrder = {
    "vldFr",
    "vldTo",
    "sctyMntnc",
    "issrCSD",
    "invstrCSD",
    "techIssrCSD",
    "issncAcct"
})
public class SecurityCSDLink7 {

    @XmlElement(name = "VldFr", required = true)
    protected DateAndDateTime2Choice vldFr;
    @XmlElement(name = "VldTo")
    protected DateAndDateTime2Choice vldTo;
    @XmlElement(name = "SctyMntnc")
    protected Boolean sctyMntnc;
    @XmlElement(name = "IssrCSD")
    protected SystemPartyIdentification2Choice issrCSD;
    @XmlElement(name = "InvstrCSD")
    protected SystemPartyIdentification2Choice invstrCSD;
    @XmlElement(name = "TechIssrCSD")
    protected SystemPartyIdentification2Choice techIssrCSD;
    @XmlElement(name = "IssncAcct")
    protected List<IssuanceAccount2> issncAcct;

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setVldFr(DateAndDateTime2Choice value) {
        this.vldFr = value;
    }

    /**
     * Gets the value of the vldTo property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getVldTo() {
        return vldTo;
    }

    /**
     * Sets the value of the vldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setVldTo(DateAndDateTime2Choice value) {
        this.vldTo = value;
    }

    /**
     * Gets the value of the sctyMntnc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctyMntnc() {
        return sctyMntnc;
    }

    /**
     * Sets the value of the sctyMntnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSctyMntnc(Boolean value) {
        this.sctyMntnc = value;
    }

    /**
     * Gets the value of the issrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getIssrCSD() {
        return issrCSD;
    }

    /**
     * Sets the value of the issrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public void setIssrCSD(SystemPartyIdentification2Choice value) {
        this.issrCSD = value;
    }

    /**
     * Gets the value of the invstrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getInvstrCSD() {
        return invstrCSD;
    }

    /**
     * Sets the value of the invstrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public void setInvstrCSD(SystemPartyIdentification2Choice value) {
        this.invstrCSD = value;
    }

    /**
     * Gets the value of the techIssrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getTechIssrCSD() {
        return techIssrCSD;
    }

    /**
     * Sets the value of the techIssrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public void setTechIssrCSD(SystemPartyIdentification2Choice value) {
        this.techIssrCSD = value;
    }

    /**
     * Gets the value of the issncAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the issncAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssncAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuanceAccount2 }
     * 
     * 
     * @return
     *     The value of the issncAcct property.
     */
    public List<IssuanceAccount2> getIssncAcct() {
        if (issncAcct == null) {
            issncAcct = new ArrayList<>();
        }
        return this.issncAcct;
    }

}
