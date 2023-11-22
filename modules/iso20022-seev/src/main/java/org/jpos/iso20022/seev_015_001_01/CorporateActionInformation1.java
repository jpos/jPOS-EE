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

package org.jpos.iso20022.seev_015_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgtId" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}PartyIdentification2Choice"/>
 *         <element name="IssrCorpActnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CorpActnPrcgId" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}Max35Text" minOccurs="0"/>
 *         <element name="EvtTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}CorporateActionEventType2FormatChoice"/>
 *         <element name="MndtryVlntryEvtTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}CorporateActionMandatoryVoluntary1FormatChoice"/>
 *         <element name="EvtPrcgTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}CorporateActionEventProcessingType1FormatChoice" minOccurs="0"/>
 *         <element name="UndrlygScty" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}FinancialInstrumentDescription3"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInformation1", propOrder = {
    "agtId",
    "issrCorpActnId",
    "corpActnPrcgId",
    "evtTp",
    "mndtryVlntryEvtTp",
    "evtPrcgTp",
    "undrlygScty"
})
public class CorporateActionInformation1 {

    @XmlElement(name = "AgtId", required = true)
    protected PartyIdentification2Choice agtId;
    @XmlElement(name = "IssrCorpActnId")
    protected String issrCorpActnId;
    @XmlElement(name = "CorpActnPrcgId")
    protected String corpActnPrcgId;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType2FormatChoice evtTp;
    @XmlElement(name = "MndtryVlntryEvtTp", required = true)
    protected CorporateActionMandatoryVoluntary1FormatChoice mndtryVlntryEvtTp;
    @XmlElement(name = "EvtPrcgTp")
    protected CorporateActionEventProcessingType1FormatChoice evtPrcgTp;
    @XmlElement(name = "UndrlygScty", required = true)
    protected FinancialInstrumentDescription3 undrlygScty;

    /**
     * Gets the value of the agtId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAgtId() {
        return agtId;
    }

    /**
     * Sets the value of the agtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setAgtId(PartyIdentification2Choice value) {
        this.agtId = value;
    }

    /**
     * Gets the value of the issrCorpActnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrCorpActnId() {
        return issrCorpActnId;
    }

    /**
     * Sets the value of the issrCorpActnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrCorpActnId(String value) {
        this.issrCorpActnId = value;
    }

    /**
     * Gets the value of the corpActnPrcgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnPrcgId() {
        return corpActnPrcgId;
    }

    /**
     * Sets the value of the corpActnPrcgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpActnPrcgId(String value) {
        this.corpActnPrcgId = value;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType2FormatChoice }
     *     
     */
    public CorporateActionEventType2FormatChoice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType2FormatChoice }
     *     
     */
    public void setEvtTp(CorporateActionEventType2FormatChoice value) {
        this.evtTp = value;
    }

    /**
     * Gets the value of the mndtryVlntryEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMandatoryVoluntary1FormatChoice }
     *     
     */
    public CorporateActionMandatoryVoluntary1FormatChoice getMndtryVlntryEvtTp() {
        return mndtryVlntryEvtTp;
    }

    /**
     * Sets the value of the mndtryVlntryEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMandatoryVoluntary1FormatChoice }
     *     
     */
    public void setMndtryVlntryEvtTp(CorporateActionMandatoryVoluntary1FormatChoice value) {
        this.mndtryVlntryEvtTp = value;
    }

    /**
     * Gets the value of the evtPrcgTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingType1FormatChoice }
     *     
     */
    public CorporateActionEventProcessingType1FormatChoice getEvtPrcgTp() {
        return evtPrcgTp;
    }

    /**
     * Sets the value of the evtPrcgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingType1FormatChoice }
     *     
     */
    public void setEvtPrcgTp(CorporateActionEventProcessingType1FormatChoice value) {
        this.evtPrcgTp = value;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public FinancialInstrumentDescription3 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public void setUndrlygScty(FinancialInstrumentDescription3 value) {
        this.undrlygScty = value;
    }

}
