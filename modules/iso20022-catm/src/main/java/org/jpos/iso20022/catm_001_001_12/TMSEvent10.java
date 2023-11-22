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

package org.jpos.iso20022.catm_001_001_12;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TMSEvent10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TMSEvent10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TmStmp" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}ISODateTime"/>
 *         <element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}TerminalManagementActionResult5Code"/>
 *         <element name="ActnId" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}TMSActionIdentification9"/>
 *         <element name="AddtlErrInf" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max70Text" minOccurs="0"/>
 *         <element name="TermnlMgrId" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max35Text" minOccurs="0"/>
 *         <element name="DvcRspn" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}DeviceResponse6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSEvent10", propOrder = {
    "tmStmp",
    "rslt",
    "actnId",
    "addtlErrInf",
    "termnlMgrId",
    "dvcRspn"
})
public class TMSEvent10 {

    @XmlElement(name = "TmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmStmp;
    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementActionResult5Code rslt;
    @XmlElement(name = "ActnId", required = true)
    protected TMSActionIdentification9 actnId;
    @XmlElement(name = "AddtlErrInf")
    protected String addtlErrInf;
    @XmlElement(name = "TermnlMgrId")
    protected String termnlMgrId;
    @XmlElement(name = "DvcRspn")
    protected DeviceResponse6 dvcRspn;

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTmStmp(XMLGregorianCalendar value) {
        this.tmStmp = value;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementActionResult5Code }
     *     
     */
    public TerminalManagementActionResult5Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementActionResult5Code }
     *     
     */
    public void setRslt(TerminalManagementActionResult5Code value) {
        this.rslt = value;
    }

    /**
     * Gets the value of the actnId property.
     * 
     * @return
     *     possible object is
     *     {@link TMSActionIdentification9 }
     *     
     */
    public TMSActionIdentification9 getActnId() {
        return actnId;
    }

    /**
     * Sets the value of the actnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSActionIdentification9 }
     *     
     */
    public void setActnId(TMSActionIdentification9 value) {
        this.actnId = value;
    }

    /**
     * Gets the value of the addtlErrInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlErrInf() {
        return addtlErrInf;
    }

    /**
     * Sets the value of the addtlErrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlErrInf(String value) {
        this.addtlErrInf = value;
    }

    /**
     * Gets the value of the termnlMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermnlMgrId() {
        return termnlMgrId;
    }

    /**
     * Sets the value of the termnlMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermnlMgrId(String value) {
        this.termnlMgrId = value;
    }

    /**
     * Gets the value of the dvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceResponse6 }
     *     
     */
    public DeviceResponse6 getDvcRspn() {
        return dvcRspn;
    }

    /**
     * Sets the value of the dvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceResponse6 }
     *     
     */
    public void setDvcRspn(DeviceResponse6 value) {
        this.dvcRspn = value;
    }

}
