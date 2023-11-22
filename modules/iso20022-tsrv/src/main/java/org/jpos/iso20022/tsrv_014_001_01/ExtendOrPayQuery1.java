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

package org.jpos.iso20022.tsrv_014_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendOrPayQuery1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExtendOrPayQuery1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UdrtkgId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.014.001.01}Undertaking9"/>
 *         <element name="DmndDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.014.001.01}Demand2"/>
 *         <element name="ReqdXpryDt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.014.001.01}ISODate"/>
 *         <element name="BkInstrs" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.014.001.01}BankInstructions1" minOccurs="0"/>
 *         <element name="BkCtct" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.014.001.01}Contacts3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NclsdFile" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.014.001.01}Document9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.014.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendOrPayQuery1", propOrder = {
    "udrtkgId",
    "dmndDtls",
    "reqdXpryDt",
    "bkInstrs",
    "bkCtct",
    "nclsdFile",
    "addtlInf"
})
public class ExtendOrPayQuery1 {

    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking9 udrtkgId;
    @XmlElement(name = "DmndDtls", required = true)
    protected Demand2 dmndDtls;
    @XmlElement(name = "ReqdXpryDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdXpryDt;
    @XmlElement(name = "BkInstrs")
    protected BankInstructions1 bkInstrs;
    @XmlElement(name = "BkCtct")
    protected List<Contacts3> bkCtct;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking9 }
     *     
     */
    public Undertaking9 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking9 }
     *     
     */
    public void setUdrtkgId(Undertaking9 value) {
        this.udrtkgId = value;
    }

    /**
     * Gets the value of the dmndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Demand2 }
     *     
     */
    public Demand2 getDmndDtls() {
        return dmndDtls;
    }

    /**
     * Sets the value of the dmndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demand2 }
     *     
     */
    public void setDmndDtls(Demand2 value) {
        this.dmndDtls = value;
    }

    /**
     * Gets the value of the reqdXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdXpryDt() {
        return reqdXpryDt;
    }

    /**
     * Sets the value of the reqdXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdXpryDt(XMLGregorianCalendar value) {
        this.reqdXpryDt = value;
    }

    /**
     * Gets the value of the bkInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link BankInstructions1 }
     *     
     */
    public BankInstructions1 getBkInstrs() {
        return bkInstrs;
    }

    /**
     * Sets the value of the bkInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInstructions1 }
     *     
     */
    public void setBkInstrs(BankInstructions1 value) {
        this.bkInstrs = value;
    }

    /**
     * Gets the value of the bkCtct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bkCtct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkCtct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contacts3 }
     * 
     * 
     * @return
     *     The value of the bkCtct property.
     */
    public List<Contacts3> getBkCtct() {
        if (bkCtct == null) {
            bkCtct = new ArrayList<>();
        }
        return this.bkCtct;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document9 }
     * 
     * 
     * @return
     *     The value of the nclsdFile property.
     */
    public List<Document9> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<>();
        }
        return this.nclsdFile;
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
