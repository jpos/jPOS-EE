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

package org.jpos.iso20022.semt_042_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportItem1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportItem1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}SecuritiesAccount19"/>
 *         <element name="AcctLvl" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}HoldingAccountLevel1Code"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}SecurityIdentification19" minOccurs="0"/>
 *         <element name="ItmDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportItem1", propOrder = {
    "acctId",
    "acctLvl",
    "finInstrmId",
    "itmDt"
})
public class ReportItem1 {

    @XmlElement(name = "AcctId", required = true)
    protected SecuritiesAccount19 acctId;
    @XmlElement(name = "AcctLvl", required = true)
    @XmlSchemaType(name = "string")
    protected HoldingAccountLevel1Code acctLvl;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "ItmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar itmDt;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setAcctId(SecuritiesAccount19 value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctLvl property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingAccountLevel1Code }
     *     
     */
    public HoldingAccountLevel1Code getAcctLvl() {
        return acctLvl;
    }

    /**
     * Sets the value of the acctLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingAccountLevel1Code }
     *     
     */
    public void setAcctLvl(HoldingAccountLevel1Code value) {
        this.acctLvl = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the itmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItmDt() {
        return itmDt;
    }

    /**
     * Sets the value of the itmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItmDt(XMLGregorianCalendar value) {
        this.itmDt = value;
    }

}
