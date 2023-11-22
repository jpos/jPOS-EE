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

package org.jpos.iso20022.reda_005_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundParameters5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundParameters5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.005.001.03}FinancialInstrument71" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FndMgmtCpny" type="{urn:iso:std:iso:20022:tech:xsd:reda.005.001.03}PartyIdentification139" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DtFr" type="{urn:iso:std:iso:20022:tech:xsd:reda.005.001.03}ISODate" minOccurs="0"/>
 *         <element name="CtryOfDmcl" type="{urn:iso:std:iso:20022:tech:xsd:reda.005.001.03}CountryCode" minOccurs="0"/>
 *         <element name="RegdDstrbtnCtry" type="{urn:iso:std:iso:20022:tech:xsd:reda.005.001.03}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundParameters5", propOrder = {
    "finInstrmDtls",
    "fndMgmtCpny",
    "dtFr",
    "ctryOfDmcl",
    "regdDstrbtnCtry"
})
public class FundParameters5 {

    @XmlElement(name = "FinInstrmDtls")
    protected List<FinancialInstrument71> finInstrmDtls;
    @XmlElement(name = "FndMgmtCpny")
    protected List<PartyIdentification139> fndMgmtCpny;
    @XmlElement(name = "DtFr")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtFr;
    @XmlElement(name = "CtryOfDmcl")
    protected String ctryOfDmcl;
    @XmlElement(name = "RegdDstrbtnCtry")
    protected List<String> regdDstrbtnCtry;

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument71 }
     * 
     * 
     * @return
     *     The value of the finInstrmDtls property.
     */
    public List<FinancialInstrument71> getFinInstrmDtls() {
        if (finInstrmDtls == null) {
            finInstrmDtls = new ArrayList<>();
        }
        return this.finInstrmDtls;
    }

    /**
     * Gets the value of the fndMgmtCpny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fndMgmtCpny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndMgmtCpny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification139 }
     * 
     * 
     * @return
     *     The value of the fndMgmtCpny property.
     */
    public List<PartyIdentification139> getFndMgmtCpny() {
        if (fndMgmtCpny == null) {
            fndMgmtCpny = new ArrayList<>();
        }
        return this.fndMgmtCpny;
    }

    /**
     * Gets the value of the dtFr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFr() {
        return dtFr;
    }

    /**
     * Sets the value of the dtFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFr(XMLGregorianCalendar value) {
        this.dtFr = value;
    }

    /**
     * Gets the value of the ctryOfDmcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfDmcl() {
        return ctryOfDmcl;
    }

    /**
     * Sets the value of the ctryOfDmcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfDmcl(String value) {
        this.ctryOfDmcl = value;
    }

    /**
     * Gets the value of the regdDstrbtnCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the regdDstrbtnCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdDstrbtnCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the regdDstrbtnCtry property.
     */
    public List<String> getRegdDstrbtnCtry() {
        if (regdDstrbtnCtry == null) {
            regdDstrbtnCtry = new ArrayList<>();
        }
        return this.regdDstrbtnCtry;
    }

}
