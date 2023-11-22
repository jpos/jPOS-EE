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

package org.jpos.iso20022.caad_008_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalAgreement2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VehicleRentalAgreement2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgrmtNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="AdjstdInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="RntlLctn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Address2" minOccurs="0"/>
 *         <element name="PckpLctn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Address2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ChckOutDt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ISODate" minOccurs="0"/>
 *         <element name="ChckOutTm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ISOTime" minOccurs="0"/>
 *         <element name="RtrLctn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Address2" minOccurs="0"/>
 *         <element name="ChckInDt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ISODate" minOccurs="0"/>
 *         <element name="ChckInTm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ISOTime" minOccurs="0"/>
 *         <element name="Drtn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max4NumericText" minOccurs="0"/>
 *         <element name="VhclClssDtls" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Vehicle4" minOccurs="0"/>
 *         <element name="TrvlDstnc" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Distance1" minOccurs="0"/>
 *         <element name="RntlRate" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}RentalRate1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RntlDtls" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}RentalDetails2" minOccurs="0"/>
 *         <element name="VhclRegnNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max70Text" minOccurs="0"/>
 *         <element name="InsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AddtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Amount18" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EstmtdTax" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DscntPrgrmm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Discount3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LltyPrgrmm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}LoyaltyProgramme3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalAgreement2", propOrder = {
    "agrmtNb",
    "adjstdInd",
    "rntlLctn",
    "pckpLctn",
    "chckOutDt",
    "chckOutTm",
    "rtrLctn",
    "chckInDt",
    "chckInTm",
    "drtn",
    "vhclClssDtls",
    "trvlDstnc",
    "rntlRate",
    "rntlDtls",
    "vhclRegnNb",
    "insrncInd",
    "addtlAmt",
    "estmtdTax",
    "dscntPrgrmm",
    "lltyPrgrmm"
})
public class VehicleRentalAgreement2 {

    @XmlElement(name = "AgrmtNb")
    protected String agrmtNb;
    @XmlElement(name = "AdjstdInd")
    protected Boolean adjstdInd;
    @XmlElement(name = "RntlLctn")
    protected Address2 rntlLctn;
    @XmlElement(name = "PckpLctn")
    protected List<Address2> pckpLctn;
    @XmlElement(name = "ChckOutDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chckOutDt;
    @XmlElement(name = "ChckOutTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar chckOutTm;
    @XmlElement(name = "RtrLctn")
    protected Address2 rtrLctn;
    @XmlElement(name = "ChckInDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chckInDt;
    @XmlElement(name = "ChckInTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar chckInTm;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "VhclClssDtls")
    protected Vehicle4 vhclClssDtls;
    @XmlElement(name = "TrvlDstnc")
    protected Distance1 trvlDstnc;
    @XmlElement(name = "RntlRate")
    protected List<RentalRate1> rntlRate;
    @XmlElement(name = "RntlDtls")
    protected RentalDetails2 rntlDtls;
    @XmlElement(name = "VhclRegnNb")
    protected String vhclRegnNb;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "AddtlAmt")
    protected List<Amount18> addtlAmt;
    @XmlElement(name = "EstmtdTax")
    protected List<Tax39> estmtdTax;
    @XmlElement(name = "DscntPrgrmm")
    protected List<Discount3> dscntPrgrmm;
    @XmlElement(name = "LltyPrgrmm")
    protected List<LoyaltyProgramme3> lltyPrgrmm;

    /**
     * Gets the value of the agrmtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrmtNb() {
        return agrmtNb;
    }

    /**
     * Sets the value of the agrmtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrmtNb(String value) {
        this.agrmtNb = value;
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
     * Gets the value of the rntlLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getRntlLctn() {
        return rntlLctn;
    }

    /**
     * Sets the value of the rntlLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setRntlLctn(Address2 value) {
        this.rntlLctn = value;
    }

    /**
     * Gets the value of the pckpLctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pckpLctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPckpLctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address2 }
     * 
     * 
     * @return
     *     The value of the pckpLctn property.
     */
    public List<Address2> getPckpLctn() {
        if (pckpLctn == null) {
            pckpLctn = new ArrayList<>();
        }
        return this.pckpLctn;
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
     * Gets the value of the vhclClssDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle4 }
     *     
     */
    public Vehicle4 getVhclClssDtls() {
        return vhclClssDtls;
    }

    /**
     * Sets the value of the vhclClssDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle4 }
     *     
     */
    public void setVhclClssDtls(Vehicle4 value) {
        this.vhclClssDtls = value;
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
     * Gets the value of the rntlRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rntlRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRntlRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RentalRate1 }
     * 
     * 
     * @return
     *     The value of the rntlRate property.
     */
    public List<RentalRate1> getRntlRate() {
        if (rntlRate == null) {
            rntlRate = new ArrayList<>();
        }
        return this.rntlRate;
    }

    /**
     * Gets the value of the rntlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RentalDetails2 }
     *     
     */
    public RentalDetails2 getRntlDtls() {
        return rntlDtls;
    }

    /**
     * Sets the value of the rntlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalDetails2 }
     *     
     */
    public void setRntlDtls(RentalDetails2 value) {
        this.rntlDtls = value;
    }

    /**
     * Gets the value of the vhclRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclRegnNb() {
        return vhclRegnNb;
    }

    /**
     * Sets the value of the vhclRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhclRegnNb(String value) {
        this.vhclRegnNb = value;
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
     * Gets the value of the estmtdTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the estmtdTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstmtdTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the estmtdTax property.
     */
    public List<Tax39> getEstmtdTax() {
        if (estmtdTax == null) {
            estmtdTax = new ArrayList<>();
        }
        return this.estmtdTax;
    }

    /**
     * Gets the value of the dscntPrgrmm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dscntPrgrmm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDscntPrgrmm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discount3 }
     * 
     * 
     * @return
     *     The value of the dscntPrgrmm property.
     */
    public List<Discount3> getDscntPrgrmm() {
        if (dscntPrgrmm == null) {
            dscntPrgrmm = new ArrayList<>();
        }
        return this.dscntPrgrmm;
    }

    /**
     * Gets the value of the lltyPrgrmm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyPrgrmm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyPrgrmm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramme3 }
     * 
     * 
     * @return
     *     The value of the lltyPrgrmm property.
     */
    public List<LoyaltyProgramme3> getLltyPrgrmm() {
        if (lltyPrgrmm == null) {
            lltyPrgrmm = new ArrayList<>();
        }
        return this.lltyPrgrmm;
    }

}
