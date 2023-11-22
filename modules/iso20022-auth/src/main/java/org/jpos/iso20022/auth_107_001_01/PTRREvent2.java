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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTRREvent2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PTRREvent2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tchnq" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}RiskReductionService1Code"/>
 *         <element name="SvcPrvdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}OrganisationIdentification15Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTRREvent2", propOrder = {
    "tchnq",
    "svcPrvdr"
})
public class PTRREvent2 {

    @XmlElement(name = "Tchnq", required = true)
    @XmlSchemaType(name = "string")
    protected RiskReductionService1Code tchnq;
    @XmlElement(name = "SvcPrvdr")
    protected OrganisationIdentification15Choice svcPrvdr;

    /**
     * Gets the value of the tchnq property.
     * 
     * @return
     *     possible object is
     *     {@link RiskReductionService1Code }
     *     
     */
    public RiskReductionService1Code getTchnq() {
        return tchnq;
    }

    /**
     * Sets the value of the tchnq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskReductionService1Code }
     *     
     */
    public void setTchnq(RiskReductionService1Code value) {
        this.tchnq = value;
    }

    /**
     * Gets the value of the svcPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getSvcPrvdr() {
        return svcPrvdr;
    }

    /**
     * Sets the value of the svcPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setSvcPrvdr(OrganisationIdentification15Choice value) {
        this.svcPrvdr = value;
    }

}
