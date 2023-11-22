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

package org.jpos.iso20022.seev_032_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventProcessingStatusAdviceV08 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionEventProcessingStatusAdviceV08">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.001.08}DocumentIdentification9" minOccurs="0"/>
 *         <element name="OthrDocId" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.001.08}DocumentIdentification33" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.001.08}CorporateActionGeneralInformation154"/>
 *         <element name="EvtPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.001.08}EventProcessingStatus5Choice" maxOccurs="unbounded"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.001.08}CorporateActionNarrative10" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.032.001.08}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventProcessingStatusAdviceV08", propOrder = {
    "ntfctnId",
    "othrDocId",
    "corpActnGnlInf",
    "evtPrcgSts",
    "addtlInf",
    "splmtryData"
})
public class CorporateActionEventProcessingStatusAdviceV08 {

    @XmlElement(name = "NtfctnId")
    protected DocumentIdentification9 ntfctnId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification33> othrDocId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation154 corpActnGnlInf;
    @XmlElement(name = "EvtPrcgSts", required = true)
    protected List<EventProcessingStatus5Choice> evtPrcgSts;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative10 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public DocumentIdentification9 getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public void setNtfctnId(DocumentIdentification9 value) {
        this.ntfctnId = value;
    }

    /**
     * Gets the value of the othrDocId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrDocId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrDocId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification33 }
     * 
     * 
     * @return
     *     The value of the othrDocId property.
     */
    public List<DocumentIdentification33> getOthrDocId() {
        if (othrDocId == null) {
            othrDocId = new ArrayList<>();
        }
        return this.othrDocId;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation154 }
     *     
     */
    public CorporateActionGeneralInformation154 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation154 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionGeneralInformation154 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the evtPrcgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtPrcgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtPrcgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventProcessingStatus5Choice }
     * 
     * 
     * @return
     *     The value of the evtPrcgSts property.
     */
    public List<EventProcessingStatus5Choice> getEvtPrcgSts() {
        if (evtPrcgSts == null) {
            evtPrcgSts = new ArrayList<>();
        }
        return this.evtPrcgSts;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative10 }
     *     
     */
    public CorporateActionNarrative10 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative10 }
     *     
     */
    public void setAddtlInf(CorporateActionNarrative10 value) {
        this.addtlInf = value;
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
