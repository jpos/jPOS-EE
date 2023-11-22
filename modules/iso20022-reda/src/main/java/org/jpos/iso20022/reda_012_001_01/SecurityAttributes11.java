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

package org.jpos.iso20022.reda_012_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityAttributes11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityAttributes11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}SecurityIdentification39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinInstrmTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}FinancialInstrument97" minOccurs="0"/>
 *         <element name="FinInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}CommonFinancialInstrumentAttributes11" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityAttributes11", propOrder = {
    "finInstrmId",
    "finInstrmTp",
    "finInstrmAttrbts"
})
public class SecurityAttributes11 {

    @XmlElement(name = "FinInstrmId")
    protected List<SecurityIdentification39> finInstrmId;
    @XmlElement(name = "FinInstrmTp")
    protected FinancialInstrument97 finInstrmTp;
    @XmlElement(name = "FinInstrmAttrbts")
    protected List<CommonFinancialInstrumentAttributes11> finInstrmAttrbts;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification39 }
     * 
     * 
     * @return
     *     The value of the finInstrmId property.
     */
    public List<SecurityIdentification39> getFinInstrmId() {
        if (finInstrmId == null) {
            finInstrmId = new ArrayList<>();
        }
        return this.finInstrmId;
    }

    /**
     * Gets the value of the finInstrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument97 }
     *     
     */
    public FinancialInstrument97 getFinInstrmTp() {
        return finInstrmTp;
    }

    /**
     * Sets the value of the finInstrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument97 }
     *     
     */
    public void setFinInstrmTp(FinancialInstrument97 value) {
        this.finInstrmTp = value;
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
     * {@link CommonFinancialInstrumentAttributes11 }
     * 
     * 
     * @return
     *     The value of the finInstrmAttrbts property.
     */
    public List<CommonFinancialInstrumentAttributes11> getFinInstrmAttrbts() {
        if (finInstrmAttrbts == null) {
            finInstrmAttrbts = new ArrayList<>();
        }
        return this.finInstrmAttrbts;
    }

}
