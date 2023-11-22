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

package org.jpos.iso20022.tsrv_013_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Demand1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Demand1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}Max35Text"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}DemandType1Code"/>
 *         <element name="UdrtkgId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}Undertaking6"/>
 *         <element name="DmndAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}UndertakingAmount3"/>
 *         <element name="AdvsgPtyRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}Max35Text" minOccurs="0"/>
 *         <element name="ScndAdvsgPtyRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CnfrmrRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SttlmAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}CashAccount27" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PresntnDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}Presentation2" minOccurs="0"/>
 *         <element name="ReqdXpryDt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}ISODate" minOccurs="0"/>
 *         <element name="DmndDcmnttn" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}DemandDocumentation1" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Demand1", propOrder = {
    "id",
    "tp",
    "udrtkgId",
    "dmndAmt",
    "advsgPtyRefNb",
    "scndAdvsgPtyRefNb",
    "cnfrmrRefNb",
    "sttlmAcct",
    "presntnDtls",
    "reqdXpryDt",
    "dmndDcmnttn",
    "addtlInf"
})
public class Demand1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected DemandType1Code tp;
    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking6 udrtkgId;
    @XmlElement(name = "DmndAmt", required = true)
    protected UndertakingAmount3 dmndAmt;
    @XmlElement(name = "AdvsgPtyRefNb")
    protected String advsgPtyRefNb;
    @XmlElement(name = "ScndAdvsgPtyRefNb")
    protected String scndAdvsgPtyRefNb;
    @XmlElement(name = "CnfrmrRefNb")
    protected String cnfrmrRefNb;
    @XmlElement(name = "SttlmAcct")
    protected List<CashAccount27> sttlmAcct;
    @XmlElement(name = "PresntnDtls")
    protected Presentation2 presntnDtls;
    @XmlElement(name = "ReqdXpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdXpryDt;
    @XmlElement(name = "DmndDcmnttn")
    protected DemandDocumentation1 dmndDcmnttn;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

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
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link DemandType1Code }
     *     
     */
    public DemandType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandType1Code }
     *     
     */
    public void setTp(DemandType1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking6 }
     *     
     */
    public Undertaking6 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking6 }
     *     
     */
    public void setUdrtkgId(Undertaking6 value) {
        this.udrtkgId = value;
    }

    /**
     * Gets the value of the dmndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount3 }
     *     
     */
    public UndertakingAmount3 getDmndAmt() {
        return dmndAmt;
    }

    /**
     * Sets the value of the dmndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount3 }
     *     
     */
    public void setDmndAmt(UndertakingAmount3 value) {
        this.dmndAmt = value;
    }

    /**
     * Gets the value of the advsgPtyRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvsgPtyRefNb() {
        return advsgPtyRefNb;
    }

    /**
     * Sets the value of the advsgPtyRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvsgPtyRefNb(String value) {
        this.advsgPtyRefNb = value;
    }

    /**
     * Gets the value of the scndAdvsgPtyRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndAdvsgPtyRefNb() {
        return scndAdvsgPtyRefNb;
    }

    /**
     * Sets the value of the scndAdvsgPtyRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScndAdvsgPtyRefNb(String value) {
        this.scndAdvsgPtyRefNb = value;
    }

    /**
     * Gets the value of the cnfrmrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfrmrRefNb() {
        return cnfrmrRefNb;
    }

    /**
     * Sets the value of the cnfrmrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfrmrRefNb(String value) {
        this.cnfrmrRefNb = value;
    }

    /**
     * Gets the value of the sttlmAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount27 }
     * 
     * 
     * @return
     *     The value of the sttlmAcct property.
     */
    public List<CashAccount27> getSttlmAcct() {
        if (sttlmAcct == null) {
            sttlmAcct = new ArrayList<>();
        }
        return this.sttlmAcct;
    }

    /**
     * Gets the value of the presntnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Presentation2 }
     *     
     */
    public Presentation2 getPresntnDtls() {
        return presntnDtls;
    }

    /**
     * Sets the value of the presntnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presentation2 }
     *     
     */
    public void setPresntnDtls(Presentation2 value) {
        this.presntnDtls = value;
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
     * Gets the value of the dmndDcmnttn property.
     * 
     * @return
     *     possible object is
     *     {@link DemandDocumentation1 }
     *     
     */
    public DemandDocumentation1 getDmndDcmnttn() {
        return dmndDcmnttn;
    }

    /**
     * Sets the value of the dmndDcmnttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandDocumentation1 }
     *     
     */
    public void setDmndDcmnttn(DemandDocumentation1 value) {
        this.dmndDcmnttn = value;
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
