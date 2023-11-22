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

package org.jpos.iso20022.semt_022_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusTrail10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusTrail10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StsDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}ISODateTime"/>
 *         <element name="SndgOrgId" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}OrganisationIdentification31" minOccurs="0"/>
 *         <element name="UsrId" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}Max35Text" minOccurs="0"/>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}ProcessingStatus87Choice" minOccurs="0"/>
 *         <element name="IfrrdMtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}MatchingStatus25Choice" minOccurs="0"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}MatchingStatus25Choice" minOccurs="0"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}SettlementStatus17Choice" minOccurs="0"/>
 *         <element name="ModPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}ModificationProcessingStatus10Choice" minOccurs="0"/>
 *         <element name="CxlSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}ProcessingStatus86Choice" minOccurs="0"/>
 *         <element name="Sttld" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}ProprietaryReason4" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTrail10", propOrder = {
    "stsDt",
    "sndgOrgId",
    "usrId",
    "prcgSts",
    "ifrrdMtchgSts",
    "mtchgSts",
    "sttlmSts",
    "modPrcgSts",
    "cxlSts",
    "sttld",
    "splmtryData"
})
public class StatusTrail10 {

    @XmlElement(name = "StsDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stsDt;
    @XmlElement(name = "SndgOrgId")
    protected OrganisationIdentification31 sndgOrgId;
    @XmlElement(name = "UsrId")
    protected String usrId;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus87Choice prcgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus25Choice ifrrdMtchgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus25Choice mtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus17Choice sttlmSts;
    @XmlElement(name = "ModPrcgSts")
    protected ModificationProcessingStatus10Choice modPrcgSts;
    @XmlElement(name = "CxlSts")
    protected ProcessingStatus86Choice cxlSts;
    @XmlElement(name = "Sttld")
    protected ProprietaryReason4 sttld;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStsDt() {
        return stsDt;
    }

    /**
     * Sets the value of the stsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStsDt(XMLGregorianCalendar value) {
        this.stsDt = value;
    }

    /**
     * Gets the value of the sndgOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification31 }
     *     
     */
    public OrganisationIdentification31 getSndgOrgId() {
        return sndgOrgId;
    }

    /**
     * Sets the value of the sndgOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification31 }
     *     
     */
    public void setSndgOrgId(OrganisationIdentification31 value) {
        this.sndgOrgId = value;
    }

    /**
     * Gets the value of the usrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrId() {
        return usrId;
    }

    /**
     * Sets the value of the usrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrId(String value) {
        this.usrId = value;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus87Choice }
     *     
     */
    public ProcessingStatus87Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus87Choice }
     *     
     */
    public void setPrcgSts(ProcessingStatus87Choice value) {
        this.prcgSts = value;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus25Choice }
     *     
     */
    public MatchingStatus25Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus25Choice }
     *     
     */
    public void setIfrrdMtchgSts(MatchingStatus25Choice value) {
        this.ifrrdMtchgSts = value;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus25Choice }
     *     
     */
    public MatchingStatus25Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus25Choice }
     *     
     */
    public void setMtchgSts(MatchingStatus25Choice value) {
        this.mtchgSts = value;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus17Choice }
     *     
     */
    public SettlementStatus17Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus17Choice }
     *     
     */
    public void setSttlmSts(SettlementStatus17Choice value) {
        this.sttlmSts = value;
    }

    /**
     * Gets the value of the modPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationProcessingStatus10Choice }
     *     
     */
    public ModificationProcessingStatus10Choice getModPrcgSts() {
        return modPrcgSts;
    }

    /**
     * Sets the value of the modPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationProcessingStatus10Choice }
     *     
     */
    public void setModPrcgSts(ModificationProcessingStatus10Choice value) {
        this.modPrcgSts = value;
    }

    /**
     * Gets the value of the cxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus86Choice }
     *     
     */
    public ProcessingStatus86Choice getCxlSts() {
        return cxlSts;
    }

    /**
     * Sets the value of the cxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus86Choice }
     *     
     */
    public void setCxlSts(ProcessingStatus86Choice value) {
        this.cxlSts = value;
    }

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setSttld(ProprietaryReason4 value) {
        this.sttld = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
