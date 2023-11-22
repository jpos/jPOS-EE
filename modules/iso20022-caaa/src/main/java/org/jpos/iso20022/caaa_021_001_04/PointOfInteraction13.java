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

package org.jpos.iso20022.caaa_021_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfInteraction13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PointOfInteraction13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caaa.021.001.04}GenericIdentification177"/>
 *         <element name="SysNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.021.001.04}Max70Text" minOccurs="0"/>
 *         <element name="GrpId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.021.001.04}Max35Text" minOccurs="0"/>
 *         <element name="Cpblties" type="{urn:iso:std:iso:20022:tech:xsd:caaa.021.001.04}PointOfInteractionCapabilities9" minOccurs="0"/>
 *         <element name="TmZone" type="{urn:iso:std:iso:20022:tech:xsd:caaa.021.001.04}Max70Text" minOccurs="0"/>
 *         <element name="TermnlIntgtn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.021.001.04}LocationCategory3Code" minOccurs="0"/>
 *         <element name="Cmpnt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.021.001.04}PointOfInteractionComponent14" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteraction13", propOrder = {
    "id",
    "sysNm",
    "grpId",
    "cpblties",
    "tmZone",
    "termnlIntgtn",
    "cmpnt"
})
public class PointOfInteraction13 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification177 id;
    @XmlElement(name = "SysNm")
    protected String sysNm;
    @XmlElement(name = "GrpId")
    protected String grpId;
    @XmlElement(name = "Cpblties")
    protected PointOfInteractionCapabilities9 cpblties;
    @XmlElement(name = "TmZone")
    protected String tmZone;
    @XmlElement(name = "TermnlIntgtn")
    @XmlSchemaType(name = "string")
    protected LocationCategory3Code termnlIntgtn;
    @XmlElement(name = "Cmpnt")
    protected List<PointOfInteractionComponent14> cmpnt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification177 }
     *     
     */
    public GenericIdentification177 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification177 }
     *     
     */
    public void setId(GenericIdentification177 value) {
        this.id = value;
    }

    /**
     * Gets the value of the sysNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysNm() {
        return sysNm;
    }

    /**
     * Sets the value of the sysNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysNm(String value) {
        this.sysNm = value;
    }

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
     * Gets the value of the cpblties property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public PointOfInteractionCapabilities9 getCpblties() {
        return cpblties;
    }

    /**
     * Sets the value of the cpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public void setCpblties(PointOfInteractionCapabilities9 value) {
        this.cpblties = value;
    }

    /**
     * Gets the value of the tmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmZone() {
        return tmZone;
    }

    /**
     * Sets the value of the tmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmZone(String value) {
        this.tmZone = value;
    }

    /**
     * Gets the value of the termnlIntgtn property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCategory3Code }
     *     
     */
    public LocationCategory3Code getTermnlIntgtn() {
        return termnlIntgtn;
    }

    /**
     * Sets the value of the termnlIntgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCategory3Code }
     *     
     */
    public void setTermnlIntgtn(LocationCategory3Code value) {
        this.termnlIntgtn = value;
    }

    /**
     * Gets the value of the cmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmpnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent14 }
     * 
     * 
     * @return
     *     The value of the cmpnt property.
     */
    public List<PointOfInteractionComponent14> getCmpnt() {
        if (cmpnt == null) {
            cmpnt = new ArrayList<>();
        }
        return this.cmpnt;
    }

}
