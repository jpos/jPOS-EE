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

package org.jpos.iso20022.catm_003_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostCommunicationParameter6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HostCommunicationParameter6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}TerminalManagementAction3Code"/>
 *         <element name="HstId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max35Text"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}NetworkParameters7" minOccurs="0"/>
 *         <element name="Key" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}KEKIdentifier5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtwkSvcPrvdr" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}NetworkParameters7" minOccurs="0"/>
 *         <element name="PhysIntrfc" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}PhysicalInterfaceParameter1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCommunicationParameter6", propOrder = {
    "actnTp",
    "hstId",
    "adr",
    "key",
    "ntwkSvcPrvdr",
    "physIntrfc"
})
public class HostCommunicationParameter6 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "HstId", required = true)
    protected String hstId;
    @XmlElement(name = "Adr")
    protected NetworkParameters7 adr;
    @XmlElement(name = "Key")
    protected List<KEKIdentifier5> key;
    @XmlElement(name = "NtwkSvcPrvdr")
    protected NetworkParameters7 ntwkSvcPrvdr;
    @XmlElement(name = "PhysIntrfc")
    protected PhysicalInterfaceParameter1 physIntrfc;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public void setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the hstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstId() {
        return hstId;
    }

    /**
     * Sets the value of the hstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHstId(String value) {
        this.hstId = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public void setAdr(NetworkParameters7 value) {
        this.adr = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KEKIdentifier5 }
     * 
     * 
     * @return
     *     The value of the key property.
     */
    public List<KEKIdentifier5> getKey() {
        if (key == null) {
            key = new ArrayList<>();
        }
        return this.key;
    }

    /**
     * Gets the value of the ntwkSvcPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getNtwkSvcPrvdr() {
        return ntwkSvcPrvdr;
    }

    /**
     * Sets the value of the ntwkSvcPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public void setNtwkSvcPrvdr(NetworkParameters7 value) {
        this.ntwkSvcPrvdr = value;
    }

    /**
     * Gets the value of the physIntrfc property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalInterfaceParameter1 }
     *     
     */
    public PhysicalInterfaceParameter1 getPhysIntrfc() {
        return physIntrfc;
    }

    /**
     * Sets the value of the physIntrfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalInterfaceParameter1 }
     *     
     */
    public void setPhysIntrfc(PhysicalInterfaceParameter1 value) {
        this.physIntrfc = value;
    }

}
