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

package org.jpos.iso20022.auth_065_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackTestingMethodology1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BackTestingMethodology1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RskMdlTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.065.001.01}ModelType1Choice"/>
 *         <element name="MdlCnfdncLvl" type="{urn:iso:std:iso:20022:tech:xsd:auth.065.001.01}BaseOneRate"/>
 *         <element name="VartnMrgnCleanInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.065.001.01}TrueFalseIndicator"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:auth.065.001.01}Max2000Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackTestingMethodology1", propOrder = {
    "rskMdlTp",
    "mdlCnfdncLvl",
    "vartnMrgnCleanInd",
    "desc"
})
public class BackTestingMethodology1 {

    @XmlElement(name = "RskMdlTp", required = true)
    protected ModelType1Choice rskMdlTp;
    @XmlElement(name = "MdlCnfdncLvl", required = true)
    protected BigDecimal mdlCnfdncLvl;
    @XmlElement(name = "VartnMrgnCleanInd")
    protected boolean vartnMrgnCleanInd;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the rskMdlTp property.
     * 
     * @return
     *     possible object is
     *     {@link ModelType1Choice }
     *     
     */
    public ModelType1Choice getRskMdlTp() {
        return rskMdlTp;
    }

    /**
     * Sets the value of the rskMdlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelType1Choice }
     *     
     */
    public void setRskMdlTp(ModelType1Choice value) {
        this.rskMdlTp = value;
    }

    /**
     * Gets the value of the mdlCnfdncLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMdlCnfdncLvl() {
        return mdlCnfdncLvl;
    }

    /**
     * Sets the value of the mdlCnfdncLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMdlCnfdncLvl(BigDecimal value) {
        this.mdlCnfdncLvl = value;
    }

    /**
     * Gets the value of the vartnMrgnCleanInd property.
     * 
     */
    public boolean isVartnMrgnCleanInd() {
        return vartnMrgnCleanInd;
    }

    /**
     * Sets the value of the vartnMrgnCleanInd property.
     * 
     */
    public void setVartnMrgnCleanInd(boolean value) {
        this.vartnMrgnCleanInd = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
