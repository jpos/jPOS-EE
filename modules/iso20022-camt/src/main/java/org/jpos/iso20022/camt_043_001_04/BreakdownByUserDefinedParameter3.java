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

package org.jpos.iso20022.camt_043_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BreakdownByUserDefinedParameter3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BreakdownByUserDefinedParameter3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pty" type="{urn:swift:xsd:camt.043.001.04}InvestmentAccount42" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:swift:xsd:camt.043.001.04}CountryCode" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:swift:xsd:camt.043.001.04}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="UsrDfnd" type="{urn:swift:xsd:camt.043.001.04}DataFormat2Choice" minOccurs="0"/>
 *         <element name="CshInFcst" type="{urn:swift:xsd:camt.043.001.04}CashInForecast5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshOutFcst" type="{urn:swift:xsd:camt.043.001.04}CashOutForecast5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NetCshFcst" type="{urn:swift:xsd:camt.043.001.04}NetCashForecast4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakdownByUserDefinedParameter3", propOrder = {
    "pty",
    "ctry",
    "ccy",
    "usrDfnd",
    "cshInFcst",
    "cshOutFcst",
    "netCshFcst"
})
public class BreakdownByUserDefinedParameter3 {

    @XmlElement(name = "Pty")
    protected InvestmentAccount42 pty;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "UsrDfnd")
    protected DataFormat2Choice usrDfnd;
    @XmlElement(name = "CshInFcst")
    protected List<CashInForecast5> cshInFcst;
    @XmlElement(name = "CshOutFcst")
    protected List<CashOutForecast5> cshOutFcst;
    @XmlElement(name = "NetCshFcst")
    protected List<NetCashForecast4> netCshFcst;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount42 }
     *     
     */
    public InvestmentAccount42 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount42 }
     *     
     */
    public void setPty(InvestmentAccount42 value) {
        this.pty = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the usrDfnd property.
     * 
     * @return
     *     possible object is
     *     {@link DataFormat2Choice }
     *     
     */
    public DataFormat2Choice getUsrDfnd() {
        return usrDfnd;
    }

    /**
     * Sets the value of the usrDfnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFormat2Choice }
     *     
     */
    public void setUsrDfnd(DataFormat2Choice value) {
        this.usrDfnd = value;
    }

    /**
     * Gets the value of the cshInFcst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshInFcst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshInFcst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashInForecast5 }
     * 
     * 
     * @return
     *     The value of the cshInFcst property.
     */
    public List<CashInForecast5> getCshInFcst() {
        if (cshInFcst == null) {
            cshInFcst = new ArrayList<>();
        }
        return this.cshInFcst;
    }

    /**
     * Gets the value of the cshOutFcst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshOutFcst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshOutFcst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOutForecast5 }
     * 
     * 
     * @return
     *     The value of the cshOutFcst property.
     */
    public List<CashOutForecast5> getCshOutFcst() {
        if (cshOutFcst == null) {
            cshOutFcst = new ArrayList<>();
        }
        return this.cshOutFcst;
    }

    /**
     * Gets the value of the netCshFcst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netCshFcst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetCshFcst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetCashForecast4 }
     * 
     * 
     * @return
     *     The value of the netCshFcst property.
     */
    public List<NetCashForecast4> getNetCshFcst() {
        if (netCshFcst == null) {
            netCshFcst = new ArrayList<>();
        }
        return this.netCshFcst;
    }

}
