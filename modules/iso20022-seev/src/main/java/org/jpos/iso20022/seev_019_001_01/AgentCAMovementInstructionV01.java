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

package org.jpos.iso20022.seev_019_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCAMovementInstructionV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCAMovementInstructionV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}DocumentIdentification8"/>
 *         <element name="AgtCAElctnAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}DocumentIdentification8" minOccurs="0"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}CorporateActionInformation1"/>
 *         <element name="MvmntGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}CorporateActionMovement1"/>
 *         <element name="UndrlygSctiesMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}UnderlyingSecurityMovement1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UndrlygCshMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}CashMovement2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrcdsMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}ProceedsMovement1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAMovementInstructionV01", propOrder = {
    "id",
    "agtCAElctnAdvcId",
    "corpActnGnlInf",
    "mvmntGnlInf",
    "undrlygSctiesMvmntDtls",
    "undrlygCshMvmntDtls",
    "prcdsMvmntDtls"
})
public class AgentCAMovementInstructionV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAElctnAdvcId")
    protected DocumentIdentification8 agtCAElctnAdvcId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "MvmntGnlInf", required = true)
    protected CorporateActionMovement1 mvmntGnlInf;
    @XmlElement(name = "UndrlygSctiesMvmntDtls")
    protected List<UnderlyingSecurityMovement1> undrlygSctiesMvmntDtls;
    @XmlElement(name = "UndrlygCshMvmntDtls")
    protected List<CashMovement2> undrlygCshMvmntDtls;
    @XmlElement(name = "PrcdsMvmntDtls")
    protected ProceedsMovement1 prcdsMvmntDtls;

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
     * Gets the value of the agtCAElctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnAdvcId() {
        return agtCAElctnAdvcId;
    }

    /**
     * Sets the value of the agtCAElctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAElctnAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnAdvcId = value;
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
     * Gets the value of the mvmntGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovement1 }
     *     
     */
    public CorporateActionMovement1 getMvmntGnlInf() {
        return mvmntGnlInf;
    }

    /**
     * Sets the value of the mvmntGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovement1 }
     *     
     */
    public void setMvmntGnlInf(CorporateActionMovement1 value) {
        this.mvmntGnlInf = value;
    }

    /**
     * Gets the value of the undrlygSctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygSctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingSecurityMovement1 }
     * 
     * 
     * @return
     *     The value of the undrlygSctiesMvmntDtls property.
     */
    public List<UnderlyingSecurityMovement1> getUndrlygSctiesMvmntDtls() {
        if (undrlygSctiesMvmntDtls == null) {
            undrlygSctiesMvmntDtls = new ArrayList<>();
        }
        return this.undrlygSctiesMvmntDtls;
    }

    /**
     * Gets the value of the undrlygCshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygCshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMovement2 }
     * 
     * 
     * @return
     *     The value of the undrlygCshMvmntDtls property.
     */
    public List<CashMovement2> getUndrlygCshMvmntDtls() {
        if (undrlygCshMvmntDtls == null) {
            undrlygCshMvmntDtls = new ArrayList<>();
        }
        return this.undrlygCshMvmntDtls;
    }

    /**
     * Gets the value of the prcdsMvmntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ProceedsMovement1 }
     *     
     */
    public ProceedsMovement1 getPrcdsMvmntDtls() {
        return prcdsMvmntDtls;
    }

    /**
     * Sets the value of the prcdsMvmntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProceedsMovement1 }
     *     
     */
    public void setPrcdsMvmntDtls(ProceedsMovement1 value) {
        this.prcdsMvmntDtls = value;
    }

}
