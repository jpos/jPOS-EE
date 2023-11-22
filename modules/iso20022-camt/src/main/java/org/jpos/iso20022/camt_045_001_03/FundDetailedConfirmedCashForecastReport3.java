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

package org.jpos.iso20022.camt_045_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundDetailedConfirmedCashForecastReport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundDetailedConfirmedCashForecastReport3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FndOrSubFndDtls" type="{urn:swift:xsd:camt.045.001.03}Fund4" minOccurs="0"/>
 *         <element name="FndCshFcstDtls" type="{urn:swift:xsd:camt.045.001.03}FundCashForecast6" maxOccurs="unbounded"/>
 *         <element name="CnsltdNetCshFcst" type="{urn:swift:xsd:camt.045.001.03}NetCashForecast3" minOccurs="0"/>
 *         <element name="Xtnsn" type="{urn:swift:xsd:camt.045.001.03}Extension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundDetailedConfirmedCashForecastReport3", propOrder = {
    "fndOrSubFndDtls",
    "fndCshFcstDtls",
    "cnsltdNetCshFcst",
    "xtnsn"
})
public class FundDetailedConfirmedCashForecastReport3 {

    @XmlElement(name = "FndOrSubFndDtls")
    protected Fund4 fndOrSubFndDtls;
    @XmlElement(name = "FndCshFcstDtls", required = true)
    protected List<FundCashForecast6> fndCshFcstDtls;
    @XmlElement(name = "CnsltdNetCshFcst")
    protected NetCashForecast3 cnsltdNetCshFcst;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the fndOrSubFndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Fund4 }
     *     
     */
    public Fund4 getFndOrSubFndDtls() {
        return fndOrSubFndDtls;
    }

    /**
     * Sets the value of the fndOrSubFndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fund4 }
     *     
     */
    public void setFndOrSubFndDtls(Fund4 value) {
        this.fndOrSubFndDtls = value;
    }

    /**
     * Gets the value of the fndCshFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fndCshFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndCshFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundCashForecast6 }
     * 
     * 
     * @return
     *     The value of the fndCshFcstDtls property.
     */
    public List<FundCashForecast6> getFndCshFcstDtls() {
        if (fndCshFcstDtls == null) {
            fndCshFcstDtls = new ArrayList<>();
        }
        return this.fndCshFcstDtls;
    }

    /**
     * Gets the value of the cnsltdNetCshFcst property.
     * 
     * @return
     *     possible object is
     *     {@link NetCashForecast3 }
     *     
     */
    public NetCashForecast3 getCnsltdNetCshFcst() {
        return cnsltdNetCshFcst;
    }

    /**
     * Sets the value of the cnsltdNetCshFcst property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetCashForecast3 }
     *     
     */
    public void setCnsltdNetCshFcst(NetCashForecast3 value) {
        this.cnsltdNetCshFcst = value;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
    }

}
