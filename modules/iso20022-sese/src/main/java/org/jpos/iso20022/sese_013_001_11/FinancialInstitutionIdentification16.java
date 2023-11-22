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

package org.jpos.iso20022.sese_013_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstitutionIdentification16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstitutionIdentification16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BICFI" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}BICFIDec2014Identifier" minOccurs="0"/>
 *         <element name="ClrSysMmbId" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}ClearingSystemMemberIdentification4Choice" minOccurs="0"/>
 *         <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}NameAndAddress5" minOccurs="0"/>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}LEIIdentifier" minOccurs="0"/>
 *         <element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}Max35Text" minOccurs="0"/>
 *         <element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}BranchData2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionIdentification16", propOrder = {
    "bicfi",
    "clrSysMmbId",
    "nmAndAdr",
    "lei",
    "prtryId",
    "brnchId"
})
public class FinancialInstitutionIdentification16 {

    @XmlElement(name = "BICFI")
    protected String bicfi;
    @XmlElement(name = "ClrSysMmbId")
    protected ClearingSystemMemberIdentification4Choice clrSysMmbId;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress5 nmAndAdr;
    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "PrtryId")
    protected String prtryId;
    @XmlElement(name = "BrnchId")
    protected BranchData2 brnchId;

    /**
     * Gets the value of the bicfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICFI() {
        return bicfi;
    }

    /**
     * Sets the value of the bicfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICFI(String value) {
        this.bicfi = value;
    }

    /**
     * Gets the value of the clrSysMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemMemberIdentification4Choice }
     *     
     */
    public ClearingSystemMemberIdentification4Choice getClrSysMmbId() {
        return clrSysMmbId;
    }

    /**
     * Sets the value of the clrSysMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemMemberIdentification4Choice }
     *     
     */
    public void setClrSysMmbId(ClearingSystemMemberIdentification4Choice value) {
        this.clrSysMmbId = value;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress5 }
     *     
     */
    public NameAndAddress5 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress5 }
     *     
     */
    public void setNmAndAdr(NameAndAddress5 value) {
        this.nmAndAdr = value;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtryId(String value) {
        this.prtryId = value;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData2 }
     *     
     */
    public BranchData2 getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData2 }
     *     
     */
    public void setBrnchId(BranchData2 value) {
        this.brnchId = value;
    }

}
