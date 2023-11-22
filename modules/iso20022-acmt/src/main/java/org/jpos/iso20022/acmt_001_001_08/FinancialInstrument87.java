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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrument87 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrument87">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}SecurityIdentification25Choice"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max350Text" minOccurs="0"/>
 *         <element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text" minOccurs="0"/>
 *         <element name="SplmtryId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text" minOccurs="0"/>
 *         <element name="ClssTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text" minOccurs="0"/>
 *         <element name="SctiesForm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}FormOfSecurity1Code" minOccurs="0"/>
 *         <element name="DstrbtnPlcy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}DistributionPolicy1Code" minOccurs="0"/>
 *         <element name="PdctGrp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max140Text" minOccurs="0"/>
 *         <element name="BlckdHldgDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}BlockedHoldingDetails2" minOccurs="0"/>
 *         <element name="Pldgg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Eligible1Code" minOccurs="0"/>
 *         <element name="Coll" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Collateral1Code" minOccurs="0"/>
 *         <element name="ThrdPtyRghts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ThirdPartyRights2" minOccurs="0"/>
 *         <element name="FndOwnrsh" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}FundOwnership1Code" minOccurs="0"/>
 *         <element name="FndIntntn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}FundIntention1Code" minOccurs="0"/>
 *         <element name="OprlSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}OperationalStatus1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument87", propOrder = {
    "id",
    "nm",
    "shrtNm",
    "splmtryId",
    "clssTp",
    "sctiesForm",
    "dstrbtnPlcy",
    "pdctGrp",
    "blckdHldgDtls",
    "pldgg",
    "coll",
    "thrdPtyRghts",
    "fndOwnrsh",
    "fndIntntn",
    "oprlSts"
})
public class FinancialInstrument87 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification25Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "SplmtryId")
    protected String splmtryId;
    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "DstrbtnPlcy")
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "PdctGrp")
    protected String pdctGrp;
    @XmlElement(name = "BlckdHldgDtls")
    protected BlockedHoldingDetails2 blckdHldgDtls;
    @XmlElement(name = "Pldgg")
    @XmlSchemaType(name = "string")
    protected Eligible1Code pldgg;
    @XmlElement(name = "Coll")
    @XmlSchemaType(name = "string")
    protected Collateral1Code coll;
    @XmlElement(name = "ThrdPtyRghts")
    protected ThirdPartyRights2 thrdPtyRghts;
    @XmlElement(name = "FndOwnrsh")
    @XmlSchemaType(name = "string")
    protected FundOwnership1Code fndOwnrsh;
    @XmlElement(name = "FndIntntn")
    @XmlSchemaType(name = "string")
    protected FundIntention1Code fndIntntn;
    @XmlElement(name = "OprlSts")
    @XmlSchemaType(name = "string")
    protected OperationalStatus1Code oprlSts;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public SecurityIdentification25Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public void setId(SecurityIdentification25Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtNm(String value) {
        this.shrtNm = value;
    }

    /**
     * Gets the value of the splmtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplmtryId() {
        return splmtryId;
    }

    /**
     * Sets the value of the splmtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplmtryId(String value) {
        this.splmtryId = value;
    }

    /**
     * Gets the value of the clssTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssTp() {
        return clssTp;
    }

    /**
     * Sets the value of the clssTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssTp(String value) {
        this.clssTp = value;
    }

    /**
     * Gets the value of the sctiesForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctiesForm() {
        return sctiesForm;
    }

    /**
     * Sets the value of the sctiesForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public void setSctiesForm(FormOfSecurity1Code value) {
        this.sctiesForm = value;
    }

    /**
     * Gets the value of the dstrbtnPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public DistributionPolicy1Code getDstrbtnPlcy() {
        return dstrbtnPlcy;
    }

    /**
     * Sets the value of the dstrbtnPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public void setDstrbtnPlcy(DistributionPolicy1Code value) {
        this.dstrbtnPlcy = value;
    }

    /**
     * Gets the value of the pdctGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctGrp() {
        return pdctGrp;
    }

    /**
     * Sets the value of the pdctGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctGrp(String value) {
        this.pdctGrp = value;
    }

    /**
     * Gets the value of the blckdHldgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BlockedHoldingDetails2 }
     *     
     */
    public BlockedHoldingDetails2 getBlckdHldgDtls() {
        return blckdHldgDtls;
    }

    /**
     * Sets the value of the blckdHldgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockedHoldingDetails2 }
     *     
     */
    public void setBlckdHldgDtls(BlockedHoldingDetails2 value) {
        this.blckdHldgDtls = value;
    }

    /**
     * Gets the value of the pldgg property.
     * 
     * @return
     *     possible object is
     *     {@link Eligible1Code }
     *     
     */
    public Eligible1Code getPldgg() {
        return pldgg;
    }

    /**
     * Sets the value of the pldgg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligible1Code }
     *     
     */
    public void setPldgg(Eligible1Code value) {
        this.pldgg = value;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral1Code }
     *     
     */
    public Collateral1Code getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral1Code }
     *     
     */
    public void setColl(Collateral1Code value) {
        this.coll = value;
    }

    /**
     * Gets the value of the thrdPtyRghts property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyRights2 }
     *     
     */
    public ThirdPartyRights2 getThrdPtyRghts() {
        return thrdPtyRghts;
    }

    /**
     * Sets the value of the thrdPtyRghts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyRights2 }
     *     
     */
    public void setThrdPtyRghts(ThirdPartyRights2 value) {
        this.thrdPtyRghts = value;
    }

    /**
     * Gets the value of the fndOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link FundOwnership1Code }
     *     
     */
    public FundOwnership1Code getFndOwnrsh() {
        return fndOwnrsh;
    }

    /**
     * Sets the value of the fndOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundOwnership1Code }
     *     
     */
    public void setFndOwnrsh(FundOwnership1Code value) {
        this.fndOwnrsh = value;
    }

    /**
     * Gets the value of the fndIntntn property.
     * 
     * @return
     *     possible object is
     *     {@link FundIntention1Code }
     *     
     */
    public FundIntention1Code getFndIntntn() {
        return fndIntntn;
    }

    /**
     * Sets the value of the fndIntntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundIntention1Code }
     *     
     */
    public void setFndIntntn(FundIntention1Code value) {
        this.fndIntntn = value;
    }

    /**
     * Gets the value of the oprlSts property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalStatus1Code }
     *     
     */
    public OperationalStatus1Code getOprlSts() {
        return oprlSts;
    }

    /**
     * Sets the value of the oprlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalStatus1Code }
     *     
     */
    public void setOprlSts(OperationalStatus1Code value) {
        this.oprlSts = value;
    }

}
