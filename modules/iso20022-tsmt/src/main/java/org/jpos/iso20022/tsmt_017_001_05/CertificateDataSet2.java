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

package org.jpos.iso20022.tsmt_017_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateDataSet2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CertificateDataSet2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataSetId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}DocumentIdentification1"/>
 *         <element name="CertTp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}TradeCertificateType1Code"/>
 *         <element name="LineItm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}LineItemAndPOIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CertfdChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}CertifiedCharacteristics2Choice"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}ISODate"/>
 *         <element name="PlcOfIsse" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PostalAddress5" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PartyIdentification26"/>
 *         <element name="InspctnDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}DatePeriodDetails" minOccurs="0"/>
 *         <element name="AuthrsdInspctrInd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="CertId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max35Text"/>
 *         <element name="Trnsprt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}SingleTransport3" minOccurs="0"/>
 *         <element name="GoodsDesc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max70Text" minOccurs="0"/>
 *         <element name="Consgnr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PartyIdentification26" minOccurs="0"/>
 *         <element name="Consgn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PartyIdentification26" minOccurs="0"/>
 *         <element name="Manfctr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PartyIdentification26" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max350Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateDataSet2", propOrder = {
    "dataSetId",
    "certTp",
    "lineItm",
    "certfdChrtcs",
    "isseDt",
    "plcOfIsse",
    "issr",
    "inspctnDt",
    "authrsdInspctrInd",
    "certId",
    "trnsprt",
    "goodsDesc",
    "consgnr",
    "consgn",
    "manfctr",
    "addtlInf"
})
public class CertificateDataSet2 {

    @XmlElement(name = "DataSetId", required = true)
    protected DocumentIdentification1 dataSetId;
    @XmlElement(name = "CertTp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeCertificateType1Code certTp;
    @XmlElement(name = "LineItm")
    protected List<LineItemAndPOIdentification1> lineItm;
    @XmlElement(name = "CertfdChrtcs", required = true)
    protected CertifiedCharacteristics2Choice certfdChrtcs;
    @XmlElement(name = "IsseDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "PlcOfIsse")
    protected PostalAddress5 plcOfIsse;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification26 issr;
    @XmlElement(name = "InspctnDt")
    protected DatePeriodDetails inspctnDt;
    @XmlElement(name = "AuthrsdInspctrInd")
    protected Boolean authrsdInspctrInd;
    @XmlElement(name = "CertId", required = true)
    protected String certId;
    @XmlElement(name = "Trnsprt")
    protected SingleTransport3 trnsprt;
    @XmlElement(name = "GoodsDesc")
    protected String goodsDesc;
    @XmlElement(name = "Consgnr")
    protected PartyIdentification26 consgnr;
    @XmlElement(name = "Consgn")
    protected PartyIdentification26 consgn;
    @XmlElement(name = "Manfctr")
    protected PartyIdentification26 manfctr;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public DocumentIdentification1 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public void setDataSetId(DocumentIdentification1 value) {
        this.dataSetId = value;
    }

    /**
     * Gets the value of the certTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCertificateType1Code }
     *     
     */
    public TradeCertificateType1Code getCertTp() {
        return certTp;
    }

    /**
     * Sets the value of the certTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCertificateType1Code }
     *     
     */
    public void setCertTp(TradeCertificateType1Code value) {
        this.certTp = value;
    }

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemAndPOIdentification1 }
     * 
     * 
     * @return
     *     The value of the lineItm property.
     */
    public List<LineItemAndPOIdentification1> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<>();
        }
        return this.lineItm;
    }

    /**
     * Gets the value of the certfdChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedCharacteristics2Choice }
     *     
     */
    public CertifiedCharacteristics2Choice getCertfdChrtcs() {
        return certfdChrtcs;
    }

    /**
     * Sets the value of the certfdChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedCharacteristics2Choice }
     *     
     */
    public void setCertfdChrtcs(CertifiedCharacteristics2Choice value) {
        this.certfdChrtcs = value;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the plcOfIsse property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress5 }
     *     
     */
    public PostalAddress5 getPlcOfIsse() {
        return plcOfIsse;
    }

    /**
     * Sets the value of the plcOfIsse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress5 }
     *     
     */
    public void setPlcOfIsse(PostalAddress5 value) {
        this.plcOfIsse = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setIssr(PartyIdentification26 value) {
        this.issr = value;
    }

    /**
     * Gets the value of the inspctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DatePeriodDetails getInspctnDt() {
        return inspctnDt;
    }

    /**
     * Sets the value of the inspctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails }
     *     
     */
    public void setInspctnDt(DatePeriodDetails value) {
        this.inspctnDt = value;
    }

    /**
     * Gets the value of the authrsdInspctrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthrsdInspctrInd() {
        return authrsdInspctrInd;
    }

    /**
     * Sets the value of the authrsdInspctrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthrsdInspctrInd(Boolean value) {
        this.authrsdInspctrInd = value;
    }

    /**
     * Gets the value of the certId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * Sets the value of the certId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertId(String value) {
        this.certId = value;
    }

    /**
     * Gets the value of the trnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link SingleTransport3 }
     *     
     */
    public SingleTransport3 getTrnsprt() {
        return trnsprt;
    }

    /**
     * Sets the value of the trnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleTransport3 }
     *     
     */
    public void setTrnsprt(SingleTransport3 value) {
        this.trnsprt = value;
    }

    /**
     * Gets the value of the goodsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * Sets the value of the goodsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsDesc(String value) {
        this.goodsDesc = value;
    }

    /**
     * Gets the value of the consgnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getConsgnr() {
        return consgnr;
    }

    /**
     * Sets the value of the consgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setConsgnr(PartyIdentification26 value) {
        this.consgnr = value;
    }

    /**
     * Gets the value of the consgn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getConsgn() {
        return consgn;
    }

    /**
     * Sets the value of the consgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setConsgn(PartyIdentification26 value) {
        this.consgn = value;
    }

    /**
     * Gets the value of the manfctr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getManfctr() {
        return manfctr;
    }

    /**
     * Sets the value of the manfctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setManfctr(PartyIdentification26 value) {
        this.manfctr = value;
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
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
