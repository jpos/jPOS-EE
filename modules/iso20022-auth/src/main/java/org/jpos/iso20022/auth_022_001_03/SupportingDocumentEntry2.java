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

package org.jpos.iso20022.auth_022_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportingDocumentEntry2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SupportingDocumentEntry2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtryId" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}Max35Text"/>
 *         <element name="OrgnlDoc" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}DocumentIdentification22"/>
 *         <element name="DocTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}Exact4AlphaNumericUnderscoreText"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlAmtAftrShipmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlAmtInCtrctCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlAmtAftrShipmntInCtrctCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ShipmntAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}ShipmentAttribute2"/>
 *         <element name="NtryAmdmntId" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}DocumentEntryAmendment1" minOccurs="0"/>
 *         <element name="MtrtyData" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}Max35Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}Max500Text" minOccurs="0"/>
 *         <element name="Attchmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}DocumentGeneralInformation5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportingDocumentEntry2", propOrder = {
    "ntryId",
    "orgnlDoc",
    "docTp",
    "ttlAmt",
    "ttlAmtAftrShipmnt",
    "ttlAmtInCtrctCcy",
    "ttlAmtAftrShipmntInCtrctCcy",
    "shipmntAttrbts",
    "ntryAmdmntId",
    "mtrtyData",
    "addtlInf",
    "attchmnt"
})
public class SupportingDocumentEntry2 {

    @XmlElement(name = "NtryId", required = true)
    protected String ntryId;
    @XmlElement(name = "OrgnlDoc", required = true)
    protected DocumentIdentification22 orgnlDoc;
    @XmlElement(name = "DocTp", required = true)
    protected String docTp;
    @XmlElement(name = "TtlAmt")
    protected ActiveCurrencyAndAmount ttlAmt;
    @XmlElement(name = "TtlAmtAftrShipmnt")
    protected ActiveCurrencyAndAmount ttlAmtAftrShipmnt;
    @XmlElement(name = "TtlAmtInCtrctCcy")
    protected ActiveCurrencyAndAmount ttlAmtInCtrctCcy;
    @XmlElement(name = "TtlAmtAftrShipmntInCtrctCcy")
    protected ActiveCurrencyAndAmount ttlAmtAftrShipmntInCtrctCcy;
    @XmlElement(name = "ShipmntAttrbts", required = true)
    protected ShipmentAttribute2 shipmntAttrbts;
    @XmlElement(name = "NtryAmdmntId")
    protected DocumentEntryAmendment1 ntryAmdmntId;
    @XmlElement(name = "MtrtyData")
    protected String mtrtyData;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;

    /**
     * Gets the value of the ntryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtryId() {
        return ntryId;
    }

    /**
     * Sets the value of the ntryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtryId(String value) {
        this.ntryId = value;
    }

    /**
     * Gets the value of the orgnlDoc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getOrgnlDoc() {
        return orgnlDoc;
    }

    /**
     * Sets the value of the orgnlDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public void setOrgnlDoc(DocumentIdentification22 value) {
        this.orgnlDoc = value;
    }

    /**
     * Gets the value of the docTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTp() {
        return docTp;
    }

    /**
     * Sets the value of the docTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTp(String value) {
        this.docTp = value;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlAmt(ActiveCurrencyAndAmount value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the ttlAmtAftrShipmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmtAftrShipmnt() {
        return ttlAmtAftrShipmnt;
    }

    /**
     * Sets the value of the ttlAmtAftrShipmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlAmtAftrShipmnt(ActiveCurrencyAndAmount value) {
        this.ttlAmtAftrShipmnt = value;
    }

    /**
     * Gets the value of the ttlAmtInCtrctCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmtInCtrctCcy() {
        return ttlAmtInCtrctCcy;
    }

    /**
     * Sets the value of the ttlAmtInCtrctCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlAmtInCtrctCcy(ActiveCurrencyAndAmount value) {
        this.ttlAmtInCtrctCcy = value;
    }

    /**
     * Gets the value of the ttlAmtAftrShipmntInCtrctCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmtAftrShipmntInCtrctCcy() {
        return ttlAmtAftrShipmntInCtrctCcy;
    }

    /**
     * Sets the value of the ttlAmtAftrShipmntInCtrctCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlAmtAftrShipmntInCtrctCcy(ActiveCurrencyAndAmount value) {
        this.ttlAmtAftrShipmntInCtrctCcy = value;
    }

    /**
     * Gets the value of the shipmntAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentAttribute2 }
     *     
     */
    public ShipmentAttribute2 getShipmntAttrbts() {
        return shipmntAttrbts;
    }

    /**
     * Sets the value of the shipmntAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentAttribute2 }
     *     
     */
    public void setShipmntAttrbts(ShipmentAttribute2 value) {
        this.shipmntAttrbts = value;
    }

    /**
     * Gets the value of the ntryAmdmntId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentEntryAmendment1 }
     *     
     */
    public DocumentEntryAmendment1 getNtryAmdmntId() {
        return ntryAmdmntId;
    }

    /**
     * Sets the value of the ntryAmdmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentEntryAmendment1 }
     *     
     */
    public void setNtryAmdmntId(DocumentEntryAmendment1 value) {
        this.ntryAmdmntId = value;
    }

    /**
     * Gets the value of the mtrtyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtrtyData() {
        return mtrtyData;
    }

    /**
     * Sets the value of the mtrtyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtrtyData(String value) {
        this.mtrtyData = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     * @return
     *     The value of the attchmnt property.
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<>();
        }
        return this.attchmnt;
    }

}
