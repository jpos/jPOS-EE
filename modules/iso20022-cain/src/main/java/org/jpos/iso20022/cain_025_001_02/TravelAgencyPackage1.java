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

package org.jpos.iso20022.cain_025_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelAgencyPackage1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TravelAgencyPackage1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RsvatnNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="TrvlPackgTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max70Text" minOccurs="0"/>
 *         <element name="NbInPty" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max10NumericText" minOccurs="0"/>
 *         <element name="CstmrRef" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}CustomerReference1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DataSrc" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="DlvryOrdrNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CdtCardSlipNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="InsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="InsrncAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Fee" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgencyPackage1", propOrder = {
    "rsvatnNb",
    "trvlPackgTp",
    "nbInPty",
    "cstmrRef",
    "dataSrc",
    "dlvryOrdrNb",
    "cdtCardSlipNb",
    "insrncInd",
    "insrncAmt",
    "fee"
})
public class TravelAgencyPackage1 {

    @XmlElement(name = "RsvatnNb")
    protected String rsvatnNb;
    @XmlElement(name = "TrvlPackgTp")
    protected String trvlPackgTp;
    @XmlElement(name = "NbInPty")
    protected String nbInPty;
    @XmlElement(name = "CstmrRef")
    protected List<CustomerReference1> cstmrRef;
    @XmlElement(name = "DataSrc")
    protected String dataSrc;
    @XmlElement(name = "DlvryOrdrNb")
    protected String dlvryOrdrNb;
    @XmlElement(name = "CdtCardSlipNb")
    protected String cdtCardSlipNb;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "Fee")
    protected BigDecimal fee;

    /**
     * Gets the value of the rsvatnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsvatnNb() {
        return rsvatnNb;
    }

    /**
     * Sets the value of the rsvatnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsvatnNb(String value) {
        this.rsvatnNb = value;
    }

    /**
     * Gets the value of the trvlPackgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrvlPackgTp() {
        return trvlPackgTp;
    }

    /**
     * Sets the value of the trvlPackgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrvlPackgTp(String value) {
        this.trvlPackgTp = value;
    }

    /**
     * Gets the value of the nbInPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbInPty() {
        return nbInPty;
    }

    /**
     * Sets the value of the nbInPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbInPty(String value) {
        this.nbInPty = value;
    }

    /**
     * Gets the value of the cstmrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cstmrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReference1 }
     * 
     * 
     * @return
     *     The value of the cstmrRef property.
     */
    public List<CustomerReference1> getCstmrRef() {
        if (cstmrRef == null) {
            cstmrRef = new ArrayList<>();
        }
        return this.cstmrRef;
    }

    /**
     * Gets the value of the dataSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSrc() {
        return dataSrc;
    }

    /**
     * Sets the value of the dataSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSrc(String value) {
        this.dataSrc = value;
    }

    /**
     * Gets the value of the dlvryOrdrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryOrdrNb() {
        return dlvryOrdrNb;
    }

    /**
     * Sets the value of the dlvryOrdrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryOrdrNb(String value) {
        this.dlvryOrdrNb = value;
    }

    /**
     * Gets the value of the cdtCardSlipNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtCardSlipNb() {
        return cdtCardSlipNb;
    }

    /**
     * Sets the value of the cdtCardSlipNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtCardSlipNb(String value) {
        this.cdtCardSlipNb = value;
    }

    /**
     * Gets the value of the insrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrncInd() {
        return insrncInd;
    }

    /**
     * Sets the value of the insrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsrncInd(Boolean value) {
        this.insrncInd = value;
    }

    /**
     * Gets the value of the insrncAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsrncAmt() {
        return insrncAmt;
    }

    /**
     * Sets the value of the insrncAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFee(BigDecimal value) {
        this.fee = value;
    }

}
