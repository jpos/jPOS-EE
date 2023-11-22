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

package org.jpos.iso20022.semt_019_002_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Statement69 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Statement69">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptNb" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}Number3Choice" minOccurs="0"/>
 *         <element name="QryRef" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="StmtId" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="StmtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}DateAndDateTime2Choice"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}Frequency26Choice" minOccurs="0"/>
 *         <element name="UpdTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}UpdateType16Choice" minOccurs="0"/>
 *         <element name="ActvtyInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement69", propOrder = {
    "rptNb",
    "qryRef",
    "stmtId",
    "stmtDtTm",
    "frqcy",
    "updTp",
    "actvtyInd"
})
public class Statement69 {

    @XmlElement(name = "RptNb")
    protected Number3Choice rptNb;
    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "StmtId")
    protected String stmtId;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTime2Choice stmtDtTm;
    @XmlElement(name = "Frqcy")
    protected Frequency26Choice frqcy;
    @XmlElement(name = "UpdTp")
    protected UpdateType16Choice updTp;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number3Choice }
     *     
     */
    public Number3Choice getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number3Choice }
     *     
     */
    public void setRptNb(Number3Choice value) {
        this.rptNb = value;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryRef(String value) {
        this.qryRef = value;
    }

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtId(String value) {
        this.stmtId = value;
    }

    /**
     * Gets the value of the stmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getStmtDtTm() {
        return stmtDtTm;
    }

    /**
     * Sets the value of the stmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setStmtDtTm(DateAndDateTime2Choice value) {
        this.stmtDtTm = value;
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
     * Gets the value of the actvtyInd property.
     * 
     */
    public boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     */
    public void setActvtyInd(boolean value) {
        this.actvtyInd = value;
    }

}
