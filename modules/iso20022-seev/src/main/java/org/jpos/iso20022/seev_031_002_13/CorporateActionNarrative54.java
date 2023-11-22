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

package org.jpos.iso20022.seev_031_002_13;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNarrative54 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionNarrative54">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Offerr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}UpdatedAdditionalInformation6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NewCpnyNm" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}UpdatedAdditionalInformation6" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}UpdatedURLlnformation5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EvtPrcgWebSiteAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RestrictedFINZMax2048Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative54", propOrder = {
    "offerr",
    "newCpnyNm",
    "urlAdr",
    "evtPrcgWebSiteAdr"
})
public class CorporateActionNarrative54 {

    @XmlElement(name = "Offerr")
    protected List<UpdatedAdditionalInformation6> offerr;
    @XmlElement(name = "NewCpnyNm")
    protected UpdatedAdditionalInformation6 newCpnyNm;
    @XmlElement(name = "URLAdr")
    protected List<UpdatedURLlnformation5> urlAdr;
    @XmlElement(name = "EvtPrcgWebSiteAdr")
    protected String evtPrcgWebSiteAdr;

    /**
     * Gets the value of the offerr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the offerr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation6 }
     * 
     * 
     * @return
     *     The value of the offerr property.
     */
    public List<UpdatedAdditionalInformation6> getOfferr() {
        if (offerr == null) {
            offerr = new ArrayList<>();
        }
        return this.offerr;
    }

    /**
     * Gets the value of the newCpnyNm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation6 }
     *     
     */
    public UpdatedAdditionalInformation6 getNewCpnyNm() {
        return newCpnyNm;
    }

    /**
     * Sets the value of the newCpnyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation6 }
     *     
     */
    public void setNewCpnyNm(UpdatedAdditionalInformation6 value) {
        this.newCpnyNm = value;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the urlAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURLAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedURLlnformation5 }
     * 
     * 
     * @return
     *     The value of the urlAdr property.
     */
    public List<UpdatedURLlnformation5> getURLAdr() {
        if (urlAdr == null) {
            urlAdr = new ArrayList<>();
        }
        return this.urlAdr;
    }

    /**
     * Gets the value of the evtPrcgWebSiteAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtPrcgWebSiteAdr() {
        return evtPrcgWebSiteAdr;
    }

    /**
     * Sets the value of the evtPrcgWebSiteAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtPrcgWebSiteAdr(String value) {
        this.evtPrcgWebSiteAdr = value;
    }

}
