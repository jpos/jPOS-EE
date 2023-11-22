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

package org.jpos.iso20022.sese_031_002_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestDetails29 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestDetails29">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}References28"/>
 *         <element name="RstrctnRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}RestrictionIdentification2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AutomtcBrrwg" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}AutomaticBorrowing11Choice" minOccurs="0"/>
 *         <element name="RtnInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="Lkg" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}LinkageType4Choice" minOccurs="0"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}PriorityNumeric5Choice" minOccurs="0"/>
 *         <element name="OthrPrcg" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}GenericIdentification47" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrtlSttlmInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}SettlementTransactionCondition5Code" minOccurs="0"/>
 *         <element name="SctiesRTGS" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}SecuritiesRTGS5Choice" minOccurs="0"/>
 *         <element name="HldInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}HoldIndicator7" minOccurs="0"/>
 *         <element name="MtchgDnl" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}MatchingDenied4Choice" minOccurs="0"/>
 *         <element name="UnltrlSplt" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}UnilateralSplit4Choice" minOccurs="0"/>
 *         <element name="Lnkgs" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}Linkages66" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails29", propOrder = {
    "ref",
    "rstrctnRef",
    "automtcBrrwg",
    "rtnInd",
    "lkg",
    "prty",
    "othrPrcg",
    "prtlSttlmInd",
    "sctiesRTGS",
    "hldInd",
    "mtchgDnl",
    "unltrlSplt",
    "lnkgs"
})
public class RequestDetails29 {

    @XmlElement(name = "Ref", required = true)
    protected References28 ref;
    @XmlElement(name = "RstrctnRef")
    protected List<RestrictionIdentification2> rstrctnRef;
    @XmlElement(name = "AutomtcBrrwg")
    protected AutomaticBorrowing11Choice automtcBrrwg;
    @XmlElement(name = "RtnInd")
    protected Boolean rtnInd;
    @XmlElement(name = "Lkg")
    protected LinkageType4Choice lkg;
    @XmlElement(name = "Prty")
    protected PriorityNumeric5Choice prty;
    @XmlElement(name = "OthrPrcg")
    protected List<GenericIdentification47> othrPrcg;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS5Choice sctiesRTGS;
    @XmlElement(name = "HldInd")
    protected HoldIndicator7 hldInd;
    @XmlElement(name = "MtchgDnl")
    protected MatchingDenied4Choice mtchgDnl;
    @XmlElement(name = "UnltrlSplt")
    protected UnilateralSplit4Choice unltrlSplt;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages66> lnkgs;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References28 }
     *     
     */
    public References28 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References28 }
     *     
     */
    public void setRef(References28 value) {
        this.ref = value;
    }

    /**
     * Gets the value of the rstrctnRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rstrctnRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrctnRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictionIdentification2 }
     * 
     * 
     * @return
     *     The value of the rstrctnRef property.
     */
    public List<RestrictionIdentification2> getRstrctnRef() {
        if (rstrctnRef == null) {
            rstrctnRef = new ArrayList<>();
        }
        return this.rstrctnRef;
    }

    /**
     * Gets the value of the automtcBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticBorrowing11Choice }
     *     
     */
    public AutomaticBorrowing11Choice getAutomtcBrrwg() {
        return automtcBrrwg;
    }

    /**
     * Sets the value of the automtcBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticBorrowing11Choice }
     *     
     */
    public void setAutomtcBrrwg(AutomaticBorrowing11Choice value) {
        this.automtcBrrwg = value;
    }

    /**
     * Gets the value of the rtnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtnInd() {
        return rtnInd;
    }

    /**
     * Sets the value of the rtnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtnInd(Boolean value) {
        this.rtnInd = value;
    }

    /**
     * Gets the value of the lkg property.
     * 
     * @return
     *     possible object is
     *     {@link LinkageType4Choice }
     *     
     */
    public LinkageType4Choice getLkg() {
        return lkg;
    }

    /**
     * Sets the value of the lkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkageType4Choice }
     *     
     */
    public void setLkg(LinkageType4Choice value) {
        this.lkg = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric5Choice }
     *     
     */
    public PriorityNumeric5Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric5Choice }
     *     
     */
    public void setPrty(PriorityNumeric5Choice value) {
        this.prty = value;
    }

    /**
     * Gets the value of the othrPrcg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPrcg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPrcg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification47 }
     * 
     * 
     * @return
     *     The value of the othrPrcg property.
     */
    public List<GenericIdentification47> getOthrPrcg() {
        if (othrPrcg == null) {
            othrPrcg = new ArrayList<>();
        }
        return this.othrPrcg;
    }

    /**
     * Gets the value of the prtlSttlmInd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public SettlementTransactionCondition5Code getPrtlSttlmInd() {
        return prtlSttlmInd;
    }

    /**
     * Sets the value of the prtlSttlmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public void setPrtlSttlmInd(SettlementTransactionCondition5Code value) {
        this.prtlSttlmInd = value;
    }

    /**
     * Gets the value of the sctiesRTGS property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesRTGS5Choice }
     *     
     */
    public SecuritiesRTGS5Choice getSctiesRTGS() {
        return sctiesRTGS;
    }

    /**
     * Sets the value of the sctiesRTGS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesRTGS5Choice }
     *     
     */
    public void setSctiesRTGS(SecuritiesRTGS5Choice value) {
        this.sctiesRTGS = value;
    }

    /**
     * Gets the value of the hldInd property.
     * 
     * @return
     *     possible object is
     *     {@link HoldIndicator7 }
     *     
     */
    public HoldIndicator7 getHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldIndicator7 }
     *     
     */
    public void setHldInd(HoldIndicator7 value) {
        this.hldInd = value;
    }

    /**
     * Gets the value of the mtchgDnl property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingDenied4Choice }
     *     
     */
    public MatchingDenied4Choice getMtchgDnl() {
        return mtchgDnl;
    }

    /**
     * Sets the value of the mtchgDnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingDenied4Choice }
     *     
     */
    public void setMtchgDnl(MatchingDenied4Choice value) {
        this.mtchgDnl = value;
    }

    /**
     * Gets the value of the unltrlSplt property.
     * 
     * @return
     *     possible object is
     *     {@link UnilateralSplit4Choice }
     *     
     */
    public UnilateralSplit4Choice getUnltrlSplt() {
        return unltrlSplt;
    }

    /**
     * Sets the value of the unltrlSplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnilateralSplit4Choice }
     *     
     */
    public void setUnltrlSplt(UnilateralSplit4Choice value) {
        this.unltrlSplt = value;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages66 }
     * 
     * 
     * @return
     *     The value of the lnkgs property.
     */
    public List<Linkages66> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<>();
        }
        return this.lnkgs;
    }

}
