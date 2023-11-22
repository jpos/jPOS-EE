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

package org.jpos.iso20022.caam_002_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommand10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCommand10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}ATMCommand6Code"/>
 *         <element name="Urgcy" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}TMSContactLevel2Code"/>
 *         <element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}ISODateTime" minOccurs="0"/>
 *         <element name="CmdId" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}ATMCommandIdentification1" minOccurs="0"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}ATMCommandReason1Code" minOccurs="0"/>
 *         <element name="TracRsn" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}ATMCommandReason1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}Max70Text" minOccurs="0"/>
 *         <element name="CmdParams" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}ATMCommandParameters3Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommand10", propOrder = {
    "tp",
    "urgcy",
    "dtTm",
    "cmdId",
    "rsn",
    "tracRsn",
    "addtlRsnInf",
    "cmdParams"
})
public class ATMCommand10 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCommand6Code tp;
    @XmlElement(name = "Urgcy", required = true)
    @XmlSchemaType(name = "string")
    protected TMSContactLevel2Code urgcy;
    @XmlElement(name = "DtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTm;
    @XmlElement(name = "CmdId")
    protected ATMCommandIdentification1 cmdId;
    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected ATMCommandReason1Code rsn;
    @XmlElement(name = "TracRsn")
    @XmlSchemaType(name = "string")
    protected List<ATMCommandReason1Code> tracRsn;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;
    @XmlElement(name = "CmdParams")
    protected ATMCommandParameters3Choice cmdParams;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand6Code }
     *     
     */
    public ATMCommand6Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand6Code }
     *     
     */
    public void setTp(ATMCommand6Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the urgcy property.
     * 
     * @return
     *     possible object is
     *     {@link TMSContactLevel2Code }
     *     
     */
    public TMSContactLevel2Code getUrgcy() {
        return urgcy;
    }

    /**
     * Sets the value of the urgcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSContactLevel2Code }
     *     
     */
    public void setUrgcy(TMSContactLevel2Code value) {
        this.urgcy = value;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTm(XMLGregorianCalendar value) {
        this.dtTm = value;
    }

    /**
     * Gets the value of the cmdId property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommandIdentification1 getCmdId() {
        return cmdId;
    }

    /**
     * Sets the value of the cmdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public void setCmdId(ATMCommandIdentification1 value) {
        this.cmdId = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandReason1Code }
     *     
     */
    public ATMCommandReason1Code getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandReason1Code }
     *     
     */
    public void setRsn(ATMCommandReason1Code value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the tracRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tracRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommandReason1Code }
     * 
     * 
     * @return
     *     The value of the tracRsn property.
     */
    public List<ATMCommandReason1Code> getTracRsn() {
        if (tracRsn == null) {
            tracRsn = new ArrayList<>();
        }
        return this.tracRsn;
    }

    /**
     * Gets the value of the addtlRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Sets the value of the addtlRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
    }

    /**
     * Gets the value of the cmdParams property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandParameters3Choice }
     *     
     */
    public ATMCommandParameters3Choice getCmdParams() {
        return cmdParams;
    }

    /**
     * Sets the value of the cmdParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandParameters3Choice }
     *     
     */
    public void setCmdParams(ATMCommandParameters3Choice value) {
        this.cmdParams = value;
    }

}
