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

package org.jpos.iso20022.secl_005_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariationMargin3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VariationMargin3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}SecurityIdentification14" minOccurs="0"/>
 *         <element name="TtlVartnMrgn" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}TotalVariationMargin1" maxOccurs="unbounded"/>
 *         <element name="TtlMrkToMkt" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}Amount2"/>
 *         <element name="MrkToMktNetd" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}Amount2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MrkToMktGrss" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}Amount2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MrkToMktFls" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}Amount2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FlsHrcut" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}Amount2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariationMargin3", propOrder = {
    "finInstrmId",
    "ttlVartnMrgn",
    "ttlMrkToMkt",
    "mrkToMktNetd",
    "mrkToMktGrss",
    "mrkToMktFls",
    "flsHrcut"
})
public class VariationMargin3 {

    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "TtlVartnMrgn", required = true)
    protected List<TotalVariationMargin1> ttlVartnMrgn;
    @XmlElement(name = "TtlMrkToMkt", required = true)
    protected Amount2 ttlMrkToMkt;
    @XmlElement(name = "MrkToMktNetd")
    protected List<Amount2> mrkToMktNetd;
    @XmlElement(name = "MrkToMktGrss")
    protected List<Amount2> mrkToMktGrss;
    @XmlElement(name = "MrkToMktFls")
    protected List<Amount2> mrkToMktFls;
    @XmlElement(name = "FlsHrcut")
    protected Amount2 flsHrcut;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the ttlVartnMrgn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlVartnMrgn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlVartnMrgn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalVariationMargin1 }
     * 
     * 
     * @return
     *     The value of the ttlVartnMrgn property.
     */
    public List<TotalVariationMargin1> getTtlVartnMrgn() {
        if (ttlVartnMrgn == null) {
            ttlVartnMrgn = new ArrayList<>();
        }
        return this.ttlVartnMrgn;
    }

    /**
     * Gets the value of the ttlMrkToMkt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2 }
     *     
     */
    public Amount2 getTtlMrkToMkt() {
        return ttlMrkToMkt;
    }

    /**
     * Sets the value of the ttlMrkToMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2 }
     *     
     */
    public void setTtlMrkToMkt(Amount2 value) {
        this.ttlMrkToMkt = value;
    }

    /**
     * Gets the value of the mrkToMktNetd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrkToMktNetd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrkToMktNetd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount2 }
     * 
     * 
     * @return
     *     The value of the mrkToMktNetd property.
     */
    public List<Amount2> getMrkToMktNetd() {
        if (mrkToMktNetd == null) {
            mrkToMktNetd = new ArrayList<>();
        }
        return this.mrkToMktNetd;
    }

    /**
     * Gets the value of the mrkToMktGrss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrkToMktGrss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrkToMktGrss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount2 }
     * 
     * 
     * @return
     *     The value of the mrkToMktGrss property.
     */
    public List<Amount2> getMrkToMktGrss() {
        if (mrkToMktGrss == null) {
            mrkToMktGrss = new ArrayList<>();
        }
        return this.mrkToMktGrss;
    }

    /**
     * Gets the value of the mrkToMktFls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrkToMktFls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrkToMktFls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount2 }
     * 
     * 
     * @return
     *     The value of the mrkToMktFls property.
     */
    public List<Amount2> getMrkToMktFls() {
        if (mrkToMktFls == null) {
            mrkToMktFls = new ArrayList<>();
        }
        return this.mrkToMktFls;
    }

    /**
     * Gets the value of the flsHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2 }
     *     
     */
    public Amount2 getFlsHrcut() {
        return flsHrcut;
    }

    /**
     * Sets the value of the flsHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2 }
     *     
     */
    public void setFlsHrcut(Amount2 value) {
        this.flsHrcut = value;
    }

}
