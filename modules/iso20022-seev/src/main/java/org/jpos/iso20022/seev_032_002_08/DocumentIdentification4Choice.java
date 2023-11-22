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

package org.jpos.iso20022.seev_032_002_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentIdentification4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentIdentification4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AcctSvcrDocId" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.002.08}RestrictedFINXMax16Text"/>
 *         <element name="AcctOwnrDocId" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.002.08}RestrictedFINXMax16Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentification4Choice", propOrder = {
    "acctSvcrDocId",
    "acctOwnrDocId"
})
public class DocumentIdentification4Choice {

    @XmlElement(name = "AcctSvcrDocId")
    protected String acctSvcrDocId;
    @XmlElement(name = "AcctOwnrDocId")
    protected String acctOwnrDocId;

    /**
     * Gets the value of the acctSvcrDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrDocId() {
        return acctSvcrDocId;
    }

    /**
     * Sets the value of the acctSvcrDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSvcrDocId(String value) {
        this.acctSvcrDocId = value;
    }

    /**
     * Gets the value of the acctOwnrDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrDocId() {
        return acctOwnrDocId;
    }

    /**
     * Sets the value of the acctOwnrDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOwnrDocId(String value) {
        this.acctOwnrDocId = value;
    }

}
