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

package org.jpos.iso20022.catm_002_001_11;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputData5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InputData5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DvcTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}SaleCapabilities2Code"/>
 *         <element name="InfQlfr" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}InformationQualify1Code"/>
 *         <element name="InptCmd" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}InputCommand1Code"/>
 *         <element name="NtfyCardInptFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TrueFalseIndicator"/>
 *         <element name="MaxInptTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}Number" minOccurs="0"/>
 *         <element name="InptTxt" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}ActionMessage10" minOccurs="0"/>
 *         <element name="ImdtRspnFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="WaitUsrVldtnFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="BeepKeyFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="GblCrrctnFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DsblCclFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DsblCrrctFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DsblVldFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MenuBckFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputData5", propOrder = {
    "dvcTp",
    "infQlfr",
    "inptCmd",
    "ntfyCardInptFlg",
    "maxInptTm",
    "inptTxt",
    "imdtRspnFlg",
    "waitUsrVldtnFlg",
    "beepKeyFlg",
    "gblCrrctnFlg",
    "dsblCclFlg",
    "dsblCrrctFlg",
    "dsblVldFlg",
    "menuBckFlg"
})
public class InputData5 {

    @XmlElement(name = "DvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected SaleCapabilities2Code dvcTp;
    @XmlElement(name = "InfQlfr", required = true)
    @XmlSchemaType(name = "string")
    protected InformationQualify1Code infQlfr;
    @XmlElement(name = "InptCmd", required = true)
    @XmlSchemaType(name = "string")
    protected InputCommand1Code inptCmd;
    @XmlElement(name = "NtfyCardInptFlg")
    protected boolean ntfyCardInptFlg;
    @XmlElement(name = "MaxInptTm")
    protected BigDecimal maxInptTm;
    @XmlElement(name = "InptTxt")
    protected ActionMessage10 inptTxt;
    @XmlElement(name = "ImdtRspnFlg")
    protected Boolean imdtRspnFlg;
    @XmlElement(name = "WaitUsrVldtnFlg")
    protected Boolean waitUsrVldtnFlg;
    @XmlElement(name = "BeepKeyFlg")
    protected Boolean beepKeyFlg;
    @XmlElement(name = "GblCrrctnFlg")
    protected Boolean gblCrrctnFlg;
    @XmlElement(name = "DsblCclFlg")
    protected Boolean dsblCclFlg;
    @XmlElement(name = "DsblCrrctFlg")
    protected Boolean dsblCrrctFlg;
    @XmlElement(name = "DsblVldFlg")
    protected Boolean dsblVldFlg;
    @XmlElement(name = "MenuBckFlg")
    protected Boolean menuBckFlg;

    /**
     * Gets the value of the dvcTp property.
     * 
     * @return
     *     possible object is
     *     {@link SaleCapabilities2Code }
     *     
     */
    public SaleCapabilities2Code getDvcTp() {
        return dvcTp;
    }

    /**
     * Sets the value of the dvcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleCapabilities2Code }
     *     
     */
    public void setDvcTp(SaleCapabilities2Code value) {
        this.dvcTp = value;
    }

    /**
     * Gets the value of the infQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link InformationQualify1Code }
     *     
     */
    public InformationQualify1Code getInfQlfr() {
        return infQlfr;
    }

    /**
     * Sets the value of the infQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationQualify1Code }
     *     
     */
    public void setInfQlfr(InformationQualify1Code value) {
        this.infQlfr = value;
    }

    /**
     * Gets the value of the inptCmd property.
     * 
     * @return
     *     possible object is
     *     {@link InputCommand1Code }
     *     
     */
    public InputCommand1Code getInptCmd() {
        return inptCmd;
    }

    /**
     * Sets the value of the inptCmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputCommand1Code }
     *     
     */
    public void setInptCmd(InputCommand1Code value) {
        this.inptCmd = value;
    }

    /**
     * Gets the value of the ntfyCardInptFlg property.
     * 
     */
    public boolean isNtfyCardInptFlg() {
        return ntfyCardInptFlg;
    }

    /**
     * Sets the value of the ntfyCardInptFlg property.
     * 
     */
    public void setNtfyCardInptFlg(boolean value) {
        this.ntfyCardInptFlg = value;
    }

    /**
     * Gets the value of the maxInptTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxInptTm() {
        return maxInptTm;
    }

    /**
     * Sets the value of the maxInptTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxInptTm(BigDecimal value) {
        this.maxInptTm = value;
    }

    /**
     * Gets the value of the inptTxt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage10 }
     *     
     */
    public ActionMessage10 getInptTxt() {
        return inptTxt;
    }

    /**
     * Sets the value of the inptTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage10 }
     *     
     */
    public void setInptTxt(ActionMessage10 value) {
        this.inptTxt = value;
    }

    /**
     * Gets the value of the imdtRspnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImdtRspnFlg() {
        return imdtRspnFlg;
    }

    /**
     * Sets the value of the imdtRspnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImdtRspnFlg(Boolean value) {
        this.imdtRspnFlg = value;
    }

    /**
     * Gets the value of the waitUsrVldtnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitUsrVldtnFlg() {
        return waitUsrVldtnFlg;
    }

    /**
     * Sets the value of the waitUsrVldtnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitUsrVldtnFlg(Boolean value) {
        this.waitUsrVldtnFlg = value;
    }

    /**
     * Gets the value of the beepKeyFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeepKeyFlg() {
        return beepKeyFlg;
    }

    /**
     * Sets the value of the beepKeyFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeepKeyFlg(Boolean value) {
        this.beepKeyFlg = value;
    }

    /**
     * Gets the value of the gblCrrctnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGblCrrctnFlg() {
        return gblCrrctnFlg;
    }

    /**
     * Sets the value of the gblCrrctnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGblCrrctnFlg(Boolean value) {
        this.gblCrrctnFlg = value;
    }

    /**
     * Gets the value of the dsblCclFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDsblCclFlg() {
        return dsblCclFlg;
    }

    /**
     * Sets the value of the dsblCclFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDsblCclFlg(Boolean value) {
        this.dsblCclFlg = value;
    }

    /**
     * Gets the value of the dsblCrrctFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDsblCrrctFlg() {
        return dsblCrrctFlg;
    }

    /**
     * Sets the value of the dsblCrrctFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDsblCrrctFlg(Boolean value) {
        this.dsblCrrctFlg = value;
    }

    /**
     * Gets the value of the dsblVldFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDsblVldFlg() {
        return dsblVldFlg;
    }

    /**
     * Sets the value of the dsblVldFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDsblVldFlg(Boolean value) {
        this.dsblVldFlg = value;
    }

    /**
     * Gets the value of the menuBckFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMenuBckFlg() {
        return menuBckFlg;
    }

    /**
     * Sets the value of the menuBckFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMenuBckFlg(Boolean value) {
        this.menuBckFlg = value;
    }

}
