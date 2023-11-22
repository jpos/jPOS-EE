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

package org.jpos.iso20022.semt_003_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PledgeeFormat6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PledgeeFormat6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="TpAndId" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}PledgeeTypeAndAnyBICIdentifier2"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}PledgeeTypeAndText2"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}GenericIdentification85"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PledgeeFormat6Choice", propOrder = {
    "tpAndId",
    "id",
    "prtry"
})
public class PledgeeFormat6Choice {

    @XmlElement(name = "TpAndId")
    protected PledgeeTypeAndAnyBICIdentifier2 tpAndId;
    @XmlElement(name = "Id")
    protected PledgeeTypeAndText2 id;
    @XmlElement(name = "Prtry")
    protected GenericIdentification85 prtry;

    /**
     * Gets the value of the tpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeeTypeAndAnyBICIdentifier2 }
     *     
     */
    public PledgeeTypeAndAnyBICIdentifier2 getTpAndId() {
        return tpAndId;
    }

    /**
     * Sets the value of the tpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeeTypeAndAnyBICIdentifier2 }
     *     
     */
    public void setTpAndId(PledgeeTypeAndAnyBICIdentifier2 value) {
        this.tpAndId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeeTypeAndText2 }
     *     
     */
    public PledgeeTypeAndText2 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeeTypeAndText2 }
     *     
     */
    public void setId(PledgeeTypeAndText2 value) {
        this.id = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification85 }
     *     
     */
    public GenericIdentification85 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification85 }
     *     
     */
    public void setPrtry(GenericIdentification85 value) {
        this.prtry = value;
    }

}
