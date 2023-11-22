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

package org.jpos.iso20022.semt_023_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Report6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Report6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptNb" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}Max5NumericText" minOccurs="0"/>
 *         <element name="QryRef" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}QueryReference2" minOccurs="0"/>
 *         <element name="RptId" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}Max35Text" minOccurs="0"/>
 *         <element name="RptDtTm" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}DateAndDateTime1Choice"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}Frequency25Choice" minOccurs="0"/>
 *         <element name="UpdTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}StatementUpdateTypeCodeAndDSSCode1Choice" minOccurs="0"/>
 *         <element name="NtceTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}GenericIdentification30" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Report6", propOrder = {
    "rptNb",
    "qryRef",
    "rptId",
    "rptDtTm",
    "frqcy",
    "updTp",
    "ntceTp"
})
public class Report6 {

    @XmlElement(name = "RptNb")
    protected String rptNb;
    @XmlElement(name = "QryRef")
    protected QueryReference2 qryRef;
    @XmlElement(name = "RptId")
    protected String rptId;
    @XmlElement(name = "RptDtTm", required = true)
    protected DateAndDateTime1Choice rptDtTm;
    @XmlElement(name = "Frqcy")
    protected Frequency25Choice frqcy;
    @XmlElement(name = "UpdTp")
    protected StatementUpdateTypeCodeAndDSSCode1Choice updTp;
    @XmlElement(name = "NtceTp")
    protected GenericIdentification30 ntceTp;

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptNb(String value) {
        this.rptNb = value;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link QueryReference2 }
     *     
     */
    public QueryReference2 getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryReference2 }
     *     
     */
    public void setQryRef(QueryReference2 value) {
        this.qryRef = value;
    }

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptId(String value) {
        this.rptId = value;
    }

    /**
     * Gets the value of the rptDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getRptDtTm() {
        return rptDtTm;
    }

    /**
     * Sets the value of the rptDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public void setRptDtTm(DateAndDateTime1Choice value) {
        this.rptDtTm = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency25Choice }
     *     
     */
    public Frequency25Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency25Choice }
     *     
     */
    public void setFrqcy(Frequency25Choice value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementUpdateTypeCodeAndDSSCode1Choice }
     *     
     */
    public StatementUpdateTypeCodeAndDSSCode1Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementUpdateTypeCodeAndDSSCode1Choice }
     *     
     */
    public void setUpdTp(StatementUpdateTypeCodeAndDSSCode1Choice value) {
        this.updTp = value;
    }

    /**
     * Gets the value of the ntceTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getNtceTp() {
        return ntceTp;
    }

    /**
     * Sets the value of the ntceTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setNtceTp(GenericIdentification30 value) {
        this.ntceTp = value;
    }

}
