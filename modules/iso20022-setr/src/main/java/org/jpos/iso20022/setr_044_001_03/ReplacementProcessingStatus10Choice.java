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

package org.jpos.iso20022.setr_044_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplacementProcessingStatus10Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReplacementProcessingStatus10Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Accptd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="Cmpltd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="Dnd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="InRpr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="PrtlRplcmntAccptd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="RcvdAtIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="RcvdAtStockXchg" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="ModReqd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="PrtrySts" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryStatusAndReason6" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplacementProcessingStatus10Choice", propOrder = {
    "accptd",
    "cmpltd",
    "dnd",
    "inRpr",
    "prtlRplcmntAccptd",
    "pdg",
    "rcvdAtIntrmy",
    "rcvdAtStockXchg",
    "rjctd",
    "modReqd",
    "prtrySts"
})
public class ReplacementProcessingStatus10Choice {

    @XmlElement(name = "Accptd")
    protected ProprietaryReason4 accptd;
    @XmlElement(name = "Cmpltd")
    protected ProprietaryReason4 cmpltd;
    @XmlElement(name = "Dnd")
    protected ProprietaryReason4 dnd;
    @XmlElement(name = "InRpr")
    protected ProprietaryReason4 inRpr;
    @XmlElement(name = "PrtlRplcmntAccptd")
    protected ProprietaryReason4 prtlRplcmntAccptd;
    @XmlElement(name = "Pdg")
    protected ProprietaryReason4 pdg;
    @XmlElement(name = "RcvdAtIntrmy")
    protected ProprietaryReason4 rcvdAtIntrmy;
    @XmlElement(name = "RcvdAtStockXchg")
    protected ProprietaryReason4 rcvdAtStockXchg;
    @XmlElement(name = "Rjctd")
    protected ProprietaryReason4 rjctd;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason4 modReqd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setAccptd(ProprietaryReason4 value) {
        this.accptd = value;
    }

    /**
     * Gets the value of the cmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCmpltd() {
        return cmpltd;
    }

    /**
     * Sets the value of the cmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setCmpltd(ProprietaryReason4 value) {
        this.cmpltd = value;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setDnd(ProprietaryReason4 value) {
        this.dnd = value;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setInRpr(ProprietaryReason4 value) {
        this.inRpr = value;
    }

    /**
     * Gets the value of the prtlRplcmntAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getPrtlRplcmntAccptd() {
        return prtlRplcmntAccptd;
    }

    /**
     * Sets the value of the prtlRplcmntAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setPrtlRplcmntAccptd(ProprietaryReason4 value) {
        this.prtlRplcmntAccptd = value;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setPdg(ProprietaryReason4 value) {
        this.pdg = value;
    }

    /**
     * Gets the value of the rcvdAtIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getRcvdAtIntrmy() {
        return rcvdAtIntrmy;
    }

    /**
     * Sets the value of the rcvdAtIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setRcvdAtIntrmy(ProprietaryReason4 value) {
        this.rcvdAtIntrmy = value;
    }

    /**
     * Gets the value of the rcvdAtStockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getRcvdAtStockXchg() {
        return rcvdAtStockXchg;
    }

    /**
     * Sets the value of the rcvdAtStockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setRcvdAtStockXchg(ProprietaryReason4 value) {
        this.rcvdAtStockXchg = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setRjctd(ProprietaryReason4 value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the modReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getModReqd() {
        return modReqd;
    }

    /**
     * Sets the value of the modReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setModReqd(ProprietaryReason4 value) {
        this.modReqd = value;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtrySts(ProprietaryStatusAndReason6 value) {
        this.prtrySts = value;
    }

}
