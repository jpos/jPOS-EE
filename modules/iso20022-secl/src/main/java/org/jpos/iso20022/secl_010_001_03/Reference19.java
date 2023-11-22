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

package org.jpos.iso20022.secl_010_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reference19 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Reference19">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradLegNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NetPosId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference19", propOrder = {
    "tradLegNtfctnId",
    "netPosId"
})
public class Reference19 {

    @XmlElement(name = "TradLegNtfctnId")
    protected List<String> tradLegNtfctnId;
    @XmlElement(name = "NetPosId")
    protected String netPosId;

    /**
     * Gets the value of the tradLegNtfctnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradLegNtfctnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradLegNtfctnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the tradLegNtfctnId property.
     */
    public List<String> getTradLegNtfctnId() {
        if (tradLegNtfctnId == null) {
            tradLegNtfctnId = new ArrayList<>();
        }
        return this.tradLegNtfctnId;
    }

    /**
     * Gets the value of the netPosId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPosId() {
        return netPosId;
    }

    /**
     * Sets the value of the netPosId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPosId(String value) {
        this.netPosId = value;
    }

}
