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

package org.jpos.iso20022.seev_048_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareholderIdentificationDisclosureResponseCancellationAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShareholderIdentificationDisclosureResponseCancellationAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DsclsrRspnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.048.001.01}Max35Text"/>
 *         <element name="IssrDsclsrReqRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.048.001.01}DisclosureRequestIdentification1"/>
 *         <element name="RspndgIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:seev.048.001.01}PartyIdentification215"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.048.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareholderIdentificationDisclosureResponseCancellationAdviceV01", propOrder = {
    "dsclsrRspnId",
    "issrDsclsrReqRef",
    "rspndgIntrmy",
    "splmtryData"
})
public class ShareholderIdentificationDisclosureResponseCancellationAdviceV01 {

    @XmlElement(name = "DsclsrRspnId", required = true)
    protected String dsclsrRspnId;
    @XmlElement(name = "IssrDsclsrReqRef", required = true)
    protected DisclosureRequestIdentification1 issrDsclsrReqRef;
    @XmlElement(name = "RspndgIntrmy", required = true)
    protected PartyIdentification215 rspndgIntrmy;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the dsclsrRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsclsrRspnId() {
        return dsclsrRspnId;
    }

    /**
     * Sets the value of the dsclsrRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsclsrRspnId(String value) {
        this.dsclsrRspnId = value;
    }

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
     * Gets the value of the rspndgIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification215 }
     *     
     */
    public PartyIdentification215 getRspndgIntrmy() {
        return rspndgIntrmy;
    }

    /**
     * Sets the value of the rspndgIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification215 }
     *     
     */
    public void setRspndgIntrmy(PartyIdentification215 value) {
        this.rspndgIntrmy = value;
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
