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

package org.jpos.iso20022.tsmt_018_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredSubmission3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequiredSubmission3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Submitr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}BICIdentification1" maxOccurs="unbounded"/>
 *         <element name="MtchIssr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}PartyIdentification27" minOccurs="0"/>
 *         <element name="MtchIsseDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}YesNoIndicator"/>
 *         <element name="MtchTrnsprt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}YesNoIndicator"/>
 *         <element name="MtchAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}YesNoIndicator"/>
 *         <element name="ClausesReqrd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}InsuranceClauses1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MtchAssrdPty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}AssuredType1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredSubmission3", propOrder = {
    "submitr",
    "mtchIssr",
    "mtchIsseDt",
    "mtchTrnsprt",
    "mtchAmt",
    "clausesReqrd",
    "mtchAssrdPty"
})
public class RequiredSubmission3 {

    @XmlElement(name = "Submitr", required = true)
    protected List<BICIdentification1> submitr;
    @XmlElement(name = "MtchIssr")
    protected PartyIdentification27 mtchIssr;
    @XmlElement(name = "MtchIsseDt")
    protected boolean mtchIsseDt;
    @XmlElement(name = "MtchTrnsprt")
    protected boolean mtchTrnsprt;
    @XmlElement(name = "MtchAmt")
    protected boolean mtchAmt;
    @XmlElement(name = "ClausesReqrd")
    @XmlSchemaType(name = "string")
    protected List<InsuranceClauses1Code> clausesReqrd;
    @XmlElement(name = "MtchAssrdPty")
    @XmlSchemaType(name = "string")
    protected AssuredType1Code mtchAssrdPty;

    /**
     * Gets the value of the submitr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the submitr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the submitr property.
     */
    public List<BICIdentification1> getSubmitr() {
        if (submitr == null) {
            submitr = new ArrayList<>();
        }
        return this.submitr;
    }

    /**
     * Gets the value of the mtchIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification27 }
     *     
     */
    public PartyIdentification27 getMtchIssr() {
        return mtchIssr;
    }

    /**
     * Sets the value of the mtchIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification27 }
     *     
     */
    public void setMtchIssr(PartyIdentification27 value) {
        this.mtchIssr = value;
    }

    /**
     * Gets the value of the mtchIsseDt property.
     * 
     */
    public boolean isMtchIsseDt() {
        return mtchIsseDt;
    }

    /**
     * Sets the value of the mtchIsseDt property.
     * 
     */
    public void setMtchIsseDt(boolean value) {
        this.mtchIsseDt = value;
    }

    /**
     * Gets the value of the mtchTrnsprt property.
     * 
     */
    public boolean isMtchTrnsprt() {
        return mtchTrnsprt;
    }

    /**
     * Sets the value of the mtchTrnsprt property.
     * 
     */
    public void setMtchTrnsprt(boolean value) {
        this.mtchTrnsprt = value;
    }

    /**
     * Gets the value of the mtchAmt property.
     * 
     */
    public boolean isMtchAmt() {
        return mtchAmt;
    }

    /**
     * Sets the value of the mtchAmt property.
     * 
     */
    public void setMtchAmt(boolean value) {
        this.mtchAmt = value;
    }

    /**
     * Gets the value of the clausesReqrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clausesReqrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClausesReqrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceClauses1Code }
     * 
     * 
     * @return
     *     The value of the clausesReqrd property.
     */
    public List<InsuranceClauses1Code> getClausesReqrd() {
        if (clausesReqrd == null) {
            clausesReqrd = new ArrayList<>();
        }
        return this.clausesReqrd;
    }

    /**
     * Gets the value of the mtchAssrdPty property.
     * 
     * @return
     *     possible object is
     *     {@link AssuredType1Code }
     *     
     */
    public AssuredType1Code getMtchAssrdPty() {
        return mtchAssrdPty;
    }

    /**
     * Sets the value of the mtchAssrdPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssuredType1Code }
     *     
     */
    public void setMtchAssrdPty(AssuredType1Code value) {
        this.mtchAssrdPty = value;
    }

}
