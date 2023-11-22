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

package org.jpos.iso20022.seev_045_001_04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareholdersIdentificationDisclosureRequestV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShareholdersIdentificationDisclosureRequestV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IssrDsclsrReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}Max35Text"/>
 *         <element name="DsclsrReqTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}DisclosureRequestType1Code"/>
 *         <element name="PrvsDsclsrReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}Max35Text" minOccurs="0"/>
 *         <element name="FwdReqInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="RspnThrghChainInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="ShrhldrRghtsDrctvInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="PlcOfJursdctn" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}CountryCode" minOccurs="0"/>
 *         <element name="AplblLaw" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}Max140Text" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}SecurityIdentification19"/>
 *         <element name="ShrhldrsDsclsrRcrdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}DateFormat46Choice"/>
 *         <element name="ShrsQtyThrshld" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}DecimalNumber" minOccurs="0"/>
 *         <element name="ReqShrHeldDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}RequestShareHeldDate1Choice" minOccurs="0"/>
 *         <element name="DsclsrRspnRcpt" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}PartyIdentification214"/>
 *         <element name="IssrDsclsrDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}DateFormat46Choice"/>
 *         <element name="DsclsrRspnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}DateFormat46Choice" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}PartyIdentification129Choice" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareholdersIdentificationDisclosureRequestV04", propOrder = {
    "issrDsclsrReqId",
    "dsclsrReqTp",
    "prvsDsclsrReqId",
    "fwdReqInd",
    "rspnThrghChainInd",
    "shrhldrRghtsDrctvInd",
    "plcOfJursdctn",
    "aplblLaw",
    "finInstrmId",
    "shrhldrsDsclsrRcrdDt",
    "shrsQtyThrshld",
    "reqShrHeldDt",
    "dsclsrRspnRcpt",
    "issrDsclsrDdln",
    "dsclsrRspnDdln",
    "issr",
    "splmtryData"
})
public class ShareholdersIdentificationDisclosureRequestV04 {

    @XmlElement(name = "IssrDsclsrReqId", required = true)
    protected String issrDsclsrReqId;
    @XmlElement(name = "DsclsrReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected DisclosureRequestType1Code dsclsrReqTp;
    @XmlElement(name = "PrvsDsclsrReqId")
    protected String prvsDsclsrReqId;
    @XmlElement(name = "FwdReqInd")
    protected Boolean fwdReqInd;
    @XmlElement(name = "RspnThrghChainInd")
    protected Boolean rspnThrghChainInd;
    @XmlElement(name = "ShrhldrRghtsDrctvInd")
    protected Boolean shrhldrRghtsDrctvInd;
    @XmlElement(name = "PlcOfJursdctn")
    protected String plcOfJursdctn;
    @XmlElement(name = "AplblLaw")
    protected String aplblLaw;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "ShrhldrsDsclsrRcrdDt", required = true)
    protected DateFormat46Choice shrhldrsDsclsrRcrdDt;
    @XmlElement(name = "ShrsQtyThrshld")
    protected BigDecimal shrsQtyThrshld;
    @XmlElement(name = "ReqShrHeldDt")
    protected RequestShareHeldDate1Choice reqShrHeldDt;
    @XmlElement(name = "DsclsrRspnRcpt", required = true)
    protected PartyIdentification214 dsclsrRspnRcpt;
    @XmlElement(name = "IssrDsclsrDdln", required = true)
    protected DateFormat46Choice issrDsclsrDdln;
    @XmlElement(name = "DsclsrRspnDdln")
    protected DateFormat46Choice dsclsrRspnDdln;
    @XmlElement(name = "Issr")
    protected PartyIdentification129Choice issr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the issrDsclsrReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrDsclsrReqId() {
        return issrDsclsrReqId;
    }

    /**
     * Sets the value of the issrDsclsrReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrDsclsrReqId(String value) {
        this.issrDsclsrReqId = value;
    }

    /**
     * Gets the value of the dsclsrReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureRequestType1Code }
     *     
     */
    public DisclosureRequestType1Code getDsclsrReqTp() {
        return dsclsrReqTp;
    }

    /**
     * Sets the value of the dsclsrReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureRequestType1Code }
     *     
     */
    public void setDsclsrReqTp(DisclosureRequestType1Code value) {
        this.dsclsrReqTp = value;
    }

    /**
     * Gets the value of the prvsDsclsrReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsDsclsrReqId() {
        return prvsDsclsrReqId;
    }

    /**
     * Sets the value of the prvsDsclsrReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvsDsclsrReqId(String value) {
        this.prvsDsclsrReqId = value;
    }

    /**
     * Gets the value of the fwdReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFwdReqInd() {
        return fwdReqInd;
    }

    /**
     * Sets the value of the fwdReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFwdReqInd(Boolean value) {
        this.fwdReqInd = value;
    }

    /**
     * Gets the value of the rspnThrghChainInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRspnThrghChainInd() {
        return rspnThrghChainInd;
    }

    /**
     * Sets the value of the rspnThrghChainInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRspnThrghChainInd(Boolean value) {
        this.rspnThrghChainInd = value;
    }

    /**
     * Gets the value of the shrhldrRghtsDrctvInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShrhldrRghtsDrctvInd() {
        return shrhldrRghtsDrctvInd;
    }

    /**
     * Sets the value of the shrhldrRghtsDrctvInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShrhldrRghtsDrctvInd(Boolean value) {
        this.shrhldrRghtsDrctvInd = value;
    }

    /**
     * Gets the value of the plcOfJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfJursdctn() {
        return plcOfJursdctn;
    }

    /**
     * Sets the value of the plcOfJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlcOfJursdctn(String value) {
        this.plcOfJursdctn = value;
    }

    /**
     * Gets the value of the aplblLaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplblLaw() {
        return aplblLaw;
    }

    /**
     * Sets the value of the aplblLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAplblLaw(String value) {
        this.aplblLaw = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the shrhldrsDsclsrRcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat46Choice }
     *     
     */
    public DateFormat46Choice getShrhldrsDsclsrRcrdDt() {
        return shrhldrsDsclsrRcrdDt;
    }

    /**
     * Sets the value of the shrhldrsDsclsrRcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat46Choice }
     *     
     */
    public void setShrhldrsDsclsrRcrdDt(DateFormat46Choice value) {
        this.shrhldrsDsclsrRcrdDt = value;
    }

    /**
     * Gets the value of the shrsQtyThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShrsQtyThrshld() {
        return shrsQtyThrshld;
    }

    /**
     * Sets the value of the shrsQtyThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShrsQtyThrshld(BigDecimal value) {
        this.shrsQtyThrshld = value;
    }

    /**
     * Gets the value of the reqShrHeldDt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestShareHeldDate1Choice }
     *     
     */
    public RequestShareHeldDate1Choice getReqShrHeldDt() {
        return reqShrHeldDt;
    }

    /**
     * Sets the value of the reqShrHeldDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestShareHeldDate1Choice }
     *     
     */
    public void setReqShrHeldDt(RequestShareHeldDate1Choice value) {
        this.reqShrHeldDt = value;
    }

    /**
     * Gets the value of the dsclsrRspnRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification214 }
     *     
     */
    public PartyIdentification214 getDsclsrRspnRcpt() {
        return dsclsrRspnRcpt;
    }

    /**
     * Sets the value of the dsclsrRspnRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification214 }
     *     
     */
    public void setDsclsrRspnRcpt(PartyIdentification214 value) {
        this.dsclsrRspnRcpt = value;
    }

    /**
     * Gets the value of the issrDsclsrDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat46Choice }
     *     
     */
    public DateFormat46Choice getIssrDsclsrDdln() {
        return issrDsclsrDdln;
    }

    /**
     * Sets the value of the issrDsclsrDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat46Choice }
     *     
     */
    public void setIssrDsclsrDdln(DateFormat46Choice value) {
        this.issrDsclsrDdln = value;
    }

    /**
     * Gets the value of the dsclsrRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat46Choice }
     *     
     */
    public DateFormat46Choice getDsclsrRspnDdln() {
        return dsclsrRspnDdln;
    }

    /**
     * Sets the value of the dsclsrRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat46Choice }
     *     
     */
    public void setDsclsrRspnDdln(DateFormat46Choice value) {
        this.dsclsrRspnDdln = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public PartyIdentification129Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public void setIssr(PartyIdentification129Choice value) {
        this.issr = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
