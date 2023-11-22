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

package org.jpos.iso20022.cain_001_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationCharacteristics3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommunicationCharacteristics3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ComTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}POICommunicationType2Code"/>
 *         <element name="RmotPty" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}PartyType7Code" maxOccurs="unbounded"/>
 *         <element name="Actv" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationCharacteristics3", propOrder = {
    "comTp",
    "rmotPty",
    "actv"
})
public class CommunicationCharacteristics3 {

    @XmlElement(name = "ComTp", required = true)
    @XmlSchemaType(name = "string")
    protected POICommunicationType2Code comTp;
    @XmlElement(name = "RmotPty", required = true)
    @XmlSchemaType(name = "string")
    protected List<PartyType7Code> rmotPty;
    @XmlElement(name = "Actv")
    protected boolean actv;

    /**
     * Gets the value of the comTp property.
     * 
     * @return
     *     possible object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public POICommunicationType2Code getComTp() {
        return comTp;
    }

    /**
     * Sets the value of the comTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public void setComTp(POICommunicationType2Code value) {
        this.comTp = value;
    }

    /**
     * Gets the value of the rmotPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rmotPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRmotPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType7Code }
     * 
     * 
     * @return
     *     The value of the rmotPty property.
     */
    public List<PartyType7Code> getRmotPty() {
        if (rmotPty == null) {
            rmotPty = new ArrayList<>();
        }
        return this.rmotPty;
    }

    /**
     * Gets the value of the actv property.
     * 
     */
    public boolean isActv() {
        return actv;
    }

    /**
     * Sets the value of the actv property.
     * 
     */
    public void setActv(boolean value) {
        this.actv = value;
    }

}
