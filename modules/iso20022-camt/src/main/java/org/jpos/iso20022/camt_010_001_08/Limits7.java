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

package org.jpos.iso20022.camt_010_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Limits7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Limits7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CurLmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}LimitReport7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DfltLmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}LimitReport7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Limits7", propOrder = {
    "curLmt",
    "dfltLmt"
})
public class Limits7 {

    @XmlElement(name = "CurLmt")
    protected List<LimitReport7> curLmt;
    @XmlElement(name = "DfltLmt")
    protected List<LimitReport7> dfltLmt;

    /**
     * Gets the value of the curLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the curLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitReport7 }
     * 
     * 
     * @return
     *     The value of the curLmt property.
     */
    public List<LimitReport7> getCurLmt() {
        if (curLmt == null) {
            curLmt = new ArrayList<>();
        }
        return this.curLmt;
    }

    /**
     * Gets the value of the dfltLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dfltLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitReport7 }
     * 
     * 
     * @return
     *     The value of the dfltLmt property.
     */
    public List<LimitReport7> getDfltLmt() {
        if (dfltLmt == null) {
            dfltLmt = new ArrayList<>();
        }
        return this.dfltLmt;
    }

}
