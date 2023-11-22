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

package org.jpos.iso20022.acmt_008_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementFrequencyAndForm1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatementFrequencyAndForm1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.008.001.04}Frequency7Code"/>
 *         <element name="ComMtd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.008.001.04}CommunicationMethod2Choice"/>
 *         <element name="DlvryAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.008.001.04}Max350Text"/>
 *         <element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.008.001.04}CommunicationFormat1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementFrequencyAndForm1", propOrder = {
    "frqcy",
    "comMtd",
    "dlvryAdr",
    "frmt"
})
public class StatementFrequencyAndForm1 {

    @XmlElement(name = "Frqcy", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency7Code frqcy;
    @XmlElement(name = "ComMtd", required = true)
    protected CommunicationMethod2Choice comMtd;
    @XmlElement(name = "DlvryAdr", required = true)
    protected String dlvryAdr;
    @XmlElement(name = "Frmt", required = true)
    protected CommunicationFormat1Choice frmt;

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency7Code }
     *     
     */
    public Frequency7Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency7Code }
     *     
     */
    public void setFrqcy(Frequency7Code value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the comMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMethod2Choice }
     *     
     */
    public CommunicationMethod2Choice getComMtd() {
        return comMtd;
    }

    /**
     * Sets the value of the comMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMethod2Choice }
     *     
     */
    public void setComMtd(CommunicationMethod2Choice value) {
        this.comMtd = value;
    }

    /**
     * Gets the value of the dlvryAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryAdr() {
        return dlvryAdr;
    }

    /**
     * Sets the value of the dlvryAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryAdr(String value) {
        this.dlvryAdr = value;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationFormat1Choice }
     *     
     */
    public CommunicationFormat1Choice getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationFormat1Choice }
     *     
     */
    public void setFrmt(CommunicationFormat1Choice value) {
        this.frmt = value;
    }

}
