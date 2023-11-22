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

package org.jpos.iso20022.tsin_011_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for QualifiedPartyIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QualifiedPartyIdentification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         <element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01}SingleQualifiedPartyIdentification1" maxOccurs="unbounded"/>
 *         <element name="ShrtId" type="{urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01}PartyIdentification2Choice" minOccurs="0"/>
 *         <element name="Role" type="{urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01}GenericIdentification1" minOccurs="0"/>
 *         <element name="RoleDesc" type="{urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedPartyIdentification1", propOrder = {
    "id",
    "pty",
    "shrtId",
    "role",
    "roleDesc"
})
public class QualifiedPartyIdentification1 {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "Pty", required = true)
    protected List<SingleQualifiedPartyIdentification1> pty;
    @XmlElement(name = "ShrtId")
    protected PartyIdentification2Choice shrtId;
    @XmlElement(name = "Role")
    protected GenericIdentification1 role;
    @XmlElement(name = "RoleDesc")
    protected String roleDesc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * {@link SingleQualifiedPartyIdentification1 }
     * 
     * 
     * @return
     *     The value of the pty property.
     */
    public List<SingleQualifiedPartyIdentification1> getPty() {
        if (pty == null) {
            pty = new ArrayList<>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the shrtId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getShrtId() {
        return shrtId;
    }

    /**
     * Sets the value of the shrtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setShrtId(PartyIdentification2Choice value) {
        this.shrtId = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setRole(GenericIdentification1 value) {
        this.role = value;
    }

    /**
     * Gets the value of the roleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * Sets the value of the roleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleDesc(String value) {
        this.roleDesc = value;
    }

}
