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
 * <p>Java class for Statement84 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Statement84">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtDtOrPrd" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}DateAndPeriod3Choice" minOccurs="0"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}Frequency26Choice" minOccurs="0"/>
 *         <element name="UpdTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}UpdateType16Choice" minOccurs="0"/>
 *         <element name="StmtBsis" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}StatementBasis9Choice" minOccurs="0"/>
 *         <element name="StmtTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}StatementType6Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement84", propOrder = {
    "stmtDtOrPrd",
    "frqcy",
    "updTp",
    "stmtBsis",
    "stmtTp"
})
public class Statement84 {

    @XmlElement(name = "StmtDtOrPrd")
    protected DateAndPeriod3Choice stmtDtOrPrd;
    @XmlElement(name = "Frqcy")
    protected Frequency26Choice frqcy;
    @XmlElement(name = "UpdTp")
    protected UpdateType16Choice updTp;
    @XmlElement(name = "StmtBsis")
    protected StatementBasis9Choice stmtBsis;
    @XmlElement(name = "StmtTp")
    protected StatementType6Choice stmtTp;

    /**
     * Gets the value of the stmtDtOrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPeriod3Choice }
     *     
     */
    public DateAndPeriod3Choice getStmtDtOrPrd() {
        return stmtDtOrPrd;
    }

    /**
     * Sets the value of the stmtDtOrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPeriod3Choice }
     *     
     */
    public void setStmtDtOrPrd(DateAndPeriod3Choice value) {
        this.stmtDtOrPrd = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency26Choice }
     *     
     */
    public Frequency26Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency26Choice }
     *     
     */
    public void setFrqcy(Frequency26Choice value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType16Choice }
     *     
     */
    public UpdateType16Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType16Choice }
     *     
     */
    public void setUpdTp(UpdateType16Choice value) {
        this.updTp = value;
    }

    /**
     * Gets the value of the stmtBsis property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasis9Choice }
     *     
     */
    public StatementBasis9Choice getStmtBsis() {
        return stmtBsis;
    }

    /**
     * Sets the value of the stmtBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasis9Choice }
     *     
     */
    public void setStmtBsis(StatementBasis9Choice value) {
        this.stmtBsis = value;
    }

    /**
     * Gets the value of the stmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType6Choice }
     *     
     */
    public StatementType6Choice getStmtTp() {
        return stmtTp;
    }

    /**
     * Sets the value of the stmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType6Choice }
     *     
     */
    public void setStmtTp(StatementType6Choice value) {
        this.stmtTp = value;
    }

}
