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

package org.jpos.iso20022.auth_012_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuredCollateral2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuredCollateral2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SnglColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.012.001.02}CollateralValuation6"/>
 *         <element name="MltplColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.012.001.02}CollateralValuation6" maxOccurs="unbounded"/>
 *         <element name="PoolColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.012.001.02}CollateralValuation6"/>
 *         <element name="OthrColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.012.001.02}CollateralValuation7" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuredCollateral2Choice", propOrder = {
    "snglColl",
    "mltplColl",
    "poolColl",
    "othrColl"
})
public class SecuredCollateral2Choice {

    @XmlElement(name = "SnglColl")
    protected CollateralValuation6 snglColl;
    @XmlElement(name = "MltplColl")
    protected List<CollateralValuation6> mltplColl;
    @XmlElement(name = "PoolColl")
    protected CollateralValuation6 poolColl;
    @XmlElement(name = "OthrColl")
    protected List<CollateralValuation7> othrColl;

    /**
     * Gets the value of the snglColl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValuation6 }
     *     
     */
    public CollateralValuation6 getSnglColl() {
        return snglColl;
    }

    /**
     * Sets the value of the snglColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValuation6 }
     *     
     */
    public void setSnglColl(CollateralValuation6 value) {
        this.snglColl = value;
    }

    /**
     * Gets the value of the mltplColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mltplColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMltplColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralValuation6 }
     * 
     * 
     * @return
     *     The value of the mltplColl property.
     */
    public List<CollateralValuation6> getMltplColl() {
        if (mltplColl == null) {
            mltplColl = new ArrayList<>();
        }
        return this.mltplColl;
    }

    /**
     * Gets the value of the poolColl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValuation6 }
     *     
     */
    public CollateralValuation6 getPoolColl() {
        return poolColl;
    }

    /**
     * Sets the value of the poolColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValuation6 }
     *     
     */
    public void setPoolColl(CollateralValuation6 value) {
        this.poolColl = value;
    }

    /**
     * Gets the value of the othrColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralValuation7 }
     * 
     * 
     * @return
     *     The value of the othrColl property.
     */
    public List<CollateralValuation7> getOthrColl() {
        if (othrColl == null) {
            othrColl = new ArrayList<>();
        }
        return this.othrColl;
    }

}
