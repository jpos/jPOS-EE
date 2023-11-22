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

package org.jpos.iso20022.colr_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementFramework1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgreementFramework1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AgrmtFrmwk" type="{urn:iso:std:iso:20022:tech:xsd:colr.014.001.05}AgreementFramework1Code"/>
 *         <element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:colr.014.001.05}GenericIdentification30"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementFramework1Choice", propOrder = {
    "agrmtFrmwk",
    "prtryId"
})
public class AgreementFramework1Choice {

    @XmlElement(name = "AgrmtFrmwk")
    @XmlSchemaType(name = "string")
    protected AgreementFramework1Code agrmtFrmwk;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification30 prtryId;

    /**
     * Gets the value of the agrmtFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementFramework1Code }
     *     
     */
    public AgreementFramework1Code getAgrmtFrmwk() {
        return agrmtFrmwk;
    }

    /**
     * Sets the value of the agrmtFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementFramework1Code }
     *     
     */
    public void setAgrmtFrmwk(AgreementFramework1Code value) {
        this.agrmtFrmwk = value;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setPrtryId(GenericIdentification30 value) {
        this.prtryId = value;
    }

}
