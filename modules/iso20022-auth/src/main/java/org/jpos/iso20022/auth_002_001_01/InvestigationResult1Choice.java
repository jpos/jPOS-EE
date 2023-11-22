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

package org.jpos.iso20022.auth_002_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestigationResult1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestigationResult1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}SupplementaryDataEnvelope1"/>
 *         <element name="InvstgtnSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}InvestigationStatus1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationResult1Choice", propOrder = {
    "rslt",
    "invstgtnSts"
})
public class InvestigationResult1Choice {

    @XmlElement(name = "Rslt")
    protected SupplementaryDataEnvelope1 rslt;
    @XmlElement(name = "InvstgtnSts")
    @XmlSchemaType(name = "string")
    protected InvestigationStatus1Code invstgtnSts;

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryDataEnvelope1 }
     *     
     */
    public SupplementaryDataEnvelope1 getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryDataEnvelope1 }
     *     
     */
    public void setRslt(SupplementaryDataEnvelope1 value) {
        this.rslt = value;
    }

    /**
     * Gets the value of the invstgtnSts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus1Code }
     *     
     */
    public InvestigationStatus1Code getInvstgtnSts() {
        return invstgtnSts;
    }

    /**
     * Sets the value of the invstgtnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus1Code }
     *     
     */
    public void setInvstgtnSts(InvestigationStatus1Code value) {
        this.invstgtnSts = value;
    }

}
