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

package org.jpos.iso20022.reda_004_001_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIdentification41 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityIdentification41">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}SecurityIdentification40"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max350Text"/>
 *         <element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max35Text" minOccurs="0"/>
 *         <element name="ClssTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max35Text" minOccurs="0"/>
 *         <element name="UmbrllNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max35Text" minOccurs="0"/>
 *         <element name="NewUmbrll" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}SecurityClassificationType2Choice" minOccurs="0"/>
 *         <element name="BaseCcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="CtryOfDmcl" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}CountryCode" minOccurs="0"/>
 *         <element name="RegdDstrbtnCtry" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdctTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ProductStructure1Choice" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ContactAttributes5" minOccurs="0"/>
 *         <element name="IssrPdctGovncPrc" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}GovernanceProcess1Choice" minOccurs="0"/>
 *         <element name="PdctCtgy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max140Text" minOccurs="0"/>
 *         <element name="PdctCtgyDE" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max140Text" minOccurs="0"/>
 *         <element name="NtnlOrUnitBased" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}NotionalOrUnitBased1Choice" minOccurs="0"/>
 *         <element name="QtnTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}QuotationType1Choice" minOccurs="0"/>
 *         <element name="LvrgdOrCntgntLblty" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="NoRtrcssnInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="ExPstCostClctnBsis" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ExPostCostCalculationBasis1Choice" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification41", propOrder = {
    "id",
    "nm",
    "shrtNm",
    "clssTp",
    "umbrllNm",
    "newUmbrll",
    "clssfctnTp",
    "baseCcy",
    "ctryOfDmcl",
    "regdDstrbtnCtry",
    "pdctTp",
    "issr",
    "issrPdctGovncPrc",
    "pdctCtgy",
    "pdctCtgyDE",
    "ntnlOrUnitBased",
    "qtnTp",
    "lvrgdOrCntgntLblty",
    "noRtrcssnInd",
    "exPstCostClctnBsis",
    "addtlInf"
})
public class SecurityIdentification41 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification40 id;
    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "UmbrllNm")
    protected String umbrllNm;
    @XmlElement(name = "NewUmbrll")
    protected Boolean newUmbrll;
    @XmlElement(name = "ClssfctnTp")
    protected SecurityClassificationType2Choice clssfctnTp;
    @XmlElement(name = "BaseCcy")
    protected String baseCcy;
    @XmlElement(name = "CtryOfDmcl")
    protected String ctryOfDmcl;
    @XmlElement(name = "RegdDstrbtnCtry")
    protected List<String> regdDstrbtnCtry;
    @XmlElement(name = "PdctTp")
    protected ProductStructure1Choice pdctTp;
    @XmlElement(name = "Issr")
    protected ContactAttributes5 issr;
    @XmlElement(name = "IssrPdctGovncPrc")
    protected GovernanceProcess1Choice issrPdctGovncPrc;
    @XmlElement(name = "PdctCtgy")
    protected String pdctCtgy;
    @XmlElement(name = "PdctCtgyDE")
    protected String pdctCtgyDE;
    @XmlElement(name = "NtnlOrUnitBased")
    protected NotionalOrUnitBased1Choice ntnlOrUnitBased;
    @XmlElement(name = "QtnTp")
    protected QuotationType1Choice qtnTp;
    @XmlElement(name = "LvrgdOrCntgntLblty")
    protected Boolean lvrgdOrCntgntLblty;
    @XmlElement(name = "NoRtrcssnInd")
    protected Boolean noRtrcssnInd;
    @XmlElement(name = "ExPstCostClctnBsis")
    protected ExPostCostCalculationBasis1Choice exPstCostClctnBsis;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification40 }
     *     
     */
    public SecurityIdentification40 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification40 }
     *     
     */
    public void setId(SecurityIdentification40 value) {
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
     * Gets the value of the umbrllNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmbrllNm() {
        return umbrllNm;
    }

    /**
     * Sets the value of the umbrllNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmbrllNm(String value) {
        this.umbrllNm = value;
    }

    /**
     * Gets the value of the newUmbrll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewUmbrll() {
        return newUmbrll;
    }

    /**
     * Sets the value of the newUmbrll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewUmbrll(Boolean value) {
        this.newUmbrll = value;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityClassificationType2Choice }
     *     
     */
    public SecurityClassificationType2Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityClassificationType2Choice }
     *     
     */
    public void setClssfctnTp(SecurityClassificationType2Choice value) {
        this.clssfctnTp = value;
    }

    /**
     * Gets the value of the baseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcy() {
        return baseCcy;
    }

    /**
     * Sets the value of the baseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCcy(String value) {
        this.baseCcy = value;
    }

    /**
     * Gets the value of the ctryOfDmcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfDmcl() {
        return ctryOfDmcl;
    }

    /**
     * Sets the value of the ctryOfDmcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfDmcl(String value) {
        this.ctryOfDmcl = value;
    }

    /**
     * Gets the value of the regdDstrbtnCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the regdDstrbtnCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdDstrbtnCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the regdDstrbtnCtry property.
     */
    public List<String> getRegdDstrbtnCtry() {
        if (regdDstrbtnCtry == null) {
            regdDstrbtnCtry = new ArrayList<>();
        }
        return this.regdDstrbtnCtry;
    }

    /**
     * Gets the value of the pdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStructure1Choice }
     *     
     */
    public ProductStructure1Choice getPdctTp() {
        return pdctTp;
    }

    /**
     * Sets the value of the pdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStructure1Choice }
     *     
     */
    public void setPdctTp(ProductStructure1Choice value) {
        this.pdctTp = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public void setIssr(ContactAttributes5 value) {
        this.issr = value;
    }

    /**
     * Gets the value of the issrPdctGovncPrc property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceProcess1Choice }
     *     
     */
    public GovernanceProcess1Choice getIssrPdctGovncPrc() {
        return issrPdctGovncPrc;
    }

    /**
     * Sets the value of the issrPdctGovncPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceProcess1Choice }
     *     
     */
    public void setIssrPdctGovncPrc(GovernanceProcess1Choice value) {
        this.issrPdctGovncPrc = value;
    }

    /**
     * Gets the value of the pdctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCtgy() {
        return pdctCtgy;
    }

    /**
     * Sets the value of the pdctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctCtgy(String value) {
        this.pdctCtgy = value;
    }

    /**
     * Gets the value of the pdctCtgyDE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCtgyDE() {
        return pdctCtgyDE;
    }

    /**
     * Sets the value of the pdctCtgyDE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctCtgyDE(String value) {
        this.pdctCtgyDE = value;
    }

    /**
     * Gets the value of the ntnlOrUnitBased property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalOrUnitBased1Choice }
     *     
     */
    public NotionalOrUnitBased1Choice getNtnlOrUnitBased() {
        return ntnlOrUnitBased;
    }

    /**
     * Sets the value of the ntnlOrUnitBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalOrUnitBased1Choice }
     *     
     */
    public void setNtnlOrUnitBased(NotionalOrUnitBased1Choice value) {
        this.ntnlOrUnitBased = value;
    }

    /**
     * Gets the value of the qtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationType1Choice }
     *     
     */
    public QuotationType1Choice getQtnTp() {
        return qtnTp;
    }

    /**
     * Sets the value of the qtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationType1Choice }
     *     
     */
    public void setQtnTp(QuotationType1Choice value) {
        this.qtnTp = value;
    }

    /**
     * Gets the value of the lvrgdOrCntgntLblty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLvrgdOrCntgntLblty() {
        return lvrgdOrCntgntLblty;
    }

    /**
     * Sets the value of the lvrgdOrCntgntLblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLvrgdOrCntgntLblty(Boolean value) {
        this.lvrgdOrCntgntLblty = value;
    }

    /**
     * Gets the value of the noRtrcssnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoRtrcssnInd() {
        return noRtrcssnInd;
    }

    /**
     * Sets the value of the noRtrcssnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoRtrcssnInd(Boolean value) {
        this.noRtrcssnInd = value;
    }

    /**
     * Gets the value of the exPstCostClctnBsis property.
     * 
     * @return
     *     possible object is
     *     {@link ExPostCostCalculationBasis1Choice }
     *     
     */
    public ExPostCostCalculationBasis1Choice getExPstCostClctnBsis() {
        return exPstCostClctnBsis;
    }

    /**
     * Sets the value of the exPstCostClctnBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExPostCostCalculationBasis1Choice }
     *     
     */
    public void setExPstCostClctnBsis(ExPostCostCalculationBasis1Choice value) {
        this.exPstCostClctnBsis = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
