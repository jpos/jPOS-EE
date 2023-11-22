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

package org.jpos.iso20022.seev_009_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedCorporateAction1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LinkedCorporateAction1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}CorporateActionNotificationType1Code"/>
 *         <element name="LkdAgtCANtfctnAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DocumentIdentification8" minOccurs="0"/>
 *         <element name="LkgTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ProcessingPosition2FormatChoice" minOccurs="0"/>
 *         <element name="LkdIssrCorpActnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="LkdCorpActnPrcgId" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedCorporateAction1", propOrder = {
    "ntfctnTp",
    "lkdAgtCANtfctnAdvcId",
    "lkgTp",
    "lkdIssrCorpActnId",
    "lkdCorpActnPrcgId"
})
public class LinkedCorporateAction1 {

    @XmlElement(name = "NtfctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionNotificationType1Code ntfctnTp;
    @XmlElement(name = "LkdAgtCANtfctnAdvcId")
    protected DocumentIdentification8 lkdAgtCANtfctnAdvcId;
    @XmlElement(name = "LkgTp")
    protected ProcessingPosition2FormatChoice lkgTp;
    @XmlElement(name = "LkdIssrCorpActnId")
    protected String lkdIssrCorpActnId;
    @XmlElement(name = "LkdCorpActnPrcgId")
    protected String lkdCorpActnPrcgId;

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationType1Code }
     *     
     */
    public CorporateActionNotificationType1Code getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationType1Code }
     *     
     */
    public void setNtfctnTp(CorporateActionNotificationType1Code value) {
        this.ntfctnTp = value;
    }

    /**
     * Gets the value of the lkdAgtCANtfctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getLkdAgtCANtfctnAdvcId() {
        return lkdAgtCANtfctnAdvcId;
    }

    /**
     * Sets the value of the lkdAgtCANtfctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setLkdAgtCANtfctnAdvcId(DocumentIdentification8 value) {
        this.lkdAgtCANtfctnAdvcId = value;
    }

    /**
     * Gets the value of the lkgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition2FormatChoice }
     *     
     */
    public ProcessingPosition2FormatChoice getLkgTp() {
        return lkgTp;
    }

    /**
     * Sets the value of the lkgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition2FormatChoice }
     *     
     */
    public void setLkgTp(ProcessingPosition2FormatChoice value) {
        this.lkgTp = value;
    }

    /**
     * Gets the value of the lkdIssrCorpActnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdIssrCorpActnId() {
        return lkdIssrCorpActnId;
    }

    /**
     * Sets the value of the lkdIssrCorpActnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkdIssrCorpActnId(String value) {
        this.lkdIssrCorpActnId = value;
    }

    /**
     * Gets the value of the lkdCorpActnPrcgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdCorpActnPrcgId() {
        return lkdCorpActnPrcgId;
    }

    /**
     * Sets the value of the lkdCorpActnPrcgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkdCorpActnPrcgId(String value) {
        this.lkdCorpActnPrcgId = value;
    }

}
