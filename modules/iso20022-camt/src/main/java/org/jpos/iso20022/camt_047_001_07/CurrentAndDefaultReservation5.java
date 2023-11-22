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

package org.jpos.iso20022.camt_047_001_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentAndDefaultReservation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrentAndDefaultReservation5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CurRsvatn" type="{urn:iso:std:iso:20022:tech:xsd:camt.047.001.07}ReservationReport7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DfltRsvatn" type="{urn:iso:std:iso:20022:tech:xsd:camt.047.001.07}ReservationReport7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentAndDefaultReservation5", propOrder = {
    "curRsvatn",
    "dfltRsvatn"
})
public class CurrentAndDefaultReservation5 {

    @XmlElement(name = "CurRsvatn")
    protected List<ReservationReport7> curRsvatn;
    @XmlElement(name = "DfltRsvatn")
    protected List<ReservationReport7> dfltRsvatn;

    /**
     * Gets the value of the curRsvatn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the curRsvatn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurRsvatn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationReport7 }
     * 
     * 
     * @return
     *     The value of the curRsvatn property.
     */
    public List<ReservationReport7> getCurRsvatn() {
        if (curRsvatn == null) {
            curRsvatn = new ArrayList<>();
        }
        return this.curRsvatn;
    }

    /**
     * Gets the value of the dfltRsvatn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dfltRsvatn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltRsvatn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationReport7 }
     * 
     * 
     * @return
     *     The value of the dfltRsvatn property.
     */
    public List<ReservationReport7> getDfltRsvatn() {
        if (dfltRsvatn == null) {
            dfltRsvatn = new ArrayList<>();
        }
        return this.dfltRsvatn;
    }

}
