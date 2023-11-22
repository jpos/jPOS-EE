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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialDataSet5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommercialDataSet5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataSetId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}DocumentIdentification1"/>
 *         <element name="ComrclDocRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}InvoiceIdentification1"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PartyIdentification26"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PartyIdentification26"/>
 *         <element name="BllTo" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PartyIdentification26" minOccurs="0"/>
 *         <element name="Goods" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}LineItem15" maxOccurs="unbounded"/>
 *         <element name="PmtTerms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PaymentTerms4" maxOccurs="unbounded"/>
 *         <element name="SttlmTerms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}SettlementTerms3"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialDataSet5", propOrder = {
    "dataSetId",
    "comrclDocRef",
    "buyr",
    "sellr",
    "bllTo",
    "goods",
    "pmtTerms",
    "sttlmTerms"
})
public class CommercialDataSet5 {

    @XmlElement(name = "DataSetId", required = true)
    protected DocumentIdentification1 dataSetId;
    @XmlElement(name = "ComrclDocRef", required = true)
    protected InvoiceIdentification1 comrclDocRef;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification26 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification26 sellr;
    @XmlElement(name = "BllTo")
    protected PartyIdentification26 bllTo;
    @XmlElement(name = "Goods", required = true)
    protected List<LineItem15> goods;
    @XmlElement(name = "PmtTerms", required = true)
    protected List<PaymentTerms4> pmtTerms;
    @XmlElement(name = "SttlmTerms", required = true)
    protected SettlementTerms3 sttlmTerms;

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
     * Gets the value of the comrclDocRef property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceIdentification1 }
     *     
     */
    public InvoiceIdentification1 getComrclDocRef() {
        return comrclDocRef;
    }

    /**
     * Sets the value of the comrclDocRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceIdentification1 }
     *     
     */
    public void setComrclDocRef(InvoiceIdentification1 value) {
        this.comrclDocRef = value;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setBuyr(PartyIdentification26 value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setSellr(PartyIdentification26 value) {
        this.sellr = value;
    }

    /**
     * Gets the value of the bllTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBllTo() {
        return bllTo;
    }

    /**
     * Sets the value of the bllTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setBllTo(PartyIdentification26 value) {
        this.bllTo = value;
    }

    /**
     * Gets the value of the goods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the goods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItem15 }
     * 
     * 
     * @return
     *     The value of the goods property.
     */
    public List<LineItem15> getGoods() {
        if (goods == null) {
            goods = new ArrayList<>();
        }
        return this.goods;
    }

    /**
     * Gets the value of the pmtTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerms4 }
     * 
     * 
     * @return
     *     The value of the pmtTerms property.
     */
    public List<PaymentTerms4> getPmtTerms() {
        if (pmtTerms == null) {
            pmtTerms = new ArrayList<>();
        }
        return this.pmtTerms;
    }

    /**
     * Gets the value of the sttlmTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTerms3 }
     *     
     */
    public SettlementTerms3 getSttlmTerms() {
        return sttlmTerms;
    }

    /**
     * Sets the value of the sttlmTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTerms3 }
     *     
     */
    public void setSttlmTerms(SettlementTerms3 value) {
        this.sttlmTerms = value;
    }

}
