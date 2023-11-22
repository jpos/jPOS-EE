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

package org.jpos.iso20022.reda_006_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Warrant4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Warrant4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mltplr" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}BaseOneRate" minOccurs="0"/>
 *         <element name="SbcptPric" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Price8" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}WarrantStyle3Choice" minOccurs="0"/>
 *         <element name="WarrtAgt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Organisation38" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Warrant4", propOrder = {
    "mltplr",
    "sbcptPric",
    "tp",
    "warrtAgt"
})
public class Warrant4 {

    @XmlElement(name = "Mltplr")
    protected BigDecimal mltplr;
    @XmlElement(name = "SbcptPric")
    protected Price8 sbcptPric;
    @XmlElement(name = "Tp")
    protected WarrantStyle3Choice tp;
    @XmlElement(name = "WarrtAgt")
    protected List<Organisation38> warrtAgt;

    /**
     * Gets the value of the mltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMltplr() {
        return mltplr;
    }

    /**
     * Sets the value of the mltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMltplr(BigDecimal value) {
        this.mltplr = value;
    }

    /**
     * Gets the value of the sbcptPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price8 }
     *     
     */
    public Price8 getSbcptPric() {
        return sbcptPric;
    }

    /**
     * Sets the value of the sbcptPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price8 }
     *     
     */
    public void setSbcptPric(Price8 value) {
        this.sbcptPric = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantStyle3Choice }
     *     
     */
    public WarrantStyle3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantStyle3Choice }
     *     
     */
    public void setTp(WarrantStyle3Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the warrtAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the warrtAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrtAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation38 }
     * 
     * 
     * @return
     *     The value of the warrtAgt property.
     */
    public List<Organisation38> getWarrtAgt() {
        if (warrtAgt == null) {
            warrtAgt = new ArrayList<>();
        }
        return this.warrtAgt;
    }

}
