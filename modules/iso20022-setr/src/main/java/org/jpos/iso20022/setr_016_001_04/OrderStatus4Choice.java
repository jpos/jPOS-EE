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

package org.jpos.iso20022.setr_016_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OrderStatus4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}OrderStatus4Code"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}CancelledStatusReason16"/>
 *         <element name="CondlyAccptd" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}ConditionallyAcceptedStatus3Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}RejectedStatus9" maxOccurs="10"/>
 *         <element name="Sspd" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}SuspendedStatusReason4Choice"/>
 *         <element name="InRpr" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}InRepairStatusReason4Choice"/>
 *         <element name="PrtlySttld" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}PartiallySettledStatus10"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatus4Choice", propOrder = {
    "sts",
    "canc",
    "condlyAccptd",
    "rjctd",
    "sspd",
    "inRpr",
    "prtlySttld"
})
public class OrderStatus4Choice {

    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected OrderStatus4Code sts;
    @XmlElement(name = "Canc")
    protected CancelledStatusReason16 canc;
    @XmlElement(name = "CondlyAccptd")
    protected ConditionallyAcceptedStatus3Choice condlyAccptd;
    @XmlElement(name = "Rjctd")
    protected List<RejectedStatus9> rjctd;
    @XmlElement(name = "Sspd")
    protected SuspendedStatusReason4Choice sspd;
    @XmlElement(name = "InRpr")
    protected InRepairStatusReason4Choice inRpr;
    @XmlElement(name = "PrtlySttld")
    protected PartiallySettledStatus10 prtlySttld;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus4Code }
     *     
     */
    public OrderStatus4Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus4Code }
     *     
     */
    public void setSts(OrderStatus4Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatusReason16 }
     *     
     */
    public CancelledStatusReason16 getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatusReason16 }
     *     
     */
    public void setCanc(CancelledStatusReason16 value) {
        this.canc = value;
    }

    /**
     * Gets the value of the condlyAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionallyAcceptedStatus3Choice }
     *     
     */
    public ConditionallyAcceptedStatus3Choice getCondlyAccptd() {
        return condlyAccptd;
    }

    /**
     * Sets the value of the condlyAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionallyAcceptedStatus3Choice }
     *     
     */
    public void setCondlyAccptd(ConditionallyAcceptedStatus3Choice value) {
        this.condlyAccptd = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectedStatus9 }
     * 
     * 
     * @return
     *     The value of the rjctd property.
     */
    public List<RejectedStatus9> getRjctd() {
        if (rjctd == null) {
            rjctd = new ArrayList<>();
        }
        return this.rjctd;
    }

    /**
     * Gets the value of the sspd property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendedStatusReason4Choice }
     *     
     */
    public SuspendedStatusReason4Choice getSspd() {
        return sspd;
    }

    /**
     * Sets the value of the sspd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendedStatusReason4Choice }
     *     
     */
    public void setSspd(SuspendedStatusReason4Choice value) {
        this.sspd = value;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link InRepairStatusReason4Choice }
     *     
     */
    public InRepairStatusReason4Choice getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InRepairStatusReason4Choice }
     *     
     */
    public void setInRpr(InRepairStatusReason4Choice value) {
        this.inRpr = value;
    }

    /**
     * Gets the value of the prtlySttld property.
     * 
     * @return
     *     possible object is
     *     {@link PartiallySettledStatus10 }
     *     
     */
    public PartiallySettledStatus10 getPrtlySttld() {
        return prtlySttld;
    }

    /**
     * Sets the value of the prtlySttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartiallySettledStatus10 }
     *     
     */
    public void setPrtlySttld(PartiallySettledStatus10 value) {
        this.prtlySttld = value;
    }

}
