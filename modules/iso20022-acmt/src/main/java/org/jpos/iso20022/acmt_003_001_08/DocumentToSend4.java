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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentToSend4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentToSend4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max140Text"/>
 *         <element name="Rcpt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}PartyIdentification125Choice"/>
 *         <element name="MtdOfTrnsmssn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}CommunicationMethod3Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentToSend4", propOrder = {
    "tp",
    "rcpt",
    "mtdOfTrnsmssn"
})
public class DocumentToSend4 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Rcpt", required = true)
    protected PartyIdentification125Choice rcpt;
    @XmlElement(name = "MtdOfTrnsmssn", required = true)
    protected CommunicationMethod3Choice mtdOfTrnsmssn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setRcpt(PartyIdentification125Choice value) {
        this.rcpt = value;
    }

    /**
     * Gets the value of the mtdOfTrnsmssn property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMethod3Choice }
     *     
     */
    public CommunicationMethod3Choice getMtdOfTrnsmssn() {
        return mtdOfTrnsmssn;
    }

    /**
     * Sets the value of the mtdOfTrnsmssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMethod3Choice }
     *     
     */
    public void setMtdOfTrnsmssn(CommunicationMethod3Choice value) {
        this.mtdOfTrnsmssn = value;
    }

}
