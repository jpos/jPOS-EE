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
 * <p>Java class for LineItem15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LineItem15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PurchsOrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}DocumentIdentification7"/>
 *         <element name="FnlSubmissn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}YesNoIndicator"/>
 *         <element name="ComrclLineItms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}LineItemDetails14" maxOccurs="unbounded"/>
 *         <element name="LineItmsTtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}CurrencyAndAmount"/>
 *         <element name="Adjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Adjustment6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FrghtChrgs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Charge25" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Tax22" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlNetAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}CurrencyAndAmount"/>
 *         <element name="BuyrDfndInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}UserDefinedInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SellrDfndInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}UserDefinedInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Incotrms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Incoterms4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem15", propOrder = {
    "purchsOrdrRef",
    "fnlSubmissn",
    "comrclLineItms",
    "lineItmsTtlAmt",
    "adjstmnt",
    "frghtChrgs",
    "tax",
    "ttlNetAmt",
    "buyrDfndInf",
    "sellrDfndInf",
    "incotrms"
})
public class LineItem15 {

    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "FnlSubmissn")
    protected boolean fnlSubmissn;
    @XmlElement(name = "ComrclLineItms", required = true)
    protected List<LineItemDetails14> comrclLineItms;
    @XmlElement(name = "LineItmsTtlAmt", required = true)
    protected CurrencyAndAmount lineItmsTtlAmt;
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment6> adjstmnt;
    @XmlElement(name = "FrghtChrgs")
    protected Charge25 frghtChrgs;
    @XmlElement(name = "Tax")
    protected List<Tax22> tax;
    @XmlElement(name = "TtlNetAmt", required = true)
    protected CurrencyAndAmount ttlNetAmt;
    @XmlElement(name = "BuyrDfndInf")
    protected List<UserDefinedInformation1> buyrDfndInf;
    @XmlElement(name = "SellrDfndInf")
    protected List<UserDefinedInformation1> sellrDfndInf;
    @XmlElement(name = "Incotrms")
    protected Incoterms4 incotrms;

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public void setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
    }

    /**
     * Gets the value of the fnlSubmissn property.
     * 
     */
    public boolean isFnlSubmissn() {
        return fnlSubmissn;
    }

    /**
     * Sets the value of the fnlSubmissn property.
     * 
     */
    public void setFnlSubmissn(boolean value) {
        this.fnlSubmissn = value;
    }

    /**
     * Gets the value of the comrclLineItms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the comrclLineItms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComrclLineItms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemDetails14 }
     * 
     * 
     * @return
     *     The value of the comrclLineItms property.
     */
    public List<LineItemDetails14> getComrclLineItms() {
        if (comrclLineItms == null) {
            comrclLineItms = new ArrayList<>();
        }
        return this.comrclLineItms;
    }

    /**
     * Gets the value of the lineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getLineItmsTtlAmt() {
        return lineItmsTtlAmt;
    }

    /**
     * Sets the value of the lineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setLineItmsTtlAmt(CurrencyAndAmount value) {
        this.lineItmsTtlAmt = value;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment6 }
     * 
     * 
     * @return
     *     The value of the adjstmnt property.
     */
    public List<Adjustment6> getAdjstmnt() {
        if (adjstmnt == null) {
            adjstmnt = new ArrayList<>();
        }
        return this.adjstmnt;
    }

    /**
     * Gets the value of the frghtChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charge25 }
     *     
     */
    public Charge25 getFrghtChrgs() {
        return frghtChrgs;
    }

    /**
     * Sets the value of the frghtChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge25 }
     *     
     */
    public void setFrghtChrgs(Charge25 value) {
        this.frghtChrgs = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax22 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax22> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ttlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlNetAmt() {
        return ttlNetAmt;
    }

    /**
     * Sets the value of the ttlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setTtlNetAmt(CurrencyAndAmount value) {
        this.ttlNetAmt = value;
    }

    /**
     * Gets the value of the buyrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     * @return
     *     The value of the buyrDfndInf property.
     */
    public List<UserDefinedInformation1> getBuyrDfndInf() {
        if (buyrDfndInf == null) {
            buyrDfndInf = new ArrayList<>();
        }
        return this.buyrDfndInf;
    }

    /**
     * Gets the value of the sellrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     * @return
     *     The value of the sellrDfndInf property.
     */
    public List<UserDefinedInformation1> getSellrDfndInf() {
        if (sellrDfndInf == null) {
            sellrDfndInf = new ArrayList<>();
        }
        return this.sellrDfndInf;
    }

    /**
     * Gets the value of the incotrms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms4 }
     *     
     */
    public Incoterms4 getIncotrms() {
        return incotrms;
    }

    /**
     * Sets the value of the incotrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms4 }
     *     
     */
    public void setIncotrms(Incoterms4 value) {
        this.incotrms = value;
    }

}
