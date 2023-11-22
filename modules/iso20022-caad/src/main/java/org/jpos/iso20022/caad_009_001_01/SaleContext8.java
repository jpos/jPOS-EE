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

package org.jpos.iso20022.caad_009_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleContext8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SaleContext8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleId" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SaleRefId" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SaleRefNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="GoodsAndSvcsTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}GoodsAndServices1Code" minOccurs="0"/>
 *         <element name="GoodAndSvcsSubTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}GoodsAndServicesSubType1Code" minOccurs="0"/>
 *         <element name="GoodAndSvcsOthrSubTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="GoodAndSvcDlvryChanl" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}GoodAndServiceDeliveryChannel1Code" minOccurs="0"/>
 *         <element name="OthrGoodAndSvcDlvryChanl" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="GoodAndSvcDlvrySchdl" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}GoodAndServiceDeliverySchedule1Code" minOccurs="0"/>
 *         <element name="OthrGoodAndSvcDlvrySchdl" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SpltPmtInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="RctReqInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="RctTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ReceiptType1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RctDstn" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max70Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleContext8", propOrder = {
    "saleId",
    "saleRefId",
    "saleRefNb",
    "goodsAndSvcsTp",
    "goodAndSvcsSubTp",
    "goodAndSvcsOthrSubTp",
    "goodAndSvcDlvryChanl",
    "othrGoodAndSvcDlvryChanl",
    "goodAndSvcDlvrySchdl",
    "othrGoodAndSvcDlvrySchdl",
    "spltPmtInd",
    "rctReqInd",
    "rctTp",
    "rctDstn",
    "addtlData"
})
public class SaleContext8 {

    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "SaleRefNb")
    protected String saleRefNb;
    @XmlElement(name = "GoodsAndSvcsTp")
    @XmlSchemaType(name = "string")
    protected GoodsAndServices1Code goodsAndSvcsTp;
    @XmlElement(name = "GoodAndSvcsSubTp")
    @XmlSchemaType(name = "string")
    protected GoodsAndServicesSubType1Code goodAndSvcsSubTp;
    @XmlElement(name = "GoodAndSvcsOthrSubTp")
    protected String goodAndSvcsOthrSubTp;
    @XmlElement(name = "GoodAndSvcDlvryChanl")
    @XmlSchemaType(name = "string")
    protected GoodAndServiceDeliveryChannel1Code goodAndSvcDlvryChanl;
    @XmlElement(name = "OthrGoodAndSvcDlvryChanl")
    protected String othrGoodAndSvcDlvryChanl;
    @XmlElement(name = "GoodAndSvcDlvrySchdl")
    @XmlSchemaType(name = "string")
    protected GoodAndServiceDeliverySchedule1Code goodAndSvcDlvrySchdl;
    @XmlElement(name = "OthrGoodAndSvcDlvrySchdl")
    protected String othrGoodAndSvcDlvrySchdl;
    @XmlElement(name = "SpltPmtInd")
    protected Boolean spltPmtInd;
    @XmlElement(name = "RctReqInd")
    protected Boolean rctReqInd;
    @XmlElement(name = "RctTp")
    @XmlSchemaType(name = "string")
    protected List<ReceiptType1Code> rctTp;
    @XmlElement(name = "RctDstn")
    protected String rctDstn;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleId(String value) {
        this.saleId = value;
    }

    /**
     * Gets the value of the saleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefId() {
        return saleRefId;
    }

    /**
     * Sets the value of the saleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRefId(String value) {
        this.saleRefId = value;
    }

    /**
     * Gets the value of the saleRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefNb() {
        return saleRefNb;
    }

    /**
     * Sets the value of the saleRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRefNb(String value) {
        this.saleRefNb = value;
    }

    /**
     * Gets the value of the goodsAndSvcsTp property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsAndServices1Code }
     *     
     */
    public GoodsAndServices1Code getGoodsAndSvcsTp() {
        return goodsAndSvcsTp;
    }

    /**
     * Sets the value of the goodsAndSvcsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsAndServices1Code }
     *     
     */
    public void setGoodsAndSvcsTp(GoodsAndServices1Code value) {
        this.goodsAndSvcsTp = value;
    }

    /**
     * Gets the value of the goodAndSvcsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsAndServicesSubType1Code }
     *     
     */
    public GoodsAndServicesSubType1Code getGoodAndSvcsSubTp() {
        return goodAndSvcsSubTp;
    }

    /**
     * Sets the value of the goodAndSvcsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsAndServicesSubType1Code }
     *     
     */
    public void setGoodAndSvcsSubTp(GoodsAndServicesSubType1Code value) {
        this.goodAndSvcsSubTp = value;
    }

    /**
     * Gets the value of the goodAndSvcsOthrSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodAndSvcsOthrSubTp() {
        return goodAndSvcsOthrSubTp;
    }

    /**
     * Sets the value of the goodAndSvcsOthrSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodAndSvcsOthrSubTp(String value) {
        this.goodAndSvcsOthrSubTp = value;
    }

    /**
     * Gets the value of the goodAndSvcDlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link GoodAndServiceDeliveryChannel1Code }
     *     
     */
    public GoodAndServiceDeliveryChannel1Code getGoodAndSvcDlvryChanl() {
        return goodAndSvcDlvryChanl;
    }

    /**
     * Sets the value of the goodAndSvcDlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodAndServiceDeliveryChannel1Code }
     *     
     */
    public void setGoodAndSvcDlvryChanl(GoodAndServiceDeliveryChannel1Code value) {
        this.goodAndSvcDlvryChanl = value;
    }

    /**
     * Gets the value of the othrGoodAndSvcDlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrGoodAndSvcDlvryChanl() {
        return othrGoodAndSvcDlvryChanl;
    }

    /**
     * Sets the value of the othrGoodAndSvcDlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrGoodAndSvcDlvryChanl(String value) {
        this.othrGoodAndSvcDlvryChanl = value;
    }

    /**
     * Gets the value of the goodAndSvcDlvrySchdl property.
     * 
     * @return
     *     possible object is
     *     {@link GoodAndServiceDeliverySchedule1Code }
     *     
     */
    public GoodAndServiceDeliverySchedule1Code getGoodAndSvcDlvrySchdl() {
        return goodAndSvcDlvrySchdl;
    }

    /**
     * Sets the value of the goodAndSvcDlvrySchdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodAndServiceDeliverySchedule1Code }
     *     
     */
    public void setGoodAndSvcDlvrySchdl(GoodAndServiceDeliverySchedule1Code value) {
        this.goodAndSvcDlvrySchdl = value;
    }

    /**
     * Gets the value of the othrGoodAndSvcDlvrySchdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrGoodAndSvcDlvrySchdl() {
        return othrGoodAndSvcDlvrySchdl;
    }

    /**
     * Sets the value of the othrGoodAndSvcDlvrySchdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrGoodAndSvcDlvrySchdl(String value) {
        this.othrGoodAndSvcDlvrySchdl = value;
    }

    /**
     * Gets the value of the spltPmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltPmtInd() {
        return spltPmtInd;
    }

    /**
     * Sets the value of the spltPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpltPmtInd(Boolean value) {
        this.spltPmtInd = value;
    }

    /**
     * Gets the value of the rctReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRctReqInd() {
        return rctReqInd;
    }

    /**
     * Sets the value of the rctReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRctReqInd(Boolean value) {
        this.rctReqInd = value;
    }

    /**
     * Gets the value of the rctTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rctTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRctTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptType1Code }
     * 
     * 
     * @return
     *     The value of the rctTp property.
     */
    public List<ReceiptType1Code> getRctTp() {
        if (rctTp == null) {
            rctTp = new ArrayList<>();
        }
        return this.rctTp;
    }

    /**
     * Gets the value of the rctDstn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRctDstn() {
        return rctDstn;
    }

    /**
     * Sets the value of the rctDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRctDstn(String value) {
        this.rctDstn = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

}
