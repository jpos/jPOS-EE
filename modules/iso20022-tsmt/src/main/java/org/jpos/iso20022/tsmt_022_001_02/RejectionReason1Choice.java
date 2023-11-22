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

package org.jpos.iso20022.tsmt_022_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RejectionReason1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="GblRjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.022.001.02}Reason2"/>
 *         <element name="RjctdElmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.022.001.02}RejectedElement1" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionReason1Choice", propOrder = {
    "gblRjctnRsn",
    "rjctdElmt"
})
public class RejectionReason1Choice {

    @XmlElement(name = "GblRjctnRsn")
    protected Reason2 gblRjctnRsn;
    @XmlElement(name = "RjctdElmt")
    protected List<RejectedElement1> rjctdElmt;

    /**
     * Gets the value of the gblRjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link Reason2 }
     *     
     */
    public Reason2 getGblRjctnRsn() {
        return gblRjctnRsn;
    }

    /**
     * Sets the value of the gblRjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason2 }
     *     
     */
    public void setGblRjctnRsn(Reason2 value) {
        this.gblRjctnRsn = value;
    }

    /**
     * Gets the value of the rjctdElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctdElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctdElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectedElement1 }
     * 
     * 
     * @return
     *     The value of the rjctdElmt property.
     */
    public List<RejectedElement1> getRjctdElmt() {
        if (rjctdElmt == null) {
            rjctdElmt = new ArrayList<>();
        }
        return this.rjctdElmt;
    }

}
