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

package org.jpos.iso20022.sese_022_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusOrStatement11Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusOrStatement11Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="StsAdvc" type="{urn:iso:std:iso:20022:tech:xsd:sese.022.001.06}DocumentNumber18"/>
 *         <element name="Stmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.022.001.06}DocumentNumber13"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusOrStatement11Choice", propOrder = {
    "stsAdvc",
    "stmt"
})
public class StatusOrStatement11Choice {

    @XmlElement(name = "StsAdvc")
    protected DocumentNumber18 stsAdvc;
    @XmlElement(name = "Stmt")
    protected DocumentNumber13 stmt;

    /**
     * Gets the value of the stsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber18 }
     *     
     */
    public DocumentNumber18 getStsAdvc() {
        return stsAdvc;
    }

    /**
     * Sets the value of the stsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber18 }
     *     
     */
    public void setStsAdvc(DocumentNumber18 value) {
        this.stsAdvc = value;
    }

    /**
     * Gets the value of the stmt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber13 }
     *     
     */
    public DocumentNumber13 getStmt() {
        return stmt;
    }

    /**
     * Sets the value of the stmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber13 }
     *     
     */
    public void setStmt(DocumentNumber13 value) {
        this.stmt = value;
    }

}
