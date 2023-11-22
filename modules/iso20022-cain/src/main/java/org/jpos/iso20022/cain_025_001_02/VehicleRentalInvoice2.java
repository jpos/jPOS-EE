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

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalInvoice2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VehicleRentalInvoice2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NoShowInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AdjstdInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="RtrLctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Address2" minOccurs="0"/>
 *         <element name="ChckOutDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISODate" minOccurs="0"/>
 *         <element name="ChckOutTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISOTime" minOccurs="0"/>
 *         <element name="ChckInDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISODate" minOccurs="0"/>
 *         <element name="ChckInTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISOTime" minOccurs="0"/>
 *         <element name="Drtn" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max4NumericText" minOccurs="0"/>
 *         <element name="VhclClssInvcd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Vehicle4" minOccurs="0"/>
 *         <element name="VhclClssPrvdd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Vehicle4" minOccurs="0"/>
 *         <element name="TrvlDstnc" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Distance1" minOccurs="0"/>
 *         <element name="RntlChrg" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}RentalRate1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SummryCmmdtyId" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="InsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AddtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Amount18" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalInvoice2", propOrder = {
    "noShowInd",
    "adjstdInd",
    "rtrLctn",
    "chckOutDt",
    "chckOutTm",
    "chckInDt",
    "chckInTm",
    "drtn",
    "vhclClssInvcd",
    "vhclClssPrvdd",
    "trvlDstnc",
    "rntlChrg",
    "summryCmmdtyId",
    "insrncInd",
    "addtlAmt",
    "tax"
})
public class VehicleRentalInvoice2 {

    @XmlElement(name = "NoShowInd")
    protected Boolean noShowInd;
    @XmlElement(name = "AdjstdInd")
    protected Boolean adjstdInd;
    @XmlElement(name = "RtrLctn")
    protected Address2 rtrLctn;
    @XmlElement(name = "ChckOutDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chckOutDt;
    @XmlElement(name = "ChckOutTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar chckOutTm;
    @XmlElement(name = "ChckInDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chckInDt;
    @XmlElement(name = "ChckInTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar chckInTm;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "VhclClssInvcd")
    protected Vehicle4 vhclClssInvcd;
    @XmlElement(name = "VhclClssPrvdd")
    protected Vehicle4 vhclClssPrvdd;
    @XmlElement(name = "TrvlDstnc")
    protected Distance1 trvlDstnc;
    @XmlElement(name = "RntlChrg")
    protected List<RentalRate1> rntlChrg;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "AddtlAmt")
    protected List<Amount18> addtlAmt;
    @XmlElement(name = "Tax")
    protected List<Tax39> tax;

    /**
     * Gets the value of the noShowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShowInd() {
        return noShowInd;
    }

    /**
     * Sets the value of the noShowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoShowInd(Boolean value) {
        this.noShowInd = value;
    }

    /**
     * Gets the value of the adjstdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjstdInd() {
        return adjstdInd;
    }

    /**
     * Sets the value of the adjstdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjstdInd(Boolean value) {
        this.adjstdInd = value;
    }

    /**
     * Gets the value of the rtrLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getRtrLctn() {
        return rtrLctn;
    }

    /**
     * Sets the value of the rtrLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setRtrLctn(Address2 value) {
        this.rtrLctn = value;
    }

    /**
     * Gets the value of the chckOutDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChckOutDt() {
        return chckOutDt;
    }

    /**
     * Sets the value of the chckOutDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChckOutDt(XMLGregorianCalendar value) {
        this.chckOutDt = value;
    }

    /**
     * Gets the value of the chckOutTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChckOutTm() {
        return chckOutTm;
    }

    /**
     * Sets the value of the chckOutTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChckOutTm(XMLGregorianCalendar value) {
        this.chckOutTm = value;
    }

    /**
     * Gets the value of the chckInDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChckInDt() {
        return chckInDt;
    }

    /**
     * Sets the value of the chckInDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChckInDt(XMLGregorianCalendar value) {
        this.chckInDt = value;
    }

    /**
     * Gets the value of the chckInTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChckInTm() {
        return chckInTm;
    }

    /**
     * Sets the value of the chckInTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChckInTm(XMLGregorianCalendar value) {
        this.chckInTm = value;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrtn(String value) {
        this.drtn = value;
    }

    /**
     * Gets the value of the vhclClssInvcd property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle4 }
     *     
     */
    public Vehicle4 getVhclClssInvcd() {
        return vhclClssInvcd;
    }

    /**
     * Sets the value of the vhclClssInvcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle4 }
     *     
     */
    public void setVhclClssInvcd(Vehicle4 value) {
        this.vhclClssInvcd = value;
    }

    /**
     * Gets the value of the vhclClssPrvdd property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle4 }
     *     
     */
    public Vehicle4 getVhclClssPrvdd() {
        return vhclClssPrvdd;
    }

    /**
     * Sets the value of the vhclClssPrvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle4 }
     *     
     */
    public void setVhclClssPrvdd(Vehicle4 value) {
        this.vhclClssPrvdd = value;
    }

    /**
     * Gets the value of the trvlDstnc property.
     * 
     * @return
     *     possible object is
     *     {@link Distance1 }
     *     
     */
    public Distance1 getTrvlDstnc() {
        return trvlDstnc;
    }

    /**
     * Sets the value of the trvlDstnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance1 }
     *     
     */
    public void setTrvlDstnc(Distance1 value) {
        this.trvlDstnc = value;
    }

    /**
     * Gets the value of the rntlChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rntlChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRntlChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RentalRate1 }
     * 
     * 
     * @return
     *     The value of the rntlChrg property.
     */
    public List<RentalRate1> getRntlChrg() {
        if (rntlChrg == null) {
            rntlChrg = new ArrayList<>();
        }
        return this.rntlChrg;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
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
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount18 }
     * 
     * 
     * @return
     *     The value of the addtlAmt property.
     */
    public List<Amount18> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<>();
        }
        return this.addtlAmt;
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
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax39> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

}
