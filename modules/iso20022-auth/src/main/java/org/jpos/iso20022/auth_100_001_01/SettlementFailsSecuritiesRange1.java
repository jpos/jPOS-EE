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

package org.jpos.iso20022.auth_100_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsSecuritiesRange1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsSecuritiesRange1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HghstInVol" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsSecurities1" maxOccurs="unbounded"/>
 *         <element name="HghstInVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsSecurities1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsSecuritiesRange1", propOrder = {
    "hghstInVol",
    "hghstInVal"
})
public class SettlementFailsSecuritiesRange1 {

    @XmlElement(name = "HghstInVol", required = true)
    protected List<SettlementFailsSecurities1> hghstInVol;
    @XmlElement(name = "HghstInVal", required = true)
    protected List<SettlementFailsSecurities1> hghstInVal;

    /**
     * Gets the value of the hghstInVol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hghstInVol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHghstInVol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementFailsSecurities1 }
     * 
     * 
     * @return
     *     The value of the hghstInVol property.
     */
    public List<SettlementFailsSecurities1> getHghstInVol() {
        if (hghstInVol == null) {
            hghstInVol = new ArrayList<>();
        }
        return this.hghstInVol;
    }

    /**
     * Gets the value of the hghstInVal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hghstInVal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHghstInVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementFailsSecurities1 }
     * 
     * 
     * @return
     *     The value of the hghstInVal property.
     */
    public List<SettlementFailsSecurities1> getHghstInVal() {
        if (hghstInVal == null) {
            hghstInVal = new ArrayList<>();
        }
        return this.hghstInVal;
    }

}
