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

package org.jpos.iso20022.colr_008_001_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralResponse3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralResponse3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesCollRspn" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}SecuritiesCollateralResponse2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshCollRspn" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}CashCollateralResponse3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrCollRspn" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}OtherCollateralResponse3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralResponse3", propOrder = {
    "sctiesCollRspn",
    "cshCollRspn",
    "othrCollRspn"
})
public class CollateralResponse3 {

    @XmlElement(name = "SctiesCollRspn")
    protected List<SecuritiesCollateralResponse2> sctiesCollRspn;
    @XmlElement(name = "CshCollRspn")
    protected List<CashCollateralResponse3> cshCollRspn;
    @XmlElement(name = "OthrCollRspn")
    protected List<OtherCollateralResponse3> othrCollRspn;

    /**
     * Gets the value of the sctiesCollRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesCollRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesCollRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesCollateralResponse2 }
     * 
     * 
     * @return
     *     The value of the sctiesCollRspn property.
     */
    public List<SecuritiesCollateralResponse2> getSctiesCollRspn() {
        if (sctiesCollRspn == null) {
            sctiesCollRspn = new ArrayList<>();
        }
        return this.sctiesCollRspn;
    }

    /**
     * Gets the value of the cshCollRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshCollRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshCollRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashCollateralResponse3 }
     * 
     * 
     * @return
     *     The value of the cshCollRspn property.
     */
    public List<CashCollateralResponse3> getCshCollRspn() {
        if (cshCollRspn == null) {
            cshCollRspn = new ArrayList<>();
        }
        return this.cshCollRspn;
    }

    /**
     * Gets the value of the othrCollRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrCollRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCollRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherCollateralResponse3 }
     * 
     * 
     * @return
     *     The value of the othrCollRspn property.
     */
    public List<OtherCollateralResponse3> getOthrCollRspn() {
        if (othrCollRspn == null) {
            othrCollRspn = new ArrayList<>();
        }
        return this.othrCollRspn;
    }

}
