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

package org.jpos.iso20022.auth_079_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionCollateralData18Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionCollateralData18Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="RpTrad" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Collateral52"/>
 *         <element name="BuySellBck" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Collateral52"/>
 *         <element name="SctiesLndg" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}CollateralFlag13Choice"/>
 *         <element name="MrgnLndg" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Security55" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCollateralData18Choice", propOrder = {
    "rpTrad",
    "buySellBck",
    "sctiesLndg",
    "mrgnLndg"
})
public class TransactionCollateralData18Choice {

    @XmlElement(name = "RpTrad")
    protected Collateral52 rpTrad;
    @XmlElement(name = "BuySellBck")
    protected Collateral52 buySellBck;
    @XmlElement(name = "SctiesLndg")
    protected CollateralFlag13Choice sctiesLndg;
    @XmlElement(name = "MrgnLndg")
    protected List<Security55> mrgnLndg;

    /**
     * Gets the value of the rpTrad property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral52 }
     *     
     */
    public Collateral52 getRpTrad() {
        return rpTrad;
    }

    /**
     * Sets the value of the rpTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral52 }
     *     
     */
    public void setRpTrad(Collateral52 value) {
        this.rpTrad = value;
    }

    /**
     * Gets the value of the buySellBck property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral52 }
     *     
     */
    public Collateral52 getBuySellBck() {
        return buySellBck;
    }

    /**
     * Sets the value of the buySellBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral52 }
     *     
     */
    public void setBuySellBck(Collateral52 value) {
        this.buySellBck = value;
    }

    /**
     * Gets the value of the sctiesLndg property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralFlag13Choice }
     *     
     */
    public CollateralFlag13Choice getSctiesLndg() {
        return sctiesLndg;
    }

    /**
     * Sets the value of the sctiesLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralFlag13Choice }
     *     
     */
    public void setSctiesLndg(CollateralFlag13Choice value) {
        this.sctiesLndg = value;
    }

    /**
     * Gets the value of the mrgnLndg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrgnLndg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnLndg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Security55 }
     * 
     * 
     * @return
     *     The value of the mrgnLndg property.
     */
    public List<Security55> getMrgnLndg() {
        if (mrgnLndg == null) {
            mrgnLndg = new ArrayList<>();
        }
        return this.mrgnLndg;
    }

}
