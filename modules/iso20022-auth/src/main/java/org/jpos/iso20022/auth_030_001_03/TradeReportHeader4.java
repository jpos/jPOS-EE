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

package org.jpos.iso20022.auth_030_001_03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeReportHeader4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeReportHeader4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ISODate" minOccurs="0"/>
 *         <element name="MsgPgntn" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Pagination1" minOccurs="0"/>
 *         <element name="NbRcrds" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Number"/>
 *         <element name="CmptntAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Max100Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NewTradRpstryIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="RptgPurp" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Max100Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReportHeader4", propOrder = {
    "rptExctnDt",
    "msgPgntn",
    "nbRcrds",
    "cmptntAuthrty",
    "newTradRpstryIdr",
    "rptgPurp"
})
public class TradeReportHeader4 {

    @XmlElement(name = "RptExctnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rptExctnDt;
    @XmlElement(name = "MsgPgntn")
    protected Pagination1 msgPgntn;
    @XmlElement(name = "NbRcrds", required = true)
    protected BigDecimal nbRcrds;
    @XmlElement(name = "CmptntAuthrty")
    protected List<String> cmptntAuthrty;
    @XmlElement(name = "NewTradRpstryIdr")
    protected OrganisationIdentification15Choice newTradRpstryIdr;
    @XmlElement(name = "RptgPurp")
    protected List<String> rptgPurp;

    /**
     * Gets the value of the rptExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptExctnDt() {
        return rptExctnDt;
    }

    /**
     * Sets the value of the rptExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRptExctnDt(XMLGregorianCalendar value) {
        this.rptExctnDt = value;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setMsgPgntn(Pagination1 value) {
        this.msgPgntn = value;
    }

    /**
     * Gets the value of the nbRcrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbRcrds() {
        return nbRcrds;
    }

    /**
     * Sets the value of the nbRcrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbRcrds(BigDecimal value) {
        this.nbRcrds = value;
    }

    /**
     * Gets the value of the cmptntAuthrty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmptntAuthrty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmptntAuthrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the cmptntAuthrty property.
     */
    public List<String> getCmptntAuthrty() {
        if (cmptntAuthrty == null) {
            cmptntAuthrty = new ArrayList<>();
        }
        return this.cmptntAuthrty;
    }

    /**
     * Gets the value of the newTradRpstryIdr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getNewTradRpstryIdr() {
        return newTradRpstryIdr;
    }

    /**
     * Sets the value of the newTradRpstryIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setNewTradRpstryIdr(OrganisationIdentification15Choice value) {
        this.newTradRpstryIdr = value;
    }

    /**
     * Gets the value of the rptgPurp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptgPurp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptgPurp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the rptgPurp property.
     */
    public List<String> getRptgPurp() {
        if (rptgPurp == null) {
            rptgPurp = new ArrayList<>();
        }
        return this.rptgPurp;
    }

}
