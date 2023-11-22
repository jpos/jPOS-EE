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

package org.jpos.iso20022.auth_030_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergySpecificAttribute9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EnergySpecificAttribute9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DlvryPtOrZone" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}DeliveryInterconnectionPoint1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrCnnctnPt" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}DeliveryInterconnectionPoint1Choice" minOccurs="0"/>
 *         <element name="LdTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyLoadType1Code" minOccurs="0"/>
 *         <element name="DlvryAttr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyDeliveryAttribute10" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergySpecificAttribute9", propOrder = {
    "dlvryPtOrZone",
    "intrCnnctnPt",
    "ldTp",
    "dlvryAttr"
})
public class EnergySpecificAttribute9 {

    @XmlElement(name = "DlvryPtOrZone")
    protected List<DeliveryInterconnectionPoint1Choice> dlvryPtOrZone;
    @XmlElement(name = "IntrCnnctnPt")
    protected DeliveryInterconnectionPoint1Choice intrCnnctnPt;
    @XmlElement(name = "LdTp")
    @XmlSchemaType(name = "string")
    protected EnergyLoadType1Code ldTp;
    @XmlElement(name = "DlvryAttr")
    protected List<EnergyDeliveryAttribute10> dlvryAttr;

    /**
     * Gets the value of the dlvryPtOrZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvryPtOrZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryPtOrZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInterconnectionPoint1Choice }
     * 
     * 
     * @return
     *     The value of the dlvryPtOrZone property.
     */
    public List<DeliveryInterconnectionPoint1Choice> getDlvryPtOrZone() {
        if (dlvryPtOrZone == null) {
            dlvryPtOrZone = new ArrayList<>();
        }
        return this.dlvryPtOrZone;
    }

    /**
     * Gets the value of the intrCnnctnPt property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInterconnectionPoint1Choice }
     *     
     */
    public DeliveryInterconnectionPoint1Choice getIntrCnnctnPt() {
        return intrCnnctnPt;
    }

    /**
     * Sets the value of the intrCnnctnPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInterconnectionPoint1Choice }
     *     
     */
    public void setIntrCnnctnPt(DeliveryInterconnectionPoint1Choice value) {
        this.intrCnnctnPt = value;
    }

    /**
     * Gets the value of the ldTp property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyLoadType1Code }
     *     
     */
    public EnergyLoadType1Code getLdTp() {
        return ldTp;
    }

    /**
     * Sets the value of the ldTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyLoadType1Code }
     *     
     */
    public void setLdTp(EnergyLoadType1Code value) {
        this.ldTp = value;
    }

    /**
     * Gets the value of the dlvryAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvryAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyDeliveryAttribute10 }
     * 
     * 
     * @return
     *     The value of the dlvryAttr property.
     */
    public List<EnergyDeliveryAttribute10> getDlvryAttr() {
        if (dlvryAttr == null) {
            dlvryAttr = new ArrayList<>();
        }
        return this.dlvryAttr;
    }

}
