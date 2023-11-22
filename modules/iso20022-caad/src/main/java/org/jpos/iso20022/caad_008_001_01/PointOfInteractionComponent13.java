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

package org.jpos.iso20022.caad_008_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfInteractionComponent13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PointOfInteractionComponent13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}POIComponentType5Code"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PointOfInteractionComponentIdentification3"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PointOfInteractionComponentStatus3" minOccurs="0"/>
 *         <element name="StdCmplc" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}GenericIdentification48" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Chrtcs" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PointOfInteractionComponentCharacteristics4" minOccurs="0"/>
 *         <element name="Assmnt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PointOfInteractionComponentIdentification3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponent13", propOrder = {
    "tp",
    "id",
    "sts",
    "stdCmplc",
    "chrtcs",
    "assmnt"
})
public class PointOfInteractionComponent13 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected POIComponentType5Code tp;
    @XmlElement(name = "Id", required = true)
    protected PointOfInteractionComponentIdentification3 id;
    @XmlElement(name = "Sts")
    protected PointOfInteractionComponentStatus3 sts;
    @XmlElement(name = "StdCmplc")
    protected List<GenericIdentification48> stdCmplc;
    @XmlElement(name = "Chrtcs")
    protected PointOfInteractionComponentCharacteristics4 chrtcs;
    @XmlElement(name = "Assmnt")
    protected List<PointOfInteractionComponentIdentification3> assmnt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentType5Code }
     *     
     */
    public POIComponentType5Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentType5Code }
     *     
     */
    public void setTp(POIComponentType5Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentIdentification3 }
     *     
     */
    public PointOfInteractionComponentIdentification3 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentIdentification3 }
     *     
     */
    public void setId(PointOfInteractionComponentIdentification3 value) {
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
     *     {@link PointOfInteractionComponentCharacteristics4 }
     *     
     */
    public PointOfInteractionComponentCharacteristics4 getChrtcs() {
        return chrtcs;
    }

    /**
     * Sets the value of the chrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentCharacteristics4 }
     *     
     */
    public void setChrtcs(PointOfInteractionComponentCharacteristics4 value) {
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
     * {@link PointOfInteractionComponentIdentification3 }
     * 
     * 
     * @return
     *     The value of the assmnt property.
     */
    public List<PointOfInteractionComponentIdentification3> getAssmnt() {
        if (assmnt == null) {
            assmnt = new ArrayList<>();
        }
        return this.assmnt;
    }

}
