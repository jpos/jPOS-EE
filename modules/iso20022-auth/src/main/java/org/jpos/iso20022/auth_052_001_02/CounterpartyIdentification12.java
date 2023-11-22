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

package org.jpos.iso20022.auth_052_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyIdentification12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartyIdentification12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}PartyIdentification236Choice"/>
 *         <element name="Brnch" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}Branch6Choice" minOccurs="0"/>
 *         <element name="CtryCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}CountryCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyIdentification12", propOrder = {
    "id",
    "brnch",
    "ctryCd"
})
public class CounterpartyIdentification12 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification236Choice id;
    @XmlElement(name = "Brnch")
    protected Branch6Choice brnch;
    @XmlElement(name = "CtryCd")
    protected String ctryCd;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public PartyIdentification236Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public void setId(PartyIdentification236Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the brnch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch6Choice }
     *     
     */
    public Branch6Choice getBrnch() {
        return brnch;
    }

    /**
     * Sets the value of the brnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch6Choice }
     *     
     */
    public void setBrnch(Branch6Choice value) {
        this.brnch = value;
    }

    /**
     * Gets the value of the ctryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryCd() {
        return ctryCd;
    }

    /**
     * Sets the value of the ctryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryCd(String value) {
        this.ctryCd = value;
    }

}
