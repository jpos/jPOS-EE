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

package org.jpos.iso20022.colr_023_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementStatus27Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementStatus27Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PrtlSttlm" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4" maxOccurs="unbounded"/>
 *         <element name="Sttld" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4" maxOccurs="unbounded"/>
 *         <element name="Usttld" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4" maxOccurs="unbounded"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryStatusAndReason6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementStatus27Choice", propOrder = {
    "prtlSttlm",
    "sttld",
    "usttld",
    "prtry"
})
public class SettlementStatus27Choice {

    @XmlElement(name = "PrtlSttlm")
    protected List<ProprietaryReason4> prtlSttlm;
    @XmlElement(name = "Sttld")
    protected List<ProprietaryReason4> sttld;
    @XmlElement(name = "Usttld")
    protected List<ProprietaryReason4> usttld;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Gets the value of the prtlSttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtlSttlm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtlSttlm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryReason4 }
     * 
     * 
     * @return
     *     The value of the prtlSttlm property.
     */
    public List<ProprietaryReason4> getPrtlSttlm() {
        if (prtlSttlm == null) {
            prtlSttlm = new ArrayList<>();
        }
        return this.prtlSttlm;
    }

    /**
     * Gets the value of the sttld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryReason4 }
     * 
     * 
     * @return
     *     The value of the sttld property.
     */
    public List<ProprietaryReason4> getSttld() {
        if (sttld == null) {
            sttld = new ArrayList<>();
        }
        return this.sttld;
    }

    /**
     * Gets the value of the usttld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the usttld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsttld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryReason4 }
     * 
     * 
     * @return
     *     The value of the usttld property.
     */
    public List<ProprietaryReason4> getUsttld() {
        if (usttld == null) {
            usttld = new ArrayList<>();
        }
        return this.usttld;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtry(ProprietaryStatusAndReason6 value) {
        this.prtry = value;
    }

}
