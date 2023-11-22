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

package org.jpos.iso20022.setr_058_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageAndBusinessReference10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MessageAndBusinessReference10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}References62Choice" minOccurs="0"/>
 *         <element name="RltdRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}AdditionalReference8" minOccurs="0"/>
 *         <element name="OrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}InvestmentFundOrder8" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageAndBusinessReference10", propOrder = {
    "ref",
    "rltdRef",
    "ordrRef"
})
public class MessageAndBusinessReference10 {

    @XmlElement(name = "Ref")
    protected References62Choice ref;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference8 rltdRef;
    @XmlElement(name = "OrdrRef")
    protected List<InvestmentFundOrder8> ordrRef;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References62Choice }
     *     
     */
    public References62Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References62Choice }
     *     
     */
    public void setRef(References62Choice value) {
        this.ref = value;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference8 }
     *     
     */
    public AdditionalReference8 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference8 }
     *     
     */
    public void setRltdRef(AdditionalReference8 value) {
        this.rltdRef = value;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ordrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundOrder8 }
     * 
     * 
     * @return
     *     The value of the ordrRef property.
     */
    public List<InvestmentFundOrder8> getOrdrRef() {
        if (ordrRef == null) {
            ordrRef = new ArrayList<>();
        }
        return this.ordrRef;
    }

}
