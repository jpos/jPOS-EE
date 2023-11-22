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

package org.jpos.iso20022.reda_006_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityAttributes10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityAttributes10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}SecurityIdentification39"/>
 *         <element name="FinInstrmTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}FinancialInstrument97" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}CommonFinancialInstrumentAttributes10" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityAttributes10", propOrder = {
    "finInstrmId",
    "finInstrmTp",
    "finInstrmAttrbts"
})
public class SecurityAttributes10 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification39 finInstrmId;
    @XmlElement(name = "FinInstrmTp")
    protected List<FinancialInstrument97> finInstrmTp;
    @XmlElement(name = "FinInstrmAttrbts")
    protected List<CommonFinancialInstrumentAttributes10> finInstrmAttrbts;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification39 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the finInstrmTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument97 }
     * 
     * 
     * @return
     *     The value of the finInstrmTp property.
     */
    public List<FinancialInstrument97> getFinInstrmTp() {
        if (finInstrmTp == null) {
            finInstrmTp = new ArrayList<>();
        }
        return this.finInstrmTp;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonFinancialInstrumentAttributes10 }
     * 
     * 
     * @return
     *     The value of the finInstrmAttrbts property.
     */
    public List<CommonFinancialInstrumentAttributes10> getFinInstrmAttrbts() {
        if (finInstrmAttrbts == null) {
            finInstrmAttrbts = new ArrayList<>();
        }
        return this.finInstrmAttrbts;
    }

}
