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

package org.jpos.iso20022.seev_021_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCAMovementConfirmationV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCAMovementConfirmationV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.021.001.01}DocumentIdentification8"/>
 *         <choice>
 *           <element name="AgtCAMvmntInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.021.001.01}DocumentIdentification8"/>
 *           <element name="AgtCAElctnStsAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.021.001.01}DocumentIdentification8"/>
 *           <element name="AgtCAGblDstrbtnStsAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.021.001.01}DocumentIdentification8"/>
 *         </choice>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.021.001.01}CorporateActionInformation1"/>
 *         <element name="SctiesMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.021.001.01}CorporateActionSecuritiesMovement1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.021.001.01}CashMovement3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAMovementConfirmationV01", propOrder = {
    "id",
    "agtCAMvmntInstrId",
    "agtCAElctnStsAdvcId",
    "agtCAGblDstrbtnStsAdvcId",
    "corpActnGnlInf",
    "sctiesMvmntDtls",
    "cshMvmntDtls"
})
public class AgentCAMovementConfirmationV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAMvmntInstrId")
    protected DocumentIdentification8 agtCAMvmntInstrId;
    @XmlElement(name = "AgtCAElctnStsAdvcId")
    protected DocumentIdentification8 agtCAElctnStsAdvcId;
    @XmlElement(name = "AgtCAGblDstrbtnStsAdvcId")
    protected DocumentIdentification8 agtCAGblDstrbtnStsAdvcId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<CorporateActionSecuritiesMovement1> sctiesMvmntDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashMovement3> cshMvmntDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setId(DocumentIdentification8 value) {
        this.id = value;
    }

    /**
     * Gets the value of the agtCAMvmntInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAMvmntInstrId() {
        return agtCAMvmntInstrId;
    }

    /**
     * Sets the value of the agtCAMvmntInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAMvmntInstrId(DocumentIdentification8 value) {
        this.agtCAMvmntInstrId = value;
    }

    /**
     * Gets the value of the agtCAElctnStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnStsAdvcId() {
        return agtCAElctnStsAdvcId;
    }

    /**
     * Sets the value of the agtCAElctnStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAElctnStsAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnStsAdvcId = value;
    }

    /**
     * Gets the value of the agtCAGblDstrbtnStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAGblDstrbtnStsAdvcId() {
        return agtCAGblDstrbtnStsAdvcId;
    }

    /**
     * Sets the value of the agtCAGblDstrbtnStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAGblDstrbtnStsAdvcId(DocumentIdentification8 value) {
        this.agtCAGblDstrbtnStsAdvcId = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public CorporateActionInformation1 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionSecuritiesMovement1 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntDtls property.
     */
    public List<CorporateActionSecuritiesMovement1> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMovement3 }
     * 
     * 
     * @return
     *     The value of the cshMvmntDtls property.
     */
    public List<CashMovement3> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<>();
        }
        return this.cshMvmntDtls;
    }

}
