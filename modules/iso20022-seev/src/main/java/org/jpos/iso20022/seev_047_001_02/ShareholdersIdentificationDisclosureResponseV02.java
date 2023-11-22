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

package org.jpos.iso20022.seev_047_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareholdersIdentificationDisclosureResponseV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShareholdersIdentificationDisclosureResponseV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}Pagination1" minOccurs="0"/>
 *         <element name="IssrDsclsrReqRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}DisclosureRequestIdentification1"/>
 *         <element name="DsclsrRspnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}Max35Text"/>
 *         <element name="RspndgIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}PartyIdentification219"/>
 *         <element name="DsclsrInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}Disclosure2Choice"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareholdersIdentificationDisclosureResponseV02", propOrder = {
    "pgntn",
    "issrDsclsrReqRef",
    "dsclsrRspnId",
    "rspndgIntrmy",
    "dsclsrInf",
    "splmtryData"
})
public class ShareholdersIdentificationDisclosureResponseV02 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "IssrDsclsrReqRef", required = true)
    protected DisclosureRequestIdentification1 issrDsclsrReqRef;
    @XmlElement(name = "DsclsrRspnId", required = true)
    protected String dsclsrRspnId;
    @XmlElement(name = "RspndgIntrmy", required = true)
    protected PartyIdentification219 rspndgIntrmy;
    @XmlElement(name = "DsclsrInf", required = true)
    protected Disclosure2Choice dsclsrInf;
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
     * Gets the value of the rspndgIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification219 }
     *     
     */
    public PartyIdentification219 getRspndgIntrmy() {
        return rspndgIntrmy;
    }

    /**
     * Sets the value of the rspndgIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification219 }
     *     
     */
    public void setRspndgIntrmy(PartyIdentification219 value) {
        this.rspndgIntrmy = value;
    }

    /**
     * Gets the value of the dsclsrInf property.
     * 
     * @return
     *     possible object is
     *     {@link Disclosure2Choice }
     *     
     */
    public Disclosure2Choice getDsclsrInf() {
        return dsclsrInf;
    }

    /**
     * Sets the value of the dsclsrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disclosure2Choice }
     *     
     */
    public void setDsclsrInf(Disclosure2Choice value) {
        this.dsclsrInf = value;
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
