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

package org.jpos.iso20022.colr_002_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralValueReportOrError5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralValueReportOrError5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="BizRpt" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}CollateralValueReport3" maxOccurs="unbounded"/>
 *         <element name="OprlErr" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}ErrorHandling5" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueReportOrError5Choice", propOrder = {
    "bizRpt",
    "oprlErr"
})
public class CollateralValueReportOrError5Choice {

    @XmlElement(name = "BizRpt")
    protected List<CollateralValueReport3> bizRpt;
    @XmlElement(name = "OprlErr")
    protected List<ErrorHandling5> oprlErr;

    /**
     * Gets the value of the bizRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bizRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralValueReport3 }
     * 
     * 
     * @return
     *     The value of the bizRpt property.
     */
    public List<CollateralValueReport3> getBizRpt() {
        if (bizRpt == null) {
            bizRpt = new ArrayList<>();
        }
        return this.bizRpt;
    }

    /**
     * Gets the value of the oprlErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the oprlErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOprlErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling5 }
     * 
     * 
     * @return
     *     The value of the oprlErr property.
     */
    public List<ErrorHandling5> getOprlErr() {
        if (oprlErr == null) {
            oprlErr = new ArrayList<>();
        }
        return this.oprlErr;
    }

}
