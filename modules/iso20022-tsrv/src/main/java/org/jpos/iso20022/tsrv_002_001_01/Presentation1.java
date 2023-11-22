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

package org.jpos.iso20022.tsrv_002_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Presentation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Presentation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mdm" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}PresentationMedium1Choice" minOccurs="0"/>
 *         <element name="PlcOfPresntnOrUdrConfChc" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}PlaceOrUnderConfirmationChoice1" minOccurs="0"/>
 *         <element name="Doc" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}Document8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Presentation1", propOrder = {
    "mdm",
    "plcOfPresntnOrUdrConfChc",
    "doc",
    "addtlInf"
})
public class Presentation1 {

    @XmlElement(name = "Mdm")
    protected PresentationMedium1Choice mdm;
    @XmlElement(name = "PlcOfPresntnOrUdrConfChc")
    protected PlaceOrUnderConfirmationChoice1 plcOfPresntnOrUdrConfChc;
    @XmlElement(name = "Doc")
    protected List<Document8> doc;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the mdm property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationMedium1Choice }
     *     
     */
    public PresentationMedium1Choice getMdm() {
        return mdm;
    }

    /**
     * Sets the value of the mdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationMedium1Choice }
     *     
     */
    public void setMdm(PresentationMedium1Choice value) {
        this.mdm = value;
    }

    /**
     * Gets the value of the plcOfPresntnOrUdrConfChc property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOrUnderConfirmationChoice1 }
     *     
     */
    public PlaceOrUnderConfirmationChoice1 getPlcOfPresntnOrUdrConfChc() {
        return plcOfPresntnOrUdrConfChc;
    }

    /**
     * Sets the value of the plcOfPresntnOrUdrConfChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOrUnderConfirmationChoice1 }
     *     
     */
    public void setPlcOfPresntnOrUdrConfChc(PlaceOrUnderConfirmationChoice1 value) {
        this.plcOfPresntnOrUdrConfChc = value;
    }

    /**
     * Gets the value of the doc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the doc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document8 }
     * 
     * 
     * @return
     *     The value of the doc property.
     */
    public List<Document8> getDoc() {
        if (doc == null) {
            doc = new ArrayList<>();
        }
        return this.doc;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
