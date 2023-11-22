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

package org.jpos.iso20022.seev_001_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingNotificationV10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MeetingNotificationV10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Pagination1" minOccurs="0"/>
 *         <element name="NtfctnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}NotificationGeneralInformation4"/>
 *         <element name="NtfctnUpd" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}NotificationUpdate2" minOccurs="0"/>
 *         <element name="EvtsLkg" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}MeetingEventReference1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Mtg" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}MeetingNotice8"/>
 *         <element name="MtgDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Meeting6" maxOccurs="5"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}IssuerInformation3"/>
 *         <element name="IssrAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}IssuerAgent3" maxOccurs="10" minOccurs="0"/>
 *         <element name="Scty" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}SecurityPosition16" maxOccurs="200"/>
 *         <element name="Rsltn" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Resolution6" maxOccurs="1000" minOccurs="0"/>
 *         <element name="Vote" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}VoteParameters8" minOccurs="0"/>
 *         <element name="PwrOfAttnyRqrmnts" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PowerOfAttorneyRequirements4" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}CorporateEventNarrative4" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingNotificationV10", propOrder = {
    "pgntn",
    "ntfctnGnlInf",
    "ntfctnUpd",
    "evtsLkg",
    "mtg",
    "mtgDtls",
    "issr",
    "issrAgt",
    "scty",
    "rsltn",
    "vote",
    "pwrOfAttnyRqrmnts",
    "addtlInf",
    "splmtryData"
})
public class MeetingNotificationV10 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "NtfctnGnlInf", required = true)
    protected NotificationGeneralInformation4 ntfctnGnlInf;
    @XmlElement(name = "NtfctnUpd")
    protected NotificationUpdate2 ntfctnUpd;
    @XmlElement(name = "EvtsLkg")
    protected List<MeetingEventReference1> evtsLkg;
    @XmlElement(name = "Mtg", required = true)
    protected MeetingNotice8 mtg;
    @XmlElement(name = "MtgDtls", required = true)
    protected List<Meeting6> mtgDtls;
    @XmlElement(name = "Issr", required = true)
    protected IssuerInformation3 issr;
    @XmlElement(name = "IssrAgt")
    protected List<IssuerAgent3> issrAgt;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition16> scty;
    @XmlElement(name = "Rsltn")
    protected List<Resolution6> rsltn;
    @XmlElement(name = "Vote")
    protected VoteParameters8 vote;
    @XmlElement(name = "PwrOfAttnyRqrmnts")
    protected PowerOfAttorneyRequirements4 pwrOfAttnyRqrmnts;
    @XmlElement(name = "AddtlInf")
    protected CorporateEventNarrative4 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setPgntn(Pagination1 value) {
        this.pgntn = value;
    }

    /**
     * Gets the value of the ntfctnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationGeneralInformation4 }
     *     
     */
    public NotificationGeneralInformation4 getNtfctnGnlInf() {
        return ntfctnGnlInf;
    }

    /**
     * Sets the value of the ntfctnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationGeneralInformation4 }
     *     
     */
    public void setNtfctnGnlInf(NotificationGeneralInformation4 value) {
        this.ntfctnGnlInf = value;
    }

    /**
     * Gets the value of the ntfctnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationUpdate2 }
     *     
     */
    public NotificationUpdate2 getNtfctnUpd() {
        return ntfctnUpd;
    }

    /**
     * Sets the value of the ntfctnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationUpdate2 }
     *     
     */
    public void setNtfctnUpd(NotificationUpdate2 value) {
        this.ntfctnUpd = value;
    }

    /**
     * Gets the value of the evtsLkg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtsLkg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtsLkg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingEventReference1 }
     * 
     * 
     * @return
     *     The value of the evtsLkg property.
     */
    public List<MeetingEventReference1> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<>();
        }
        return this.evtsLkg;
    }

    /**
     * Gets the value of the mtg property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingNotice8 }
     *     
     */
    public MeetingNotice8 getMtg() {
        return mtg;
    }

    /**
     * Sets the value of the mtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingNotice8 }
     *     
     */
    public void setMtg(MeetingNotice8 value) {
        this.mtg = value;
    }

    /**
     * Gets the value of the mtgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mtgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Meeting6 }
     * 
     * 
     * @return
     *     The value of the mtgDtls property.
     */
    public List<Meeting6> getMtgDtls() {
        if (mtgDtls == null) {
            mtgDtls = new ArrayList<>();
        }
        return this.mtgDtls;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerInformation3 }
     *     
     */
    public IssuerInformation3 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerInformation3 }
     *     
     */
    public void setIssr(IssuerInformation3 value) {
        this.issr = value;
    }

    /**
     * Gets the value of the issrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the issrAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuerAgent3 }
     * 
     * 
     * @return
     *     The value of the issrAgt property.
     */
    public List<IssuerAgent3> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<>();
        }
        return this.issrAgt;
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
     * {@link SecurityPosition16 }
     * 
     * 
     * @return
     *     The value of the scty property.
     */
    public List<SecurityPosition16> getScty() {
        if (scty == null) {
            scty = new ArrayList<>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the rsltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resolution6 }
     * 
     * 
     * @return
     *     The value of the rsltn property.
     */
    public List<Resolution6> getRsltn() {
        if (rsltn == null) {
            rsltn = new ArrayList<>();
        }
        return this.rsltn;
    }

    /**
     * Gets the value of the vote property.
     * 
     * @return
     *     possible object is
     *     {@link VoteParameters8 }
     *     
     */
    public VoteParameters8 getVote() {
        return vote;
    }

    /**
     * Sets the value of the vote property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteParameters8 }
     *     
     */
    public void setVote(VoteParameters8 value) {
        this.vote = value;
    }

    /**
     * Gets the value of the pwrOfAttnyRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link PowerOfAttorneyRequirements4 }
     *     
     */
    public PowerOfAttorneyRequirements4 getPwrOfAttnyRqrmnts() {
        return pwrOfAttnyRqrmnts;
    }

    /**
     * Sets the value of the pwrOfAttnyRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerOfAttorneyRequirements4 }
     *     
     */
    public void setPwrOfAttnyRqrmnts(PowerOfAttorneyRequirements4 value) {
        this.pwrOfAttnyRqrmnts = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateEventNarrative4 }
     *     
     */
    public CorporateEventNarrative4 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateEventNarrative4 }
     *     
     */
    public void setAddtlInf(CorporateEventNarrative4 value) {
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
