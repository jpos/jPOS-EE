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
 * <p>Java class for LineItemAndPOIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LineItemAndPOIdentification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LineItmId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max70Text" maxOccurs="unbounded"/>
 *         <element name="PurchsOrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}DocumentIdentification7"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemAndPOIdentification1", propOrder = {
    "lineItmId",
    "purchsOrdrRef"
})
public class LineItemAndPOIdentification1 {

    @XmlElement(name = "LineItmId", required = true)
    protected List<String> lineItmId;
    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;

    /**
     * Gets the value of the lineItmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the lineItmId property.
     */
    public List<String> getLineItmId() {
        if (lineItmId == null) {
            lineItmId = new ArrayList<>();
        }
        return this.lineItmId;
    }

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public void setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
    }

}
