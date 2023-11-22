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

package org.jpos.iso20022.semt_016_002_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraPositionDetails63 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraPositionDetails63">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:semt.016.002.09}SafekeepingPlaceFormat39Choice" minOccurs="0"/>
 *         <element name="BalFr" type="{urn:iso:std:iso:20022:tech:xsd:semt.016.002.09}SecuritiesBalanceType8Choice"/>
 *         <element name="IntraPosMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:semt.016.002.09}IntraPositionMovementDetails20" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionDetails63", propOrder = {
    "sfkpgPlc",
    "balFr",
    "intraPosMvmnt"
})
public class IntraPositionDetails63 {

    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat39Choice sfkpgPlc;
    @XmlElement(name = "BalFr", required = true)
    protected SecuritiesBalanceType8Choice balFr;
    @XmlElement(name = "IntraPosMvmnt", required = true)
    protected List<IntraPositionMovementDetails20> intraPosMvmnt;

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat39Choice }
     *     
     */
    public SafekeepingPlaceFormat39Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat39Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat39Choice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType8Choice }
     *     
     */
    public SecuritiesBalanceType8Choice getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType8Choice }
     *     
     */
    public void setBalFr(SecuritiesBalanceType8Choice value) {
        this.balFr = value;
    }

    /**
     * Gets the value of the intraPosMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intraPosMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntraPosMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraPositionMovementDetails20 }
     * 
     * 
     * @return
     *     The value of the intraPosMvmnt property.
     */
    public List<IntraPositionMovementDetails20> getIntraPosMvmnt() {
        if (intraPosMvmnt == null) {
            intraPosMvmnt = new ArrayList<>();
        }
        return this.intraPosMvmnt;
    }

}
