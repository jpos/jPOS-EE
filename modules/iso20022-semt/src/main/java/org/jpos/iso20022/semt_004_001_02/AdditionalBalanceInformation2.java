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

package org.jpos.iso20022.semt_004_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalBalanceInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalBalanceInformation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Qty" type="{urn:swift:xsd:semt.004.001.02}SubBalanceQuantity1Choice"/>
 *         <choice>
 *           <element name="SubBalTp" type="{urn:swift:xsd:semt.004.001.02}SecuritiesBalanceType2Code"/>
 *           <element name="XtndedSubBalTp" type="{urn:swift:xsd:semt.004.001.02}Extended350Code"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalBalanceInformation2", propOrder = {
    "qty",
    "subBalTp",
    "xtndedSubBalTp"
})
public class AdditionalBalanceInformation2 {

    @XmlElement(name = "Qty", required = true)
    protected SubBalanceQuantity1Choice qty;
    @XmlElement(name = "SubBalTp")
    @XmlSchemaType(name = "string")
    protected SecuritiesBalanceType2Code subBalTp;
    @XmlElement(name = "XtndedSubBalTp")
    protected String xtndedSubBalTp;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceQuantity1Choice }
     *     
     */
    public SubBalanceQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceQuantity1Choice }
     *     
     */
    public void setQty(SubBalanceQuantity1Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType2Code }
     *     
     */
    public SecuritiesBalanceType2Code getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType2Code }
     *     
     */
    public void setSubBalTp(SecuritiesBalanceType2Code value) {
        this.subBalTp = value;
    }

    /**
     * Gets the value of the xtndedSubBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedSubBalTp() {
        return xtndedSubBalTp;
    }

    /**
     * Sets the value of the xtndedSubBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtndedSubBalTp(String value) {
        this.xtndedSubBalTp = value;
    }

}
