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

package org.jpos.iso20022.tsrv_019_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingStatusAdvice1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UndertakingStatusAdvice1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}PartyIdentification43"/>
 *         <element name="UdrtkgId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Undertaking8" minOccurs="0"/>
 *         <element name="AmdmntSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Number" minOccurs="0"/>
 *         <element name="AdvsgPtyRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CnfrmrRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max35Text" minOccurs="0"/>
 *         <element name="StsCtgy" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}ExternalUndertakingStatusCategory1Code"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}UndertakingStatus3Code"/>
 *         <element name="StsRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}StatusReasonInformation8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RptdAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}ReportedAmount1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OrgnlMsgDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}OriginalMessage1" minOccurs="0"/>
 *         <element name="NclsdFile" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Document9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingStatusAdvice1", propOrder = {
    "initgPty",
    "udrtkgId",
    "amdmntSeqNb",
    "advsgPtyRefNb",
    "cnfrmrRefNb",
    "stsCtgy",
    "sts",
    "stsRsn",
    "rptdAmt",
    "orgnlMsgDtls",
    "nclsdFile",
    "addtlInf"
})
public class UndertakingStatusAdvice1 {

    @XmlElement(name = "InitgPty", required = true)
    protected PartyIdentification43 initgPty;
    @XmlElement(name = "UdrtkgId")
    protected Undertaking8 udrtkgId;
    @XmlElement(name = "AmdmntSeqNb")
    protected BigDecimal amdmntSeqNb;
    @XmlElement(name = "AdvsgPtyRefNb")
    protected String advsgPtyRefNb;
    @XmlElement(name = "CnfrmrRefNb")
    protected String cnfrmrRefNb;
    @XmlElement(name = "StsCtgy", required = true)
    protected String stsCtgy;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected UndertakingStatus3Code sts;
    @XmlElement(name = "StsRsn")
    protected List<StatusReasonInformation8> stsRsn;
    @XmlElement(name = "RptdAmt")
    protected List<ReportedAmount1> rptdAmt;
    @XmlElement(name = "OrgnlMsgDtls")
    protected OriginalMessage1 orgnlMsgDtls;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setInitgPty(PartyIdentification43 value) {
        this.initgPty = value;
    }

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking8 }
     *     
     */
    public Undertaking8 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking8 }
     *     
     */
    public void setUdrtkgId(Undertaking8 value) {
        this.udrtkgId = value;
    }

    /**
     * Gets the value of the amdmntSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmdmntSeqNb() {
        return amdmntSeqNb;
    }

    /**
     * Sets the value of the amdmntSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmdmntSeqNb(BigDecimal value) {
        this.amdmntSeqNb = value;
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
     * Gets the value of the stsCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsCtgy() {
        return stsCtgy;
    }

    /**
     * Sets the value of the stsCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStsCtgy(String value) {
        this.stsCtgy = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingStatus3Code }
     *     
     */
    public UndertakingStatus3Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingStatus3Code }
     *     
     */
    public void setSts(UndertakingStatus3Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation8 }
     * 
     * 
     * @return
     *     The value of the stsRsn property.
     */
    public List<StatusReasonInformation8> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the rptdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportedAmount1 }
     * 
     * 
     * @return
     *     The value of the rptdAmt property.
     */
    public List<ReportedAmount1> getRptdAmt() {
        if (rptdAmt == null) {
            rptdAmt = new ArrayList<>();
        }
        return this.rptdAmt;
    }

    /**
     * Gets the value of the orgnlMsgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessage1 }
     *     
     */
    public OriginalMessage1 getOrgnlMsgDtls() {
        return orgnlMsgDtls;
    }

    /**
     * Sets the value of the orgnlMsgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessage1 }
     *     
     */
    public void setOrgnlMsgDtls(OriginalMessage1 value) {
        this.orgnlMsgDtls = value;
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
