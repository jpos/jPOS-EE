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

package org.jpos.iso20022.seev_026_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionStandingInstructionGeneralInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionStandingInstructionGeneralInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StgInstrTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}StandingInstructionType1Code"/>
 *         <element name="EvtTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}CorporateActionEventType2FormatChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InstgPtyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}PartyIdentification2Choice"/>
 *         <element name="ClntStgInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}Max35Text"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}IncludedAccount1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UndrlygScty" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}FinancialInstrumentDescription3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionStandingInstructionGeneralInformation1", propOrder = {
    "stgInstrTp",
    "evtTp",
    "instgPtyId",
    "clntStgInstrId",
    "acctDtls",
    "undrlygScty"
})
public class CorporateActionStandingInstructionGeneralInformation1 {

    @XmlElement(name = "StgInstrTp", required = true)
    @XmlSchemaType(name = "string")
    protected StandingInstructionType1Code stgInstrTp;
    @XmlElement(name = "EvtTp")
    protected List<CorporateActionEventType2FormatChoice> evtTp;
    @XmlElement(name = "InstgPtyId", required = true)
    protected PartyIdentification2Choice instgPtyId;
    @XmlElement(name = "ClntStgInstrId", required = true)
    protected String clntStgInstrId;
    @XmlElement(name = "AcctDtls")
    protected List<IncludedAccount1> acctDtls;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentDescription3 undrlygScty;

    /**
     * Gets the value of the stgInstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link StandingInstructionType1Code }
     *     
     */
    public StandingInstructionType1Code getStgInstrTp() {
        return stgInstrTp;
    }

    /**
     * Sets the value of the stgInstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingInstructionType1Code }
     *     
     */
    public void setStgInstrTp(StandingInstructionType1Code value) {
        this.stgInstrTp = value;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionEventType2FormatChoice }
     * 
     * 
     * @return
     *     The value of the evtTp property.
     */
    public List<CorporateActionEventType2FormatChoice> getEvtTp() {
        if (evtTp == null) {
            evtTp = new ArrayList<>();
        }
        return this.evtTp;
    }

    /**
     * Gets the value of the instgPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getInstgPtyId() {
        return instgPtyId;
    }

    /**
     * Sets the value of the instgPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setInstgPtyId(PartyIdentification2Choice value) {
        this.instgPtyId = value;
    }

    /**
     * Gets the value of the clntStgInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntStgInstrId() {
        return clntStgInstrId;
    }

    /**
     * Sets the value of the clntStgInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntStgInstrId(String value) {
        this.clntStgInstrId = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncludedAccount1 }
     * 
     * 
     * @return
     *     The value of the acctDtls property.
     */
    public List<IncludedAccount1> getAcctDtls() {
        if (acctDtls == null) {
            acctDtls = new ArrayList<>();
        }
        return this.acctDtls;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public FinancialInstrumentDescription3 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public void setUndrlygScty(FinancialInstrumentDescription3 value) {
        this.undrlygScty = value;
    }

}
