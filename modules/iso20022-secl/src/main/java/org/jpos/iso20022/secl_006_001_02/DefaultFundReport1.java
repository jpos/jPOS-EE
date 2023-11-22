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

package org.jpos.iso20022.secl_006_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultFundReport1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DefaultFundReport1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DfltFndClctn" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}DefaultFund1" maxOccurs="unbounded"/>
 *         <element name="CollDesc" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}Collateral3" maxOccurs="unbounded"/>
 *         <element name="NetXcssOrDfcit" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}AmountAndDirection21"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultFundReport1", propOrder = {
    "dfltFndClctn",
    "collDesc",
    "netXcssOrDfcit"
})
public class DefaultFundReport1 {

    @XmlElement(name = "DfltFndClctn", required = true)
    protected List<DefaultFund1> dfltFndClctn;
    @XmlElement(name = "CollDesc", required = true)
    protected List<Collateral3> collDesc;
    @XmlElement(name = "NetXcssOrDfcit", required = true)
    protected AmountAndDirection21 netXcssOrDfcit;

    /**
     * Gets the value of the dfltFndClctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dfltFndClctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltFndClctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultFund1 }
     * 
     * 
     * @return
     *     The value of the dfltFndClctn property.
     */
    public List<DefaultFund1> getDfltFndClctn() {
        if (dfltFndClctn == null) {
            dfltFndClctn = new ArrayList<>();
        }
        return this.dfltFndClctn;
    }

    /**
     * Gets the value of the collDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collateral3 }
     * 
     * 
     * @return
     *     The value of the collDesc property.
     */
    public List<Collateral3> getCollDesc() {
        if (collDesc == null) {
            collDesc = new ArrayList<>();
        }
        return this.collDesc;
    }

    /**
     * Gets the value of the netXcssOrDfcit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getNetXcssOrDfcit() {
        return netXcssOrDfcit;
    }

    /**
     * Sets the value of the netXcssOrDfcit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setNetXcssOrDfcit(AmountAndDirection21 value) {
        this.netXcssOrDfcit = value;
    }

}
