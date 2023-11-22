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

package org.jpos.iso20022.seev_005_001_09;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingReference10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MeetingReference10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MtgId" type="{urn:iso:std:iso:20022:tech:xsd:seev.005.001.09}Max35Text"/>
 *         <element name="IssrMtgId" type="{urn:iso:std:iso:20022:tech:xsd:seev.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="MtgDtAndTm" type="{urn:iso:std:iso:20022:tech:xsd:seev.005.001.09}ISODateTime"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:seev.005.001.09}MeetingType4Code"/>
 *         <element name="Clssfctn" type="{urn:iso:std:iso:20022:tech:xsd:seev.005.001.09}MeetingTypeClassification2Choice" minOccurs="0"/>
 *         <element name="Lctn" type="{urn:iso:std:iso:20022:tech:xsd:seev.005.001.09}PostalAddress1" maxOccurs="5" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:seev.005.001.09}PartyIdentification129Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingReference10", propOrder = {
    "mtgId",
    "issrMtgId",
    "mtgDtAndTm",
    "tp",
    "clssfctn",
    "lctn",
    "issr"
})
public class MeetingReference10 {

    @XmlElement(name = "MtgId", required = true)
    protected String mtgId;
    @XmlElement(name = "IssrMtgId")
    protected String issrMtgId;
    @XmlElement(name = "MtgDtAndTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mtgDtAndTm;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected MeetingType4Code tp;
    @XmlElement(name = "Clssfctn")
    protected MeetingTypeClassification2Choice clssfctn;
    @XmlElement(name = "Lctn")
    protected List<PostalAddress1> lctn;
    @XmlElement(name = "Issr")
    protected PartyIdentification129Choice issr;

    /**
     * Gets the value of the mtgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtgId() {
        return mtgId;
    }

    /**
     * Sets the value of the mtgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtgId(String value) {
        this.mtgId = value;
    }

    /**
     * Gets the value of the issrMtgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrMtgId() {
        return issrMtgId;
    }

    /**
     * Sets the value of the issrMtgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrMtgId(String value) {
        this.issrMtgId = value;
    }

    /**
     * Gets the value of the mtgDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtgDtAndTm() {
        return mtgDtAndTm;
    }

    /**
     * Sets the value of the mtgDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtgDtAndTm(XMLGregorianCalendar value) {
        this.mtgDtAndTm = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingType4Code }
     *     
     */
    public MeetingType4Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingType4Code }
     *     
     */
    public void setTp(MeetingType4Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the clssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingTypeClassification2Choice }
     *     
     */
    public MeetingTypeClassification2Choice getClssfctn() {
        return clssfctn;
    }

    /**
     * Sets the value of the clssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingTypeClassification2Choice }
     *     
     */
    public void setClssfctn(MeetingTypeClassification2Choice value) {
        this.clssfctn = value;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress1 }
     * 
     * 
     * @return
     *     The value of the lctn property.
     */
    public List<PostalAddress1> getLctn() {
        if (lctn == null) {
            lctn = new ArrayList<>();
        }
        return this.lctn;
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

}
