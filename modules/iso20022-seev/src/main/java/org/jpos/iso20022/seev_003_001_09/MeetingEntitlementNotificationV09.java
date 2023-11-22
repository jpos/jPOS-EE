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

package org.jpos.iso20022.seev_003_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingEntitlementNotificationV09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MeetingEntitlementNotificationV09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}NotificationType2Code"/>
 *         <element name="PrvsEntitlmntNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}Max35Text" minOccurs="0"/>
 *         <element name="MtgRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}MeetingReference10"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}PartyIdentification129Choice"/>
 *         <element name="Scty" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}SecurityPosition18" maxOccurs="200"/>
 *         <element name="Elgblty" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}EligibilityDates1"/>
 *         <element name="MtgAttndee" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}PartyIdentification232Choice" minOccurs="0"/>
 *         <element name="Prxy" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}PartyIdentification232Choice" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingEntitlementNotificationV09", propOrder = {
    "ntfctnTp",
    "prvsEntitlmntNtfctnId",
    "mtgRef",
    "issr",
    "scty",
    "elgblty",
    "mtgAttndee",
    "prxy",
    "splmtryData"
})
public class MeetingEntitlementNotificationV09 {

    @XmlElement(name = "NtfctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationType2Code ntfctnTp;
    @XmlElement(name = "PrvsEntitlmntNtfctnId")
    protected String prvsEntitlmntNtfctnId;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference10 mtgRef;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification129Choice issr;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition18> scty;
    @XmlElement(name = "Elgblty", required = true)
    protected EligibilityDates1 elgblty;
    @XmlElement(name = "MtgAttndee")
    protected PartyIdentification232Choice mtgAttndee;
    @XmlElement(name = "Prxy")
    protected PartyIdentification232Choice prxy;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType2Code }
     *     
     */
    public NotificationType2Code getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType2Code }
     *     
     */
    public void setNtfctnTp(NotificationType2Code value) {
        this.ntfctnTp = value;
    }

    /**
     * Gets the value of the prvsEntitlmntNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsEntitlmntNtfctnId() {
        return prvsEntitlmntNtfctnId;
    }

    /**
     * Sets the value of the prvsEntitlmntNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvsEntitlmntNtfctnId(String value) {
        this.prvsEntitlmntNtfctnId = value;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference10 }
     *     
     */
    public MeetingReference10 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference10 }
     *     
     */
    public void setMtgRef(MeetingReference10 value) {
        this.mtgRef = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public PartyIdentification129Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public void setIssr(PartyIdentification129Choice value) {
        this.issr = value;
    }

    /**
     * Gets the value of the scty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityPosition18 }
     * 
     * 
     * @return
     *     The value of the scty property.
     */
    public List<SecurityPosition18> getScty() {
        if (scty == null) {
            scty = new ArrayList<>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the elgblty property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityDates1 }
     *     
     */
    public EligibilityDates1 getElgblty() {
        return elgblty;
    }

    /**
     * Sets the value of the elgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityDates1 }
     *     
     */
    public void setElgblty(EligibilityDates1 value) {
        this.elgblty = value;
    }

    /**
     * Gets the value of the mtgAttndee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PartyIdentification232Choice getMtgAttndee() {
        return mtgAttndee;
    }

    /**
     * Sets the value of the mtgAttndee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public void setMtgAttndee(PartyIdentification232Choice value) {
        this.mtgAttndee = value;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PartyIdentification232Choice getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public void setPrxy(PartyIdentification232Choice value) {
        this.prxy = value;
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
