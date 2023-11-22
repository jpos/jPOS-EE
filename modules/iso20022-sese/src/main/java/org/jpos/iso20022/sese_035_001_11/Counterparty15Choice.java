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

package org.jpos.iso20022.sese_035_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Counterparty15Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Counterparty15Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}PartyIdentificationAndAccount196"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}PartyIdentificationAndAccount196"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Counterparty15Choice", propOrder = {
    "sellr",
    "buyr"
})
public class Counterparty15Choice {

    @XmlElement(name = "Sellr")
    protected PartyIdentificationAndAccount196 sellr;
    @XmlElement(name = "Buyr")
    protected PartyIdentificationAndAccount196 buyr;

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public PartyIdentificationAndAccount196 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public void setSellr(PartyIdentificationAndAccount196 value) {
        this.sellr = value;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public PartyIdentificationAndAccount196 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount196 }
     *     
     */
    public void setBuyr(PartyIdentificationAndAccount196 value) {
        this.buyr = value;
    }

}
