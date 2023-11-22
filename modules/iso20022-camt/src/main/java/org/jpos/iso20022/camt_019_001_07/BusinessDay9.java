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

package org.jpos.iso20022.camt_019_001_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDay9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BusinessDay9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="SysSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}SystemStatus3" minOccurs="0"/>
 *         <element name="SysInfPerCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}SystemAvailabilityAndEvents3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDay9", propOrder = {
    "sysDt",
    "sysSts",
    "sysInfPerCcy"
})
public class BusinessDay9 {

    @XmlElement(name = "SysDt")
    protected DateAndDateTime2Choice sysDt;
    @XmlElement(name = "SysSts")
    protected SystemStatus3 sysSts;
    @XmlElement(name = "SysInfPerCcy")
    protected List<SystemAvailabilityAndEvents3> sysInfPerCcy;

    /**
     * Gets the value of the sysDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getSysDt() {
        return sysDt;
    }

    /**
     * Sets the value of the sysDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setSysDt(DateAndDateTime2Choice value) {
        this.sysDt = value;
    }

    /**
     * Gets the value of the sysSts property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatus3 }
     *     
     */
    public SystemStatus3 getSysSts() {
        return sysSts;
    }

    /**
     * Sets the value of the sysSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatus3 }
     *     
     */
    public void setSysSts(SystemStatus3 value) {
        this.sysSts = value;
    }

    /**
     * Gets the value of the sysInfPerCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sysInfPerCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysInfPerCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemAvailabilityAndEvents3 }
     * 
     * 
     * @return
     *     The value of the sysInfPerCcy property.
     */
    public List<SystemAvailabilityAndEvents3> getSysInfPerCcy() {
        if (sysInfPerCcy == null) {
            sysInfPerCcy = new ArrayList<>();
        }
        return this.sysInfPerCcy;
    }

}
