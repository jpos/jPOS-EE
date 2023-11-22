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

package org.jpos.iso20022.semt_022_002_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusTrail11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusTrail11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StsDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}ISODateTime"/>
 *         <element name="SndgOrgId" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}OrganisationIdentification32" minOccurs="0"/>
 *         <element name="UsrId" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}RestrictedFINXMax35Text" minOccurs="0"/>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}ProcessingStatus92Choice" minOccurs="0"/>
 *         <element name="IfrrdMtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}MatchingStatus30Choice" minOccurs="0"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}MatchingStatus30Choice" minOccurs="0"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}SettlementStatus22Choice" minOccurs="0"/>
 *         <element name="ModPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}ModificationProcessingStatus11Choice" minOccurs="0"/>
 *         <element name="CxlSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}ProcessingStatus93Choice" minOccurs="0"/>
 *         <element name="Sttld" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}ProprietaryReason5" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTrail11", propOrder = {
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
public class StatusTrail11 {

    @XmlElement(name = "StsDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stsDt;
    @XmlElement(name = "SndgOrgId")
    protected OrganisationIdentification32 sndgOrgId;
    @XmlElement(name = "UsrId")
    protected String usrId;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus92Choice prcgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus30Choice ifrrdMtchgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus30Choice mtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus22Choice sttlmSts;
    @XmlElement(name = "ModPrcgSts")
    protected ModificationProcessingStatus11Choice modPrcgSts;
    @XmlElement(name = "CxlSts")
    protected ProcessingStatus93Choice cxlSts;
    @XmlElement(name = "Sttld")
    protected ProprietaryReason5 sttld;
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
     *     {@link OrganisationIdentification32 }
     *     
     */
    public OrganisationIdentification32 getSndgOrgId() {
        return sndgOrgId;
    }

    /**
     * Sets the value of the sndgOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification32 }
     *     
     */
    public void setSndgOrgId(OrganisationIdentification32 value) {
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
     *     {@link ProcessingStatus92Choice }
     *     
     */
    public ProcessingStatus92Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus92Choice }
     *     
     */
    public void setPrcgSts(ProcessingStatus92Choice value) {
        this.prcgSts = value;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus30Choice }
     *     
     */
    public MatchingStatus30Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus30Choice }
     *     
     */
    public void setIfrrdMtchgSts(MatchingStatus30Choice value) {
        this.ifrrdMtchgSts = value;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus30Choice }
     *     
     */
    public MatchingStatus30Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus30Choice }
     *     
     */
    public void setMtchgSts(MatchingStatus30Choice value) {
        this.mtchgSts = value;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus22Choice }
     *     
     */
    public SettlementStatus22Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus22Choice }
     *     
     */
    public void setSttlmSts(SettlementStatus22Choice value) {
        this.sttlmSts = value;
    }

    /**
     * Gets the value of the modPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationProcessingStatus11Choice }
     *     
     */
    public ModificationProcessingStatus11Choice getModPrcgSts() {
        return modPrcgSts;
    }

    /**
     * Sets the value of the modPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationProcessingStatus11Choice }
     *     
     */
    public void setModPrcgSts(ModificationProcessingStatus11Choice value) {
        this.modPrcgSts = value;
    }

    /**
     * Gets the value of the cxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus93Choice }
     *     
     */
    public ProcessingStatus93Choice getCxlSts() {
        return cxlSts;
    }

    /**
     * Sets the value of the cxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus93Choice }
     *     
     */
    public void setCxlSts(ProcessingStatus93Choice value) {
        this.cxlSts = value;
    }

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public ProprietaryReason5 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public void setSttld(ProprietaryReason5 value) {
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
