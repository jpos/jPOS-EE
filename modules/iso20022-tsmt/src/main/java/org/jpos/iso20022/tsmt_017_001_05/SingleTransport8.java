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

package org.jpos.iso20022.tsmt_017_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SingleTransport8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SingleTransport8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrnsprtByAir" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}TransportByAir4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TrnsprtBySea" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}TransportBySea5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TrnsprtByRoad" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}TransportByRoad4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TrnsprtByRail" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}TransportByRail4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleTransport8", propOrder = {
    "trnsprtByAir",
    "trnsprtBySea",
    "trnsprtByRoad",
    "trnsprtByRail"
})
public class SingleTransport8 {

    @XmlElement(name = "TrnsprtByAir")
    protected List<TransportByAir4> trnsprtByAir;
    @XmlElement(name = "TrnsprtBySea")
    protected List<TransportBySea5> trnsprtBySea;
    @XmlElement(name = "TrnsprtByRoad")
    protected List<TransportByRoad4> trnsprtByRoad;
    @XmlElement(name = "TrnsprtByRail")
    protected List<TransportByRail4> trnsprtByRail;

    /**
     * Gets the value of the trnsprtByAir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtByAir property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtByAir().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportByAir4 }
     * 
     * 
     * @return
     *     The value of the trnsprtByAir property.
     */
    public List<TransportByAir4> getTrnsprtByAir() {
        if (trnsprtByAir == null) {
            trnsprtByAir = new ArrayList<>();
        }
        return this.trnsprtByAir;
    }

    /**
     * Gets the value of the trnsprtBySea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtBySea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtBySea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportBySea5 }
     * 
     * 
     * @return
     *     The value of the trnsprtBySea property.
     */
    public List<TransportBySea5> getTrnsprtBySea() {
        if (trnsprtBySea == null) {
            trnsprtBySea = new ArrayList<>();
        }
        return this.trnsprtBySea;
    }

    /**
     * Gets the value of the trnsprtByRoad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtByRoad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtByRoad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportByRoad4 }
     * 
     * 
     * @return
     *     The value of the trnsprtByRoad property.
     */
    public List<TransportByRoad4> getTrnsprtByRoad() {
        if (trnsprtByRoad == null) {
            trnsprtByRoad = new ArrayList<>();
        }
        return this.trnsprtByRoad;
    }

    /**
     * Gets the value of the trnsprtByRail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtByRail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtByRail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportByRail4 }
     * 
     * 
     * @return
     *     The value of the trnsprtByRail property.
     */
    public List<TransportByRail4> getTrnsprtByRail() {
        if (trnsprtByRail == null) {
            trnsprtByRail = new ArrayList<>();
        }
        return this.trnsprtByRail;
    }

}
