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

package org.jpos.iso20022.auth_025_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentEntryAmendment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentEntryAmendment1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CrrctgNtryNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}Number"/>
 *         <element name="OrgnlDoc" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}DocumentIdentification28"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentEntryAmendment1", propOrder = {
    "crrctgNtryNb",
    "orgnlDoc"
})
public class DocumentEntryAmendment1 {

    @XmlElement(name = "CrrctgNtryNb", required = true)
    protected BigDecimal crrctgNtryNb;
    @XmlElement(name = "OrgnlDoc", required = true)
    protected DocumentIdentification28 orgnlDoc;

    /**
     * Gets the value of the crrctgNtryNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrrctgNtryNb() {
        return crrctgNtryNb;
    }

    /**
     * Sets the value of the crrctgNtryNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCrrctgNtryNb(BigDecimal value) {
        this.crrctgNtryNb = value;
    }

    /**
     * Gets the value of the orgnlDoc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public DocumentIdentification28 getOrgnlDoc() {
        return orgnlDoc;
    }

    /**
     * Sets the value of the orgnlDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public void setOrgnlDoc(DocumentIdentification28 value) {
        this.orgnlDoc = value;
    }

}
