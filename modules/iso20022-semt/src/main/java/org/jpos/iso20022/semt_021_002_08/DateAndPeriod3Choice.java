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

package org.jpos.iso20022.semt_021_002_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateAndPeriod3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateAndPeriod3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="StmtDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}DateAndDateTime2Choice"/>
 *         <element name="StmtPrd" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}Period7Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndPeriod3Choice", propOrder = {
    "stmtDt",
    "stmtPrd"
})
public class DateAndPeriod3Choice {

    @XmlElement(name = "StmtDt")
    protected DateAndDateTime2Choice stmtDt;
    @XmlElement(name = "StmtPrd")
    protected Period7Choice stmtPrd;

    /**
     * Gets the value of the stmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getStmtDt() {
        return stmtDt;
    }

    /**
     * Sets the value of the stmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setStmtDt(DateAndDateTime2Choice value) {
        this.stmtDt = value;
    }

    /**
     * Gets the value of the stmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period7Choice }
     *     
     */
    public Period7Choice getStmtPrd() {
        return stmtPrd;
    }

    /**
     * Sets the value of the stmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period7Choice }
     *     
     */
    public void setStmtPrd(Period7Choice value) {
        this.stmtPrd = value;
    }

}
