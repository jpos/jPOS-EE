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

package org.jpos.iso20022.auth_041_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransparencyDataReport15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransparencyDataReport15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}ISINOct2015Identifier"/>
 *         <element name="RptgDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}ISODate" minOccurs="0"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}MICIdentifier" minOccurs="0"/>
 *         <element name="Sspnsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}TrueFalseIndicator"/>
 *         <element name="NbTxs" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}Number" minOccurs="0"/>
 *         <element name="AggtdQttvData" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}TransactionsBin2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport15", propOrder = {
    "techRcrdId",
    "id",
    "rptgDt",
    "tradgVn",
    "sspnsn",
    "nbTxs",
    "aggtdQttvData"
})
public class TransparencyDataReport15 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "RptgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rptgDt;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "Sspnsn")
    protected boolean sspnsn;
    @XmlElement(name = "NbTxs")
    protected BigDecimal nbTxs;
    @XmlElement(name = "AggtdQttvData")
    protected List<TransactionsBin2> aggtdQttvData;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechRcrdId(String value) {
        this.techRcrdId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the rptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptgDt() {
        return rptgDt;
    }

    /**
     * Sets the value of the rptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRptgDt(XMLGregorianCalendar value) {
        this.rptgDt = value;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgVn(String value) {
        this.tradgVn = value;
    }

    /**
     * Gets the value of the sspnsn property.
     * 
     */
    public boolean isSspnsn() {
        return sspnsn;
    }

    /**
     * Sets the value of the sspnsn property.
     * 
     */
    public void setSspnsn(boolean value) {
        this.sspnsn = value;
    }

    /**
     * Gets the value of the nbTxs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbTxs() {
        return nbTxs;
    }

    /**
     * Sets the value of the nbTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbTxs(BigDecimal value) {
        this.nbTxs = value;
    }

    /**
     * Gets the value of the aggtdQttvData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the aggtdQttvData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggtdQttvData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionsBin2 }
     * 
     * 
     * @return
     *     The value of the aggtdQttvData property.
     */
    public List<TransactionsBin2> getAggtdQttvData() {
        if (aggtdQttvData == null) {
            aggtdQttvData = new ArrayList<>();
        }
        return this.aggtdQttvData;
    }

}
