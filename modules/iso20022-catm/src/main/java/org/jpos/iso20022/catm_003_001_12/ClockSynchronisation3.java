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

package org.jpos.iso20022.catm_003_001_12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockSynchronisation3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClockSynchronisation3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="POITmZone" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max70Text"/>
 *         <element name="SynctnSvr" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}NetworkParameters7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Dely" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}ISOTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClockSynchronisation3", propOrder = {
    "poiTmZone",
    "synctnSvr",
    "dely"
})
public class ClockSynchronisation3 {

    @XmlElement(name = "POITmZone", required = true)
    protected String poiTmZone;
    @XmlElement(name = "SynctnSvr")
    protected List<NetworkParameters7> synctnSvr;
    @XmlElement(name = "Dely")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dely;

    /**
     * Gets the value of the poiTmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOITmZone() {
        return poiTmZone;
    }

    /**
     * Sets the value of the poiTmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOITmZone(String value) {
        this.poiTmZone = value;
    }

    /**
     * Gets the value of the synctnSvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the synctnSvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynctnSvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkParameters7 }
     * 
     * 
     * @return
     *     The value of the synctnSvr property.
     */
    public List<NetworkParameters7> getSynctnSvr() {
        if (synctnSvr == null) {
            synctnSvr = new ArrayList<>();
        }
        return this.synctnSvr;
    }

    /**
     * Gets the value of the dely property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDely() {
        return dely;
    }

    /**
     * Sets the value of the dely property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDely(XMLGregorianCalendar value) {
        this.dely = value;
    }

}
