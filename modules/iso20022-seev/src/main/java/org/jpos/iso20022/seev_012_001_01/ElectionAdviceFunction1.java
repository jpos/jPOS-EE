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

package org.jpos.iso20022.seev_012_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectionAdviceFunction1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ElectionAdviceFunction1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ElctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}ElectionType1Code"/>
 *         <element name="PrvsAgtCAElctnAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}DocumentIdentification8" minOccurs="0"/>
 *         <element name="AgtCAElctnStsAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}DocumentIdentification8" minOccurs="0"/>
 *         <element name="AgtCAElctnAmdmntReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}DocumentIdentification8" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectionAdviceFunction1", propOrder = {
    "elctnTp",
    "prvsAgtCAElctnAdvcId",
    "agtCAElctnStsAdvcId",
    "agtCAElctnAmdmntReqId"
})
public class ElectionAdviceFunction1 {

    @XmlElement(name = "ElctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ElectionType1Code elctnTp;
    @XmlElement(name = "PrvsAgtCAElctnAdvcId")
    protected DocumentIdentification8 prvsAgtCAElctnAdvcId;
    @XmlElement(name = "AgtCAElctnStsAdvcId")
    protected DocumentIdentification8 agtCAElctnStsAdvcId;
    @XmlElement(name = "AgtCAElctnAmdmntReqId")
    protected DocumentIdentification8 agtCAElctnAmdmntReqId;

    /**
     * Gets the value of the elctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionType1Code }
     *     
     */
    public ElectionType1Code getElctnTp() {
        return elctnTp;
    }

    /**
     * Sets the value of the elctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionType1Code }
     *     
     */
    public void setElctnTp(ElectionType1Code value) {
        this.elctnTp = value;
    }

    /**
     * Gets the value of the prvsAgtCAElctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getPrvsAgtCAElctnAdvcId() {
        return prvsAgtCAElctnAdvcId;
    }

    /**
     * Sets the value of the prvsAgtCAElctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setPrvsAgtCAElctnAdvcId(DocumentIdentification8 value) {
        this.prvsAgtCAElctnAdvcId = value;
    }

    /**
     * Gets the value of the agtCAElctnStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnStsAdvcId() {
        return agtCAElctnStsAdvcId;
    }

    /**
     * Sets the value of the agtCAElctnStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAElctnStsAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnStsAdvcId = value;
    }

    /**
     * Gets the value of the agtCAElctnAmdmntReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnAmdmntReqId() {
        return agtCAElctnAmdmntReqId;
    }

    /**
     * Sets the value of the agtCAElctnAmdmntReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAElctnAmdmntReqId(DocumentIdentification8 value) {
        this.agtCAElctnAmdmntReqId = value;
    }

}
