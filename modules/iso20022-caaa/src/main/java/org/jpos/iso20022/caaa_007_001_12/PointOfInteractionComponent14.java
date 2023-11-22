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

package org.jpos.iso20022.caaa_007_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfInteractionComponent14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PointOfInteractionComponent14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}POIComponentType6Code"/>
 *         <element name="SubTpInf" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max70Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}PointOfInteractionComponentIdentification2"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}PointOfInteractionComponentStatus3" minOccurs="0"/>
 *         <element name="StdCmplc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}GenericIdentification48" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Chrtcs" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}PointOfInteractionComponentCharacteristics9" minOccurs="0"/>
 *         <element name="Assmnt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}PointOfInteractionComponentAssessment1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Packg" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}PackageType4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponent14", propOrder = {
    "tp",
    "subTpInf",
    "id",
    "sts",
    "stdCmplc",
    "chrtcs",
    "assmnt",
    "packg"
})
public class PointOfInteractionComponent14 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected POIComponentType6Code tp;
    @XmlElement(name = "SubTpInf")
    protected String subTpInf;
    @XmlElement(name = "Id", required = true)
    protected PointOfInteractionComponentIdentification2 id;
    @XmlElement(name = "Sts")
    protected PointOfInteractionComponentStatus3 sts;
    @XmlElement(name = "StdCmplc")
    protected List<GenericIdentification48> stdCmplc;
    @XmlElement(name = "Chrtcs")
    protected PointOfInteractionComponentCharacteristics9 chrtcs;
    @XmlElement(name = "Assmnt")
    protected List<PointOfInteractionComponentAssessment1> assmnt;
    @XmlElement(name = "Packg")
    protected List<PackageType4> packg;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentType6Code }
     *     
     */
    public POIComponentType6Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentType6Code }
     *     
     */
    public void setTp(POIComponentType6Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the subTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTpInf() {
        return subTpInf;
    }

    /**
     * Sets the value of the subTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTpInf(String value) {
        this.subTpInf = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentIdentification2 }
     *     
     */
    public PointOfInteractionComponentIdentification2 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentIdentification2 }
     *     
     */
    public void setId(PointOfInteractionComponentIdentification2 value) {
        this.id = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentStatus3 }
     *     
     */
    public PointOfInteractionComponentStatus3 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentStatus3 }
     *     
     */
    public void setSts(PointOfInteractionComponentStatus3 value) {
        this.sts = value;
    }

    /**
     * Gets the value of the stdCmplc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stdCmplc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStdCmplc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification48 }
     * 
     * 
     * @return
     *     The value of the stdCmplc property.
     */
    public List<GenericIdentification48> getStdCmplc() {
        if (stdCmplc == null) {
            stdCmplc = new ArrayList<>();
        }
        return this.stdCmplc;
    }

    /**
     * Gets the value of the chrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentCharacteristics9 }
     *     
     */
    public PointOfInteractionComponentCharacteristics9 getChrtcs() {
        return chrtcs;
    }

    /**
     * Sets the value of the chrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentCharacteristics9 }
     *     
     */
    public void setChrtcs(PointOfInteractionComponentCharacteristics9 value) {
        this.chrtcs = value;
    }

    /**
     * Gets the value of the assmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponentAssessment1 }
     * 
     * 
     * @return
     *     The value of the assmnt property.
     */
    public List<PointOfInteractionComponentAssessment1> getAssmnt() {
        if (assmnt == null) {
            assmnt = new ArrayList<>();
        }
        return this.assmnt;
    }

    /**
     * Gets the value of the packg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the packg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType4 }
     * 
     * 
     * @return
     *     The value of the packg property.
     */
    public List<PackageType4> getPackg() {
        if (packg == null) {
            packg = new ArrayList<>();
        }
        return this.packg;
    }

}
