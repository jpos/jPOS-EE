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

package org.jpos.iso20022.seev_008_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingResultDisseminationV08 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MeetingResultDisseminationV08">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}Pagination1" minOccurs="0"/>
 *         <element name="MtgRsltDssmntnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}Max35Text" minOccurs="0"/>
 *         <element name="MtgRsltsDssmntnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}NotificationType2Code"/>
 *         <element name="PrvsMtgRsltsDssmntnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}Max35Text" minOccurs="0"/>
 *         <element name="MtgRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}MeetingReference10"/>
 *         <element name="Scty" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}SecurityPosition19" maxOccurs="200"/>
 *         <element name="VoteRslt" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}Vote18" maxOccurs="1000"/>
 *         <element name="Prtcptn" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}Participation5" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}CommunicationAddress11" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingResultDisseminationV08", propOrder = {
    "pgntn",
    "mtgRsltDssmntnId",
    "mtgRsltsDssmntnTp",
    "prvsMtgRsltsDssmntnId",
    "mtgRef",
    "scty",
    "voteRslt",
    "prtcptn",
    "addtlInf",
    "splmtryData"
})
public class MeetingResultDisseminationV08 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "MtgRsltDssmntnId")
    protected String mtgRsltDssmntnId;
    @XmlElement(name = "MtgRsltsDssmntnTp", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationType2Code mtgRsltsDssmntnTp;
    @XmlElement(name = "PrvsMtgRsltsDssmntnId")
    protected String prvsMtgRsltsDssmntnId;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference10 mtgRef;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition19> scty;
    @XmlElement(name = "VoteRslt", required = true)
    protected List<Vote18> voteRslt;
    @XmlElement(name = "Prtcptn")
    protected Participation5 prtcptn;
    @XmlElement(name = "AddtlInf")
    protected CommunicationAddress11 addtlInf;
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
     * Gets the value of the mtgRsltDssmntnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtgRsltDssmntnId() {
        return mtgRsltDssmntnId;
    }

    /**
     * Sets the value of the mtgRsltDssmntnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtgRsltDssmntnId(String value) {
        this.mtgRsltDssmntnId = value;
    }

    /**
     * Gets the value of the mtgRsltsDssmntnTp property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType2Code }
     *     
     */
    public NotificationType2Code getMtgRsltsDssmntnTp() {
        return mtgRsltsDssmntnTp;
    }

    /**
     * Sets the value of the mtgRsltsDssmntnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType2Code }
     *     
     */
    public void setMtgRsltsDssmntnTp(NotificationType2Code value) {
        this.mtgRsltsDssmntnTp = value;
    }

    /**
     * Gets the value of the prvsMtgRsltsDssmntnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsMtgRsltsDssmntnId() {
        return prvsMtgRsltsDssmntnId;
    }

    /**
     * Sets the value of the prvsMtgRsltsDssmntnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvsMtgRsltsDssmntnId(String value) {
        this.prvsMtgRsltsDssmntnId = value;
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
     * {@link SecurityPosition19 }
     * 
     * 
     * @return
     *     The value of the scty property.
     */
    public List<SecurityPosition19> getScty() {
        if (scty == null) {
            scty = new ArrayList<>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the voteRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the voteRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vote18 }
     * 
     * 
     * @return
     *     The value of the voteRslt property.
     */
    public List<Vote18> getVoteRslt() {
        if (voteRslt == null) {
            voteRslt = new ArrayList<>();
        }
        return this.voteRslt;
    }

    /**
     * Gets the value of the prtcptn property.
     * 
     * @return
     *     possible object is
     *     {@link Participation5 }
     *     
     */
    public Participation5 getPrtcptn() {
        return prtcptn;
    }

    /**
     * Sets the value of the prtcptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participation5 }
     *     
     */
    public void setPrtcptn(Participation5 value) {
        this.prtcptn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress11 }
     *     
     */
    public CommunicationAddress11 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress11 }
     *     
     */
    public void setAddtlInf(CommunicationAddress11 value) {
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
