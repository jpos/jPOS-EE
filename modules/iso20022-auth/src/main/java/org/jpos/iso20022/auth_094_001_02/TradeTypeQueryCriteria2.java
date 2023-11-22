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

package org.jpos.iso20022.auth_094_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTypeQueryCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeTypeQueryCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Oprtr" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}Operation3Code"/>
 *         <element name="SctiesFincgTxTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}ExposureType10Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CollCmpntTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}CollateralType6Code" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTypeQueryCriteria2", propOrder = {
    "oprtr",
    "sctiesFincgTxTp",
    "collCmpntTp"
})
public class TradeTypeQueryCriteria2 {

    @XmlElement(name = "Oprtr", required = true)
    @XmlSchemaType(name = "string")
    protected Operation3Code oprtr;
    @XmlElement(name = "SctiesFincgTxTp")
    @XmlSchemaType(name = "string")
    protected List<ExposureType10Code> sctiesFincgTxTp;
    @XmlElement(name = "CollCmpntTp")
    @XmlSchemaType(name = "string")
    protected List<CollateralType6Code> collCmpntTp;

    /**
     * Gets the value of the oprtr property.
     * 
     * @return
     *     possible object is
     *     {@link Operation3Code }
     *     
     */
    public Operation3Code getOprtr() {
        return oprtr;
    }

    /**
     * Sets the value of the oprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation3Code }
     *     
     */
    public void setOprtr(Operation3Code value) {
        this.oprtr = value;
    }

    /**
     * Gets the value of the sctiesFincgTxTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesFincgTxTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesFincgTxTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposureType10Code }
     * 
     * 
     * @return
     *     The value of the sctiesFincgTxTp property.
     */
    public List<ExposureType10Code> getSctiesFincgTxTp() {
        if (sctiesFincgTxTp == null) {
            sctiesFincgTxTp = new ArrayList<>();
        }
        return this.sctiesFincgTxTp;
    }

    /**
     * Gets the value of the collCmpntTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collCmpntTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollCmpntTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralType6Code }
     * 
     * 
     * @return
     *     The value of the collCmpntTp property.
     */
    public List<CollateralType6Code> getCollCmpntTp() {
        if (collCmpntTp == null) {
            collCmpntTp = new ArrayList<>();
        }
        return this.collCmpntTp;
    }

}
