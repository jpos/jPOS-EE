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

package org.jpos.iso20022.pacs_002_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateRelatedData2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MandateRelatedData2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DrctDbtMndt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.13}MandateRelatedInformation15" minOccurs="0"/>
 *         <element name="CdtTrfMndt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.13}CreditTransferMandateData1" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateRelatedData2Choice", propOrder = {
    "drctDbtMndt",
    "cdtTrfMndt"
})
public class MandateRelatedData2Choice {

    @XmlElement(name = "DrctDbtMndt")
    protected MandateRelatedInformation15 drctDbtMndt;
    @XmlElement(name = "CdtTrfMndt")
    protected CreditTransferMandateData1 cdtTrfMndt;

    /**
     * Gets the value of the drctDbtMndt property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation15 }
     *     
     */
    public MandateRelatedInformation15 getDrctDbtMndt() {
        return drctDbtMndt;
    }

    /**
     * Sets the value of the drctDbtMndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation15 }
     *     
     */
    public void setDrctDbtMndt(MandateRelatedInformation15 value) {
        this.drctDbtMndt = value;
    }

    /**
     * Gets the value of the cdtTrfMndt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public CreditTransferMandateData1 getCdtTrfMndt() {
        return cdtTrfMndt;
    }

    /**
     * Sets the value of the cdtTrfMndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public void setCdtTrfMndt(CreditTransferMandateData1 value) {
        this.cdtTrfMndt = value;
    }

}
