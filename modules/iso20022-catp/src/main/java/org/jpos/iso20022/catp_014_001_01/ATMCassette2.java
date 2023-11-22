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

package org.jpos.iso20022.catp_014_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCassette2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCassette2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PhysId" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}Max35Text" minOccurs="0"/>
 *         <element name="LogclId" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}Max35Text"/>
 *         <element name="SrlNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMCassetteType1Code"/>
 *         <element name="SubTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMNoteType1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MdiaTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMMediaType1Code" minOccurs="0"/>
 *         <element name="MdiaCntrs" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMCassetteCounters3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCassette2", propOrder = {
    "physId",
    "logclId",
    "srlNb",
    "tp",
    "subTp",
    "mdiaTp",
    "mdiaCntrs"
})
public class ATMCassette2 {

    @XmlElement(name = "PhysId")
    protected String physId;
    @XmlElement(name = "LogclId", required = true)
    protected String logclId;
    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCassetteType1Code tp;
    @XmlElement(name = "SubTp")
    @XmlSchemaType(name = "string")
    protected List<ATMNoteType1Code> subTp;
    @XmlElement(name = "MdiaTp")
    @XmlSchemaType(name = "string")
    protected ATMMediaType1Code mdiaTp;
    @XmlElement(name = "MdiaCntrs")
    protected List<ATMCassetteCounters3> mdiaCntrs;

    /**
     * Gets the value of the physId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysId() {
        return physId;
    }

    /**
     * Sets the value of the physId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysId(String value) {
        this.physId = value;
    }

    /**
     * Gets the value of the logclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogclId() {
        return logclId;
    }

    /**
     * Sets the value of the logclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogclId(String value) {
        this.logclId = value;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrlNb(String value) {
        this.srlNb = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCassetteType1Code }
     *     
     */
    public ATMCassetteType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCassetteType1Code }
     *     
     */
    public void setTp(ATMCassetteType1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the subTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMNoteType1Code }
     * 
     * 
     * @return
     *     The value of the subTp property.
     */
    public List<ATMNoteType1Code> getSubTp() {
        if (subTp == null) {
            subTp = new ArrayList<>();
        }
        return this.subTp;
    }

    /**
     * Gets the value of the mdiaTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType1Code }
     *     
     */
    public ATMMediaType1Code getMdiaTp() {
        return mdiaTp;
    }

    /**
     * Sets the value of the mdiaTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType1Code }
     *     
     */
    public void setMdiaTp(ATMMediaType1Code value) {
        this.mdiaTp = value;
    }

    /**
     * Gets the value of the mdiaCntrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mdiaCntrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMdiaCntrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCassetteCounters3 }
     * 
     * 
     * @return
     *     The value of the mdiaCntrs property.
     */
    public List<ATMCassetteCounters3> getMdiaCntrs() {
        if (mdiaCntrs == null) {
            mdiaCntrs = new ArrayList<>();
        }
        return this.mdiaCntrs;
    }

}
