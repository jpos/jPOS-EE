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

package org.jpos.iso20022.auth_101_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsReportHeader2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsReportHeader2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}ISODateTime"/>
 *         <element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}DatePeriod2"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}ActiveCurrencyCode"/>
 *         <element name="RptSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}TransactionOperationType4Code"/>
 *         <element name="SctiesSttlmSys" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}SecuritiesSettlementSystemIdentification2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsReportHeader2", propOrder = {
    "creDtTm",
    "rptgPrd",
    "ccy",
    "rptSts",
    "sctiesSttlmSys"
})
public class SettlementFailsReportHeader2 {

    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "RptgPrd", required = true)
    protected DatePeriod2 rptgPrd;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "RptSts", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionOperationType4Code rptSts;
    @XmlElement(name = "SctiesSttlmSys", required = true)
    protected SecuritiesSettlementSystemIdentification2 sctiesSttlmSys;

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public void setRptgPrd(DatePeriod2 value) {
        this.rptgPrd = value;
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
     * Gets the value of the rptSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOperationType4Code }
     *     
     */
    public TransactionOperationType4Code getRptSts() {
        return rptSts;
    }

    /**
     * Sets the value of the rptSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOperationType4Code }
     *     
     */
    public void setRptSts(TransactionOperationType4Code value) {
        this.rptSts = value;
    }

    /**
     * Gets the value of the sctiesSttlmSys property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementSystemIdentification2 }
     *     
     */
    public SecuritiesSettlementSystemIdentification2 getSctiesSttlmSys() {
        return sctiesSttlmSys;
    }

    /**
     * Sets the value of the sctiesSttlmSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementSystemIdentification2 }
     *     
     */
    public void setSctiesSttlmSys(SecuritiesSettlementSystemIdentification2 value) {
        this.sctiesSttlmSys = value;
    }

}
