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

package org.jpos.iso20022.caad_009_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalCustomer2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VehicleRentalCustomer2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RntrNm" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max70Text"/>
 *         <element name="CorpNm" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max70Text" minOccurs="0"/>
 *         <element name="CorpIdr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text"/>
 *         <element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}CustomerAssigner1Code" minOccurs="0"/>
 *         <element name="PmryDrvr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}DriverInParty2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlDrvr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}DriverInParty2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LltyPrgrmm" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}LoyaltyProgramme2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalCustomer2", propOrder = {
    "rntrNm",
    "corpNm",
    "corpIdr",
    "assgnr",
    "pmryDrvr",
    "addtlDrvr",
    "lltyPrgrmm"
})
public class VehicleRentalCustomer2 {

    @XmlElement(name = "RntrNm", required = true)
    protected String rntrNm;
    @XmlElement(name = "CorpNm")
    protected String corpNm;
    @XmlElement(name = "CorpIdr", required = true)
    protected String corpIdr;
    @XmlElement(name = "Assgnr")
    @XmlSchemaType(name = "string")
    protected CustomerAssigner1Code assgnr;
    @XmlElement(name = "PmryDrvr")
    protected List<DriverInParty2> pmryDrvr;
    @XmlElement(name = "AddtlDrvr")
    protected List<DriverInParty2> addtlDrvr;
    @XmlElement(name = "LltyPrgrmm")
    protected LoyaltyProgramme2 lltyPrgrmm;

    /**
     * Gets the value of the rntrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRntrNm() {
        return rntrNm;
    }

    /**
     * Sets the value of the rntrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRntrNm(String value) {
        this.rntrNm = value;
    }

    /**
     * Gets the value of the corpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpNm() {
        return corpNm;
    }

    /**
     * Sets the value of the corpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpNm(String value) {
        this.corpNm = value;
    }

    /**
     * Gets the value of the corpIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpIdr() {
        return corpIdr;
    }

    /**
     * Sets the value of the corpIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpIdr(String value) {
        this.corpIdr = value;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAssigner1Code }
     *     
     */
    public CustomerAssigner1Code getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAssigner1Code }
     *     
     */
    public void setAssgnr(CustomerAssigner1Code value) {
        this.assgnr = value;
    }

    /**
     * Gets the value of the pmryDrvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmryDrvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmryDrvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverInParty2 }
     * 
     * 
     * @return
     *     The value of the pmryDrvr property.
     */
    public List<DriverInParty2> getPmryDrvr() {
        if (pmryDrvr == null) {
            pmryDrvr = new ArrayList<>();
        }
        return this.pmryDrvr;
    }

    /**
     * Gets the value of the addtlDrvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlDrvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlDrvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverInParty2 }
     * 
     * 
     * @return
     *     The value of the addtlDrvr property.
     */
    public List<DriverInParty2> getAddtlDrvr() {
        if (addtlDrvr == null) {
            addtlDrvr = new ArrayList<>();
        }
        return this.addtlDrvr;
    }

    /**
     * Gets the value of the lltyPrgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramme2 }
     *     
     */
    public LoyaltyProgramme2 getLltyPrgrmm() {
        return lltyPrgrmm;
    }

    /**
     * Sets the value of the lltyPrgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramme2 }
     *     
     */
    public void setLltyPrgrmm(LoyaltyProgramme2 value) {
        this.lltyPrgrmm = value;
    }

}
