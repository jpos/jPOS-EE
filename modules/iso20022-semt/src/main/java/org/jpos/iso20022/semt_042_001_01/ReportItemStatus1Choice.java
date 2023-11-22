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

package org.jpos.iso20022.semt_042_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportItemStatus1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportItemStatus1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Accptd" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}NoReasonCode"/>
 *         <element name="AccptdWthXcptn" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}ReportItemStatus1" maxOccurs="unbounded"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}ReportItemStatus1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportItemStatus1Choice", propOrder = {
    "accptd",
    "accptdWthXcptn",
    "rjctd"
})
public class ReportItemStatus1Choice {

    @XmlElement(name = "Accptd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode accptd;
    @XmlElement(name = "AccptdWthXcptn")
    protected List<ReportItemStatus1> accptdWthXcptn;
    @XmlElement(name = "Rjctd")
    protected ReportItemStatus1 rjctd;

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setAccptd(NoReasonCode value) {
        this.accptd = value;
    }

    /**
     * Gets the value of the accptdWthXcptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the accptdWthXcptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccptdWthXcptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportItemStatus1 }
     * 
     * 
     * @return
     *     The value of the accptdWthXcptn property.
     */
    public List<ReportItemStatus1> getAccptdWthXcptn() {
        if (accptdWthXcptn == null) {
            accptdWthXcptn = new ArrayList<>();
        }
        return this.accptdWthXcptn;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportItemStatus1 }
     *     
     */
    public ReportItemStatus1 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportItemStatus1 }
     *     
     */
    public void setRjctd(ReportItemStatus1 value) {
        this.rjctd = value;
    }

}
