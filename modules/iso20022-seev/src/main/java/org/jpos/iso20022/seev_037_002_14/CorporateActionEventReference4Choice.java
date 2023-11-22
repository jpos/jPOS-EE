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

package org.jpos.iso20022.seev_037_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventReference4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionEventReference4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="LkdOffclCorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.002.14}RestrictedFINXMax16Text"/>
 *         <element name="LkdCorpActnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.002.14}RestrictedFINXMax16Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventReference4Choice", propOrder = {
    "lkdOffclCorpActnEvtId",
    "lkdCorpActnId"
})
public class CorporateActionEventReference4Choice {

    @XmlElement(name = "LkdOffclCorpActnEvtId")
    protected String lkdOffclCorpActnEvtId;
    @XmlElement(name = "LkdCorpActnId")
    protected String lkdCorpActnId;

    /**
     * Gets the value of the lkdOffclCorpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdOffclCorpActnEvtId() {
        return lkdOffclCorpActnEvtId;
    }

    /**
     * Sets the value of the lkdOffclCorpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkdOffclCorpActnEvtId(String value) {
        this.lkdOffclCorpActnEvtId = value;
    }

    /**
     * Gets the value of the lkdCorpActnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdCorpActnId() {
        return lkdCorpActnId;
    }

    /**
     * Sets the value of the lkdCorpActnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkdCorpActnId(String value) {
        this.lkdCorpActnId = value;
    }

}
