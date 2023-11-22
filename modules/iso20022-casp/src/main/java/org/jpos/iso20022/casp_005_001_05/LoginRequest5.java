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

package org.jpos.iso20022.casp_005_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginRequest5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoginRequest5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LgnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}ISODateTime"/>
 *         <element name="SaleSftwr" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}PointOfInteractionComponent14" maxOccurs="unbounded"/>
 *         <element name="SaleTermnlData" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}SaleTerminalData1" minOccurs="0"/>
 *         <element name="TrngMdFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CshrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}Max35Text" minOccurs="0"/>
 *         <element name="CshrLang" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}LanguageCode"/>
 *         <element name="ShftNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}Max2NumericText" minOccurs="0"/>
 *         <element name="TknReqdTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}SaleTokenScope1Code" minOccurs="0"/>
 *         <element name="CstmrOrdrReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}CustomerOrderRequest1Code" minOccurs="0"/>
 *         <element name="POIId" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}PointOfInteractionComponentIdentification2" minOccurs="0"/>
 *         <element name="TtlsGrpId" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}Max35Text" minOccurs="0"/>
 *         <element name="OutptDisp" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}ActionMessage10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginRequest5", propOrder = {
    "lgnDtTm",
    "saleSftwr",
    "saleTermnlData",
    "trngMdFlg",
    "cshrId",
    "cshrLang",
    "shftNb",
    "tknReqdTp",
    "cstmrOrdrReq",
    "poiId",
    "ttlsGrpId",
    "outptDisp"
})
public class LoginRequest5 {

    @XmlElement(name = "LgnDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lgnDtTm;
    @XmlElement(name = "SaleSftwr", required = true)
    protected List<PointOfInteractionComponent14> saleSftwr;
    @XmlElement(name = "SaleTermnlData")
    protected SaleTerminalData1 saleTermnlData;
    @XmlElement(name = "TrngMdFlg")
    protected Boolean trngMdFlg;
    @XmlElement(name = "CshrId")
    protected String cshrId;
    @XmlElement(name = "CshrLang", required = true)
    protected String cshrLang;
    @XmlElement(name = "ShftNb")
    protected String shftNb;
    @XmlElement(name = "TknReqdTp")
    @XmlSchemaType(name = "string")
    protected SaleTokenScope1Code tknReqdTp;
    @XmlElement(name = "CstmrOrdrReq")
    @XmlSchemaType(name = "string")
    protected CustomerOrderRequest1Code cstmrOrdrReq;
    @XmlElement(name = "POIId")
    protected PointOfInteractionComponentIdentification2 poiId;
    @XmlElement(name = "TtlsGrpId")
    protected String ttlsGrpId;
    @XmlElement(name = "OutptDisp")
    protected ActionMessage10 outptDisp;

    /**
     * Gets the value of the lgnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLgnDtTm() {
        return lgnDtTm;
    }

    /**
     * Sets the value of the lgnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLgnDtTm(XMLGregorianCalendar value) {
        this.lgnDtTm = value;
    }

    /**
     * Gets the value of the saleSftwr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the saleSftwr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleSftwr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent14 }
     * 
     * 
     * @return
     *     The value of the saleSftwr property.
     */
    public List<PointOfInteractionComponent14> getSaleSftwr() {
        if (saleSftwr == null) {
            saleSftwr = new ArrayList<>();
        }
        return this.saleSftwr;
    }

    /**
     * Gets the value of the saleTermnlData property.
     * 
     * @return
     *     possible object is
     *     {@link SaleTerminalData1 }
     *     
     */
    public SaleTerminalData1 getSaleTermnlData() {
        return saleTermnlData;
    }

    /**
     * Sets the value of the saleTermnlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleTerminalData1 }
     *     
     */
    public void setSaleTermnlData(SaleTerminalData1 value) {
        this.saleTermnlData = value;
    }

    /**
     * Gets the value of the trngMdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrngMdFlg() {
        return trngMdFlg;
    }

    /**
     * Sets the value of the trngMdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrngMdFlg(Boolean value) {
        this.trngMdFlg = value;
    }

    /**
     * Gets the value of the cshrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrId() {
        return cshrId;
    }

    /**
     * Sets the value of the cshrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshrId(String value) {
        this.cshrId = value;
    }

    /**
     * Gets the value of the cshrLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrLang() {
        return cshrLang;
    }

    /**
     * Sets the value of the cshrLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshrLang(String value) {
        this.cshrLang = value;
    }

    /**
     * Gets the value of the shftNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShftNb() {
        return shftNb;
    }

    /**
     * Sets the value of the shftNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShftNb(String value) {
        this.shftNb = value;
    }

    /**
     * Gets the value of the tknReqdTp property.
     * 
     * @return
     *     possible object is
     *     {@link SaleTokenScope1Code }
     *     
     */
    public SaleTokenScope1Code getTknReqdTp() {
        return tknReqdTp;
    }

    /**
     * Sets the value of the tknReqdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleTokenScope1Code }
     *     
     */
    public void setTknReqdTp(SaleTokenScope1Code value) {
        this.tknReqdTp = value;
    }

    /**
     * Gets the value of the cstmrOrdrReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderRequest1Code }
     *     
     */
    public CustomerOrderRequest1Code getCstmrOrdrReq() {
        return cstmrOrdrReq;
    }

    /**
     * Sets the value of the cstmrOrdrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderRequest1Code }
     *     
     */
    public void setCstmrOrdrReq(CustomerOrderRequest1Code value) {
        this.cstmrOrdrReq = value;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentIdentification2 }
     *     
     */
    public PointOfInteractionComponentIdentification2 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentIdentification2 }
     *     
     */
    public void setPOIId(PointOfInteractionComponentIdentification2 value) {
        this.poiId = value;
    }

    /**
     * Gets the value of the ttlsGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlsGrpId() {
        return ttlsGrpId;
    }

    /**
     * Sets the value of the ttlsGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlsGrpId(String value) {
        this.ttlsGrpId = value;
    }

    /**
     * Gets the value of the outptDisp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage10 }
     *     
     */
    public ActionMessage10 getOutptDisp() {
        return outptDisp;
    }

    /**
     * Sets the value of the outptDisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage10 }
     *     
     */
    public void setOutptDisp(ActionMessage10 value) {
        this.outptDisp = value;
    }

}
