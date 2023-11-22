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

package org.jpos.iso20022.auth_025_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportingDocument3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SupportingDocument3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SpprtgDocId" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}Max35Text"/>
 *         <element name="OrgnlReqId" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Cert" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}DocumentIdentification28"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}PartyIdentification135"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="Amdmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}DocumentAmendment1" minOccurs="0"/>
 *         <element name="CtrctRef" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}ContractRegistrationReference2Choice"/>
 *         <element name="Ntry" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}SupportingDocumentEntry2" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportingDocument3", propOrder = {
    "spprtgDocId",
    "orgnlReqId",
    "cert",
    "acctOwnr",
    "acctSvcr",
    "amdmnt",
    "ctrctRef",
    "ntry",
    "splmtryData"
})
public class SupportingDocument3 {

    @XmlElement(name = "SpprtgDocId", required = true)
    protected String spprtgDocId;
    @XmlElement(name = "OrgnlReqId")
    protected String orgnlReqId;
    @XmlElement(name = "Cert", required = true)
    protected DocumentIdentification28 cert;
    @XmlElement(name = "AcctOwnr", required = true)
    protected PartyIdentification135 acctOwnr;
    @XmlElement(name = "AcctSvcr", required = true)
    protected BranchAndFinancialInstitutionIdentification6 acctSvcr;
    @XmlElement(name = "Amdmnt")
    protected DocumentAmendment1 amdmnt;
    @XmlElement(name = "CtrctRef", required = true)
    protected ContractRegistrationReference2Choice ctrctRef;
    @XmlElement(name = "Ntry", required = true)
    protected List<SupportingDocumentEntry2> ntry;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the spprtgDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpprtgDocId() {
        return spprtgDocId;
    }

    /**
     * Sets the value of the spprtgDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpprtgDocId(String value) {
        this.spprtgDocId = value;
    }

    /**
     * Gets the value of the orgnlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlReqId() {
        return orgnlReqId;
    }

    /**
     * Sets the value of the orgnlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlReqId(String value) {
        this.orgnlReqId = value;
    }

    /**
     * Gets the value of the cert property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public DocumentIdentification28 getCert() {
        return cert;
    }

    /**
     * Sets the value of the cert property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public void setCert(DocumentIdentification28 value) {
        this.cert = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setAcctOwnr(PartyIdentification135 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentAmendment1 }
     *     
     */
    public DocumentAmendment1 getAmdmnt() {
        return amdmnt;
    }

    /**
     * Sets the value of the amdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAmendment1 }
     *     
     */
    public void setAmdmnt(DocumentAmendment1 value) {
        this.amdmnt = value;
    }

    /**
     * Gets the value of the ctrctRef property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationReference2Choice }
     *     
     */
    public ContractRegistrationReference2Choice getCtrctRef() {
        return ctrctRef;
    }

    /**
     * Sets the value of the ctrctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationReference2Choice }
     *     
     */
    public void setCtrctRef(ContractRegistrationReference2Choice value) {
        this.ctrctRef = value;
    }

    /**
     * Gets the value of the ntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportingDocumentEntry2 }
     * 
     * 
     * @return
     *     The value of the ntry property.
     */
    public List<SupportingDocumentEntry2> getNtry() {
        if (ntry == null) {
            ntry = new ArrayList<>();
        }
        return this.ntry;
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
