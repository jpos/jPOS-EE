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

package org.jpos.iso20022.colr_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Statement78 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Statement78">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtId" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Max35Text"/>
 *         <element name="RptNb" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Number3Choice" minOccurs="0"/>
 *         <element name="QryRef" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Max35Text" minOccurs="0"/>
 *         <element name="StmtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}DateAndDateTime2Choice"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Frequency22Choice"/>
 *         <element name="UpdTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}UpdateType15Choice"/>
 *         <element name="CollSd" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralRole1Code"/>
 *         <element name="StmtBsis" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}StatementBasis14Choice"/>
 *         <element name="StsTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}StatementStatusType1Code" minOccurs="0"/>
 *         <element name="SummryInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}YesNoIndicator"/>
 *         <element name="ActvtyInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement78", propOrder = {
    "stmtId",
    "rptNb",
    "qryRef",
    "stmtDtTm",
    "frqcy",
    "updTp",
    "collSd",
    "stmtBsis",
    "stsTp",
    "summryInd",
    "actvtyInd"
})
public class Statement78 {

    @XmlElement(name = "StmtId", required = true)
    protected String stmtId;
    @XmlElement(name = "RptNb")
    protected Number3Choice rptNb;
    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTime2Choice stmtDtTm;
    @XmlElement(name = "Frqcy", required = true)
    protected Frequency22Choice frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected UpdateType15Choice updTp;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "StmtBsis", required = true)
    protected StatementBasis14Choice stmtBsis;
    @XmlElement(name = "StsTp")
    @XmlSchemaType(name = "string")
    protected StatementStatusType1Code stsTp;
    @XmlElement(name = "SummryInd")
    protected boolean summryInd;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;

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
     *     {@link Frequency22Choice }
     *     
     */
    public Frequency22Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency22Choice }
     *     
     */
    public void setFrqcy(Frequency22Choice value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType15Choice }
     *     
     */
    public UpdateType15Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType15Choice }
     *     
     */
    public void setUpdTp(UpdateType15Choice value) {
        this.updTp = value;
    }

    /**
     * Gets the value of the collSd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Sets the value of the collSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public void setCollSd(CollateralRole1Code value) {
        this.collSd = value;
    }

    /**
     * Gets the value of the stmtBsis property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasis14Choice }
     *     
     */
    public StatementBasis14Choice getStmtBsis() {
        return stmtBsis;
    }

    /**
     * Sets the value of the stmtBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasis14Choice }
     *     
     */
    public void setStmtBsis(StatementBasis14Choice value) {
        this.stmtBsis = value;
    }

    /**
     * Gets the value of the stsTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementStatusType1Code }
     *     
     */
    public StatementStatusType1Code getStsTp() {
        return stsTp;
    }

    /**
     * Sets the value of the stsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementStatusType1Code }
     *     
     */
    public void setStsTp(StatementStatusType1Code value) {
        this.stsTp = value;
    }

    /**
     * Gets the value of the summryInd property.
     * 
     */
    public boolean isSummryInd() {
        return summryInd;
    }

    /**
     * Sets the value of the summryInd property.
     * 
     */
    public void setSummryInd(boolean value) {
        this.summryInd = value;
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
