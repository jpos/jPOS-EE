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

package org.jpos.iso20022.setr_016_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status24Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Status24Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="OrdrDtlsRpt" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}OrderStatusAndReason10"/>
 *         <element name="IndvOrdrDtlsRpt" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}IndividualOrderStatusAndReason7" maxOccurs="unbounded"/>
 *         <element name="SwtchOrdrDtlsRpt" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}SwitchOrderStatusAndReason2" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status24Choice", propOrder = {
    "ordrDtlsRpt",
    "indvOrdrDtlsRpt",
    "swtchOrdrDtlsRpt"
})
public class Status24Choice {

    @XmlElement(name = "OrdrDtlsRpt")
    protected OrderStatusAndReason10 ordrDtlsRpt;
    @XmlElement(name = "IndvOrdrDtlsRpt")
    protected List<IndividualOrderStatusAndReason7> indvOrdrDtlsRpt;
    @XmlElement(name = "SwtchOrdrDtlsRpt")
    protected List<SwitchOrderStatusAndReason2> swtchOrdrDtlsRpt;

    /**
     * Gets the value of the ordrDtlsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusAndReason10 }
     *     
     */
    public OrderStatusAndReason10 getOrdrDtlsRpt() {
        return ordrDtlsRpt;
    }

    /**
     * Sets the value of the ordrDtlsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusAndReason10 }
     *     
     */
    public void setOrdrDtlsRpt(OrderStatusAndReason10 value) {
        this.ordrDtlsRpt = value;
    }

    /**
     * Gets the value of the indvOrdrDtlsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvOrdrDtlsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvOrdrDtlsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualOrderStatusAndReason7 }
     * 
     * 
     * @return
     *     The value of the indvOrdrDtlsRpt property.
     */
    public List<IndividualOrderStatusAndReason7> getIndvOrdrDtlsRpt() {
        if (indvOrdrDtlsRpt == null) {
            indvOrdrDtlsRpt = new ArrayList<>();
        }
        return this.indvOrdrDtlsRpt;
    }

    /**
     * Gets the value of the swtchOrdrDtlsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the swtchOrdrDtlsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwtchOrdrDtlsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchOrderStatusAndReason2 }
     * 
     * 
     * @return
     *     The value of the swtchOrdrDtlsRpt property.
     */
    public List<SwitchOrderStatusAndReason2> getSwtchOrdrDtlsRpt() {
        if (swtchOrdrDtlsRpt == null) {
            swtchOrdrDtlsRpt = new ArrayList<>();
        }
        return this.swtchOrdrDtlsRpt;
    }

}
