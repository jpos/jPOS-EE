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

package org.jpos.iso20022.seev_004_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PledgeInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PledgeInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pldgr" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}PartyIdentification232Choice"/>
 *         <element name="ThrdPty" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}ThirdPartyIdentification1" minOccurs="0"/>
 *         <element name="PldgTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}GenericIdentification36"/>
 *         <element name="RtrSctiesInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PledgeInformation1", propOrder = {
    "pldgr",
    "thrdPty",
    "pldgTp",
    "rtrSctiesInd"
})
public class PledgeInformation1 {

    @XmlElement(name = "Pldgr", required = true)
    protected PartyIdentification232Choice pldgr;
    @XmlElement(name = "ThrdPty")
    protected ThirdPartyIdentification1 thrdPty;
    @XmlElement(name = "PldgTp", required = true)
    protected GenericIdentification36 pldgTp;
    @XmlElement(name = "RtrSctiesInd")
    protected Boolean rtrSctiesInd;

    /**
     * Gets the value of the pldgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PartyIdentification232Choice getPldgr() {
        return pldgr;
    }

    /**
     * Sets the value of the pldgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public void setPldgr(PartyIdentification232Choice value) {
        this.pldgr = value;
    }

    /**
     * Gets the value of the thrdPty property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyIdentification1 }
     *     
     */
    public ThirdPartyIdentification1 getThrdPty() {
        return thrdPty;
    }

    /**
     * Sets the value of the thrdPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyIdentification1 }
     *     
     */
    public void setThrdPty(ThirdPartyIdentification1 value) {
        this.thrdPty = value;
    }

    /**
     * Gets the value of the pldgTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getPldgTp() {
        return pldgTp;
    }

    /**
     * Sets the value of the pldgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public void setPldgTp(GenericIdentification36 value) {
        this.pldgTp = value;
    }

    /**
     * Gets the value of the rtrSctiesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtrSctiesInd() {
        return rtrSctiesInd;
    }

    /**
     * Sets the value of the rtrSctiesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtrSctiesInd(Boolean value) {
        this.rtrSctiesInd = value;
    }

}
