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

package org.jpos.iso20022.semt_003_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Statement76 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Statement76">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptNb" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}Number3Choice" minOccurs="0"/>
 *         <element name="QryRef" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="StmtId" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="StmtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}DateAndDateTime2Choice"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}Frequency26Choice"/>
 *         <element name="UpdTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}UpdateType16Choice"/>
 *         <element name="StmtBsis" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}StatementBasis9Choice"/>
 *         <element name="ActvtyInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}YesNoIndicator"/>
 *         <element name="AudtdInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}YesNoIndicator"/>
 *         <element name="SubAcctInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}YesNoIndicator"/>
 *         <element name="TaxLotInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="SctyIntrstOrSetOff" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement76", propOrder = {
    "rptNb",
    "qryRef",
    "stmtId",
    "stmtDtTm",
    "frqcy",
    "updTp",
    "stmtBsis",
    "actvtyInd",
    "audtdInd",
    "subAcctInd",
    "taxLotInd",
    "sctyIntrstOrSetOff"
})
public class Statement76 {

    @XmlElement(name = "RptNb")
    protected Number3Choice rptNb;
    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "StmtId")
    protected String stmtId;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTime2Choice stmtDtTm;
    @XmlElement(name = "Frqcy", required = true)
    protected Frequency26Choice frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected UpdateType16Choice updTp;
    @XmlElement(name = "StmtBsis", required = true)
    protected StatementBasis9Choice stmtBsis;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "AudtdInd")
    protected boolean audtdInd;
    @XmlElement(name = "SubAcctInd")
    protected boolean subAcctInd;
    @XmlElement(name = "TaxLotInd")
    protected Boolean taxLotInd;
    @XmlElement(name = "SctyIntrstOrSetOff")
    protected Boolean sctyIntrstOrSetOff;

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

    /**
     * Gets the value of the audtdInd property.
     * 
     */
    public boolean isAudtdInd() {
        return audtdInd;
    }

    /**
     * Sets the value of the audtdInd property.
     * 
     */
    public void setAudtdInd(boolean value) {
        this.audtdInd = value;
    }

    /**
     * Gets the value of the subAcctInd property.
     * 
     */
    public boolean isSubAcctInd() {
        return subAcctInd;
    }

    /**
     * Sets the value of the subAcctInd property.
     * 
     */
    public void setSubAcctInd(boolean value) {
        this.subAcctInd = value;
    }

    /**
     * Gets the value of the taxLotInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxLotInd() {
        return taxLotInd;
    }

    /**
     * Sets the value of the taxLotInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxLotInd(Boolean value) {
        this.taxLotInd = value;
    }

    /**
     * Gets the value of the sctyIntrstOrSetOff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctyIntrstOrSetOff() {
        return sctyIntrstOrSetOff;
    }

    /**
     * Sets the value of the sctyIntrstOrSetOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSctyIntrstOrSetOff(Boolean value) {
        this.sctyIntrstOrSetOff = value;
    }

}
