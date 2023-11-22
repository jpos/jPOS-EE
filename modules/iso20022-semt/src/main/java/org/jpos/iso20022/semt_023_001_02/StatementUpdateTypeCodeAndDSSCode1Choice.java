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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementUpdateTypeCodeAndDSSCode1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatementUpdateTypeCodeAndDSSCode1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="StmtUpdTpAsCd" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}StatementUpdateType1Code"/>
 *         <element name="StmtUpdTpAsDSS" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}GenericIdentification7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementUpdateTypeCodeAndDSSCode1Choice", propOrder = {
    "stmtUpdTpAsCd",
    "stmtUpdTpAsDSS"
})
public class StatementUpdateTypeCodeAndDSSCode1Choice {

    @XmlElement(name = "StmtUpdTpAsCd")
    @XmlSchemaType(name = "string")
    protected StatementUpdateType1Code stmtUpdTpAsCd;
    @XmlElement(name = "StmtUpdTpAsDSS")
    protected GenericIdentification7 stmtUpdTpAsDSS;

    /**
     * Gets the value of the stmtUpdTpAsCd property.
     * 
     * @return
     *     possible object is
     *     {@link StatementUpdateType1Code }
     *     
     */
    public StatementUpdateType1Code getStmtUpdTpAsCd() {
        return stmtUpdTpAsCd;
    }

    /**
     * Sets the value of the stmtUpdTpAsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementUpdateType1Code }
     *     
     */
    public void setStmtUpdTpAsCd(StatementUpdateType1Code value) {
        this.stmtUpdTpAsCd = value;
    }

    /**
     * Gets the value of the stmtUpdTpAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification7 }
     *     
     */
    public GenericIdentification7 getStmtUpdTpAsDSS() {
        return stmtUpdTpAsDSS;
    }

    /**
     * Sets the value of the stmtUpdTpAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification7 }
     *     
     */
    public void setStmtUpdTpAsDSS(GenericIdentification7 value) {
        this.stmtUpdTpAsDSS = value;
    }

}
