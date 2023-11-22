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

package org.jpos.iso20022.auth_090_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionSetAggregated4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSetAggregated4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RefDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ISODate"/>
 *         <element name="PosSet" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PositionSet21" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CcyPosSet" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PositionSet21" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CollPosSet" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PositionSet22" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CcyCollPosSet" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PositionSet22" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetAggregated4", propOrder = {
    "refDt",
    "posSet",
    "ccyPosSet",
    "collPosSet",
    "ccyCollPosSet"
})
public class PositionSetAggregated4 {

    @XmlElement(name = "RefDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "PosSet")
    protected List<PositionSet21> posSet;
    @XmlElement(name = "CcyPosSet")
    protected List<PositionSet21> ccyPosSet;
    @XmlElement(name = "CollPosSet")
    protected List<PositionSet22> collPosSet;
    @XmlElement(name = "CcyCollPosSet")
    protected List<PositionSet22> ccyCollPosSet;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefDt(XMLGregorianCalendar value) {
        this.refDt = value;
    }

    /**
     * Gets the value of the posSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the posSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet21 }
     * 
     * 
     * @return
     *     The value of the posSet property.
     */
    public List<PositionSet21> getPosSet() {
        if (posSet == null) {
            posSet = new ArrayList<>();
        }
        return this.posSet;
    }

    /**
     * Gets the value of the ccyPosSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ccyPosSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet21 }
     * 
     * 
     * @return
     *     The value of the ccyPosSet property.
     */
    public List<PositionSet21> getCcyPosSet() {
        if (ccyPosSet == null) {
            ccyPosSet = new ArrayList<>();
        }
        return this.ccyPosSet;
    }

    /**
     * Gets the value of the collPosSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collPosSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet22 }
     * 
     * 
     * @return
     *     The value of the collPosSet property.
     */
    public List<PositionSet22> getCollPosSet() {
        if (collPosSet == null) {
            collPosSet = new ArrayList<>();
        }
        return this.collPosSet;
    }

    /**
     * Gets the value of the ccyCollPosSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ccyCollPosSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyCollPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet22 }
     * 
     * 
     * @return
     *     The value of the ccyCollPosSet property.
     */
    public List<PositionSet22> getCcyCollPosSet() {
        if (ccyCollPosSet == null) {
            ccyCollPosSet = new ArrayList<>();
        }
        return this.ccyCollPosSet;
    }

}
