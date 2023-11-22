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

package org.jpos.iso20022.tsrv_002_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Trigger1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Trigger1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtChc" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}FixedOrRecurrentDate1Choice" minOccurs="0"/>
 *         <element name="DcmntryEvt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}Document10" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trigger1", propOrder = {
    "dtChc",
    "dcmntryEvt"
})
public class Trigger1 {

    @XmlElement(name = "DtChc")
    protected FixedOrRecurrentDate1Choice dtChc;
    @XmlElement(name = "DcmntryEvt")
    protected List<Document10> dcmntryEvt;

    /**
     * Gets the value of the dtChc property.
     * 
     * @return
     *     possible object is
     *     {@link FixedOrRecurrentDate1Choice }
     *     
     */
    public FixedOrRecurrentDate1Choice getDtChc() {
        return dtChc;
    }

    /**
     * Sets the value of the dtChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedOrRecurrentDate1Choice }
     *     
     */
    public void setDtChc(FixedOrRecurrentDate1Choice value) {
        this.dtChc = value;
    }

    /**
     * Gets the value of the dcmntryEvt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dcmntryEvt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDcmntryEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document10 }
     * 
     * 
     * @return
     *     The value of the dcmntryEvt property.
     */
    public List<Document10> getDcmntryEvt() {
        if (dcmntryEvt == null) {
            dcmntryEvt = new ArrayList<>();
        }
        return this.dcmntryEvt;
    }

}
