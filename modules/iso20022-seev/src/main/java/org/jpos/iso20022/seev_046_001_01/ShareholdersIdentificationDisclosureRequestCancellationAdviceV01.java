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

package org.jpos.iso20022.seev_046_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareholdersIdentificationDisclosureRequestCancellationAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShareholdersIdentificationDisclosureRequestCancellationAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IssrDsclsrReqRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.046.001.01}DisclosureRequestIdentification1"/>
 *         <element name="CxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.046.001.01}DisclosureRequestCancellationReason1Code" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:seev.046.001.01}PartyIdentification129Choice" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.046.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareholdersIdentificationDisclosureRequestCancellationAdviceV01", propOrder = {
    "issrDsclsrReqRef",
    "cxlRsn",
    "issr",
    "splmtryData"
})
public class ShareholdersIdentificationDisclosureRequestCancellationAdviceV01 {

    @XmlElement(name = "IssrDsclsrReqRef", required = true)
    protected DisclosureRequestIdentification1 issrDsclsrReqRef;
    @XmlElement(name = "CxlRsn")
    @XmlSchemaType(name = "string")
    protected DisclosureRequestCancellationReason1Code cxlRsn;
    @XmlElement(name = "Issr")
    protected PartyIdentification129Choice issr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the issrDsclsrReqRef property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureRequestIdentification1 }
     *     
     */
    public DisclosureRequestIdentification1 getIssrDsclsrReqRef() {
        return issrDsclsrReqRef;
    }

    /**
     * Sets the value of the issrDsclsrReqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureRequestIdentification1 }
     *     
     */
    public void setIssrDsclsrReqRef(DisclosureRequestIdentification1 value) {
        this.issrDsclsrReqRef = value;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureRequestCancellationReason1Code }
     *     
     */
    public DisclosureRequestCancellationReason1Code getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureRequestCancellationReason1Code }
     *     
     */
    public void setCxlRsn(DisclosureRequestCancellationReason1Code value) {
        this.cxlRsn = value;
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
