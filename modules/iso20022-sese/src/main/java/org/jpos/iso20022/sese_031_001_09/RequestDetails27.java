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

package org.jpos.iso20022.sese_031_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestDetails27 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestDetails27">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}References27"/>
 *         <element name="RstrctnRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}RestrictionIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AutomtcBrrwg" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}AutomaticBorrowing7Choice" minOccurs="0"/>
 *         <element name="RtnInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="Lkg" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}LinkageType3Choice" minOccurs="0"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}PriorityNumeric4Choice" minOccurs="0"/>
 *         <element name="OthrPrcg" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}GenericIdentification30" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrtlSttlmInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}SettlementTransactionCondition5Code" minOccurs="0"/>
 *         <element name="SctiesRTGS" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}SecuritiesRTGS4Choice" minOccurs="0"/>
 *         <element name="HldInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}HoldIndicator6" minOccurs="0"/>
 *         <element name="MtchgDnl" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}MatchingDenied3Choice" minOccurs="0"/>
 *         <element name="UnltrlSplt" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}UnilateralSplit3Choice" minOccurs="0"/>
 *         <element name="Lnkgs" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}Linkages62" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails27", propOrder = {
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
public class RequestDetails27 {

    @XmlElement(name = "Ref", required = true)
    protected References27 ref;
    @XmlElement(name = "RstrctnRef")
    protected List<RestrictionIdentification1> rstrctnRef;
    @XmlElement(name = "AutomtcBrrwg")
    protected AutomaticBorrowing7Choice automtcBrrwg;
    @XmlElement(name = "RtnInd")
    protected Boolean rtnInd;
    @XmlElement(name = "Lkg")
    protected LinkageType3Choice lkg;
    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "OthrPrcg")
    protected List<GenericIdentification30> othrPrcg;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS4Choice sctiesRTGS;
    @XmlElement(name = "HldInd")
    protected HoldIndicator6 hldInd;
    @XmlElement(name = "MtchgDnl")
    protected MatchingDenied3Choice mtchgDnl;
    @XmlElement(name = "UnltrlSplt")
    protected UnilateralSplit3Choice unltrlSplt;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages62> lnkgs;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References27 }
     *     
     */
    public References27 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References27 }
     *     
     */
    public void setRef(References27 value) {
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
     * {@link RestrictionIdentification1 }
     * 
     * 
     * @return
     *     The value of the rstrctnRef property.
     */
    public List<RestrictionIdentification1> getRstrctnRef() {
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
     *     {@link AutomaticBorrowing7Choice }
     *     
     */
    public AutomaticBorrowing7Choice getAutomtcBrrwg() {
        return automtcBrrwg;
    }

    /**
     * Sets the value of the automtcBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticBorrowing7Choice }
     *     
     */
    public void setAutomtcBrrwg(AutomaticBorrowing7Choice value) {
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
     *     {@link LinkageType3Choice }
     *     
     */
    public LinkageType3Choice getLkg() {
        return lkg;
    }

    /**
     * Sets the value of the lkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkageType3Choice }
     *     
     */
    public void setLkg(LinkageType3Choice value) {
        this.lkg = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public PriorityNumeric4Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public void setPrty(PriorityNumeric4Choice value) {
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
     * {@link GenericIdentification30 }
     * 
     * 
     * @return
     *     The value of the othrPrcg property.
     */
    public List<GenericIdentification30> getOthrPrcg() {
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
     *     {@link SecuritiesRTGS4Choice }
     *     
     */
    public SecuritiesRTGS4Choice getSctiesRTGS() {
        return sctiesRTGS;
    }

    /**
     * Sets the value of the sctiesRTGS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesRTGS4Choice }
     *     
     */
    public void setSctiesRTGS(SecuritiesRTGS4Choice value) {
        this.sctiesRTGS = value;
    }

    /**
     * Gets the value of the hldInd property.
     * 
     * @return
     *     possible object is
     *     {@link HoldIndicator6 }
     *     
     */
    public HoldIndicator6 getHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldIndicator6 }
     *     
     */
    public void setHldInd(HoldIndicator6 value) {
        this.hldInd = value;
    }

    /**
     * Gets the value of the mtchgDnl property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingDenied3Choice }
     *     
     */
    public MatchingDenied3Choice getMtchgDnl() {
        return mtchgDnl;
    }

    /**
     * Sets the value of the mtchgDnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingDenied3Choice }
     *     
     */
    public void setMtchgDnl(MatchingDenied3Choice value) {
        this.mtchgDnl = value;
    }

    /**
     * Gets the value of the unltrlSplt property.
     * 
     * @return
     *     possible object is
     *     {@link UnilateralSplit3Choice }
     *     
     */
    public UnilateralSplit3Choice getUnltrlSplt() {
        return unltrlSplt;
    }

    /**
     * Sets the value of the unltrlSplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnilateralSplit3Choice }
     *     
     */
    public void setUnltrlSplt(UnilateralSplit3Choice value) {
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
     * {@link Linkages62 }
     * 
     * 
     * @return
     *     The value of the lnkgs property.
     */
    public List<Linkages62> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<>();
        }
        return this.lnkgs;
    }

}
