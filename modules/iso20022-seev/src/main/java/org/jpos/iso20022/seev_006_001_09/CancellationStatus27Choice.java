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

package org.jpos.iso20022.seev_006_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationStatus27Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CancellationStatus27Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="GblCxlSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}CancellationStatus26Choice"/>
 *         <element name="DtldCxlSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}DetailedInstructionCancellationStatus14" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationStatus27Choice", propOrder = {
    "gblCxlSts",
    "dtldCxlSts"
})
public class CancellationStatus27Choice {

    @XmlElement(name = "GblCxlSts")
    protected CancellationStatus26Choice gblCxlSts;
    @XmlElement(name = "DtldCxlSts")
    protected List<DetailedInstructionCancellationStatus14> dtldCxlSts;

    /**
     * Gets the value of the gblCxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus26Choice }
     *     
     */
    public CancellationStatus26Choice getGblCxlSts() {
        return gblCxlSts;
    }

    /**
     * Sets the value of the gblCxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus26Choice }
     *     
     */
    public void setGblCxlSts(CancellationStatus26Choice value) {
        this.gblCxlSts = value;
    }

    /**
     * Gets the value of the dtldCxlSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtldCxlSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldCxlSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionCancellationStatus14 }
     * 
     * 
     * @return
     *     The value of the dtldCxlSts property.
     */
    public List<DetailedInstructionCancellationStatus14> getDtldCxlSts() {
        if (dtldCxlSts == null) {
            dtldCxlSts = new ArrayList<>();
        }
        return this.dtldCxlSts;
    }

}
