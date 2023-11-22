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

package org.jpos.iso20022.reda_004_001_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalMarketAnnex5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LocalMarketAnnex5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}CountryCode" maxOccurs="unbounded"/>
 *         <element name="LclOrdrDsk" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}OrderDesk1"/>
 *         <element name="SbcptPrcgChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ProcessingCharacteristics8" minOccurs="0"/>
 *         <element name="RedPrcgChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ProcessingCharacteristics5" minOccurs="0"/>
 *         <element name="SwtchPrcgChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ProcessingCharacteristics6" minOccurs="0"/>
 *         <element name="CshSttlmDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}CashAccount205" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalMarketAnnex5", propOrder = {
    "ctry",
    "lclOrdrDsk",
    "sbcptPrcgChrtcs",
    "redPrcgChrtcs",
    "swtchPrcgChrtcs",
    "cshSttlmDtls",
    "addtlInf"
})
public class LocalMarketAnnex5 {

    @XmlElement(name = "Ctry", required = true)
    protected List<String> ctry;
    @XmlElement(name = "LclOrdrDsk", required = true)
    protected OrderDesk1 lclOrdrDsk;
    @XmlElement(name = "SbcptPrcgChrtcs")
    protected ProcessingCharacteristics8 sbcptPrcgChrtcs;
    @XmlElement(name = "RedPrcgChrtcs")
    protected ProcessingCharacteristics5 redPrcgChrtcs;
    @XmlElement(name = "SwtchPrcgChrtcs")
    protected ProcessingCharacteristics6 swtchPrcgChrtcs;
    @XmlElement(name = "CshSttlmDtls")
    protected List<CashAccount205> cshSttlmDtls;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the ctry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ctry property.
     */
    public List<String> getCtry() {
        if (ctry == null) {
            ctry = new ArrayList<>();
        }
        return this.ctry;
    }

    /**
     * Gets the value of the lclOrdrDsk property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDesk1 }
     *     
     */
    public OrderDesk1 getLclOrdrDsk() {
        return lclOrdrDsk;
    }

    /**
     * Sets the value of the lclOrdrDsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDesk1 }
     *     
     */
    public void setLclOrdrDsk(OrderDesk1 value) {
        this.lclOrdrDsk = value;
    }

    /**
     * Gets the value of the sbcptPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics8 }
     *     
     */
    public ProcessingCharacteristics8 getSbcptPrcgChrtcs() {
        return sbcptPrcgChrtcs;
    }

    /**
     * Sets the value of the sbcptPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics8 }
     *     
     */
    public void setSbcptPrcgChrtcs(ProcessingCharacteristics8 value) {
        this.sbcptPrcgChrtcs = value;
    }

    /**
     * Gets the value of the redPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics5 }
     *     
     */
    public ProcessingCharacteristics5 getRedPrcgChrtcs() {
        return redPrcgChrtcs;
    }

    /**
     * Sets the value of the redPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics5 }
     *     
     */
    public void setRedPrcgChrtcs(ProcessingCharacteristics5 value) {
        this.redPrcgChrtcs = value;
    }

    /**
     * Gets the value of the swtchPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics6 }
     *     
     */
    public ProcessingCharacteristics6 getSwtchPrcgChrtcs() {
        return swtchPrcgChrtcs;
    }

    /**
     * Sets the value of the swtchPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics6 }
     *     
     */
    public void setSwtchPrcgChrtcs(ProcessingCharacteristics6 value) {
        this.swtchPrcgChrtcs = value;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshSttlmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSttlmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount205 }
     * 
     * 
     * @return
     *     The value of the cshSttlmDtls property.
     */
    public List<CashAccount205> getCshSttlmDtls() {
        if (cshSttlmDtls == null) {
            cshSttlmDtls = new ArrayList<>();
        }
        return this.cshSttlmDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
