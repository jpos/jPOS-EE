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

package org.jpos.iso20022.acmt_018_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Group3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Group3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ModCd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}Modification1Code" minOccurs="0"/>
 *         <element name="GrpId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}Max4AlphaNumericText"/>
 *         <element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.018.001.03}PartyAndCertificate5" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group3", propOrder = {
    "modCd",
    "grpId",
    "pty"
})
public class Group3 {

    @XmlElement(name = "ModCd")
    @XmlSchemaType(name = "string")
    protected Modification1Code modCd;
    @XmlElement(name = "GrpId", required = true)
    protected String grpId;
    @XmlElement(name = "Pty", required = true)
    protected List<PartyAndCertificate5> pty;

    /**
     * Gets the value of the modCd property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getModCd() {
        return modCd;
    }

    /**
     * Sets the value of the modCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public void setModCd(Modification1Code value) {
        this.modCd = value;
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
     * Gets the value of the pty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndCertificate5 }
     * 
     * 
     * @return
     *     The value of the pty property.
     */
    public List<PartyAndCertificate5> getPty() {
        if (pty == null) {
            pty = new ArrayList<>();
        }
        return this.pty;
    }

}
