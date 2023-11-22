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

package org.jpos.iso20022.seev_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionDate4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionDate4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CpnClpngDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="CnsntXprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="CnsntRcrdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="EarlstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="MktDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="RspnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="DdlnToSplt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="QtnSetngDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="SbcptCostDbtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate4", propOrder = {
    "cpnClpngDt",
    "cnsntXprtnDt",
    "cnsntRcrdDt",
    "pmtDt",
    "earlstPmtDt",
    "mktDdln",
    "rspnDdln",
    "ddlnToSplt",
    "xpryDt",
    "qtnSetngDt",
    "sbcptCostDbtDt"
})
public class CorporateActionDate4 {

    @XmlElement(name = "CpnClpngDt")
    protected DateFormat4Choice cpnClpngDt;
    @XmlElement(name = "CnsntXprtnDt")
    protected DateFormat4Choice cnsntXprtnDt;
    @XmlElement(name = "CnsntRcrdDt")
    protected DateFormat4Choice cnsntRcrdDt;
    @XmlElement(name = "PmtDt")
    protected DateFormat4Choice pmtDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat4Choice earlstPmtDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat4Choice mktDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat4Choice rspnDdln;
    @XmlElement(name = "DdlnToSplt")
    protected DateFormat4Choice ddlnToSplt;
    @XmlElement(name = "XpryDt")
    protected DateFormat4Choice xpryDt;
    @XmlElement(name = "QtnSetngDt")
    protected DateFormat4Choice qtnSetngDt;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat4Choice sbcptCostDbtDt;

    /**
     * Gets the value of the cpnClpngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCpnClpngDt() {
        return cpnClpngDt;
    }

    /**
     * Sets the value of the cpnClpngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setCpnClpngDt(DateFormat4Choice value) {
        this.cpnClpngDt = value;
    }

    /**
     * Gets the value of the cnsntXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCnsntXprtnDt() {
        return cnsntXprtnDt;
    }

    /**
     * Sets the value of the cnsntXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setCnsntXprtnDt(DateFormat4Choice value) {
        this.cnsntXprtnDt = value;
    }

    /**
     * Gets the value of the cnsntRcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCnsntRcrdDt() {
        return cnsntRcrdDt;
    }

    /**
     * Sets the value of the cnsntRcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setCnsntRcrdDt(DateFormat4Choice value) {
        this.cnsntRcrdDt = value;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setPmtDt(DateFormat4Choice value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setEarlstPmtDt(DateFormat4Choice value) {
        this.earlstPmtDt = value;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setMktDdln(DateFormat4Choice value) {
        this.mktDdln = value;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setRspnDdln(DateFormat4Choice value) {
        this.rspnDdln = value;
    }

    /**
     * Gets the value of the ddlnToSplt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getDdlnToSplt() {
        return ddlnToSplt;
    }

    /**
     * Sets the value of the ddlnToSplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setDdlnToSplt(DateFormat4Choice value) {
        this.ddlnToSplt = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setXpryDt(DateFormat4Choice value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the qtnSetngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getQtnSetngDt() {
        return qtnSetngDt;
    }

    /**
     * Sets the value of the qtnSetngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setQtnSetngDt(DateFormat4Choice value) {
        this.qtnSetngDt = value;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setSbcptCostDbtDt(DateFormat4Choice value) {
        this.sbcptCostDbtDt = value;
    }

}
