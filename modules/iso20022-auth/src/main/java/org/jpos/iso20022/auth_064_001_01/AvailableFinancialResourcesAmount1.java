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

package org.jpos.iso20022.auth_064_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableFinancialResourcesAmount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AvailableFinancialResourcesAmount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlInitlMrgn" type="{urn:iso:std:iso:20022:tech:xsd:auth.064.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="TtlPrfnddDfltFnd" type="{urn:iso:std:iso:20022:tech:xsd:auth.064.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="CCPSkinInTheGame" type="{urn:iso:std:iso:20022:tech:xsd:auth.064.001.01}ReportingAssetBreakdown1" maxOccurs="unbounded"/>
 *         <element name="OthrDfltFndCntrbtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.064.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="UfnddMmbCmmtmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.064.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="UfnddThrdPtyCmmtmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.064.001.01}ActiveCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableFinancialResourcesAmount1", propOrder = {
    "ttlInitlMrgn",
    "ttlPrfnddDfltFnd",
    "ccpSkinInTheGame",
    "othrDfltFndCntrbtn",
    "ufnddMmbCmmtmnt",
    "ufnddThrdPtyCmmtmnt"
})
public class AvailableFinancialResourcesAmount1 {

    @XmlElement(name = "TtlInitlMrgn", required = true)
    protected ActiveCurrencyAndAmount ttlInitlMrgn;
    @XmlElement(name = "TtlPrfnddDfltFnd", required = true)
    protected ActiveCurrencyAndAmount ttlPrfnddDfltFnd;
    @XmlElement(name = "CCPSkinInTheGame", required = true)
    protected List<ReportingAssetBreakdown1> ccpSkinInTheGame;
    @XmlElement(name = "OthrDfltFndCntrbtn", required = true)
    protected ActiveCurrencyAndAmount othrDfltFndCntrbtn;
    @XmlElement(name = "UfnddMmbCmmtmnt", required = true)
    protected ActiveCurrencyAndAmount ufnddMmbCmmtmnt;
    @XmlElement(name = "UfnddThrdPtyCmmtmnt", required = true)
    protected ActiveCurrencyAndAmount ufnddThrdPtyCmmtmnt;

    /**
     * Gets the value of the ttlInitlMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlInitlMrgn() {
        return ttlInitlMrgn;
    }

    /**
     * Sets the value of the ttlInitlMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlInitlMrgn(ActiveCurrencyAndAmount value) {
        this.ttlInitlMrgn = value;
    }

    /**
     * Gets the value of the ttlPrfnddDfltFnd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlPrfnddDfltFnd() {
        return ttlPrfnddDfltFnd;
    }

    /**
     * Sets the value of the ttlPrfnddDfltFnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlPrfnddDfltFnd(ActiveCurrencyAndAmount value) {
        this.ttlPrfnddDfltFnd = value;
    }

    /**
     * Gets the value of the ccpSkinInTheGame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ccpSkinInTheGame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCPSkinInTheGame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingAssetBreakdown1 }
     * 
     * 
     * @return
     *     The value of the ccpSkinInTheGame property.
     */
    public List<ReportingAssetBreakdown1> getCCPSkinInTheGame() {
        if (ccpSkinInTheGame == null) {
            ccpSkinInTheGame = new ArrayList<>();
        }
        return this.ccpSkinInTheGame;
    }

    /**
     * Gets the value of the othrDfltFndCntrbtn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOthrDfltFndCntrbtn() {
        return othrDfltFndCntrbtn;
    }

    /**
     * Sets the value of the othrDfltFndCntrbtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOthrDfltFndCntrbtn(ActiveCurrencyAndAmount value) {
        this.othrDfltFndCntrbtn = value;
    }

    /**
     * Gets the value of the ufnddMmbCmmtmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getUfnddMmbCmmtmnt() {
        return ufnddMmbCmmtmnt;
    }

    /**
     * Sets the value of the ufnddMmbCmmtmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setUfnddMmbCmmtmnt(ActiveCurrencyAndAmount value) {
        this.ufnddMmbCmmtmnt = value;
    }

    /**
     * Gets the value of the ufnddThrdPtyCmmtmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getUfnddThrdPtyCmmtmnt() {
        return ufnddThrdPtyCmmtmnt;
    }

    /**
     * Sets the value of the ufnddThrdPtyCmmtmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setUfnddThrdPtyCmmtmnt(ActiveCurrencyAndAmount value) {
        this.ufnddThrdPtyCmmtmnt = value;
    }

}
