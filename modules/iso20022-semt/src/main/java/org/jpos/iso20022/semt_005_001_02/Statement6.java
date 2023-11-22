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

package org.jpos.iso20022.semt_005_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Statement6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Statement6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ref" type="{urn:swift:xsd:semt.005.001.02}Max35Text"/>
 *         <element name="StmtDtTm" type="{urn:swift:xsd:semt.005.001.02}DateAndDateTimeChoice"/>
 *         <element name="CreDtTm" type="{urn:swift:xsd:semt.005.001.02}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="Frqcy" type="{urn:swift:xsd:semt.005.001.02}FrequencyCodeAndDSSCode1Choice"/>
 *         <element name="UpdTp" type="{urn:swift:xsd:semt.005.001.02}StatementUpdateTypeCodeAndDSSCodeChoice"/>
 *         <element name="ActvtyInd" type="{urn:swift:xsd:semt.005.001.02}YesNoIndicator"/>
 *         <element name="StmtBsis" type="{urn:swift:xsd:semt.005.001.02}StatementBasisCodeAndDSSCodeChoice"/>
 *         <element name="RptNb" type="{urn:swift:xsd:semt.005.001.02}Max5NumericText" minOccurs="0"/>
 *         <element name="AudtdInd" type="{urn:swift:xsd:semt.005.001.02}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement6", propOrder = {
    "ref",
    "stmtDtTm",
    "creDtTm",
    "frqcy",
    "updTp",
    "actvtyInd",
    "stmtBsis",
    "rptNb",
    "audtdInd"
})
public class Statement6 {

    @XmlElement(name = "Ref", required = true)
    protected String ref;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTimeChoice stmtDtTm;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTimeChoice creDtTm;
    @XmlElement(name = "Frqcy", required = true)
    protected FrequencyCodeAndDSSCode1Choice frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected StatementUpdateTypeCodeAndDSSCodeChoice updTp;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "StmtBsis", required = true)
    protected StatementBasisCodeAndDSSCodeChoice stmtBsis;
    @XmlElement(name = "RptNb")
    protected String rptNb;
    @XmlElement(name = "AudtdInd")
    protected boolean audtdInd;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the stmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getStmtDtTm() {
        return stmtDtTm;
    }

    /**
     * Sets the value of the stmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setStmtDtTm(DateAndDateTimeChoice value) {
        this.stmtDtTm = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setCreDtTm(DateAndDateTimeChoice value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyCodeAndDSSCode1Choice }
     *     
     */
    public FrequencyCodeAndDSSCode1Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyCodeAndDSSCode1Choice }
     *     
     */
    public void setFrqcy(FrequencyCodeAndDSSCode1Choice value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementUpdateTypeCodeAndDSSCodeChoice }
     *     
     */
    public StatementUpdateTypeCodeAndDSSCodeChoice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementUpdateTypeCodeAndDSSCodeChoice }
     *     
     */
    public void setUpdTp(StatementUpdateTypeCodeAndDSSCodeChoice value) {
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

    /**
     * Gets the value of the stmtBsis property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasisCodeAndDSSCodeChoice }
     *     
     */
    public StatementBasisCodeAndDSSCodeChoice getStmtBsis() {
        return stmtBsis;
    }

    /**
     * Sets the value of the stmtBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasisCodeAndDSSCodeChoice }
     *     
     */
    public void setStmtBsis(StatementBasisCodeAndDSSCodeChoice value) {
        this.stmtBsis = value;
    }

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptNb(String value) {
        this.rptNb = value;
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

}
