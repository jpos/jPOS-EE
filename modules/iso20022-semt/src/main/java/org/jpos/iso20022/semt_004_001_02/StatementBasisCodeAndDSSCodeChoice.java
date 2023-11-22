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

package org.jpos.iso20022.semt_004_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementBasisCodeAndDSSCodeChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatementBasisCodeAndDSSCodeChoice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="StmtBsisAsCd" type="{urn:swift:xsd:semt.004.001.02}StatementBasis1Code"/>
 *           <element name="StmtBsisAsDSS" type="{urn:swift:xsd:semt.004.001.02}GenericIdentification7"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementBasisCodeAndDSSCodeChoice", propOrder = {
    "stmtBsisAsCd",
    "stmtBsisAsDSS"
})
public class StatementBasisCodeAndDSSCodeChoice {

    @XmlElement(name = "StmtBsisAsCd")
    @XmlSchemaType(name = "string")
    protected StatementBasis1Code stmtBsisAsCd;
    @XmlElement(name = "StmtBsisAsDSS")
    protected GenericIdentification7 stmtBsisAsDSS;

    /**
     * Gets the value of the stmtBsisAsCd property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasis1Code }
     *     
     */
    public StatementBasis1Code getStmtBsisAsCd() {
        return stmtBsisAsCd;
    }

    /**
     * Sets the value of the stmtBsisAsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasis1Code }
     *     
     */
    public void setStmtBsisAsCd(StatementBasis1Code value) {
        this.stmtBsisAsCd = value;
    }

    /**
     * Gets the value of the stmtBsisAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification7 }
     *     
     */
    public GenericIdentification7 getStmtBsisAsDSS() {
        return stmtBsisAsDSS;
    }

    /**
     * Sets the value of the stmtBsisAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification7 }
     *     
     */
    public void setStmtBsisAsDSS(GenericIdentification7 value) {
        this.stmtBsisAsDSS = value;
    }

}
