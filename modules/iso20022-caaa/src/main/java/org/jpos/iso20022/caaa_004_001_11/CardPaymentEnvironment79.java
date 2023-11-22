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

package org.jpos.iso20022.caaa_004_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentEnvironment79 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentEnvironment79">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acqrr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Acquirer10" minOccurs="0"/>
 *         <element name="SvcPrvdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Acquirer10" minOccurs="0"/>
 *         <element name="Mrchnt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Organisation41" minOccurs="0"/>
 *         <element name="POI" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}PointOfInteraction13" minOccurs="0"/>
 *         <element name="Card" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}PaymentCard33" minOccurs="0"/>
 *         <element name="Chck" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Check1" minOccurs="0"/>
 *         <element name="StordValAcct" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}StoredValueAccount2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LltyAcct" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}LoyaltyAccount3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CstmrDvc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}CustomerDevice3" minOccurs="0"/>
 *         <element name="Wllt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}CustomerDevice3" minOccurs="0"/>
 *         <element name="PmtTkn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Token1" minOccurs="0"/>
 *         <element name="MrchntTkn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}MerchantToken2" minOccurs="0"/>
 *         <element name="Crdhldr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Cardholder20" minOccurs="0"/>
 *         <element name="PrtctdCrdhldrData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}ContentInformationType35" minOccurs="0"/>
 *         <element name="SaleEnvt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}RetailerSaleEnvironment2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment79", propOrder = {
    "acqrr",
    "svcPrvdr",
    "mrchnt",
    "poi",
    "card",
    "chck",
    "stordValAcct",
    "lltyAcct",
    "cstmrDvc",
    "wllt",
    "pmtTkn",
    "mrchntTkn",
    "crdhldr",
    "prtctdCrdhldrData",
    "saleEnvt"
})
public class CardPaymentEnvironment79 {

    @XmlElement(name = "Acqrr")
    protected Acquirer10 acqrr;
    @XmlElement(name = "SvcPrvdr")
    protected Acquirer10 svcPrvdr;
    @XmlElement(name = "Mrchnt")
    protected Organisation41 mrchnt;
    @XmlElement(name = "POI")
    protected PointOfInteraction13 poi;
    @XmlElement(name = "Card")
    protected PaymentCard33 card;
    @XmlElement(name = "Chck")
    protected Check1 chck;
    @XmlElement(name = "StordValAcct")
    protected List<StoredValueAccount2> stordValAcct;
    @XmlElement(name = "LltyAcct")
    protected List<LoyaltyAccount3> lltyAcct;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice3 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected CustomerDevice3 wllt;
    @XmlElement(name = "PmtTkn")
    protected Token1 pmtTkn;
    @XmlElement(name = "MrchntTkn")
    protected MerchantToken2 mrchntTkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder20 crdhldr;
    @XmlElement(name = "PrtctdCrdhldrData")
    protected ContentInformationType35 prtctdCrdhldrData;
    @XmlElement(name = "SaleEnvt")
    protected RetailerSaleEnvironment2 saleEnvt;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer10 }
     *     
     */
    public Acquirer10 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer10 }
     *     
     */
    public void setAcqrr(Acquirer10 value) {
        this.acqrr = value;
    }

    /**
     * Gets the value of the svcPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer10 }
     *     
     */
    public Acquirer10 getSvcPrvdr() {
        return svcPrvdr;
    }

    /**
     * Sets the value of the svcPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer10 }
     *     
     */
    public void setSvcPrvdr(Acquirer10 value) {
        this.svcPrvdr = value;
    }

    /**
     * Gets the value of the mrchnt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation41 }
     *     
     */
    public Organisation41 getMrchnt() {
        return mrchnt;
    }

    /**
     * Sets the value of the mrchnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation41 }
     *     
     */
    public void setMrchnt(Organisation41 value) {
        this.mrchnt = value;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction13 }
     *     
     */
    public PointOfInteraction13 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction13 }
     *     
     */
    public void setPOI(PointOfInteraction13 value) {
        this.poi = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard33 }
     *     
     */
    public PaymentCard33 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard33 }
     *     
     */
    public void setCard(PaymentCard33 value) {
        this.card = value;
    }

    /**
     * Gets the value of the chck property.
     * 
     * @return
     *     possible object is
     *     {@link Check1 }
     *     
     */
    public Check1 getChck() {
        return chck;
    }

    /**
     * Sets the value of the chck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Check1 }
     *     
     */
    public void setChck(Check1 value) {
        this.chck = value;
    }

    /**
     * Gets the value of the stordValAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stordValAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStordValAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueAccount2 }
     * 
     * 
     * @return
     *     The value of the stordValAcct property.
     */
    public List<StoredValueAccount2> getStordValAcct() {
        if (stordValAcct == null) {
            stordValAcct = new ArrayList<>();
        }
        return this.stordValAcct;
    }

    /**
     * Gets the value of the lltyAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyAccount3 }
     * 
     * 
     * @return
     *     The value of the lltyAcct property.
     */
    public List<LoyaltyAccount3> getLltyAcct() {
        if (lltyAcct == null) {
            lltyAcct = new ArrayList<>();
        }
        return this.lltyAcct;
    }

    /**
     * Gets the value of the cstmrDvc property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice3 }
     *     
     */
    public CustomerDevice3 getCstmrDvc() {
        return cstmrDvc;
    }

    /**
     * Sets the value of the cstmrDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice3 }
     *     
     */
    public void setCstmrDvc(CustomerDevice3 value) {
        this.cstmrDvc = value;
    }

    /**
     * Gets the value of the wllt property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice3 }
     *     
     */
    public CustomerDevice3 getWllt() {
        return wllt;
    }

    /**
     * Sets the value of the wllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice3 }
     *     
     */
    public void setWllt(CustomerDevice3 value) {
        this.wllt = value;
    }

    /**
     * Gets the value of the pmtTkn property.
     * 
     * @return
     *     possible object is
     *     {@link Token1 }
     *     
     */
    public Token1 getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Sets the value of the pmtTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token1 }
     *     
     */
    public void setPmtTkn(Token1 value) {
        this.pmtTkn = value;
    }

    /**
     * Gets the value of the mrchntTkn property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantToken2 }
     *     
     */
    public MerchantToken2 getMrchntTkn() {
        return mrchntTkn;
    }

    /**
     * Sets the value of the mrchntTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantToken2 }
     *     
     */
    public void setMrchntTkn(MerchantToken2 value) {
        this.mrchntTkn = value;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder20 }
     *     
     */
    public Cardholder20 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder20 }
     *     
     */
    public void setCrdhldr(Cardholder20 value) {
        this.crdhldr = value;
    }

    /**
     * Gets the value of the prtctdCrdhldrData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType35 }
     *     
     */
    public ContentInformationType35 getPrtctdCrdhldrData() {
        return prtctdCrdhldrData;
    }

    /**
     * Sets the value of the prtctdCrdhldrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType35 }
     *     
     */
    public void setPrtctdCrdhldrData(ContentInformationType35 value) {
        this.prtctdCrdhldrData = value;
    }

    /**
     * Gets the value of the saleEnvt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerSaleEnvironment2 }
     *     
     */
    public RetailerSaleEnvironment2 getSaleEnvt() {
        return saleEnvt;
    }

    /**
     * Sets the value of the saleEnvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerSaleEnvironment2 }
     *     
     */
    public void setSaleEnvt(RetailerSaleEnvironment2 value) {
        this.saleEnvt = value;
    }

}
