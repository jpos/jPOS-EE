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

package org.jpos.iso20022.seev_023_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionAdditionalInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionAdditionalInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BnfclOwnrDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.023.001.01}BeneficialOwner1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.023.001.01}Max350Text" minOccurs="0"/>
 *         <element name="RcvrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.023.001.01}PartyIdentification2Choice" minOccurs="0"/>
 *         <element name="CertfctnInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.023.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="CertfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.023.001.01}BeneficiaryCertificationType1FormatChoice" minOccurs="0"/>
 *         <element name="DlvryDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.023.001.01}ProceedsDelivery1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.023.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAdditionalInformation1", propOrder = {
    "bnfclOwnrDtls",
    "regnDtls",
    "rcvrId",
    "certfctnInd",
    "certfctnTp",
    "dlvryDtls",
    "addtlInstr"
})
public class CorporateActionAdditionalInformation1 {

    @XmlElement(name = "BnfclOwnrDtls")
    protected List<BeneficialOwner1> bnfclOwnrDtls;
    @XmlElement(name = "RegnDtls")
    protected String regnDtls;
    @XmlElement(name = "RcvrId")
    protected PartyIdentification2Choice rcvrId;
    @XmlElement(name = "CertfctnInd")
    protected Boolean certfctnInd;
    @XmlElement(name = "CertfctnTp")
    protected BeneficiaryCertificationType1FormatChoice certfctnTp;
    @XmlElement(name = "DlvryDtls")
    protected List<ProceedsDelivery1> dlvryDtls;
    @XmlElement(name = "AddtlInstr")
    protected String addtlInstr;

    /**
     * Gets the value of the bnfclOwnrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfclOwnrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfclOwnrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficialOwner1 }
     * 
     * 
     * @return
     *     The value of the bnfclOwnrDtls property.
     */
    public List<BeneficialOwner1> getBnfclOwnrDtls() {
        if (bnfclOwnrDtls == null) {
            bnfclOwnrDtls = new ArrayList<>();
        }
        return this.bnfclOwnrDtls;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnDtls(String value) {
        this.regnDtls = value;
    }

    /**
     * Gets the value of the rcvrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getRcvrId() {
        return rcvrId;
    }

    /**
     * Sets the value of the rcvrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setRcvrId(PartyIdentification2Choice value) {
        this.rcvrId = value;
    }

    /**
     * Gets the value of the certfctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertfctnInd() {
        return certfctnInd;
    }

    /**
     * Sets the value of the certfctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertfctnInd(Boolean value) {
        this.certfctnInd = value;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryCertificationType1FormatChoice }
     *     
     */
    public BeneficiaryCertificationType1FormatChoice getCertfctnTp() {
        return certfctnTp;
    }

    /**
     * Sets the value of the certfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryCertificationType1FormatChoice }
     *     
     */
    public void setCertfctnTp(BeneficiaryCertificationType1FormatChoice value) {
        this.certfctnTp = value;
    }

    /**
     * Gets the value of the dlvryDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvryDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProceedsDelivery1 }
     * 
     * 
     * @return
     *     The value of the dlvryDtls property.
     */
    public List<ProceedsDelivery1> getDlvryDtls() {
        if (dlvryDtls == null) {
            dlvryDtls = new ArrayList<>();
        }
        return this.dlvryDtls;
    }

    /**
     * Gets the value of the addtlInstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInstr() {
        return addtlInstr;
    }

    /**
     * Sets the value of the addtlInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInstr(String value) {
        this.addtlInstr = value;
    }

}
