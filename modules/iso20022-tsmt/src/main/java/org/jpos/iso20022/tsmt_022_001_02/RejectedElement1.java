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

package org.jpos.iso20022.tsmt_022_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedElement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RejectedElement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ElmtSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.022.001.02}Number"/>
 *         <element name="IndvRjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.022.001.02}Max140Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedElement1", propOrder = {
    "elmtSeqNb",
    "indvRjctnRsn"
})
public class RejectedElement1 {

    @XmlElement(name = "ElmtSeqNb", required = true)
    protected BigDecimal elmtSeqNb;
    @XmlElement(name = "IndvRjctnRsn", required = true)
    protected String indvRjctnRsn;

    /**
     * Gets the value of the elmtSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElmtSeqNb() {
        return elmtSeqNb;
    }

    /**
     * Sets the value of the elmtSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElmtSeqNb(BigDecimal value) {
        this.elmtSeqNb = value;
    }

    /**
     * Gets the value of the indvRjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndvRjctnRsn() {
        return indvRjctnRsn;
    }

    /**
     * Sets the value of the indvRjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndvRjctnRsn(String value) {
        this.indvRjctnRsn = value;
    }

}
