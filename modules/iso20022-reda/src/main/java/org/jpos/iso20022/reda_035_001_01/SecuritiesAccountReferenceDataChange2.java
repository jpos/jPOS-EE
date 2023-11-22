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

package org.jpos.iso20022.reda_035_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccountReferenceDataChange2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesAccountReferenceDataChange2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesAcctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.035.001.01}SecuritiesAccount19"/>
 *         <element name="FldNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.035.001.01}Max35Text"/>
 *         <element name="OdFldVal" type="{urn:iso:std:iso:20022:tech:xsd:reda.035.001.01}Max350Text"/>
 *         <element name="NewFldVal" type="{urn:iso:std:iso:20022:tech:xsd:reda.035.001.01}Max350Text"/>
 *         <element name="OprTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:reda.035.001.01}ISODateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountReferenceDataChange2", propOrder = {
    "sctiesAcctId",
    "fldNm",
    "odFldVal",
    "newFldVal",
    "oprTmStmp"
})
public class SecuritiesAccountReferenceDataChange2 {

    @XmlElement(name = "SctiesAcctId", required = true)
    protected SecuritiesAccount19 sctiesAcctId;
    @XmlElement(name = "FldNm", required = true)
    protected String fldNm;
    @XmlElement(name = "OdFldVal", required = true)
    protected String odFldVal;
    @XmlElement(name = "NewFldVal", required = true)
    protected String newFldVal;
    @XmlElement(name = "OprTmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oprTmStmp;

    /**
     * Gets the value of the sctiesAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSctiesAcctId() {
        return sctiesAcctId;
    }

    /**
     * Sets the value of the sctiesAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSctiesAcctId(SecuritiesAccount19 value) {
        this.sctiesAcctId = value;
    }

    /**
     * Gets the value of the fldNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFldNm() {
        return fldNm;
    }

    /**
     * Sets the value of the fldNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFldNm(String value) {
        this.fldNm = value;
    }

    /**
     * Gets the value of the odFldVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdFldVal() {
        return odFldVal;
    }

    /**
     * Sets the value of the odFldVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdFldVal(String value) {
        this.odFldVal = value;
    }

    /**
     * Gets the value of the newFldVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFldVal() {
        return newFldVal;
    }

    /**
     * Sets the value of the newFldVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFldVal(String value) {
        this.newFldVal = value;
    }

    /**
     * Gets the value of the oprTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOprTmStmp() {
        return oprTmStmp;
    }

    /**
     * Sets the value of the oprTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOprTmStmp(XMLGregorianCalendar value) {
        this.oprTmStmp = value;
    }

}
